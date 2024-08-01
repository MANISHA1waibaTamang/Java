package B_Basic_IO;

import java.util.Scanner;

public class i_volume_of_cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Length:");
         int L=sc.nextInt();
         System.out.println("Enter Breadth:");
         int B=sc.nextInt();
         System.out.println("Enter Height:");
         int H=sc.nextInt();
         int volume=L*B*H;
         System.out.println("the volume of cuboid is "+volume);
         sc.close();
    }
}
