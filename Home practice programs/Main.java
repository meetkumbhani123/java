class arraysExample{
     void demoArrays(){
    int [ ] ages= new int[3];
    float[] weight= new float[3];
    String [] names= new String[3];
    ages[0]=22;
    ages[1]=12;
    ages[2]=11;
    int ans=0;
    
    
    for(int i=0;i<3;i++){
        if(ages[i]>ans){
            ans=ages[i];
        }
    }
    System.out.println(ans);
    
    
    }
}
public class Main {

    public static void main(String[] args) {
        arraysExample obj= new arraysExample();
        obj.demoArrays();
    }
}