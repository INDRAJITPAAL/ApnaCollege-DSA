public class numberToStringmodifiedCode {
    public static void changeNumberToString(int n, StringBuilder newstr) {
        if (n == 0) {
            return;
        }
       changeNumberToString(n / 10, newstr);
       int LastDigit=n%10;

        switch (LastDigit) {
            case 0:
                newstr.append(" zero");
                break;
            case 1:
                newstr.append(" one");
                break;
            case 2:
                newstr.append(" two");
                break;
            case 3:
                newstr.append(" three");
                break;
            case 4:
                newstr.append(" four");
                break;
            case 5:
                newstr.append(" five");
                break;
            case 6:
                newstr.append(" six");
                break;
            case 7:
                newstr.append(" seven");
                break;
            case 8:
                newstr.append(" eight");
                break;
            case 9:
                newstr.append(" nine");
                break;
            default:
                newstr.append(" ");
        }
        
       
   

    }

    public static void main(String[] args) {

        int n = 6789;
        StringBuilder newStr=new StringBuilder();
        changeNumberToString(n, newStr);
        System.out.println(newStr);
    }
}
