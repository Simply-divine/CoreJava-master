package chapter4;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");
        sb.append("sumit");

        System.out.println(sb.length() + " " +sb.capacity());
        sb.ensureCapacity(500);
        System.out.println(sb);
        System.out.println(sb.substring(0,5));
        sb.insert(5, " more ");
        sb.replace(6, 10, "Java");
        sb.delete(0, 6);
        sb.reverse();
        sb.trimToSize();
        System.out.println(sb);
        System.out.println(sb.length() + " " +sb.capacity());
    }
}
