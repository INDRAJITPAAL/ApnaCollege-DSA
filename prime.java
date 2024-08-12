import java.util.*;

public class prime {
  public static void main(String[] args) {

    int n = 10899763;
    int rev=0;
    while (n > 0) {
      //last digit of given number
      int lastDigit = n % 10;
      //calculate riverse of given number
       rev =(rev*10)+lastDigit;
       //remove last digit 
       n/=10;
    }
    System.out.println(rev);

  }
}