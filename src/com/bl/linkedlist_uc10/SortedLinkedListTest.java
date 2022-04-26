package com.bl.linkedlist_uc10;

import org.junit.Test;

public class SortedLinkedListTest {
	
	//************Inserting 56,30,40,70 in a OrderedLinkedList******************* 
	
	@Test
	public void addElementTest() {
		OrderedList<Integer> sort = new SortedLinkedList<>();
		sort.add(56);
		sort.add(30);
		sort.add(40);
		sort.add(70);
		System.out.println(sort);
	}

}
