import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        switch (n%7) {
            case 1:
                System.out.println("day is monday");
                break;
                case 2:
                System.out.println("day is tuesday");
                break;
                case 3:
                System.out.println("day is wenesday");
                break;
                case 4:
                System.out.println("day is thrusday");
                break;
                case 5:
                System.out.println("day is friday");
                break ;
                case 6:
                System.out.println("day is saturday");
                break;
                case 7:
                System.out.println("day is sunday");
                break;
                
                
        }
        
        
                
        

        

    
    }
}
