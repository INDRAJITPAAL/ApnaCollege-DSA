// Car attribute
public class m {
  public static String kd(String str) {
    StringBuilder sb = new StringBuilder(" ");
    sb.append(Character.toUpperCase(str.charAt(0)));
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      }else{
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "indrajit pal and comming forward nepal and comming to very large scale";
    System.out.println(kd(str));
  }
}
