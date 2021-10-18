package day05;


class OverA { 
  
    void show(String str) { 
        System.out.println("상위클래스의 메소드 show(String str) 수행 " + str); 
    }
    void show(int a, int b) {
      System.out.println("상위클래스 메소드 오버로딩 show(int a, int b) 수행" + a +"\t"+ b);
    }
    
} 

class SubOverA extends OverA { 
    void show() { 
        System.out.println("하위클래스의 메소드 show() 수행"); 
    } 
} 
       
public class OverrideExam1 { 
    public static void main(String args[]) { 
        SubOverA over = new SubOverA(); 
        over.show("IT KOREA");
        over.show(2400, 2);
        over.show(); 
    } 
} 