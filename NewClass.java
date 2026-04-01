import java.util.Scanner;
class InvalidAgeException2 extends Exception{
    public InvalidAgeException2(String str){
        super(str);
    }
}
class InvalidNameException2 extends Exception{
    public InvalidNameException2(String str){
        super(str);
    }
}
class Student{
    String name;
    int roll;
    int age;
    String course;
    Student(String name,int roll, int age,String course){
        this.name=name;
        this.roll=roll;
        this.age=age;
        this.course=course;
    }
    static void Avalidate(int age) throws InvalidAgeException2{
        if(age<15 || age>21){
            throw new InvalidAgeException2("You are not in age range ");
        }
        else{
            System.out.println("Welcome to school");
        }
    }
    static void Nvalidate(String n)throws InvalidNameException2{
        boolean symbol=false;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            
            if(!Character.isLetter(c) && c!=' '){
                symbol=true;
                break;
            }
        }
        if(symbol){
            throw new InvalidNameException2("Your name contains Special character");
        }
        else{
            System.out.println("Your name is "+n);
        }
    }
}
public class NewClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            Student.Avalidate(age);
            sc.nextLine();
            System.out.print("Enter your name: ");
            String n=sc.nextLine();
            Student.Nvalidate(n);
            System.out.print("Enter your course ");
            String co=sc.nextLine();
            System.out.print("What is your roll  no: ");
            int roll=sc.nextInt();
            System.out.println("Good Day "+n+" you enrolled "+co+" course "+" your Roll no is "+roll);
        }
        catch(InvalidAgeException2 e1){
            System.out.println("Exception occur at Age ");
            System.out.println(e1);
        }
        catch(InvalidNameException2 e2){
            System.out.println("Exception occur at Name");
            System.out.println(e2);
        }
    }
}
