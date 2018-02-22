package com.java9.sample;

public class WSShop {

    public static void process(Order order) {
        System.out.println("start process for " + order.getId());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("done process for " + order.getId());
    }
}
