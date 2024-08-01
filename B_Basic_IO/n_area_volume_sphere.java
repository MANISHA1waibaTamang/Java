package B_Basic_IO;

import java.util.Scanner;

public class n_area_volume_sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        double r=sc.nextDouble();
        double volume=(4/3)*3.14*(Math.pow(r,3));
        double area=4*3.14*(Math.pow(r,2));
        System.out.println("Volume of sphere = "+volume);
        System.out.println("Area of sphere = "+area);
        sc.close();
    }
}
