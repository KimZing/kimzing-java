package com.kimzing.java.网络.bio.single;

import java.io.*;
import java.net.Socket;

/**
 * 阻塞IO客户端.
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/10/31 17:38
 */
public class BIOClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8080);
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        // 非阻塞： 发送到网络是不需要阻塞的
        bufferedWriter.write("name: client1, age: 18 \n");
        bufferedWriter.flush();

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(client.getInputStream()));
        // 阻塞
        String response = bufferedReader.readLine();
        System.out.println("收到服务端响应: " + response);
    }
}
