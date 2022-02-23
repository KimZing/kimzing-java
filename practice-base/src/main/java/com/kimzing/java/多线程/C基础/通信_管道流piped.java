package com.kimzing.java.多线程.C基础;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * 使用管道流进行通信.
 * <p>
 *     很方便，但是制约也多，不能双向传输，不适合多个线程
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/2/17 16:49
 */
public class 通信_管道流piped {

    public static void main(String[] args) throws IOException, InterruptedException {
        PipedReader pipedReader = new PipedReader();
        PipedWriter pipedWriter = new PipedWriter();
        pipedWriter.connect(pipedReader);

        Thread writer = new Thread(new Writer(pipedWriter));
        writer.start();

        TimeUnit.SECONDS.sleep(2);

        Thread reader = new Thread(new Reader(pipedReader));
        reader.start();
    }


    static class Writer implements Runnable {

        public Writer(PipedWriter writer) {
            this.writer = writer;
        }

        private PipedWriter writer;

        @Override
        public void run() {
            try {
                for (int i = 0; i < 100; i++) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    writer.write("你好" + i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Reader implements Runnable {

        public Reader(PipedReader reader) {
            this.reader = reader;
        }

        private PipedReader reader;

        @Override
        public void run() {
            int receive = 0;
            try {
                while (true) {
                    if (((receive = reader.read()) != -1)) {
                        System.out.print((char)receive);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
