import java.util.*;
public class OdPattern {
    public static void main(String[] args)
    {
        int i,j;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
               System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {

            System.out.print("*");
            }  
            if(i>=2){ //Or use in for loop 
            for(j=1;j<=i-1;j++) //Or j=2;j<=i;j++
            {
                System.out.print("*");

            }   
        }
            System.out.println();     
    }
    
}
}