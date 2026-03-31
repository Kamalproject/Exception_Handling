import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
public class UserException {
    static void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Welcome to Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        try{
            validate(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception is occur "+e);
        }
        System.out.println("Rest of Code");
    }
}
