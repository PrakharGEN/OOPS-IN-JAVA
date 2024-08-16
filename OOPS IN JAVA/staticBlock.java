public class staticBlock {
    public static void main(String[] args) {
        staticBlock A = new staticBlock();
    }
    staticBlock(){
        System.out.println("I am constructor");
    }
    static{
      System.out.println("I am static block");
    }
    {
        System.out.println("I am instance block");
    }
}
