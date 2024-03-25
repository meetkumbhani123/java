import java.util.Scanner;

public class Paladrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int rev=0;
        int c;
        c=n;
        while(n!=0)
        {
            rev = rev*10 + n%10;
            n=n/10;
         
        }
        if(rev==c){
            System.out.println("GIven number is paladrom");
        }
        else{
            System.out.println("number is not paladrom");
        }

        
    }
}
