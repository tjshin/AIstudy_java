package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

  public static void main(String[] args) {
    List < String > slist = new ArrayList < String > ();
    slist.add("Tomas");
    slist.add("Edward");
    slist.add("Jack");
    
    Stream < String > stream = slist.stream();
    stream.forEach(s -> System.out.println(s + " "));
    System.out.println();
    
    slist.stream().sorted().forEach(s -> System.out.print(s+ " ")); //스트림 새로 생성하여 정렬하여 출력한다.

  }

}
