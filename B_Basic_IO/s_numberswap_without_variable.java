package B_Basic_IO;

public class s_numberswap_without_variable {
    public static void main(String[]args){
        int num1=10;
        int num2=20;

        System.out.println("Before swapping:");
        System.out.println("value of num is "+num1);
        System.out.println("Value of num2 is "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping:");
        System.out.println("Value of num1: "+num1);
        System.out.println("Value of num2: "+num2);
    }
}
