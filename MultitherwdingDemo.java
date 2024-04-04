class myThered extends Thread{
    @Override
   public void run(){
    
        System.out.println(" hello i am meet");
        System.out.println("hello");
        System.out.println(" i need cooling");
        System.out.println("i need also some cooking");
    }
}
class myThered2 extends Thread{
    @Override
   public void run(){
    
        // System.out.println(" hello i am cooking");
        System.out.println("i am not cooking");
    }
}


public class MultitherwdingDemo {
    public static void main(String[] args) {
        myThered t1 = new myThered();
        myThered2 t2= new myThered2();
        t1.start();
        t2.start();
    }
}
