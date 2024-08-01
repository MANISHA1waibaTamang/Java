package E_operators;

import java.util.Scanner;

public class d_logical_AND_OR_triangle_side {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("In triangle ABC:");
        System.out.println("Enter lenght of side BC(a) : ");
        int a=sc.nextInt();
        System.out.println("Enter length of side AC(b) : ");
        int b=sc.nextInt();
        System.out.println("Enter the lenght of side AB(c) : ");
        int c=sc.nextInt();

        if(a==b && b==c){
            System.out.println("Equilateral Triangle.");
        }
        else if(a==b || b==c || a==c){
            System.out.println("Isosceles triangle.");
        }
        else{
            System.out.println("Scalane triangle.");
        }
        sc.close();
    }    
}
 