import java.util.Scanner;

public class Evenndivisbleby3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        if (n%2==0 && n%3==0) {
            System.out.println("number is even and divisble by 3 and the value is : "+n);
        }
        else
        {
            System.out.println("given nuber is not even and not divisble by 3 and the value is ");
        }
    }
}
