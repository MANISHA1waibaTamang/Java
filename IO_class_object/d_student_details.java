package IO_class_object;
class stud{
    int roll,age;
    String name,address;
    void inputData(int r,int a,String n, String add)
    {
        roll=r;
        age=a;
        name=n;
        address=add;
    }
    void displayData(){
        System.out.println("roll no="+roll);
        System.out.println("age="+age);
        System.out.println("name="+name);
        System.out.println("address="+address);
    }
}

public class d_student_details {
    public static void main(String[] args) {
        stud s1=new stud();
        s1.inputData(10, 21, "dev", "htd");
    }
    
}
