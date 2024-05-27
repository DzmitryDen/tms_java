package task_1;

public class Test1Thread extends Thread{

    private String value;

    public Test1Thread(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println(value);
    }
}
