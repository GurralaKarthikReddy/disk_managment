import java.util.Scanner;
import java.util.Arrays;


public class Look {

	public int[] Series;
	public int[] flag;
	public int high;
	public int low;
	public int head;
	public int n;
	public Scanner in;
	public Look(int head,int high,int low,int n){

		this.head=head;
		this.n=n;
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
			for(int i=m+1;i<n;i++)
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
			for(int i=m-1;i>=0;i--)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
		}
	}
}
