package day03.coding;

public class Pay3 {

  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    
    System.out.print("경력 년수를 입력하세요: "); 
    int year = in.nextInt();  
    System.out.print("자녀수를 입력하세요: "); 
    int child = in.nextInt(); 
    System.out.print("자격증 선택(0-없음, 1-기능사, 2-산업기사, 3-기사): "); 
    int license = in.nextInt();
    System.out.print("자격증 이름을 입력하세요: ");
    String name = in.next();
    
    int year_pay = year * 200000; 
    int child_pay = child * 200000; 
    int basic = 1600000; 
     
    int license_pay = 0; 
    if (license == 1){  
      license_pay = 100000; 
    }else if(license == 2){ 
      license_pay = 150000; 
    }else if(license == 3){ 
      license_pay = 200000; 
    } 

    int decide_pay = basic + year_pay + child_pay + license_pay;   
    int annual_salary = decide_pay * 13;
    
    System.out.println("-----------------------"); 
    System.out.println("JAVA 개발자 급여 내역서"); 
    System.out.println("-----------------------"); 
    System.out.println("기본급    : " + basic); 
    System.out.println("경력 년수  : " + year); 
    System.out.println("경력 수당  : " + year_pay); 
    System.out.println("자녀수    : " + child); 
    System.out.println("자녀 수당 : " + child_pay);
    System.out.println("자격증 명 : " + name);
    System.out.println("자격증 수당: " + license_pay); 
    System.out.println("결정된 급여: " + decide_pay); 
    System.out.println("결정된 연봉: " + annual_salary); 
    System.out.println("-----------------------"); 
    
    

  }

}
