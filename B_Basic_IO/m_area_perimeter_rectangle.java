package B_Basic_IO;

import java.util.Scanner;

public class m_area_perimeter_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle :");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle :");
        int b=sc.nextInt();
        int area=l*b;
        int peri=2*(l+b);
        System.out.println("The area of rectangle is "+area);
        System.out.println("The perimeter of rectangle is "+peri);
        sc.close();
    }
}
