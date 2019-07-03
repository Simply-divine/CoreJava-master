package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRuntime {
    public static void main(String[] args) throws IOException {
       Runtime.getRuntime().exec("/usr/bin/gnome-terminal -e \"ls\"");
    }
}
