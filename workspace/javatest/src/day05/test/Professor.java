package day05.test;

class Person {
  String name;
  String phone;
  static int ID;

  public void setName(String s) {
    name = s;
  }

  public String getPhone() {
    return phone;
  }

  public static int getID() {
    return ID;
  }
}

class Professor extends Person {

  public void setName(String s) {
  }// 범위 좁히면 안됨 

  public String getPhone() {
    return phone;
  }// 리턴형 바꾸면 안됨

  public static int getID() {
    return ID;// 스태틱 바꾸면 안됨
  }
}