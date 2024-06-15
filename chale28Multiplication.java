import java.util.*;

public class chale28Multiplication {0
    public static void main(String[] args){
        System.out.println("Welcome to Print Table");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        printMultiplication(num);

    }
    public static void printMultiplication(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " X " +i + " =  " +(num*i));
            i++;
        }
    }

    
}
