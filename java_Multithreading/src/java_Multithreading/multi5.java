package java_Multithreading;

import java.util.Scanner;

public class multi5 implements Runnable {
    private final String label;

    public multi5(String label) {
        this.label = label;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println(label + " " + i);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread tMax = new Thread(new multi5("MAX"));
        Thread tNorm = new Thread(new multi5("NORM"));
        Thread tMin = new Thread(new multi5("MIN"));

        tMax.setPriority(Thread.MAX_PRIORITY);
        tNorm.setPriority(Thread.NORM_PRIORITY);
        tMin.setPriority(Thread.MIN_PRIORITY);

        tMax.start();
        tNorm.start();
        tMin.start();

        tMax.join();
        tNorm.join();
        tMin.join();

        sc.close();
    }
}
