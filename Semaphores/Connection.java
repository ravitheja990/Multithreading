package Semaphores;

import java.util.concurrent.Semaphore;

public class Connection {
    private static Connection instance = new Connection();
    private Semaphore semaphore = new Semaphore(10, true);
    private int connections = 0;
    private Connection() {

    }
    public static Connection getInstance() {
        return instance;
    }
    public void connect() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            doConnect();
        }finally {
            semaphore.release();
        }
    }
    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--;
        }
    }
}
