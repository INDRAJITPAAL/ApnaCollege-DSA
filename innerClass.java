public class innerClass {
    public static void main(String[] args) {
        OuterClass myOuterClass=new OuterClass();
        OuterClass.InnerClass myInner =myOuterClass.new InnerClass();
        System.out.println(myOuterClass.y);
        System.out.println(myInner.x);
    }
}

class OuterClass {
    int y=20;
     class InnerClass{

        int x = 10;
    }
   
}
