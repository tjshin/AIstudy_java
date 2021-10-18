package day07;

import java.util.Vector;

class Sung{ 
    //멤버 변수 
    String name=""; 
    int kuk = 0; 
    int eng = 0; 
    int tot = 0; 
    int avg = 0; 
    public Sung(){} 
    public Sung(String name,int kuk,int eng){ 
        this.name = name; 
        this.kuk = kuk; 
        this.eng = eng; 
        this.tot = kuk+eng; 
        this.avg = (kuk+eng) / 2; 
    } 
} 
public class VectorTest2 { 
    public static void main(String args[]){ 
        int i=0; 
         
        //sung 객체 생성 
        Sung s = null; 
        Sung s1 = new Sung("기획자",100, 80); 
        Sung s2 = new Sung("설계자",80, 90); 
        Sung s3 = new Sung("개발자",90, 80); 
         
        //Vector에 요소 저장 
        Vector v = new Vector(); 
        v.addElement(s1); 
        v.addElement(s2); 
        v.addElement(s3);         
        //vector에 저장된 sungjuk객체 추출하여 출력 
        for(i=0; i<v.size(); i++){ 
            s = (Sung)v.get(i); 
            System.out.print(s.name + "\t"); 
            System.out.print(s.kuk + "\t"); 
            System.out.print(s.eng + "\t"); 
            System.out.print(s.tot + "\t"); 
            System.out.print(s.avg + "\t\n");            
        } 
    } 
} 