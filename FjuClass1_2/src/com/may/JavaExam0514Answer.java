package com.may;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaExam0514Answer {
    public static void main(String[] args) {
        PrintWriter out = null;
        try{
            FileWriter word = new FileWriter("resultAnswer.txt");
            out = new PrintWriter(word);
            out.write("JAVA 吳佩玟");
            out.flush();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (out != null)
            out.close();
        }

    }
}
