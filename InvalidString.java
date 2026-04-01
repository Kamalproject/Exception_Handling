import java.util.Scanner;
class VowelException extends Exception{
    public VowelException(String input){
        super(input);
    }
}
class BlankException extends Exception{
    public BlankException(String input){
        super(input);
    }
}
class ExitException extends Exception{
    public ExitException(String input){
        super(input);
    }
}

class TestException{
    String str;
    TestException(String str){
        this.str=str;
    }  
    void Check()throws VowelException,ExitException,BlankException{
        
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                throw new VowelException("String contains vowel");
            }
        }
        if(str.isEmpty()){
            throw new BlankException("String is null");
        }
        
        if(str.equals("X")){
            throw new ExitException("You enter the stop signal");
        }
    }
}
public class InvalidString {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String ");
        String str=sc.nextLine();
        try{
            TestException teE=new TestException(str);
            teE.Check();
            //System.out.println("String is "+str);
        }
        catch(VowelException e){
            System.out.println("Exception occur at Vowel");
            System.out.println(e);
        }
        catch(ExitException e1){
            System.out.println("Exception occur at Stop signal ");
            System.out.println(e1);
        }
        catch(BlankException e2){
            System.out.println("Exception occur at string");
            System.out.println(e2);
        }
    }
}
