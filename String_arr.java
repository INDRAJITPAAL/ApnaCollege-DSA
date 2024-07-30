public class String_arr {
    public static int stringArr(String arr[] ,String key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        String arr[]={"puri","dahi","samasa","jhilly","chatpati"};
        String key="chatpati";
        int index=stringArr(arr, key);
        System.out.println(index);
    }
}
