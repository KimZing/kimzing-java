package com.kimzing.java.多线程.B示例.线程池;

/**
 * 线程池.
 * <p>
 *     暂时不实现
 * </p>
 *
 * @author KimZing - kimzing@163.com
 * @since 2022/4/26 15:04
 */
public interface ThreadPool {

    /** 执行一个Job */
    void execute(Job job);

    /** 关闭线程池 */
    void shutdown();

    /** 添加指定数量的工作线程 */
    void addWorker(int num);

    /** 移除指定数量的工作线程 */
    void removeWorker(int num);

    /** 获取等待执行的任务数量 */
    int getJobSize();

}
