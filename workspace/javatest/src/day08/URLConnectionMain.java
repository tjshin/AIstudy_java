package day08;

/** 
URLConnection을 이용한 입력 스트림 개설 
**/
import java.net.*;
import java.io.*;

public class URLConnectionMain {
  public static void main(String args[]) throws MalformedURLException, IOException {
    URL url = new URL("http://www.daum.net");
    URLConnection con = url.openConnection();
    String temp;
    BufferedReader br;
    br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
    while ((temp = br.readLine()) != null) {
      System.out.println(temp);
    }
    br.close();
  } // end of main
} // end of URLConnectionMain class