package chapter8;

import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"sumit");
        hashMap.get(1);
        hashMap.putIfAbsent(null,"sumit more");
        System.out.println(hashMap);

        for(Map.Entry mapdata: hashMap.entrySet()){
            System.out.println(mapdata.getKey() + " " + mapdata.getValue());
        }
        LinkedHashMap<Integer,String> hashMap2 = new LinkedHashMap<>();
        hashMap2.put(1,"sumit");
        hashMap2.put(2,"sumit");
        hashMap2.put(15,"sumit");
        hashMap2.put(21,"sumit");
        hashMap2.put(19,"sumit");
        hashMap2.put(51,"sumit");
        hashMap2.put(16,"sumit");
        hashMap2.putIfAbsent(1,"sumit more");

        for(Map.Entry mapdata: hashMap.entrySet()){
            System.out.println(mapdata.getKey() + " " + mapdata.getValue());
        }

        TreeMap<Integer,String> hashMap3 = new TreeMap<>();
        hashMap3.put(1,"sumit");
        hashMap3.put(2,"sumit");
        hashMap3.put(15,"sumit");
        hashMap3.put(21,"sumit");
        hashMap3.put(19,"sumit");
        hashMap3.put(51,"sumit");
        hashMap3.put(16,"sumit");
        hashMap3.putIfAbsent(1,"sumit more");
        System.out.println(hashMap3);
        hashMap3.descendingMap();

        for(Map.Entry mapdata: hashMap.entrySet()){
            System.out.println(mapdata.getKey() + " " + mapdata.getValue());
        }

        TreeSet<Integer> treeSet =new TreeSet<>();
        treeSet.add(1);
        treeSet.add(13);
        treeSet.add(2);
        System.out.println(treeSet.headSet(2,true));
        System.out.println(treeSet);
    }
}
