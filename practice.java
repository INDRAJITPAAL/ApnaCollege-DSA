public class practice {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.canThink();
    }
}

//interface practice 
interface Animal{
    void walk();
    // void talk();
    // void eat();
    // void breathTime();
    // void skinColor();

}

interface Human{
// void hight();
void canThink();
}


class Deer implements Animal,Human{
    public void walk(){
        System.out.println("Deer walk with 4 legs");
    }
    public void canThink(){
        System.out.println("Deer cannot think");
    }




     
}