import java.util.Scanner;
import java.util.Stack;

public class StackPop {
    public static void main(String[] args) {
        Stack s=new Stack();
        String str;
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            str=scanner.next();
            if(str=="-"){
                System.out.println(s.pop());
            }
            s.push(str);
        }

    }

}
