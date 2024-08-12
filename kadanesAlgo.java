public class kadanesAlgo {
    public static void kadanAlgo(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<number.length;i++){
            currSum+=number[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int number[]={1,-2,3,4,5};
        kadanAlgo(number);
    }
}
