public class methodOverriding {
    void show(){
        System.out.println("what is this shape");
    }
}
class tik extends methodOverriding{
void show(){
    System.out.println("I am square shape");
}
}
class kim
{
    public static void main(String[] args) {
        tik r = new tik();
        r.show();
    }
}