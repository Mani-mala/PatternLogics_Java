package patterns;
import java.util.Scanner;
public class NumberTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size for a number Triangle : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5
	*/
