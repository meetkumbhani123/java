import java.util.Scanner;

class algebra{
    int a;
    int b;
    algebra(int x,int y){
        a=x;
        b=y;
 System.out.println("Consturcter is called");

    }
    int add(){
        int ans=a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    
}
public class Constructers {

    public static void main(String[] args) {
        algebra obj= new algebra(5,7);
        Scanner sc= new Scanner(System.in);
        // int x= sc.nextInt();
        // int y= sc.nextInt();
        System.out.println("sum of input number is:");
    int ans= obj.add();
    System.out.println(ans);
    System.out.println(obj.sub());
    System.out.println(obj.mul());
    algebra obj2= new algebra(10,7);
    System.out.println(obj2.add());
    System.out.println(obj2.sub());
    System.out.println(obj2.mul());
    }
}