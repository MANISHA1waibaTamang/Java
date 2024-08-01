package IO_class_object;

import java.util.Scanner;

class studn{
    int roll,age;
    String name;
    void getData(Scanner sc){
        roll=sc.nextInt();
        age=sc.nextInt();
        name=sc.next();
    }
    void Display(){
        System.out.println("Roll="+roll);
        System.out.println("age="+age);
        System.out.println("name="+name);
    }
}
public class e_user_input_student_details {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the details of the student1:");
    studn st1=new studn(); 
    st1.getData(sc);

    System.out.println("Enter the details of the student2:");
    studn st2=new studn();
    st2.getData(sc);

    System.out.println("Enter the details of student3");
    studn st3=new studn();
    st3.getData(sc);

    System.out.println("Details of the student1");
    st1.Display();

    System.out.println("Details of the student2");
    st2.Display();

    System.out.println("Details of the student3");
    st3.Display();
    sc.close(); 
}
}
