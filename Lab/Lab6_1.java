import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subjects_registed;
	String[] subject_code;
	int[] subject_credit;
	String[] grade_obtained;
    int total_credit;
	double spi;

	public Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID no");
		id_no = sc.nextInt();
		System.out.println("Enter no of subjects registed");
		no_of_subjects_registed = sc.nextInt();
		subject_code = new String[no_of_subjects_registed];
		subject_credit  = new int[no_of_subjects_registed];
		grade_obtained  = new String[no_of_subjects_registed];

		for(int i=0;i<no_of_subjects_registed;i++){
			System.out.println("Enter Subject code for subject("+(i+1)+")");
			subject_code[i] = sc.nextLine();
			System.out.println("Enter Subject credit for subject("+(i+1)+")");
			subject_credit[i] = sc.nextInt();
			System.out.println("Enter grade obtained for subject("+(i+1)+")");
			grade_obtained[i] = sc.nextLine();
		}
	}

	public double calculate_spi(){
      
        int sum=0;

		for(int i=0;i<no_of_subjects_registed;i++){
            total_credit+=sum;
            if(grade_obtained.equals("a++")){
                
            }
        }
        spi= total_credit
		
	}
}
public class Lab6_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for(int i=0;i<n;i++){
			students[i] = new Student();
		}
		for(int i=0;i<n;i++){
			double spi = students[i].calculate_spi();
			System.out.println("SPI = "+spi);
		}
	}
}