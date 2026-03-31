import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
class Student{
    String name;
    int roll;
    int age;
    String course;
    
    Student(String n,int r,int a,String c)throws InvalidAgeException{
        
        name=n;
        roll=r;
        age=a;
        course=c;
    }

    
}
public class ValidStudent {
    static void validate(int age)throws InvalidAgeException{
        if(age<15 || age>21){
            throw new InvalidAgeException("OOPs! You are not in my age range ");
        }
        else{
            //System.out.println("Name is "+name);
            System.out.println("Welcome to Progamming world");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the Student: ");
        String name=sc.nextLine();
        System.out.print("Enter the roll of the Student: ");
        int roll=sc.nextInt();
        System.out.print("What is the age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Which course you enrolled: ");
        String course=sc.nextLine();
        
        System.out.print("Which year: ");
        String year=sc.nextLine();
        
        try{
            validate(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
