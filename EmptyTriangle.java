import java.util.Scanner;

public class EmptyTriangle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size for a  Triangle : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
                if(j==1 || j==i || i==n)
				    System.out.print("* ");
                else
                    System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
}
/*
     * 
    * *
   *   *
  *     *
 *       *
* * * * * *
 */