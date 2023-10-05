import java.util.Scanner;
class Arm
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(sum==temp)
			System.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");
	}
}