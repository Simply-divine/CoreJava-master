public class ExceptionPractice2 {
    public static void main(String[] args) {
        //try catch blocks loop
        int a;
        String s;
        try {
            try {
              a=Integer.valueOf("aaa");
            }
            catch (Exception e){
                System.out.println(e);
            }
            try {
                s=null;

            }
            catch (Exception e){
                System.out.println(e);
            }
            //can use throw for generating custom exception
            try{
                a=101;
                if(a>100){
                    throw new MyCustomOne("NUMBER CANNOT BE GREATER THAN 100");
                }
            }catch (Exception e){
                System.out.println(e.getCause());
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class MyCustomOne extends Exception {

    public MyCustomOne(String message) {
        super(message);
    }


}