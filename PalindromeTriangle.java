import java.util.Scanner;

public class PalindromeTriangle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size for a number Triangle : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
            int p=i;
			for(int j=1;j<=2*(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p-- +" ");
			}
            p+=2;
            for(int j=1;j<i;j++)
			{
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
/*
            1 
          2 1 2
        3 2 1 2 3 
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7
 */