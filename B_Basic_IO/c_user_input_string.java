package B_Basic_IO;

import java.util.Scanner;

public class c_user_input_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.next();
        System.err.println("The name is "+name);
        sc.close();

    }
}
