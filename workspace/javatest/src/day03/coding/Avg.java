package day03.coding;

public class Avg {

  public static void main(String[] args) {
    int num[][] = {{3,5,2,7},
        {23,24,29,561},
        {2400,2,151,77}};
    double sum = 0;
    for (int i=0; i<num.length; i++) {
      for (int j=0; j<num[i].length;j++) {
        sum += num[i][j];
        
      }
    }
System.out.println("3년매출총액"+sum+"이며 연평균매출"+sum/num.length + "이다.");
  }

}
