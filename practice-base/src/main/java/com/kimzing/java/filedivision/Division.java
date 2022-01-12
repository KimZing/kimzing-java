package com.kimzing.java.filedivision;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * 文件分割.
 *
 * @author KimZing - kimzing@163.com
 * @since 2021/4/16 21:33
 */
public class Division {

    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("/Users/kimzing/Desktop/pcm.pcm"));
        int perSize = bytes.length / 10;
        if (perSize % 2 != 0) {
            // 音频文件要求是even
            perSize+=1;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < 10; i++) {
            start = i * perSize;
            end = (i + 1) * perSize;
            byte[] temp = Arrays.copyOfRange(bytes, start, end);
            FileOutputStream out = new FileOutputStream("/Users/kimzing/Desktop/pcm/pcm" + i + ".pcm");
            out.write(temp);
            out.close();
        }
    }

}
