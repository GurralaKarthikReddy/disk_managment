
import java.util.Scanner;

public class Main {

	public static Scanner in;
	public static int head;
	public static int high;
	public static int low;
	public static int n;

	public static void main(String args[]){
		
		System.out.println("Input");
		in = new Scanner(System.in);
		head = in.nextInt();
		in = new Scanner(System.in);
		low = in.nextInt();
		in = new Scanner(System.in);
		high = in.nextInt();
		in = new Scanner(System.in);
		n=in.nextInt();
		
		System.out.println("Fcfs In Action");
		Fcfs s1=new Fcfs(head,low,high,n);
		s1.setValues();
		s1.Disk();
		
		System.out.println("SSTF in Action");
		Sstf s2=new Sstf(high,low,head,n);
		s2.setValues();
		s2.Disk();
		
		System.out.println("SCAN in Action");
		Scan s6=new Scan(head,high,low,n);
		s6.setValues();
		s6.sort();
		s6.Disk();
	
		System.out.println("LOOK in Action");
		Look s3=new Look(head,high,low,n);
		s3.setValues();
		s3.sort();
		s3.Disk();
	
		System.out.println("CSCAN in Action");
		Cscan s4=new Cscan(head,high,low,n);
		s4.setValues();
		s4.sort();
		s4.Disk();
		
		System.out.println("CSCAN in Action");
		Clook s5=new Clook(head,high,low,n);
		s5.setValues();
		s5.sort();
		s5.Disk();
		
	}
	
}
