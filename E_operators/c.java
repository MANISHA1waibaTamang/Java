package E_operators;

import java.util.Scanner;

public class c{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c=sc.nextInt();

        if(a>b && b>c)//use of logical AND operator
        {
            System.out.println(+a+ " is greater than "+b+ " and "+c);
        }
        else if(b>a && a>c){
            System.out.println(+b+" is greater than "+a+" and "+c);
        }
        else{
            System.out.println(+c+" is greater than "+a+" and "+b );
        }
    }
}