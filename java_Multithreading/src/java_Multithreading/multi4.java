package java_Multithreading;

import java.util.Scanner;

public class multi4 {
    static class EvenRunner implements Runnable {
        public void run() {
            for (int i = 2; i <= 20; i += 2) System.out.println(i);
        }
    }

    static class OddRunner implements Runnable {
        public void run() {
            for (int i = 1; i <= 20; i += 2) System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread even = new Thread(new EvenRunner());
        Thread odd = new Thread(new OddRunner());
        even.start();
        even.join();
        odd.start();
        odd.join();
        sc.close();
    }
}
