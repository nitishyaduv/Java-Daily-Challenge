import java.util.*;

public class BitwiseLeftshift{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Operation of Bitwise Operator");
        System.out.print("Enter the first Number:");
        int first = input.nextInt();
        System.out.print("Enter second Number:");
        int second = input.nextInt();

        int result4 = first << second;
        System.out.print("Left shift Operator:" +result4);
    }

}