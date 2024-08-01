package B_Basic_IO;

import java.util.Scanner;

public class r_swap_number_with_user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the value of num2 :");
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("the value of num1 is "+num1);
        System.out.println("The value of num2 is "+num2);
        sc.close();
    }
}
