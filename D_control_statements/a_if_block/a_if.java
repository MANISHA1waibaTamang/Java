package D_control_statements.a_if_block;

import java.util.Scanner;

public class a_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("The number "+n+" is positive number.");
        }
        sc.close();
    }
}
