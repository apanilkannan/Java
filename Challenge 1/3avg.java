import java.util.Scanner;
class Avg
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers:");
		int sum = 0;
        int count = 5;

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            sum += number;
        }

        int average = sum / count;
        System.out.println("The average of the numbers is: " + average);
	}
}
		