public class lambdafun {
    public static void main(String[] args) {
        Runnable t = () -> {

        };

        Thread thread = new Thread(t);
        thread.start();

        lambdacheck lambdacheck = (name)-> "sumit " + name;

        System.out.println(lambdacheck.say("sumit"));

    }
}

interface lambdacheck{
    String say(String name);
}