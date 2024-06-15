import java.util.*;

public class chale31SumofDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digit");
        System.out.println("Enter a Number: ");
        int num = input.nextInt();
        int sum = sumOfdigit(num);
        System.out.println("Sum of Digit is: " +sum);

    }
    public static int sumOfdigit(int num){
        int sum = 0;
        while(num > 0){
            sum += (num % 10);
            num/=10;
        }
        return sum;
    }
    
}
