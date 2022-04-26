package com.bl.queueuc3_uc4;

public class MyNode<K> implements INode<K> {
	
	K key;
	INode<K> next;
	
	
	public MyNode(K key) {
		this.key = key;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public INode<K> getNext() {
		return next;
	}
	public void setNext(INode<K> next) {
		this.next = next;
	}

//	@Override
//	public String toString() {
//		return "MyNode [key=" + key + ", next=" + next
//				+ "]";
//	}
	
	

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("MyNode {key=>" + key + "}");
		if(next != null) {
			str.append("=>" + next);
		}
		return str.toString();
	}
}
	
	


