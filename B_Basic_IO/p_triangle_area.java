package B_Basic_IO;

import java.util.Scanner;

public class p_triangle_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of triangle :");
        float b=sc.nextFloat();
        System.out.println("Enter height of triangle :");
        float h=sc.nextInt();
        float area=(float) (0.5*b*h);
        System.out.println("The area of triangle is "+area);
        sc.close();
    }
}
