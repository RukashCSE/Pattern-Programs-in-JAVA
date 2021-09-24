import java.util.*;
class Main
{
 public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        int t=1;
        char s='A';
        for(i=1;i<=n;i++)
        {
            for(j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            if(i%2==1){
            for(j=i;j<=n;j++)
            {
                System.out.print(s);
                s++;
            }}
            if(i%2==0){
            for(j=i;j<=n;j++)
            {
                System.out.print(t);
                t++;}
            }
            System.out.println();
        }
    }
}