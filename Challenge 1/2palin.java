import java.util.Scanner;
class Palin
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int dig=0;
		while(num>0)
		{
			dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("The number is Palindrome");
		}
		else
			System.out.println("The Number is not Palindrome");
	}
}