import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r= sc.nextInt();
        System.out.println("Enter the number of coloms : ");
        int c= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
