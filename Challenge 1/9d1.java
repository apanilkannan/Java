import java.util.Scanner;
class Diamond
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd): ");
        int rows = scanner.nextInt();
        int spaces = rows / 2;
        int stars = 1;
        for (int i = 1; i <= rows; i++) 
		{
            for (int j = 1; j <= spaces; j++) 
			{
                System.out.print(" ");
            }
			for (int k = 1; k <= stars; k++) 
			{
                System.out.print("*");
            }
			System.out.println();
            if (i <= rows / 2) 
			{
                spaces--;
                stars += 2;
            } else 
			{
                spaces++;
                stars -= 2;
			}
		}
	}
}	
		
		