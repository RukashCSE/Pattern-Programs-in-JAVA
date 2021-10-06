import java.util.*;
public class Reversealpha 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        char m='A';
        
        for(i=1;i<=n;i++)  //I want the exact number to reverse a pattern, run a dummy pattern to find the last num in patter.
        { 
            for(j=1;j<=i;j++)
            { 
                System.out.print(m+" ");
                ++m;
            }
            System.out.println("");
        }
        m--;
        char r=m;      
         System.out.println("The Total numbers in pattern");      
        System.out.println(r);
        System.out.println("The value of 1st pattern "+m);
         System.out.println("The REVERSE continue Alphabets:");
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




    
