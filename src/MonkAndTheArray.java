import java.util.Scanner;

public class MonkAndTheArray {
    public static void main(String[] args) {
        Long test_cases,N,K,result;
        Long min=Long.MAX_VALUE;
        Scanner scanner=new Scanner(System.in);
        test_cases=scanner.nextLong();
        for (int i = 0; i <test_cases ; i++) {
            N=scanner.nextLong();
            Long a[]=new Long[Math.toIntExact(N)];
            K=scanner.nextLong();
            for (int j = 0; j <N ; j++) {
                a[i]=scanner.nextLong();
                if(a[i]>min)
                    min=a[i];
            }
            result= K-min;
            System.out.println(result);

        }
    }
}
