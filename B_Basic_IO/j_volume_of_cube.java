package B_Basic_IO;

import java.util.Scanner;

public class j_volume_of_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int l=sc.nextInt();
        int volume=(int) Math.pow(l,3);
        System.out.println("The volume of cube is "+volume+" ut.cb");
        sc.close();
    }
}
