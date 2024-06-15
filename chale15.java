import java.util.*;

public class chale15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to Number checker calculator");
        System.out.println("Enter a number:");
        int num = input.nextInt();
        
        if(num > 0){
            System.out.println("Number is posative");
        }
        else if(num == 0){
            System.out.println("Number is Zero");
        }
        else{
            System.out.println("Number is Negative");
            
        }
    }
    
}
