import java.util.*;

public class chale7swap {
    public static void main(String[] args) {
        System.out.println("Welcome to Swapping station\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num1 A: ");
        int a = input.nextInt();
        System.out.println("Enter Num2 B: ");
        int b = input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("A="+a);
        System.out.println("B="+b);

    }    
}
