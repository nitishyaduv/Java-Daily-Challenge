import java.util.*;

public class chale29OddSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wel to Odd Sum Calculator");
        System.out.println("Enter a Number: ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("Odd Sum till " +num + " is " +sum);
    }
    public static int OddSum(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;

    }

}