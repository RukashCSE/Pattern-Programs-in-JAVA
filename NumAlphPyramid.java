public class NumAlphPyramid {
    public static void main(String[] args)
    {
        int i,j,row=6;
     for(i=0;i<row;i++)
     {
         int t=1;
         char s='A';
        for(j=0;j<=i;j++)
        if(i%2==1)
         {
            System.out.print(t+" ");
            t++;
        }
        else{
             System.out.print(s+" ");
             s++;
         }
         System.out.println(" ");
     }   
    
    
    }
}
