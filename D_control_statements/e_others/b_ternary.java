package D_control_statements.e_others;

import java.util.Scanner;

public class b_ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        String result=(age<18)?"ineligible to get voter id.":"eligible to get voter id.";
        System.out.println(result);
        sc.close();
    }
}
