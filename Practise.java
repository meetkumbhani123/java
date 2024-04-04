 abstract class Greet{
    abstract void  greeting();
    abstract void print();

    
}
class Greet1 extends Greet{
    void greeting(){
        System.out.println("hello meet");

    }
    void print(){
        System.out.println("Hello Hello meet");
    }
}
class Child  extends Greet{
    public void meet(){
         System.out.println("by by");
         
    }
    void greeting(){
        System.out.println("hello meet");

    }
    void print(){
        System.out.println("Hello Hello meet");
    }

}
public class Practise {
    public static void main(String[] args) {
        Greet1 g= new Greet1();
        g.greeting();
            
        
    }
}
