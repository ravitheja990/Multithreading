package demo1;

class Runner extends Thread {
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(100l);
            }catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.start();
        Runner runner2 = new Runner();
        runner2.start();
    }
}
