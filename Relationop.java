import java.util.*;

public class Relationop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome for applying Driving Lisence");
        System.out.println("Enter your Age:");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("Eligible for Driving License");
        }
        else{
            System.out.println("Not Eligible ");
        }
    }    
}
