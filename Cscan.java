import java.util.Scanner;
import java.util.Arrays;


public class Cscan {

	public int[] Series;
	public int[] flag;
	public int high;
	public int low;
	public int head;
	public int n;
	public Scanner in;
	public Cscan(int head,int high,int low,int n){

		this.n=n;
		this.head=head;
		this.high=high;
		this.low=low;
		Series=new int[n];
		flag=new int[n];
	}
	
	public void setValues(){
		in = new Scanner(System.in);

		System.out.println("Get the input values");
		for(int i=0;i<n;i++)
	     {
            Series[i]=in.nextInt();
            flag[i]=0;
	     }
	}
	
	public void sort(){
		
		Arrays.sort(Series);
	}
	public void Disk()
	{
		int m = 0;
		for(int i=0;i<n;i++)
		{
			
			if((Series[i]>=head)&&(Series[i]<=head))
			{
				m=i;
			}
			
			
		}
		int b=high-low;
		if(m<(b/2))
		{
			for(int i=m;i>=0;i--)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
			System.out.println(low);
			System.out.println(high);
			for(int i=n-1;i>=m+1;i--)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
		}
		else
		{
			for(int i=m;i<n;i++)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
			System.out.println(high);
			
			System.out.println(low);
			for(int i=0;i<=m-1;i++)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
		}
	}
}
