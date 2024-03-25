import java.util.Scanner;

public class Patteern3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of rows : ");
        int r=sc.nextInt();
        System.out.println("Enter the value of coloms");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}