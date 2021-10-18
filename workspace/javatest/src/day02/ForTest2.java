package day02;
public class ForTest2 { 
    public static void main(String[] args) { 
// 밑에 있는 outer가 레이블lable
        outer: for (int i=0; i<=2; i++) { 
                    for (int j=2; j>=0; j--) { 
                        if (i==j) break outer;//label레이블 
                        System.out.println("i==" + i + " j==" + j); 
                    } 
                } 
    } 
} 