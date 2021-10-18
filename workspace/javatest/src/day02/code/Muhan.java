package day02.code;

public class Muhan {

  public static void main(String[] args) {
    int i=1;
    int sum = 0;
    while (i<=100) {
      i++;
      if (i%2==1)
        continue;
      else
        sum = sum+i;
    }
    System.out.println("1부터 100까지 짝수의 합은 " + sum);
    }

  }


