public class ThreadgroupPracticeCaller {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public void run() {
                ThreadGroupPractice.main(args);
            }
        };
    }
}
