package com.kimzing.java.网络.bio.mutiple;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 阻塞IO服务端.
 * <p>
 *     多线程版本，支持同时进行多个连接的读写操作
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/10/31 17:36
 */
public class BIOServer {

    @SuppressWarnings("AlibabaThreadPoolCreation")
    final static ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
// 阻塞
            Socket instance = serverSocket.accept();
            executor.execute(() -> {
                try {
                    BufferedReader bufferedReader =
                            new BufferedReader(new InputStreamReader(instance.getInputStream()));
                // 阻塞
                String request = null;
                    request = bufferedReader.readLine();
                    System.out.println("收到客户端请求:" + request);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(instance.getOutputStream()));
                    // 非阻塞
                    bufferedWriter.write("success\n");
                    bufferedWriter.flush();
                    TimeUnit.SECONDS.sleep(30);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }


    }

}
