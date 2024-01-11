package week10Programs;

public class Pattern2 {
	public static void main(String[] args) {
		for(int index=0;index<5;index++)
		{
			for(int index1=0;index1<5;index1++)
			{
			
				if(index==0 ||index==4 ||index1==0  || index1==3)
				System.out.print("* ");
				else if(index1>0)
					System.out.print("  ");
				
			}System.out.println();	
		
			}
		}
	}
	

