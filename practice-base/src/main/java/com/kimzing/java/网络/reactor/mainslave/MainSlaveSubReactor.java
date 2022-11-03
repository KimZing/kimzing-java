package com.kimzing.java.网络.reactor.mainslave;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;

/**
 * .
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/11/3 18:06
 */
public class MainSlaveSubReactor implements Runnable{

    private Selector selector;

    public MainSlaveSubReactor(Selector selector) {
        this.selector = selector;
    }


    @Override
    public void run() {
        while(true){
            try {
                selector.select();
                Thread.sleep(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while(iterator.hasNext()){
                    SelectionKey key = iterator.next();
                    dispatch(key);
                    iterator.remove();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void dispatch(SelectionKey key) {
        Runnable runnable = (Runnable) key.attachment();
        if (runnable != null) {
            runnable.run();
        }
    }
}
