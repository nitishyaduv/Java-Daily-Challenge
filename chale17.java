import java.util.*;

public class chale17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome For finding greatest number ");
        System.out.println("Enter Number: Num1, Num2, Num3");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("The greatest Number is:" +num1);
        }
        else if(num2 >= num3){
            System.out.println("The greatest Number is:" +num2);
        }
        else{
            System.out.println("The greatest Number is:" +num3);
        }

    }
    
}
