public class Oriverse_array {
    public static void riverseArr(int arr[] ) {
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        riverseArr(arr);
        for(int A:arr){
            System.out.print(A+" ");
        }
    }
}
