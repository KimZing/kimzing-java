package com.kimzing.java.多线程.C基础;

/**
 * 通过线程间join来进行通信.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/18 11:21
 */
public class 通信_join {

    public static void main(String[] args) {
        Thread preThread = null;
        for (int i = 0; i < 10; i++) {
            Joiner joiner = new Joiner(preThread, String.valueOf(i));
            joiner.start();
            preThread = joiner;
        }
    }

    static class Joiner extends Thread {

        public Joiner(Thread preThread, String name) {
            super(name);
            this.preThread = preThread;
        }

        private Thread preThread;

        @Override
        public void run() {
            if (preThread != null) {
                try {
                    preThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(currentThread().getName() + " completed");
        }
    }


}
