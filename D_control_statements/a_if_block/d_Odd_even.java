package D_control_statements.a_if_block;

import java.util.Scanner;

public class d_Odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd :");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The number "+n+" is even.");
        }
        else{
            System.out.println("The number is "+n+" is odd.");
        }
        sc.close();
    }
}
