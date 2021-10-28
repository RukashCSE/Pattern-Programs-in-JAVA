import java.util.*;
public class Reversenumcontinue  
{
    public static void main(String[] args)
    {
        System.out.println("Better to given the input is below = 5 ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        int m=1;
        for(i=1;i<=n;i++)  //I want the exact number to reverse a pattern, run a dummy pattern to find the last num in patter.
        { 
            for(j=1;j<=i;j++)
            { 
                System.out.print(m+" ");
                m++;
            }
            System.out.println("");
        }
        int r=m-1;          //r is the last num in pattern, we reduce r get the reverse pattern.
        System.out.println(r);
        System.out.println(m);
        System.out.println("The Reverse number continue is: ");
        for(i=1;i<=n;i++)   //process of reverse
        { 
            for(j=1;j<=i;j++)
            { 
                System.out.print(r+" ");
                r--;
            }
            System.out.println("");
        }
        
        
    }
}


