import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int i = 2;
        boolean flag = false;

        while (i < n) {
            if (n % i == 0) {
                flag = true;
                break;
            }
            i++;
        }

        if (flag) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is  prime");
        }
    }
}
