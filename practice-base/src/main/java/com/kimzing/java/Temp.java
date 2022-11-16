package com.kimzing.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/7/8 17:28
 */
public class Temp {

    public static void main(String[] args) {
        // printarab();
        removeListError();
    }

    private static void removeListError() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (String s : list) {
            list.remove(s);
        }
    }

    private static void printarab() {
        List<String> stringList = Stream.of("1","2","3","4").collect(Collectors.toList());
        StringBuffer stringBuffer = new StringBuffer();
        stringList.stream().forEach(str -> {
            stringBuffer.append(str);
            stringBuffer.append(",");
        });
        System.out.println(stringBuffer.toString());
        List<String> string1List = Stream.of("ذراع النقل","2","6","3","4").collect(Collectors.toList());
        StringBuilder stringBuffer1 = new StringBuilder();
        string1List.stream().forEach(str -> {
            stringBuffer1.append(str);
            stringBuffer1.append(",");
        });
        System.out.println(stringBuffer1.toString());
    }

}
