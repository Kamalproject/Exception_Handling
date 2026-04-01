import java.util.Scanner;
class InvalidAgeException1 extends Exception{
    public InvalidAgeException1(String str){
        super(str);
    }
}
class InvalidNameException extends Exception{
    InvalidNameException(String s){
        super(s);
    }
}

class Student{
    int roll;
    String name;
    int age;
    String course;
    Student(int r,String n,int a,String c){
        roll=r;
        name=n;
        age=a;
        course=c;
    }
}
public class ValidStudent2 {
    static void Avalidate(int age)throws InvalidAgeException1{
        if(age<15 || age>21){
            throw new InvalidAgeException1("You are not in Age range");
        }
        else{
            System.out.println("Welcome to Our School");
            
        }
    }
    static void Nvalidate(String name)throws InvalidNameException{
        boolean special=false;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            
            if(!Character.isLetter(c) && c!=' '){
                special=true;
                break;
            }
        }
        if(special){
            throw new InvalidNameException("Name contains special character ");
        }
        else{
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=sc.nextInt();
                
       try{
           
           Avalidate(age);
           sc.nextLine();
           System.out.print("Enter Your name ");
           String name=sc.nextLine();           
           Nvalidate(name);               
           System.out.print("Which course you want to enrolled ");
           String course=sc.nextLine();
           System.out.print("What is your roll no: ");
           int roll=sc.nextInt();
           System.out.println(name+" You enrolled "+course+" and your Roll no is "+roll);
        }  
        catch(InvalidAgeException1 e1){
            System.out.println("Exception occur at age");
            System.out.println(e1);
        }
       catch(InvalidNameException e2){
           System.out.println("Exception occur at Name");
           System.out.println(e2);
       }
    }
}


