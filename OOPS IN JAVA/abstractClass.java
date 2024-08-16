abstract class abstractClass {
    public abstract void sound();

    
}
class Dog extends abstractClass{
    public void sound(){
        System.out.println("Dog is Barking");
    }
}
class lion extends abstractClass{
    public void sound(){
        System.out.println("lion is Barking");
    }
}
class koka{
    public static void main(String[] args) {
        Dog d = new Dog();
        lion l = new lion();
        d.sound();
        l.sound();
    }
}
