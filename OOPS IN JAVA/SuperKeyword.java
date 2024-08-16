public class SuperKeyword {
    int a=10;
}
class Tic extends SuperKeyword{
    int a =20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class kox{
    public static void main(String[] args) {
        Tic r = new Tic();
        r.show();
    }
}
//similarly it works for method and constructor
//in default constructor we need not to call it it will automatically do but in case of parametrized constructor we need to do
