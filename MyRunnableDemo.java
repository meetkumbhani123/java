class myThered implements Runnable{
    public void run(){
        System.out.println(" i am meet");

    }
}
class myThered2 implements Runnable{
    public void run(){
        System.out.println("how are u");
        System.out.println("you are manswi");
       
    }
}
public class MyRunnableDemo {
    public static void main(String[] args) {
        myThered t1= new myThered();
        Thread m1= new Thread(t1);
        myThered2 t2= new myThered2();
        Thread m2= new Thread(t2);
        m1.start();
        m2.start();
    }
}
