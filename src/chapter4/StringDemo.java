package chapter4;

import chapter5.User;

import java.util.Arrays;

public class StringDemo{
    public static void main(String[] args) {
        char data[] = {'h','e'};
        String data2  = String.valueOf(data);
        Integer a = Integer.valueOf("12");
        data2 = data2.concat( "llo"+ " world   ");
        System.out.println(data2);
        System.out.println(data2.length());
        System.out.println(data2.equals("hehe"));
        System.out.println(data2.equalsIgnoreCase("Hehe"));
        System.out.println(data2.contains("he"));
        System.out.println(data2.indexOf("he",1));
        System.out.println(data2.startsWith("h",1));
        System.out.println(data2.endsWith("he"));
        System.out.println(data2.substring(1,3));

        String ch[] = data2.split(" ");
        for (String c : ch) {
            System.out.println(c + " ");
            }

        data2 = data2.trim();
        System.out.println(String.join("-",ch));
        System.out.println(data2.length());
        System.out.println(data2.toUpperCase());
        System.out.println(data2.toLowerCase());
        System.out.println(data2.replace("world","Sumit"));


        User user =  new User(1,"sumit");
        System.out.println(user);
    }
}