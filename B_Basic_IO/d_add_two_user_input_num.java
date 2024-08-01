package B_Basic_IO;

import java.util.Scanner;

public class d_add_two_user_input_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" =" +sum);
        sc.close();
    }
}
