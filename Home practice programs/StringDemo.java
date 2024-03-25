class Base1{
    int x;
    Base1(){
        System.out.println(" i am called");
    }
    Base1(int x){
        System.out.println("from base arguemnt construteri am coming.");
    }
}
class Derived1 extends Base1{
 Derived1(){
    
    System.out.println(" from derived i am called");
 }
 Derived1(int x,int y){
    super(x);
System.out.println("i am coming");
 }
}

class Base{
    int x;
    public int getx(){
        return x;
    }
    public void  setx(int x){
        this.x=x;
    }
     public void printme(){
        System.out.println("i am costructer");
    }
}
class Derived extends Base{
int y;
 public int gety(){
    return y;
 }
 public void sety(int y){
    this.y=y;
 }
}
public class StringDemo {

    public static void main(String[] args) {
        Derived b= new Derived();
        b.sety(43);
        b.gety();
        System.out.println(b.gety());
        Derived1 d= new Derived1(1,2);
    }
}