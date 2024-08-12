public class find_value_in_array {
    public static int find_value(int arr[] ,int value) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
     return -1;   
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+i*36;
        }
        int value=148;
        System.out.println(find_value(arr,value));
    }
}
