import java.util.*;

public class chale18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Calculator");
        System.out.println("Enter your year,You want to Checks: ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            System.out.println("Your year is Leap Year");
        }
        else{
            System.out.println("Your year is not Leap Year");
        }
    }
    
}
