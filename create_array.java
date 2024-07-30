import java.util.*;
public class create_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark[]=new int[10];
       for(int i=0;i<10;i++){
        mark[i]=sc.nextInt();
       }
       for(int i:mark){
        System.out.print(i+", ");
       }
    }
}
