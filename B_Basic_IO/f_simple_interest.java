package B_Basic_IO;

import java.util.Scanner;

public class f_simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a principal: ");
        double p=sc.nextDouble();
        System.out.println("Enter a time: ");
        double t=sc.nextDouble();
        System.out.println("Enter a rate of interest: ");
        double r=sc.nextDouble();
        double si=(p*t*r)/100;
        System.out.println("Simple inetrest = "+si);
        sc.close();
    }
}
