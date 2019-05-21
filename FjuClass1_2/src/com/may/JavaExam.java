package com.may;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
        import java.io.OutputStreamWriter;

public class JavaExam {
    public static void main(String[] args) throws Exception{
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("result.txt"),"utf-8");
        try {
            writer.write("JAVA ");
            writer.write(21555);
            writer.write(20329);
            writer.write(29599);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
