import java.util.*;
public class Emptydowntriangle {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        for(j=0;j<=n*2;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        for(i=1;i<n;i++)
        {            
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=1;j++)
            {
                System.out.print("*");
            }
            
            for(j=n-1;j>i;j--)
            {
                System.out.print("  ");
            }
            if(i<n-1)
              {  for(j=1;j<=1;j++)
                {
                    System.out.print("*");
                }
              }
            System.out.println();
        }
    }
}
