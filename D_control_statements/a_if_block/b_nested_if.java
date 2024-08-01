package D_control_statements.a_if_block;

import java.util.Scanner;
public class b_nested_if {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number less than 100 :");
        int n=sc.nextInt();
        if(n<100){
            if(n<50){
                System.out.println("The number "+n+" is less than 50.");
            }
            if(n>50){
                System.out.println("The number "+n+" is greater than 50.");
            }
            if(n==50)
            {
                System.out.println("The number is equal to 50.");
            }
        }
        sc.close();
    }
}
