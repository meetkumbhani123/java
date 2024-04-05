import java.util.*;
import java.io.*;
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "name: "+name+"Age: "+age;
    }
}
public class Lab11_1 {
public static void main(String[] args) {
    try{
        BufferedWriter bw= new BufferedWriter(new FileWriter("Lab11_1.txt"));
        bw.write("Meet kumbhani,18");
        bw.newLine();
        bw.write("Dherya bhatt,18");
        bw.newLine();
        bw.write("viraj odedasra,18");
        bw.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    try{
        BufferedReader br= new BufferedReader(new FileReader("Lab11_1.txt"));
        String line;
        while((line=br.readLine())!=null){
            String name_age[] =line.split(",");
            String name= name_age[0];
            int age= Integer.parseInt(name_age[1]);
            Student st= new Student(name, age);
            System.out.println(st);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
}
    
}