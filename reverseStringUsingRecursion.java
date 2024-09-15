public class reverseStringUsingRecursion {
    public static String reverseStr(String str){
        // base case
        if(str.isEmpty()){
            return str;
        }
        // work
        return reverseStr(str.substring(1))+str.charAt(0);
        // recursive work
    }
    public static void main(String[] args) {
        String str="indrajitpal";
        System.out.println(reverseStr(str));
        // System.out.println(str.substring(1)+str.charAt(0));
    }
}
