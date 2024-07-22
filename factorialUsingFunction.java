public class factorialUsingFunction {
    public static float fact(float n){
      if(n==0){
        return 1;
      }
      return n*fact(n-1);
    }
    public static float binCoeffi(float n,float r){
      float fact_n=fact(n);
      float fact_r=fact(r);
      float fact_nMr=fact(n-r);
      return fact_n/(fact_r*fact_nMr);
    }
    public static void main(String[] args) {
        System.out.println(binCoeffi(5.0f, 4.0f));

     
    }
    
}
