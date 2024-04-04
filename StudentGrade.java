import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        if (marks >= 90 && marks < 100) {
            System.out.println("Grade : Excellent");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade : Very good ");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade :Good ");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade :Can do better ");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade : Average");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("Grade :Below average ");
        } else if (marks < 40) {
            System.out.println("Grade :Fail ");
        }
    }
}
