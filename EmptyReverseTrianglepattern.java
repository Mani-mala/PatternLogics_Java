import java.util.Scanner;

public class EmptyReverseTrianglepattern {
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size for a Triangle : ");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--)
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
* * * * * 
 *     *  
  *   *   
   * *    
    *  
 */