public class getter {
    public static void main(String[] args) {
Person p1=new Person();
System.out.println(p1.getValue());
    }
}
class Person{
    private String name="indrajitt";
    private String age;
    
    // getter
    public String getValue(){
        return name;
    }


}