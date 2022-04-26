package com.bl.queueuc3_uc4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class QueueTest {

	@Test
	public void enqueueTest() {
		System.out.println("--------Enqueue-----------");
		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		System.out.println(queue);
	}

	@Test
	public void dequeueTest() {
		System.out.println("--------Dequeue-----------");
		MyQueue<Integer> queue = new MyQueue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		System.out.println(queue);
		assertEquals(56, queue.dequeue());
		System.out.println(queue);
		assertEquals(30, queue.dequeue());
		System.out.println(queue);
		assertEquals(70, queue.dequeue());
		System.out.println(queue);
	}
	
}
