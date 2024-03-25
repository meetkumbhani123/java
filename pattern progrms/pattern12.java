import java.util.Scanner;

public class pattern12 {

    public static void main(String[] args) {
        int k=2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                
                System.out.printf("%2d ",k);
                k=k+2;
            }
            System.out.println();
        }
        
        
    }
}