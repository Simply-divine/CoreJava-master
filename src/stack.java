import java.util.Stack;

public class stack {
    static Boolean balanceString(String s){
        Stack<Character> st=new Stack<>();

        char c[]=new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            st.push(s.charAt(i));
            else if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']'){
                if(checkPair(s.charAt(i),st.pop())){
                    continue;
                }
                else{
                    return false;
                }
            }

        }
        return true;
    }
    public static boolean checkPair(char c2,char c1){
        if(c1=='{'&&c2=='}'){
            return true;
        }
        if(c1=='['&&c2==']'){
            return true;
        }
        if(c1=='('&&c2==')'){
            return true;
        }
        else
            return false;


    }

    public static void main(String[] args) {
        String s="({[])";
        if(balanceString(s)){
            System.out.println("balanced string");
        }
        else
            System.out.println("unbalanced string");
    }
}
