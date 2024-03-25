import java.util.Scanner;

public class StudentDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        if (marks>= 60) {
            System.out.println("Grade : First division");
        } else if (marks>50) {
            System.out.println("Grade : seacond divison ");
        } else if (marks >40) {
            System.out.println("Grade :Third division ");
        } else {
            System.out.println("Grade :Fail ");
        }

    }
}
