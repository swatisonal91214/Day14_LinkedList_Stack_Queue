package com.bl.linkedlist_uc1_uc9;

public class MyLinkedList<K> {
	
	INode<K> head;
	INode<K> tail;
	
	public boolean addFirst(INode<K> newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if(head == null) {
			head = newNode;
		}else{
			newNode.setNext(head);
			head = newNode;
		}
		
		return true;
}
	
	public int size() {
		int size = 0;
		INode<K> temp = head;
		while(temp!= null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}
	
	public boolean addAtPosition(int position, INode<K> newNode) {
		if(position == 0) {
			addFirst(newNode);
		}else if(position == size()) {
			addLast(newNode);
		}else {
			INode<K> temp = head;
			
			for(int i = 0; i< position - 1; i++) {
				temp = temp.getNext();
			}
			INode<K> temp1 = temp.getNext();
			temp.setNext(newNode);
			newNode.setNext(temp1);
		}
		
		return true;
	}
	
	public boolean addLast(INode<K> newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if (head == null) {
			head = newNode;
		}else {
			tail.setNext(newNode);
			tail = newNode; 
			
		}
		return true;
	}
	
	public boolean popLast() {
		INode<K> temp = head;
		while(temp.getNext().getNext()!= null) {
			temp = temp.getNext();
		}
		
		temp.setNext(null);
		tail = temp;
		return true;
	}
	
	public boolean popFirst() {
		INode<K> temp = head;
		head = head.getNext();
		temp.setNext(null);
		return true;
	}
	
	public boolean remove(INode<K> node) {
		if(head.getKey() == node.getKey()) {
			popFirst();
			return true;
		}else if(tail.getKey() == node.getKey()) {
				popLast();
				return true;
			}else {
				INode<K> temp = head;
				INode<K> temp1;
				while(temp.getNext().getKey() != node.getKey()) {
					temp =  temp.getNext();
				}
				temp1 = temp.getNext().getNext();
				temp.setNext(temp1);
				return true;
			}
	}
	
	public boolean searchNode(INode<K> node) {
		INode<K> temp = head;
		for(int i = 0; i< size(); i++) {
			if(temp.getKey() == node.getKey()) {
				System.out.println("Given node is present in the list");
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
		
	public int searchIndex(INode<K> node) {
		INode<K> temp = head;
		int index = 0;
		while(temp!= null) {
			if(temp.getKey() == node.getKey()) {
				return index;
			}
			temp = temp.getNext();
			index++;
		}
		System.out.println("Not found");
		return -1;
	}
	
	public INode<K> searchNode(int index){
		INode<K> temp = head;
		for(int i = 0; i<size(); i++) {
			if(i == index) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null; // This will be used if your statement is false and need to retuen something
	}
	
	

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail="
				+ tail + "]";
	}

	
}
