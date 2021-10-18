package day07;

import java.util.Vector;

public class BoxingUnBoxingMain2 {
  public static void main(String[] args) {
    Vector v = new Vector(5, 5);
    v.add(new Integer(3));// java2
    v.add(1);// boxing //Java5
    v.add(5);
    v.add(4);
    v.add(8);
    v.add(3);
    Integer gg = 3;// boxing
    int ff = new Integer(4);// unboxing
    int aa = (Integer) v.get(2);// unboxing Java5
    System.out.println("unboxing예  : " + aa);
    prints(v);
  }

  public static void prints(Vector vi) {
    int num = vi.size();
    int sum = 0;
    for (int j = 0; j < num; j++) {
      // sum+=((Integer)vi.get(j)).intValue();//java2
      sum += (Integer) vi.get(j);// unboxing //java5
    } // for
    System.out.println("합   : " + sum);
  }// prints
}
