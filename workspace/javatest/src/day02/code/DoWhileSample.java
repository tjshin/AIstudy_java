package day02.code;
public class DoWhileSample {
public static void main (String[] args) {
char a = 'a';
 
do {
System.out.print(a);
a = (char) (a + 1); // 1을 더하면 다음 문자에 해당하는 ASCII값이 됨
} while (a <= 'z');
}
}