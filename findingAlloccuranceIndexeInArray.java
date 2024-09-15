public class findingAlloccuranceIndexeInArray {
    public static void findOccurance(int arr[],int idx,int key){
        //base case
        if(idx==arr.length){
            return;
        }
        // work
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        // recursive work
        findOccurance(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,7,8,90,7,7,8,9};
        findOccurance(arr, 0, 7);
    }
}
