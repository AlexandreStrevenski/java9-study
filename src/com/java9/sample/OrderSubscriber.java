package com.java9.sample;

import java.util.concurrent.Flow;

public class OrderSubscriber implements Flow.Subscriber<Order> {
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(Order order) {
        WSShop.process(order);
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("done all orders");
    }
}
