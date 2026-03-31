import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Neumerator: ");
        int num=sc.nextInt();
        System.out.print("Enter Denomerator: ");
        int denum=sc.nextByte();
        try{
            float result=num/denum;
            System.out.println("Result of divison of two number is "+result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("You enter denometer as a 0 please enter another number except Zero");
        }
    }
}
