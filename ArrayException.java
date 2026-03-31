public class ArrayException {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("You try to access the element from out site of sie");
        }
        System.out.println("Finally block executed");
    }
}
