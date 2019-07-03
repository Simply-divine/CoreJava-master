import java.util.*;
import java.util.function.Consumer;

public class CollectionsDemo{

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sumit");
        list.add("sumit");
        list.add("sumit");
        list.add("sumit");
        list.add(0,"dddd");
        System.out.println(list);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hardik");
        list1.addAll(0,list);
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
        //list1.removeIf(a->a.contains("ardik"));
        for (String a:list1) {
            System.out.println(a);
        }


        list1.forEach(System.out::print);
        list1.forEach((a) -> System.out.println("\nData " + a));

        list1.forEach(new Consumer<String>() {
            @Override
            public void accept(String a) {
                System.out.println(a);
            }
        });
        System.out.println(list1.lastIndexOf("sumit"));

        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        itr = list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        itr.forEachRemaining((a)->{
            System.out.println(a);
        });

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Student> h=new HashSet<Student>(students);
        h.add(new Student(1,"gaa"));
        HashSet<Integer> h1= (HashSet<Integer>) h.clone();
        System.out.println(h1);

//        students.add();
    }

}
