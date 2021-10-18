package day07.coding;

import java.util.Vector;

public class BoxBox {

  public static void main(String[] args) {
    Vector < Boolean > v = new Vector < Boolean > (5, 5);
    v.add(1 + 1 == 3);
    v.add(4 > 3);
    v.add(5 <= 5);
    v.add(4 < Math.PI);
    v.add(-1 > 0);
    prints(v);
  }
  
  public static void prints(Vector < Boolean > vt) {
    int num = vt.size();
    
    for(int i = 0 ; i < num ; i++ ) {
      System.out.println(vt.get(i));
    }
    System.out.println("vt.size() : " + vt.size());
    System.out.println("vt : " + vt);

  }

}
