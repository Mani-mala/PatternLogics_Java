import java.util.Scanner;
public class PatternFromInsta1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int print=1;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i+1;j++)
            {
                System.out.print("  ");
            }
            if(i%2==0)
            {
                for(int j=1;j<=num;j++)
                {
                    System.out.print(print++ +" ");
                }
            }
            else
            {
                print+=num-1;
                for(int j=1;j<=num;j++)
                {
                    System.out.print(print-- +" ");
                }
                print+=num+1;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
