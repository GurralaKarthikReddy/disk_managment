import java.util.Scanner;

public class Fcfs {
	public int[] Series;
	public int[] flag;
	public int head;
	public int high;
	public int low;
	public int n;
	private Scanner in;
	public Fcfs(int head,int high,int low,int n)
	{
		this.n=n;
		this.high=high;
		this.low=low;
		this.head=head;
		
		Series=new int[n];
		flag=new int[n];		
	}
	public void setValues()
	{		
		System.out.println("Get the input values");
		for(int i=0;i<n;i++)
	     {
			in = new Scanner(System.in);
            Series[i]=in.nextInt();
            flag[i]=0;
	     }
		
	}
	public void Disk(){
		System.out.println("The disk Fragmentation");
		System.out.println(head);
		int k=0;
		while(k==0)
		{
			for(int i=0;i<n;i++)
			{
				if(flag[i]!=1)
				{
					System.out.println(Series[i]);
					flag[i]=1;
				}
			}
			
			for(int i=0;i<n;i++)
			{
				if(flag[i]==0)
				{
					break;
				}
				k=1;
			}
			
		}
	}

}