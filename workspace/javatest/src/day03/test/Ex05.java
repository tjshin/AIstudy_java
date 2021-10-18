package day03.test;



public class Ex05 {

  public static void main(String[] args) {
   
      
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
      
      if(a>b) {           
        System.out.println("최대값: "+ a);
        System.out.println("최소값: "+ b);}
      else if (a<b) {
        System.out.println("최대값: "+ b);
        System.out.println("최소값: "+ a);
      }
        

  }

}
