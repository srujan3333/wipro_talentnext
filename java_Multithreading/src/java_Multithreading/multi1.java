package java_Multithreading;

import java.util.Scanner;

public class multi1 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Runnable r = new multi1();
        Thread t1 = new Thread(r, "Scooby");
        Thread t2 = new Thread(r, "Shaggy");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        sc.close();
    }
}
