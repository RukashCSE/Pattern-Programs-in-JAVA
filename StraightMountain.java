public class StraightMountain {
    public static void main(String[] args)
    {
      int i,j;
      var row=6;
      for(i=row;i>=1;i--)
      {
        for(j=0;j<i;j++)
        {
            System.out.print("* ");
        }        


        System.out.println(" ");
      }
      for(i=1;i<=row;i++)
      {
        for(j=0;j<i;j++)
        {
            System.out.print("* ");
        }
        System.out.println(" ");
      }
     }
    
}
