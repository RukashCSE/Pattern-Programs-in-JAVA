public class Dimond
{
    public static void main(String[] args)
    {
        int i,j,row=5;        
        for(i=0;i<=row;i++)
        {        
            for(int rs=row;rs>=i;rs--)
            {          
                System.out.print("* ");
            }                      
            for(int s=1;s<=i;s++)
            {
                System.out.print("    ");
            }
            for(int p=row;p>=i;p--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(i=0;i<=row;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int space=0;space<row-i;space++)
            {
                System.out.print("    ");
            }
            for(int rs=0;rs<=i;rs++)
            {
                 {
                System.out.print("* ");
            }
            }
            System.out.println(" ");
        }
    }    
}
