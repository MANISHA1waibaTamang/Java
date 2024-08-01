package D_control_statements.b_loop;

import java.util.Scanner;

public class c_for {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "(n*i));
        }
        sc.close();
     }
}
