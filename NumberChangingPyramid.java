import java.util.Scanner;

public class NumberChangingPyramid {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int p=1;
        for(int i=0;i<=n;i++)
        {
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
1 
2 3 
4 5 6 
7 8 9 10       
11 12 13 14 15
 */