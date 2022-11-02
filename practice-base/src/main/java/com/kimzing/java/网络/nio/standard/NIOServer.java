package com.kimzing.java.网络.nio.standard;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * NIO标准版的服务端.
 * <p>
 * 读不会阻塞，没有数据也会直接返回
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2019-08-27 11:05
 */
public class NIOServer {

    private static List<SocketChannel> clients = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.configureBlocking(false);
        server.bind(new InetSocketAddress(8080));
        while (true) {
            SocketChannel client = server.accept();
            if (client != null) {
                client.configureBlocking(false);
                clients.add(client);
                System.out.println("客户端建立连接");
            }

            clients.forEach(c -> {
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                try {
                    int read = c.read(byteBuffer);
                    if (read > 0) {
                        System.out.println("接收到客户端消息" + new String(byteBuffer.array()));
                        c.write(ByteBuffer.wrap("ok\n".getBytes()));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

}
