public class permutation {
    public static void perMutation(String str,String per){
        if(str.isEmpty()){
            System.out.print(per+", ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            perMutation(newStr, per+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        perMutation(str,"");
    }
}
