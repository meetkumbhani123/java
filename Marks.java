import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter the marks of all students");
        Scanner sc= new Scanner(System.in);
        int marks[]=new int[5];
        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt(); 
        }
        for(int i=0;i<5;i++){
            System.out.println(marks[i]); 
        }


    }
}
