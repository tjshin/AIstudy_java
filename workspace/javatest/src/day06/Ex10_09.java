package day06;

import java.io.FileInputStream;

public class Ex10_09 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/AIstudy/java/data1.txt");
        int ch;
 
        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);
 
        fis.close();
 
    }
}
