public class encapsulation {
    private int value;
    public void setValue(int x){
         value =x;
    }
    public int getValue(){
        return value;
    }
}
class kit{
    public static void main(String[] args) {
        encapsulation k = new encapsulation();
        k.setValue(50);
        System.out.println(k.getValue());
    }
}
