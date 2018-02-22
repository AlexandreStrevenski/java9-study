package com.java9.sample;

import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Order order = new Order();
        order.setId(1L);
        order.setAddress("street 1");
        order.getItems().add(new Item());

        SubmissionPublisher<Order> publisher = new SubmissionPublisher<>();
        publisher.subscribe(new OrderSubscriber());
        publisher.submit(order);

        System.out.println("done");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();


    }
}
