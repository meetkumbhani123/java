import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("nuber is odd");
        }
        

    }
}
