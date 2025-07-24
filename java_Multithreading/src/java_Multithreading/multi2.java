package java_Multithreading;

import java.util.Random;
import java.util.Scanner;

public class multi2 implements Runnable {
    String[] colours = {"white","blue","black","green","red","yellow"};

    public void run() {
        Random rand = new Random();
        while (true) {
            int idx = rand.nextInt(colours.length);
            System.out.println(colours[idx]);
            if (colours[idx].equals("red")) break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread(new multi2());
        t.start();
        t.join();
        sc.close();
    }
}
