package ReEntrantLocks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void increment() {
        for(int i=0;i<10000;i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("Waiting ...");
        condition.await();
        System.out.println("Woken up!");
        try {
            increment();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Press the return key!");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key!");
        condition.signal();
        try {
            increment();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void finished() {
        System.out.println("Count is :: " + count);
    }
}
