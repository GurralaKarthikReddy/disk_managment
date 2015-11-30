package paging;
import java.io.*;
class Fifo{
        public static void main(String args[]) throws IOException
        {       
                int f,page=0,pgf=0,n,chn=0;
                boolean flag;
            	System.out.println("enter no. of frames: ");
            	// Object obj;
            	int pt=0;
            	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
				f=Integer.parseInt(obj.readLine());
            	int frame[]=new int[f];
            	for(int i=0;i<f;i++)
            		{
            		frame[i]=-1;
            		}
            	int pages[]; 
            	System.out.println("enter the no of pages ");
            	 n=Integer.parseInt(obj.readLine());
            	 pages=new int[n];
            	System.out.println("enter the page no ");
            	for(int j=0;j<n;j++)
            	pages[j]=Integer.parseInt(obj.readLine());
            	do{
            	int pg=0;
            	for(pg=0;pg<n;pg++)
            	{
            	
            	page=pages[pg];
            	flag=true;
            	for(int j=0;j<f;j++)
            	{
            	if(page==frame[j])
            	{
            	flag=false;
            	 break;
            	}
            	}
            	if(flag)
            	{
//            	int pt = 0;
				frame[pt]=page;
            	pt++;
            	if(pt==f)
            	pt=0;
            	System.out.print("frame :");
            	for(int j=0;j<f;j++)
            	System.out.print(frame[j]+"   ");

            	System.out.println();
            	pgf++;
            	}
            	else
            	{
            	System.out.print("frame :");
            	for(int j=0;j<f;j++)
            	System.out.print(frame[j]+"  ");

            	System.out.println();
            	//chn++;
            	}
            	
            	chn++;
            	}
            	}while(chn!=n);
            	System.out.println("Page fault:"+pgf);
            //	break;
        }

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}
        }

