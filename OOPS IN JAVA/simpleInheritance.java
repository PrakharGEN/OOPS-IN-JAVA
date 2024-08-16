public class simpleInheritance {
    int roll;
    int marks;
    String name;
    void input(){
        System.out.println("Enter the roll no and marks");
    }
}
class trip extends simpleInheritance
{
    void disp()
    {
        roll=1;
        name="ankit";
        marks=89;
        System.out.println(roll+" "+name+" "+" "+marks);
    }
    public static void main(String[] args) {
        trip r = new trip();
        r.input();
        r.disp();

    }
}
