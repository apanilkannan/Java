import java.util.Scanner;
class Prime
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=2;
		int b,flag,i;
		System.out.print("\nEnter the limit : ");
		b = sc.nextInt();
		while(a<b)
		{
			flag=0;
			for(i=2;i<=a/2;++i)
			{
				if(a%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag == 0)
			System.out.print(a+" ");
			a++;
		}
	}
}