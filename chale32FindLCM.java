import java.util.*;

class chale32FindLCM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Enter a first Nnumber: ");
        int first = input.nextInt();
        System.out.println("Enter second Number:");
        int secomd = input.nextInt();
        int Lcm = Lcm(first,second);
        System.out.println("Lcm fo two Number: " +Lcm);

    }
    public static int Lcm(int first, int second){
        int i =1;
        while(true){
            int factor = first * i;
            if(factor % second == 0){
                return factor;             
            }
            i++
        }
    }
}