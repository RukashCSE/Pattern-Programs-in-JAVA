public class NumOddpattern 
{
    public static void main(String[] args)
    {
    int i,row=6;
    int j,k=1;
    for(i=0;i<=row;i++)
    {
      if(i%2==0)  
      {
          for(j=0;j<=i;j++)
          System.out.print(k++ +" ");
         
      }
      System.out.println(" ");
    }
    }
    
}
