import java.util.Scanner;
public class PatternDesign {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int cur=0,temp=0;
        for(int i=1;i<=num;i++)
        {
            System.out.print(i+" ");
            cur=i;
            temp=num-1;
           for(int j=1;j<i;j++)
           {
            cur+=temp--;
            System.out.print(cur+" ");
           }
           System.out.println();
        }
        sc.close();
    }
}
