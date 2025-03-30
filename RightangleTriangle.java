import java.util.Scanner;

public class RightangleTriangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2 ==0)
            {
                for(int j=0;j<=i;j++)
                {
                    if(j%2 ==0)
                        System.out.print("*  ");
                    else
                        System.out.print("  ");
                }
            }
            else
            {
                for(int j=0;j<=i;j++)
                {
                    if(j%2 ==1)
                        System.out.print("*  ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=n-2;i>=0;i--)
        {
            if(i%2 ==0)
            {
                for(int j=0;j<=i;j++)
                {
                    if(j%2 ==0)
                        System.out.print("*  ");
                    else
                        System.out.print("  ");
                }
            }
            else
            {
                for(int j=0;j<=i;j++)
                {
                    if(j%2 ==1)
                        System.out.print("*  ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
*  
  *  
*    *  
  *    *          
*    *    *       
  *    *    *     
*    *    *    *  
  *    *    *     
*    *    *       
  *    *          
*    *  
  *  
* 
*/  