import java.util.*;
public class Numinevorder {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        { int m=i;
            for(j=1;j<=i;j++)
            {
                System.out.print(m+" ");
                m--;
            }
            System.out.println("");
        }
    }    
}
