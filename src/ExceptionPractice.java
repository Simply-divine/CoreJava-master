import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 0;
        try {
            try{
                a = Integer.valueOf("aaa");//number format exception

            }catch (Exception e){
                System.out.println("APP ERROR 123: STRING TO NUMBER CONVERSION");
            }
            try{
                a = Integer.valueOf("aaa");//number format exception

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            try {
                Scanner scanner=new Scanner(System.in);
               // int n=scanner.nextInt();//if we dont give a number input mismatch exception
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                String s=null;
                System.out.println(s.length());//null pointer
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                int arr[]={0,1};
                System.out.println(arr[2]);//array index out of bounds
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                a = 102;
                if(a > 100){
                    throw new MarksInvalidException("NUMBER MUST BE LESS THAN 0!");
                }
            }catch (ArithmeticException | MarksInvalidException e){
                System.out.println(e);
            }



        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}


class MarksInvalidException extends Exception{

    public MarksInvalidException(String message) {
        super(message);
    }
}