import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class CompilerVersion {
    public static void main(String[] args) {
        //Stack stack = new Stack();
        String[] s = new String[2000];
        int i=0;
        char str[]=new char[60];
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            s[i]=scanner.nextLine();
            if(s[i].contains("//")) {
                int k = s[i].indexOf("//");
              //  System.out.println("k="+k);
                String sub = s[i].substring(0, k);
                sub=sub.replaceAll("->", ".");
                s[i]=sub+s[i].substring(k,s[i].length());
            }
            else{
                s[i]=s[i].replaceAll("->",".");
            }
            i++;
        }
        for (int j = 0; j <i ; j++) {
            System.out.println(s[j]);
        }
    }

}
