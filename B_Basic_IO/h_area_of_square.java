package B_Basic_IO;

import java.util.Scanner;

public class h_area_of_square {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of square: ");
        int length=sc.nextInt();
        int area=length*length;
        System.out.println("the area of square is "+area);
        sc.close();
    }
}