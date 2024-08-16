public class compiletimePolymorphism {
    void add(){
        int a =10;
        int b=20;
        int c ;
        c=a+b;
        System.out.println(c);
    }
    void add(int x ,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        compiletimePolymorphism rom = new compiletimePolymorphism();
        rom.add(19, 25);
        rom.add();
        rom.add(14, 56.14);
    }
}
