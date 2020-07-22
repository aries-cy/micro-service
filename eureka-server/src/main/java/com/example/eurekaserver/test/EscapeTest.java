package com.example.eurekaserver.test;

/**
 * 逃逸分析
 * jvm默认是开启逃逸分析的
 * 关闭逃逸分析，jvm参数设置 -XX:+PrintGCDetails -Xmx10m -Xms10m -XX:-DoEscapeAnalysis
 * @author cy
 */
public class EscapeTest {

    public static void alloc() {
        byte[] b = new byte[2];
        b[0] = 1;
    }

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }

}
