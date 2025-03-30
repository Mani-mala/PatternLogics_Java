import java.util.Scanner;

public class ReverseNumberTriangle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size for a number Triangle : ");
		int n=sc.nextInt();
        int p=0;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+j+" ");
			}
			System.out.println();
            p++;
		}
		sc.close();
	}
}
/*
1 2 3 4 5 
 2 3 4 5  
  3 4 5   
   4 5    
    5  
 */