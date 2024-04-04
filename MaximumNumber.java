import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a.b and c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is larger");
            }
            else if (b>a && b>c) {
                System.out.println("B is largest");
                
            }
            else if(c>a && c>b){
                System.out.println("C is largest");

            }
        

    }
}