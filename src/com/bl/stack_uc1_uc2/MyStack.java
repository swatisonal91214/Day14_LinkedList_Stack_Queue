package com.bl.stack_uc1_uc2;

public class MyStack<K> {
	
	MyLinkedList<K> list;
	
	public MyStack() {
		list = new MyLinkedList<>();
	}
	
	public boolean push(K item) {
		INode<K> newNode = new MyNode<K>(item);
		return list.addFirst(newNode);
		
	}
	
	public K pop() {
		INode<K> popNode = list.popFirst();
		return popNode.getKey();
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public int size() {
		return list.size();
	}
	
	public K peek() {
		return list.head.getKey();
	}

	@Override
	public String toString() {
		return "MyStack [list=" + list + "]";
	}

	
	
}
