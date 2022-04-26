package com.bl.linkedlist_uc10;

public class SortedLinkedList<K extends Comparable<K>> implements OrderedList<K> {
	
	MyLinkedList<K> list;
	
	public SortedLinkedList(){
		list = new MyLinkedList<>();
	}

	@Override
	public void add(K key) {
		INode<K> node = new MyNode<>(key);
		int pos =0;
		for(int i = 0; i< list.size(); i++) {
			if(list.searchNode(i).getKey().compareTo(key)>0) {
				pos = i;
			}else {
				pos = i+1;
			}
		}
		list.addAtPosition(pos, node);
	}

	@Override
	public String toString() {
		return "SortedLinkedList [list=" + list + "]";
	}
	
	
	

}
