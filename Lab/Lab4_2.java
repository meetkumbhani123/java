import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int constant=0;
        int vovel=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == 'a' || c =='e' || c=='i'|| c=='o'|| c=='u'||c=='A'|| c=='E'||c=='I'||c=='O'||c=='U'  ){
                
                constant++;

            }
            else{
                vovel++;
            }
        }
        System.out.println("vovel:"+vovel);
        System.out.println("constant"+constant);
        
    }
}
