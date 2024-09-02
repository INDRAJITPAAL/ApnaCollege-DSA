
public class Practice {
  public static int clearIth(int n, int i) {
    int bitMas = ~(1 << i);
    return (n & bitMas);

  }

  public static int setrIth(int n, int i) {
    int bitMask = 1 << i;
    return n | bitMask;
  }

  public static int updateIthBit(int n, int i, int newBit) {
    if (newBit == 0) {
      return clearIth(n, i);
    } else {
      return setrIth(n, i);
    }
  }

  public static void main(String[] args) {
    System.out.println(updateIthBit(10, 2, 0));
  }
}
