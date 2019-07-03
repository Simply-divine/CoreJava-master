import java.util.Scanner;

public class Fibonacciseries {

    public static void main(String[] args) {
       int result,j,n;
       Scanner scanner=new Scanner(System.in);

       n=scanner.nextInt();
       if(n==0) System.out.println("0");
       else {

           result = fibonacci(n);

           System.out.println(result);
       }

    }

    private static int fibonacci(int n) {
        int M[][]={{1,1},{1,0}};
        //int F[    ][]=new int[2][2];
        if(n!=0)
        power(M,(n-1));
        return M[0][0];
    }

    private static void power(int[][] m, int n) {
        if (n == 0||n==1) {
            return;
        }
        int f[][]={{1,1},{1,0}};
        power(m,n/2);
        multiply(m,m);
        if(n%2!=0){
            multiply(m,f);
        }
    }

    private static void multiply(int[][] m, int[][] f) {
        int x=m[0][0]*f[0][0]+m[0][1]*f[1][0];
        int y=m[0][0]*f[0][1]+m[0][1]*f[1][1];
        int z=m[1][0]*f[0][0]+m[1][1]*f[1][0];
        int w=m[1][0]*f[0][1]+m[1][1]*f[1][1];
        m[0][0]=x;
        m[0][1]=y;
        m[1][0]=z;
        m[1][1]=w;
    }


}
