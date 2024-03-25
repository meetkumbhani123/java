import java.util.Scanner;

public class Lab5_3 {
    String str;
    static int count_a=0;
    static int count_e=0;
    static int count_i=0;
    static int count_o=0;
    static int count_u=0;

    //  Lab5_3(String str){
    //   this.str=str;
  //  }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("Please enter the string (or type 'quit' to exit): ");
            String str = sc.nextLine().toLowerCase();

            
            if (str.equals("quit")) {
                break;
            }

        
            count_a = 0;
            count_e = 0;
            count_i = 0;
            count_o = 0;
            count_u = 0;

    
            for (int k = 0; k < str.length(); k++) {
                char ch = str.charAt(k);
                if (ch == 'a')
                    count_a++;
                else if (ch == 'e')
                    count_e++;
                else if (ch == 'i')
                    count_i++;
                else if (ch == 'o')
                    count_o++;
                else if (ch == 'u')
                    count_u++;
            }

            
            System.out.println("Count of 'a': " + count_a);
            System.out.println("Count of 'e': " + count_e);
            System.out.println("Count of 'i': " + count_i);
            System.out.println("Count of 'o': " + count_o);
            System.out.println("Count of 'u': " + count_u);
        }
    }
}
