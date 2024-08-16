public class parametrizedConstructor {
    int x;
    int y;
    parametrizedConstructor(int a,int b){
         x =a;
          y =b;
    }
    void show(){
        System.out.print(x+" "+y);
    }
}
class tim {
    public static void main(String[] args) {
        parametrizedConstructor prakhar = new parametrizedConstructor(100,200);
        prakhar.show();
    }
  
}
