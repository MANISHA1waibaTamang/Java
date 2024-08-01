package D_control_statements.a_if_block;

import java.util.Scanner;

public class f_if_elseif_else {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check negative, positive or zero :");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number is positive.");
        }
        else if(n<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
        sc.close();
    }
}
