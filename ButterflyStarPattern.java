import java.util.Scanner;

public class ButterflyStarPattern {
    public static void main(String[] args)
    {

	int num;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of rows for butterfly pattern");
	num=input.nextInt();
//upper half
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=i;j++) //left stars
		{
			System.out.print("*");
		}
		for(int k=1;k<=2*(num-i);k++) //spaces
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)  //right stars
		{
			System.out.print("*");
		}
	     System.out.println();
	}
//lower half

	for(int i=num-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=2*(num-i);k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	     System.out.println();
	}

    }
}
