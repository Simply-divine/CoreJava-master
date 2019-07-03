package PasswordManager.src;

import java.util.Arrays;

class User {
    String name = "ani";
    String password = "ani";
    private int counter;
    private MyPasswords myPasswords[] = new MyPasswords[1];

    private User() {

    }

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    void addPasswords(String source, String password) {
        if (counter >= 1) {
            this.myPasswords = Arrays.copyOf(myPasswords, counter + 1);
        }
        myPasswords[counter++] = new MyPasswords(source, password);
    }

    void searchPassword(String source) {
        System.out.println("\n\nSource                     Password\n");
        boolean flag = false;
        for (MyPasswords myPassword : myPasswords) {
            if (myPassword.source.equalsIgnoreCase(source)) {
                System.out.println(myPassword);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("No such source");
        }
    }

    void updatePassword(String source,String password) {
        boolean flag = false;
        for (MyPasswords myPassword : myPasswords) {
            if (myPassword.source.equalsIgnoreCase(source)) {
                myPassword.password=password;
                flag = true;
                System.out.println("\n\nSource                     new Password\n");
                System.out.println(myPassword);
                break;
            }
        }
        if (!flag) {
            System.out.println("No such source");
        }
    }

    void displayall() {
        System.out.println("\n\nSource                     Password\n");
        for (MyPasswords myPassword : myPasswords) {
            System.out.println(myPassword);
        }
    }

    @Override
    public String toString() {
        return "\n" +
                "My name=" + name +
                "\nMypassword=" + password +
                "\n\nSource                     Password\n" +
                Arrays.toString(myPasswords);
    }

    class MyPasswords {
        String source;
        String password;

        MyPasswords(String source, String password) {
            this.source = source;
            this.password = password;
        }

        @Override
        public String toString() {
            String format = "%-25s:%-5s\n";
            return String.format(format, source, password);
        }
    }
}
