import java.util.*;

public class challe16 {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Number is an even");
        }
        else{
            System.out.println("Number is an odd");
        }

    }
    
}
