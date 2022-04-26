package com.bl.stack_uc1_uc2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StackTest {

	@Test
	public void pushStack() {
		System.out.println(
				"-------------Create and push---------------");
		MyStack<Integer> stack = new MyStack<>();

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println(stack);
		System.out.println(stack.peek());
		assertEquals(56, stack.peek());
	}

	@Test
	public void popStack() {
		System.out
				.println("-------------Peek and Pop---------------");
		MyStack<Integer> stack = new MyStack<>();

		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack);
		assertEquals(56, stack.peek());
		stack.pop();
		System.out.println();
		System.out.println(stack);
		assertEquals(30, stack.peek());
		stack.pop();
		System.out.println();
		System.out.println(stack);
		assertEquals(70, stack.peek());
		stack.pop();
		System.out.println();
		System.out.println(stack);
	}
	
}