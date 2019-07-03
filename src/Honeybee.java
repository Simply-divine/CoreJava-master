import java.util.Arrays;
import java.util.Scanner;

public class Honeybee {
    static int result = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(), n, m, q, number_to_hop, x, y;

        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            int a[][] = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    a[j][k] = scanner.nextInt();
                }
            }
            // System.out.println(Arrays.deepToString(a));
            q = scanner.nextInt();
            for (int j = 0; j < q; j++) {
                number_to_hop = scanner.nextInt();
                x = scanner.nextInt();
                y = scanner.nextInt();
                getHoney(number_to_hop, x, y, a);
            }


        }
    }

    private static void getHoney(int number_to_hop, int x, int y, int[][] a) {

//   +  + +++;
        if (number_to_hop == 1) {
            try {
                result += a[x][y - 1];
            } catch (Exception e) {
            }
            try {
                result += a[x - 1][y];
            } catch (Exception e) {
            }
            try {
                result += a[x][y + 1];
            } catch (Exception e) {
            }
            try {
                result += a[x + 1][y - 1];
            } catch (Exception e) {
            }
            try {
                result += a[x + 1][y];
            } catch (Exception e) {
            }
            try {
                result += a[x + 1][y + 1];
            } catch (Exception e) {
            }

        } else if (number_to_hop == 2) {
            try {
                result += a[x + 1][y - 1];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x + 2][y];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x + 1][y + 1];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x + 1][y + 2];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x][y + 2];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x - 1][y + 2];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x - 2][y + 1];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x - 2][y];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x - 2][y - 1];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x - 1][y - 2];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x][y - 2];
            } catch (Exception e) {
                //System.out.println("hop2");
            }
            try {
                result += a[x + 1][y - 2];
            } catch (Exception e) {
                //System.out.println("hop2");
            }


            // new

        }
    }
}