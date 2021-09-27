import java.util.*;
class Emptymirrortriangle
{
    public static void main(String[] args)
    {
int i,j;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.print("* ");
        }
        System.out.println("");
        for(i=1;i<=n;++i){
            for(j=1;j<=i;++j){
                System.out.print(" ");
            }
            for(j=1;j<=1;++j){
                System.out.print("*");
            }
            for(j=1;j<=n-i;++j){
                    System.out.print(" ");
            }
            for(j=1;j<=n-i-1;++j){
                System.out.print(" ");
            }
            if(i<n){
            for(j=1;j<=1;++j){
                System.out.print("*");
            }}
            System.out.println("");
        }
    }
}