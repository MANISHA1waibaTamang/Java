package D_control_statements.a_if_block;

import java.util.Scanner;

public class c_if_else{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number check whether it is positive or negative :");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive.");
        }
        else{
            System.out.println("Number is negative.");
        }
        sc.close();
    }
}