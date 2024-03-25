abstract class Vagetable {
String color;
String name;
public String tostring(){
        return "vagetable name"+name+"vagetable color"+color;
}
    
}
class Potato extends Vagetable{
    
public String toString(){
    color="red";
    name="potato";
    return color +" "+name;
}
}
class Briangle extends Vagetable{
    public String toString(){
        color="brown";
        name="briangle";
        return color +" "+name;
    }
    }



public class Lab7_1 {
public static void main(String[] args) {
    Potato p= new Potato();
Briangle b= new Briangle();
System.out.println(p);
System.out.println(b);
}
    
}
