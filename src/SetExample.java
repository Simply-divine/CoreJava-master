import chapter8.User;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 60; i < 120; i+=20) {
            list.add(i);
        }

        for (int i = 120; i >= 60; i-=20) {
            list.add(i);
        }
        list.add(20);
        list.add(70);

        System.out.println(list);

        HashSet<Integer> setdata = new HashSet<>();
        setdata.addAll(list);
        System.out.println(setdata);

        LinkedHashSet<Integer> setdata2 = new LinkedHashSet<>();
        setdata2.addAll(list);
        System.out.println(setdata2);


        TreeSet<Integer> setdata3 = new TreeSet<>();

        Spliterator<Integer> spltr=setdata3.stream().spliterator();
        //System.out.println("look here->"+setdata3.descendingSet().descendingIterator().next());
        setdata3.addAll(list);
        setdata3.descendingIterator().forEachRemaining(s-> System.out.print(s+" "));
        int x=setdata3.ceiling(66);
        System.out.println("ceiling: "+x);
        //spltr.forEachRemaining(s-> System.out.print(s+" "));
        System.out.println(setdata3);

        TreeSet<User> setdata4 = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            setdata4.add(new User(i+1,"data " + (i +1)));
        }
        System.out.println(setdata4);
    }
}
