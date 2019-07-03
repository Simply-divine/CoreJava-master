import java.util.regex.Pattern;

public class Regex_practice {
    public static void main(String[] args) {
        Pattern.matches(".s","as");
        Pattern.matches("[abc]","c");
        Pattern.matches("[a-zA-Z]","as");
        Pattern.matches("[[a-e]&&[m-n]]","i");
        Pattern.matches("[amn]?","m");
        Pattern.matches("[amn]+","aamm");
        Pattern.matches("[amn]*","amma");
        Pattern.matches("\\d","1");
        Pattern.matches("\\D","e");
        Pattern.matches("\\s"," ");
        Pattern.matches("\\S","a");
        Pattern.matches("\\w","1");
        Pattern.matches("\\W"," ");
        Pattern.matches("^This is string$","This is the word.");
        Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{2,3}$","hardikvu0204@gmail.com");
        Double over= 0.5;
        String oversplit[]=String.valueOf(over).split("[.]");
        if(oversplit[1].equals("5")){
            oversplit[0]=String.valueOf(Integer.valueOf(oversplit[0])+1);
            oversplit[1]="0";
        }
        System.out.println(oversplit[0]+" "+oversplit[1]);



    }
}
