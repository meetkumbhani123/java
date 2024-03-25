import java.util.Scanner;
public class Lab8_1 {

    public static void main(String[] args) {
        try{
            int x= Integer.parseInt(args[0]);
            int y= Integer.parseInt(args[1]);
            int k=1;
            for(int i=0;i<y;i++){
                k=k*x;
            }
            System.out.println(k);
            
            
           
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
          
    }
}