package projects.multithreading;

public class Ex2 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            Thread.sleep(1000);
        }
        System.out.println("Go!!!");
    }

}