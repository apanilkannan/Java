class Letpyr
{
    public static void main(String[]args) 
	{
        int rows=5; 
		char letter='A';
        for(int i=rows;i>=1;i--) 
		{
            for(intj=1;j<=rows-i;j++) 
			{
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) 
			{
                System.out.print(letter+" ");
				letter++;
            }
            System.out.println();
			letter='A';
        }
    }
}
