import java.util.Scanner;
public class PatternFromInsta2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int p=1,col=num,row;
        System.out.println("1");
        for(int i=2;i<=num;i++)
        {
            row=1;
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    p+=col--;
                    System.out.print(p+" ");
                   
                }
                else{
                    System.out.print(p-col+row+" ");
                    row++;
                }
            }
            System.out.println();
        }
    }
}
