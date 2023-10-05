class Numpyr {
    public static void main(String[]args) 
	{
        int rows=7; 
        int num = 1;
		for (int i = 1; i <= rows; i++) 
		{
			for (int j=1;j<=i;j++) 
			{
                if(num<=25) 
				{
					if(num==15||num==20){
						System.out.println();
					}
                    System.out.print(num+" ");
                }
                num++;
            }
			if(num!=16&&num!=22)
			{
				System.out.println();
			}
        }
    }
}