import java.util.*;

public class threeLARGEST {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 20554450;
    int b = 7978;
    int c = 30874;
    if (a > b && a > c) {
      System.out.println(a);
    } else if (b > a && b > c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }
  }
}
