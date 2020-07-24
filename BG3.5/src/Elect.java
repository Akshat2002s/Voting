import java.util.*;
public class Elect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=0,ctr=1;
        int a[]=new int[5];

       Scanner ins= new Scanner(System.in);


			do
			{
			   {
			        System.out.print("Enter candidate no. ");
			        num= ins.nextInt();
			}
			
			
			   		for(i=0;i<5;i++)
			   		{
			   			if(num==(i+1))
			   				a[i]++;
			   		}
			
			   		ctr++;
					} while(ctr<=10);
			
				System.out.println(" "); 
			
				for(i=0;i<5;i++)
					System.out.println("The no. of votes for canadidate "+(i+1)+" are: "+a[i]);
			
		}
			
	}



	


