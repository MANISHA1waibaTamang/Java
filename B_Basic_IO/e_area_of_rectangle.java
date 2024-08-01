package B_Basic_IO;

import java.util.Scanner;

public class e_area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length: ");
        int l=sc.nextInt();
        System.out.println("Enter a breadth: ");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("The area of rectangle "+area+"m.sqr");
        sc.close();
    }
}
