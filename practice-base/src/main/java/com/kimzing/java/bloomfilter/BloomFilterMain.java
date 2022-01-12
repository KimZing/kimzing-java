package com.kimzing.java.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 布隆过滤器实践.
 *
 * @author KimZing - kimzing@163.com
 * @since 2021/6/13 18:11
 */
public class BloomFilterMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 预计会填入的数据量
        int expectDataNumber = 920000;
        // 误识别率，这里规定为百分之一，但是会扩大布隆的长度
        double fpp = 0.01;
        BloomFilter<CharSequence> bloomFilter = BloomFilter.create(Funnels.stringFunnel(StandardCharsets.UTF_8), expectDataNumber, fpp);

        Files.readAllLines(Paths.get("c:/Users/kimzing/Desktop/words.txt"))
                .stream()
                .forEach(s -> bloomFilter.put(s.split("\t")[0]));

        // 验证
        System.out.println(bloomFilter.mightContain("hello"));  // false
    }

}
