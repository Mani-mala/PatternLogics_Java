import java.util.Scanner;
public class NumberIncreasingReversePyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            int p=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(p+++" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
1 2 3 4 5 
1 2 3 4   
1 2 3     
1 2       
1  
 */