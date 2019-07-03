public class PrintAllSubsets {
    static Boolean isPalindrome (String data) {
        if(!data.matches("[\\w]+")){
            return false;
        }
        char array[] = data.toCharArray();
        int start = 0, end = data.length(), mid = (end / 2);
        if(mid==0)return true;
        --end;
        boolean on = false;
        while (mid > 0) {
            if ((array[start] == array[end]) ){
                ++start;
                --end;
                --mid;
                on = true;
                continue;
            } else {
                on = false;
                break;
            }
        }
        return on;
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','a'};
        for (int i = 0; i <(1<<arr.length) ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if((i&(1<<j))!=0){
                    String str=String.valueOf(arr[j]);
                    if(isPalindrome(str.trim())) {
                        System.out.println("YES");
                        System.out.println(str);
                    }
                }
            }
            System.out.println();
        }
    }
}
