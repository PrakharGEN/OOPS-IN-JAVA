public class thisKeyword {
    void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        thisKeyword ram = new thisKeyword();
        System.out.println(ram);
        ram.show();
    }
}
