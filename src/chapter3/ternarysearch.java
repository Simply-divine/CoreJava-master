package chapter3;

import java.util.Scanner;

public class ternarysearch {
    static long func(long x){
        return 2*x*x-12*x+7;
    }
    static long ternarysearch(long l, long r){
        for (int i = 0; i <200 ; i++) {
            long mid1=(2*l+r)/3;
            long mid2=(l+2*r)/3;


            if(func(mid1)<func(mid2)){
                
            }
            else r=mid1;
        }
        System.out.println("data " + func(l));
        long x = l;
        return func(x);

    }
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        long result[]=new long[n];
        for (int i = 0; i <n; i++) {

            long l= scanner.nextInt();
            long r=scanner.nextInt();
            result[i]=ternarysearch(l,r);
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(result[i]);
        }

    }
}
