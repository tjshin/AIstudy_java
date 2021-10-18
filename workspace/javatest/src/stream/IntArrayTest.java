package stream;
 
import java.util.Arrays;
 
public class IntArrayTest {
 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int sumVal = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count();
        //count 타입은 long
        System.out.println(sumVal);
        System.out.println(count);
        
    }
}