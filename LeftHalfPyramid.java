import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(j<(n-i))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }           
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
* * * * * * 
 */