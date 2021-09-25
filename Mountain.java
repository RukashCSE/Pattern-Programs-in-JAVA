public class Mountain{
        public static void main(String[] args){
        int i,j,row=6;
        
        for(i=0;i<row;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            for(int space=1;space<row-i;space++)
            {
                System.out.print("------");
            }
            for(int rs=0;rs<=i;rs++)
            {
        
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }


    
}
