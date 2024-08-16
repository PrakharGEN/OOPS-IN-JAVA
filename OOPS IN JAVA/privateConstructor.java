public class privateConstructor {
    int a;
    String b;
    double c;

    private privateConstructor(){
a=10;
b="prakhar";
c=22.45;
System.out.print(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        privateConstructor A = new privateConstructor();
    }
   
}
class D
{
    public static void main(String[] args) {
        privateConstructor A = new  privateConstructor();
    }
}