interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    public String name;
    public Duck(String name){
        this.name=name;
    }
    @Override
    public void fly(){
        System.out.println(this.name+" can fly.");
    }
    @Override
    public void swim(){
        System.out.println(this.name+" can swim.");
    }
    void display(){
        System.out.println("Duck name: "+this.name);
        System.out.println("Abilities: ");
        this.fly();
        this.swim();
    }
}
public class A2_Q8 {
    public static void main(String[] args) {
        Duck d1 = new Duck("Swan");
        // d1.fly();
        // d1.swim();
        d1.display();
    }
}
