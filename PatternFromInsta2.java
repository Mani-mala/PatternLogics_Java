import java.util.Scanner;
public class PatternFromInsta2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int p=1,col=num,row,current=0;                 
        System.out.println("1");
        for(int i=2;i<=num;i++)
        {
            row=0;
            p+=col--;
            System.out.print(p+" ");
            current=p;
            for(int j=1;j<i;j++)
            {
                current-=(col+row);
                System.out.print(current+" ");
                row++;
            }
            System.out.println();
        }
      
        }
    }
/* output  
    1
    7 2
    12 8 3
    16 13 9 4
    19 17 14 10 5
    21 20 18 15 11 6  */
