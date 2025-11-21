package Testing_nd_Trials;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class test1 {
    public static void main(String[] args) throws Throwable {
        try{
            FileWriter fw = new FileWriter("output.txt" , true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("hello world");
            fw.close();
            System.out.println("success");
        }catch (Exception e){
            System.out.println("some thing went wrong");
        }

    }
}