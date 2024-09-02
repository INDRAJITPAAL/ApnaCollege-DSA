public class printLargestString {
    public static void largestString(String str[]){
        String Largest=str[0];
        for(int i=1;i<str.length;i++){
            if(Largest.compareTo(str[i])<0){
                Largest=str[i];
            }
        }
        System.out.println(Largest);
    }
    public static void main(String[] args) {
        String str[]={"apple","mango","banana","zebra"};
        largestString(str);
    }
}
