public class array {

    public static void main(String[] args) {
        int []run=  new int[6];
        run[0]=2;
        run[1]=3;
        run[2]=2;
        run[3]=3;
        run[4]=2;
        run[5]=3;
        int total=0;
        for(int i=0;i<6;i++){
            total+=run[i];
        }
        System.out.println("total runs"+total);
        

    }
}