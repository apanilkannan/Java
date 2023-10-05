import java.util.Scanner;
class Swap
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int num=sc.nextInt();
		System.out.println("Enter second num");
		int num2=sc.nextInt();
		num=num+num2;
		num2=num-num2;
		num=num-num2;
		System.out.println("After swapping: num1= "+num+ ", num2= "+num2);
	}
}	
		
		