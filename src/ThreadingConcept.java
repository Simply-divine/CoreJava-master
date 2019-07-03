public class ThreadingConcept extends Thread{
    public static void main(String[] args) {
        ThreadingConcept threadingConcept = new ThreadingConcept();
        ThreadingConcept threadingConcept2 = new ThreadingConcept();
        ThreadingConcept threadingConcept3 = new ThreadingConcept();
        threadingConcept.start();
        threadingConcept2.start();
        threadingConcept3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
