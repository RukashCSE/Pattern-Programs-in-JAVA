import java.util.*;
public class EmptyRightAngle {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        
        int n=obj.nextInt();
        int i,j;        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=1;j++)
            {
                System.out.print("*");
            }
            if(i>=3){
            for(j=0;j<i-2;j++)
            {
                System.out.print(" ");
            }}
            if(i>=2){  //or use j=2;j<=1;j++
            for(j=1;j<=1;j++)
            {
                System.out.print("* ");
            }}
            System.out.println();
        }
        for(j=0;j<=n;j++){
            System.out.print("*");
        }
        
    }
    
}
