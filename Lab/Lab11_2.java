import java.io.File;
public class Lab11_2 {
    public static void main(String[] args) {
        String filename= args[0];
        File file = new File(filename);
        try{
            if(!file.exists()){
                System.out.println("File does not exist");
            }
            else{
                if(file.isFile()){
                    System.out.println("size"+file.length());
                }
                else if(file.isDirectory()){
                    File[] files= file.listFiles();
                    if(file!=null){
                        for(File f:files){
                            System.out.println(f.getName());
                        }
                    }
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
