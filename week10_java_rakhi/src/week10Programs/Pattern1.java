package week10Programs;

public class Pattern1 {
	public static void main(String[] args) {
		
		int space=4,star=1;
		for(int index=1;index<=9;index++)
		{
			for(int index1=1;index1<=space;index1++)
			{
				System.out.print(" ");
			}	
			for(int index1=1;index1<=star;index1++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(index<=4)
			{
				space--;
				star++;
				
			}
			else {
				space++;
				star--;
			}
		}
	}
}
