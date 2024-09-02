public class StringAllInbultFunction {
    public static void main(String[] args) {
        String str = "tony";
        String str2 = new String("tony");
        String largest = "";
        // 1.
        // compare fuuction that comparing between two letter str to str2
        if (str.compareTo(str2) <= 0) {
            largest = str2;
        }
        // consideering upper and lower no difference
        if (str.compareToIgnoreCase(str2) <= 0) {
            largest = str2;
        }
        System.out.println(largest);
        // 2.
        // String Bulder
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        // 3.
        // equal to function
        if (str.equals(str2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        // comparing
        if (str == str2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        // String length()
        System.out.println(str.length());

        // 4.
        // lower case to upper case are
        System.out.println(str.toUpperCase());

        //typecasting of string 
        System.out.println(sb.toString());

    }
}
