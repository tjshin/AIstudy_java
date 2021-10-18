package day07;

public class AutoBoxingUnBoxing {
  public static void main(String[] args) {
    int i = 10;
    Integer intObject = i; // auto boxing
    System.out.println("intObject = " + intObject);
    i = intObject + 10; // auto unboxing
    System.out.println("i = " + i);
  }
}