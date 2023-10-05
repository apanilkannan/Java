import java.util.Scanner;
class Invp{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
		int spaces = 0;
        for (int i=rows;i>=1;i--) {
            for (int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces+=2;
        }
    }
}


        

        
        


