import java.util.Scanner;

public class SandGlassStar {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        System.out.println("Enter the How many rows do you Want to Print:");
       for(i=1;i<=n;i++)
       {
            for(j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
        
        System.out.println();
       }
       for(i=1;i<=n;i++)
       {
            for(j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        
        System.out.println();
       }
    }
}


