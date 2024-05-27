package task_4;

public class PrintService {

    private boolean check = true;

    public synchronized void print1() throws InterruptedException {

        while (check) {
            wait();
        }
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        check = true;
        notifyAll();
    }

    public synchronized void print2() throws InterruptedException {

        while (!check) {
            wait();
        }
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        check = false;
        notifyAll();
    }
}
