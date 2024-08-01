package E_operators;

import java.lang.Math;

import java.util.Scanner;

    
public class b_arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=sc.nextInt();
        System.out.println("Enter second number : ");
        int n2=sc.nextInt();

        System.out.println("sum = "+(n1+n2));
        System.out.println("difference = "+(n1-n2));
        System.out.println("product = "+(n1*n2));
        System.out.println("quotient = "+(n1+n2));
        System.out.println("remainder = "+(n1%n2));
        System.out.println("exponential = "+(int)Math.pow(n1,n2));

        sc.close();
    }
}
