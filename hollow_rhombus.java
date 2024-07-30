public class hollow_rhombus {
    public static void h_rhombus(int n) {
        for(int i=1;i<=n;i++){
            //spc
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //str
            for(int j=1;j<=n;j++){
               if(i==1||i==n||j==1||j==n){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        h_rhombus(10);
    }
}
