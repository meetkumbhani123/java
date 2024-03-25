import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array values: ");
        int sum=0;
        int avg;
        int []arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
            sum=sum+i;
            avg=sum/4;

        }
        System.out.println("avarage: "+sum);
    }
    
}
