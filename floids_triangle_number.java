public class floids_triangle_number {
    public static void f_t_number(int n){
        int NU=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(NU+" ");
                NU++;
            }
            System.out.println();
        }
    }
        public static void main(String[] args){
            f_t_number(5);

        }
}
