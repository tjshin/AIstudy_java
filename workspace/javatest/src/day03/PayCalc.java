package day03;

class Pay{
  private String name;
  private int bonbong;
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBonbong() {
    return bonbong;
  }

  public void setBonbong(int bonbong) {
    this.bonbong = bonbong;
  }

  public Pay() {}
  
  public Pay(String name, int bonbong) {
    this.name = name;
    this.bonbong = bonbong;
  }
 
  public int taxCalc() {
    return (int)(bonbong * 0.045+0.5);
  }
  public int silsuCalc() {
    return bonbong - taxCalc();
  }
  
  public void printPay() {
    System.out.println("--------------------"); 
    System.out.println("---8월 급여 내역---"); 
    System.out.println("--------------------"); 
    System.out.println("성명: " + name); 
    System.out.println("본봉: " + bonbong); 
    System.out.println("세금: " + taxCalc()); 
    System.out.println("실수령액: " + silsuCalc());
    System.out.println("\n");
  }
}

class ExtraPay extends Pay{
  private int year;         //근무(경력) 년수 
  private int child;        //자녀수 
  
  ExtraPay(){}
  ExtraPay(String name, int bonbong, int year, int child){
    super(name, bonbong);
    this.year = year;
    this.child = child;
  }
  
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public int getChild() {
    return child;
  }
  public void setChild(int child) {
    this.child = child;
  }
  
  public int getExtraPay() {
    int pay = 0;    //초봉 기본급 
    
    if (year == 0){ 
        System.out.println("신입사원입니다.");     
    }else if (year == 1) { 
        pay = 200000; 
        System.out.println("경력 1년 입니다."); 
    }else if(year == 2) { 
        pay = 400000; 
    }else if(year == 3) { 
        pay = 600000; 
    }else if(year == 4) { 
        pay = 800000; 
    }else{ 
        pay = 1500000; 
    } 
     
    //자녀수당을 계산합니다. 
    if (year >=1){ 
        if (child > 1){ 
            pay = pay + (child * 200000);
        }
    }
    return pay;
  }
  
  @Override
  public void printPay() {
    System.out.println("--------------------"); 
    System.out.println("---8월 급여 내역---"); 
    System.out.println("--------------------"); 
    System.out.println("성명: " + getName()); 
    System.out.println("본봉: " + getBonbong()); 
    System.out.println("세금: " + taxCalc());
    System.out.println("수당: " + getExtraPay());
    System.out.println("실수령액: " + (silsuCalc() + getExtraPay()));
    System.out.println("\n");
  }
  
  

}

public class PayCalc {

  public static void main(String[] args) {
    Pay p1 = new Pay();
    Pay p2 = new Pay();
    Pay p3 = new Pay();

    p1.setBonbong(2000000); //200만원 
    p1.setName("왕눈이"); 
     
    p2.setBonbong(2500000); //250만원 
    p2.setName("아로미"); 
     
    p3.setBonbong(1500000); //150만원 
    p3.setName("투투");   
    
    ExtraPay ex = new ExtraPay();
    ex.setBonbong(900000);
    ex.setName("드록바");
    ex.setChild(9);
    ex.setYear(10);
    ex.printPay();
    
    ExtraPay ep = new ExtraPay("뎀바바", 360000, 18, 3);
    ep.printPay();
    
    p1.printPay();
    p2.printPay();
    p3.printPay();
    
  }

}
