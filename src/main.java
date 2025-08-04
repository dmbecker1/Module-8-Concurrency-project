public class Main {
    public static void main(String[] args) {
        CounterUp counterUp = new CounterUp();
        CounterDown counterDown = new CounterDown();

        Thread t1 = new Thread(counterUp);
        Thread t2 = new Thread(counterDown);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
