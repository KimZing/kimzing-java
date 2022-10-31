package com.kimzing.java.网络.bio.single;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 阻塞IO服务端.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/10/31 17:36
 */
public class BIOServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8080);
        // 阻塞
        Socket instance = serverSocket.accept();
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(instance.getInputStream()));
        // 阻塞
        String request = bufferedReader.readLine();
        System.out.println("收到客户端请求:" + request);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(instance.getOutputStream()));
        // 非阻塞
        bufferedWriter.write("success\n");
        bufferedWriter.flush();
    }

}
