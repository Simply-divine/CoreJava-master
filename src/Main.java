import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int tests = in.nextInt();
        for (int i = 0; i < tests; i += 1) {
            int n = in.nextInt();
            int[] startArray = readArray(in, n);
            int[] finalArray = readArray(in, n);

            boolean res = solve(startArray, finalArray);
            out.println((res ? "YES" : "NO"));
        }
        out.close();
    }

    private static int[] readArray(Scanner in, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i += 1) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    private static boolean solve(final int[] startArray, final int[] finalArray) {
        int n = startArray.length;
        PosKeeper pos = new PosKeeper(n);
        IntervalTree tree = new IntervalTree(n);

        for (int i = 0; i < n; i += 1) {
            pos.addLast(startArray[i], i);
            tree.changeValue(i, startArray[i]);
        }

        for (int i = n - 1; i >= 0; i -= 1) {
            int startPos = pos.getLast(finalArray[i]);
            if (startPos == -1) {
                return false;
            }

            int maxOnTheWay = tree.getMax(startPos, n - 1);
            if (maxOnTheWay > finalArray[i]) {
                return false;
            }

            pos.removeLast(finalArray[i]);
            tree.changeValue(startPos, -1);
        }
        return true;
    }
}

class PosKeeper {
    private List<LinkedList<Integer>> pos;

    public PosKeeper(int maxNum) {
        pos = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i <= maxNum; i += 1) {
            pos.add(new LinkedList<Integer>());
        }
    }

    public void addLast(int num, int pos) {
        this.pos.get(num).addLast(pos);
    }

    public void removeLast(int num) {
        pos.get(num).removeLast();
    }

    public int getLast(int num) {
        if (pos.get(num).size() <= 0) {
            return -1;
        }
        return pos.get(num).getLast();
    }
}

class IntervalTree {
    private int[] nodes;
    private int size;

    public IntervalTree(int size) {
        this.nodes = new int[4 * size];
        this.size = size;
    }

    public void changeValue(int pos, int newValue) {
        changeValue(0, 0, size - 1, pos, newValue);
    }

    private void changeValue(int node, int left, int right, int pos, int newValue) {
        if (left == right) {
            nodes[node] = newValue;
            return;
        }

        int mid = left + (right - left) / 2;
        if (pos <= mid) {
            changeValue(leftSon(node), left, mid, pos, newValue);
        } else {
            changeValue(rightSon(node), mid + 1, right, pos, newValue);
        }

        calculateValue(node);
    }

    private void calculateValue(int node) {
        nodes[node] = 0;
        if (leftSon(node) < nodes.length) {
            nodes[node] = Math.max(nodes[node], nodes[leftSon(node)]);
        }
        if (rightSon(node) < nodes.length) {
            nodes[node] = Math.max(nodes[node], nodes[rightSon(node)]);
        }
    }

    public int getMax(int left, int right) {
        return getMax(0, 0, size - 1, left, right);
    }

    private int getMax(int node, int left, int right, int x, int y) {
        if (x <= left && right <= y) {
            return nodes[node];
        }

        int value = 0;
        int mid = left + (right - left) / 2;

        if (x <= mid) {
            value = Math.max(value, getMax(leftSon(node), left, mid, x, y));
        }
        if (mid < y) {
            value = Math.max(value, getMax(rightSon(node), mid + 1, right, x, y));
        }

        return value;
    }

    private static int leftSon(int node) {
        return 2 * node + 1;
    }

    private static int rightSon(int node) {
        return 2 * node + 2;
    }
}

class Scanner {
    private BufferedReader br;
    private StringTokenizer st;

    public Scanner(InputStream in) {
        br = new BufferedReader(new InputStreamReader(in));
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    private String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
}