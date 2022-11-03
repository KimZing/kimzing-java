package com.kimzing.java.网络.nio.standard;


import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * Nio客户端，与服务端代码类似，不做详细阐述了.
 *
 * @author KimZing - kimzing@163.com
 * @since 2019-08-27 11:39
 */
public class NIOClient {

    public static void main(String[] args) throws Exception {
        SocketChannel client = SocketChannel.open();
        // 配置非阻塞
        client.configureBlocking(false);
        // 由于是非阻塞，可能连接成功之前就会返回
        client.connect(new InetSocketAddress(8080));
        // 等待连接完成
        while (!client.finishConnect()) {
            TimeUnit.SECONDS.sleep(1);
        }
        // 发送数据
        client.write(ByteBuffer.wrap("hello nio".getBytes()));
        // 读取数据
        while (true) {
            byte[] bytes = new byte[1024];
            int read = client.read(ByteBuffer.wrap(bytes));
            if (read != 0) {
                System.out.println("服务器返回:" + new String(bytes));
                break;
            }
        }
        client.close();
    }
}
