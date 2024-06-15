import java.util.*;

public class BitwiseNOT{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Operation of Bitwise Operator");
        System.out.print("Enter the first Number:");
        int first = input.nextInt();
        System.out.print("Enter second Number:");
        int second = input.nextInt();

        int result = first ~ second;
        System.out.print("NOT Operator:" +result);

    }

}