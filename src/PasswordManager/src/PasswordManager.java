package PasswordManager.src;

import java.util.Arrays;
import java.util.Scanner;


public class PasswordManager {
    private Scanner sc = new Scanner(System.in);
    private User user[] = new User[1];
    private String name;
    private String password;
    private int counter;

    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();
        passwordManager.runApplication();
    }

    private void addUser(String source, String password) {
        if (counter >= 1) {
            this.user = Arrays.copyOf(user, counter + 1);
        }
        user[counter++] = new User(source, password);
    }

    private void runApplication() {
        int choice;
        System.out.println("WELCOME ........\n\n\n\n");
        System.out.println("To SignIn press 1:\nTo SignUp press 2:\n");

        try {
            sc.reset();
            choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    signin();
                    break;
                case 2:
                    sigup();
                    break;
                default:
                    throw new NumberFormatException("Choice will be 1 OR 2 only.");
            }
        } catch (NumberFormatException e) {
            System.out.println("APP ERROR MESSAGE : " + e.getMessage());
        } finally {
            System.out.println("CATCH OVER");

           // System.out.println(Arrays.toString(user));
            runApplication();
        }

    }

    private void afterSiginMethod(User user) {


        boolean flag = false;
        int choice;
        System.out.println("\nWELCOME ........" + user.name);
        do {
            System.out.println("To add new source and password press 1:\nTo search password of any source press 2:\nTo display all source press 3:\nTo update password of any source press 4:\nTo SignOut press 5:\n");

            try {
                sc.reset();
                choice = Integer.parseInt(sc.next());
                switch (choice) {
                    case 1:
                        sc.reset();
                        System.out.println("\nenter source :");

                        String source = sc.next();
                        sc.reset();
                        System.out.println("\nenter password");
                        String pass = sc.next();
                        sc.reset();
                        user.addPasswords(source, pass);
                        sc.reset();
                        break;
                    case 2:
                        sc.reset();
                        System.out.println("\nenter source :");
                        source = sc.next();
                        user.searchPassword(source);
                        sc.reset();
                        break;
                    case 3:
                        user.displayall();
                        break;
                    case 4:
                        sc.reset();
                        System.out.println("\nenter source :");
                        source = sc.next();
                        sc.reset();
                        System.out.println("\nenter password");
                        pass = sc.next();
                        sc.reset();
                        user.updatePassword(source, pass);
                        sc.reset();
                        break;
                    case 5:
                        System.out.println("\n you signed out " + user.name + " \n bye\n\n\n");
                        flag = true;
                        break;
                    default:
                        throw new NumberFormatException("Choice will be 1 OR 2 only.");
                }
            } catch (NumberFormatException e) {
                System.out.println("APP ERROR MESSAGE : " + e.getMessage());
            }
        } while (!flag);

    }

    private void signin() {
        boolean flag = false;
        System.out.println("please enter user name:");
        name = sc.next();
        System.out.println("please enter password:");
        password = sc.next();
        for (User anUser : user) {
            if (anUser.name.equalsIgnoreCase(name) && anUser.password.equalsIgnoreCase(password)) {
                System.out.println("Hello " + name + " your password is " + password);
                afterSiginMethod(anUser);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Username or Password is wrong");
        }
    }

    private void sigup() {
        System.out.println("please enter user name:");
        name = sc.next();
        System.out.println("please enter password:");
        password = sc.next();
        System.out.println("Hello " + name + " your password is " + password);
        addUser(name, password);
    }
}