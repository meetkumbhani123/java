class Time{
    int hour;
    int minute;
    int seacond;
    Time(int hour,int minute,int seacond){
        this.hour=hour;
        this.minute=minute;
        this.seacond=seacond;
    }
    public void addtime(Time t1,Time t2){
        this.hour= t1.hour+t2.hour;
        this.minute=t1.minute+t2.minute;
        this.seacond=t1.seacond+t2.seacond;
        System.out.println(hour+","+minute +","+seacond);
    }
}
public class AddTimeLab5 {
    public static void main(String[] args) {
        Time t1= new Time(12,22,21);
        Time t2 =new Time(1,23,22);
        
         t1.addtime(t1,t2);


    }
}
