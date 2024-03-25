import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        System.out.println("Enter the lenght of array :");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }     
        for(int j=n-1;j>=0;j--){
            System.out.println("reverce:" +arr[j]);
        }
     
    }
}
