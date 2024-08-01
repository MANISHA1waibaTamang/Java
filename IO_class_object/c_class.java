package IO_class_object;

class student{
    int roll=9;
    String name="dev";
}
public class c_class{
    public static void main(String[] args) {
        student s1=new student();
        System.out.println("Roll no="+s1.roll);
        System.out.println("Name="+s1.name);
    }
}
