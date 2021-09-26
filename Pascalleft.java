import java.util.*;
public class Pascalleft {
 public static void main(String[] args)
 {
     int i,j;
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     for(i=1;i<=n;i++)
     {
        for(j=n-1;j>=i;j--)
        {
            System.out.print("  ");
        } 
        for(j=1;j<=i;j++)
         {
             System.out.print("* ");
         }
        
         System.out.println();
     }
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=i;j++)
        {
            System.out.print("  ");
        } 
         for(j=n;j>i;j--)
         {
             System.out.print("* ");
         }
        
         System.out.println();
     }
 }   
}
