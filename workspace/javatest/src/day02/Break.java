package day02;
public class Break { 
    public static void main(String[] args) { 
        for (int i=0; i<=3; i++) {     //3 
            for (int j=2; j>=0; j--) { //3 
                System.out.print("i=" + i + " j=" + j); 
                System.out.print("     "); 
                System.out.println("X-MAS"); 
                if (j == 1){ 
                    System.out.println("j==1 break"); 
                    break; 
                } 
            }// END 안쪽 for문 
           
            if ( i == 3){ 
                System.out.println("i==3 break");                 
                break; 
            } 
        }// END 바깥쪽 for문 
    } 
} 
