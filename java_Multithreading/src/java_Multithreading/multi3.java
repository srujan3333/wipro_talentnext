package java_Multithreading;

import java.util.Scanner;

public class multi3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try { Thread.sleep(5000); } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread(new multi3());
        t.start();
        t.join();
        sc.close();
    }
}
