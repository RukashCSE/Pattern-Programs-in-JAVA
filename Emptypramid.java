import java.util.*;
public class Emptypramid {
 public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            int i,j;
            for(i=1;i<n;i++)
            {
                for(j=n-1;j>=i;j--)
                {
                    System.out.print(" ");
                }
                for(j=1;j<=1;j++)
                {
                    System.out.print("* ");
                }
                for(j=3;j<=i;j++)
                {
                    System.out.print("  ");
                }
                if(i>=2)
                    for(j=1;j<=1;j++)
                    {
                        System.out.print("* ");
                    }
                System.out.println();
            }
            for(i=0;i<n;i++)
            {
                System.out.print("* ");
            }
        
    }


    
}
