package com.may;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream("dd.txt"),"utf-8");
        fos.write(100);
        fos.write(66);
        fos.write(21555);
        fos.write(20329);
        fos.write(29599);
        fos.flush();
        fos.close();
        System.out.println((int)'玟');
        System.out.println(Integer.toHexString(24171));
        System.out.println(Integer.toHexString('幫'));
        System.out.println("iT \u90A6 \u5e6b \u5fd9");

    }
}
