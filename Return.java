import java.util.*;

public class Return{
    public static void main(String[] args) {
        greet();
        int num1 = readNumber(); 
        int num2 = readNumber();
        int num3 = readNumber();

        int sum = num1 + num2 + num3;
        System.out.println("Sum of Number is : " +sum);
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        return num;
    }

    public static void greet(){
        System.out.println("Welcome to Calculator");
    }

    
}
