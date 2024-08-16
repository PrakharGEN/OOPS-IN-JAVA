public class copyConstructor {
    int a;
    String name;
    copyConstructor(){
        a=11;
        name="rakesh";
    }
    copyConstructor(copyConstructor ref){
        a=ref.a;
        name=ref.name;
        System.out.print(a+" "+name);
    }
}
class C{
public static void main(String[] args) {
    copyConstructor prakhar = new copyConstructor();
    copyConstructor r2 = new copyConstructor(prakhar);
;
}


}
   


