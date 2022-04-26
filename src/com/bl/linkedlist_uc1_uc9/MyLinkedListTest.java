package com.bl.linkedlist_uc1_uc9;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyLinkedListTest {
	
	//*******************UC1*****************Inserting 56,30,70 in a LinkedList**************
	
	@Test
	public void addTest() {
		System.out.println("***********Adding values to LinkedList************");
		MyLinkedList<Integer> addlist = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<>(70);
		INode<Integer> secondNode = new MyNode<>(30);
		INode<Integer> thirdNode = new MyNode<>(56);
		addlist.addFirst(firstNode);
		addlist.addFirst(secondNode);
		addlist.addFirst(thirdNode);
		System.out.println(addlist);
		System.out.println();
	}
	
	//************************UC2*****Inserting 30 and 56 to 70*******************
	
	@Test
	public void addFirstTest() {
		System.out.println("************Adding At First in LinkedList**************");
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		INode<Integer> firstNode = new MyNode<Integer>(70);
		list.addFirst(firstNode);
		INode<Integer> secondNode = new MyNode<Integer>(30);
		list.addFirst(secondNode);
		INode<Integer> thirdNode = new MyNode<Integer>(56);
		list.addFirst(thirdNode);
		System.out.println(list);
		System.out.println();
		
	}
	
	//*************************UC3*Appending 30 to 56 and 70***************************
	@Test
	public void addLastTest() {
		System.out.println("******************Append values to the linked list*******************");
		MyLinkedList<Integer> list = new MyLinkedList<>();
		INode<Integer> firstNode = new MyNode<Integer>(56);
		list.addLast(firstNode);
		INode<Integer> secondNode = new MyNode<Integer>(30);
		list.addLast(secondNode);
		INode<Integer> thirdNode = new MyNode<Integer>(70);
		list.addLast(thirdNode);
		System.out.println(list);
		System.out.println();
	}
	
	//**************UC 4***Inserting 30 between 56 and 70**********************************
	@Test
	public void addAtPosition() {
		System.out.println("***************Inserting value at position*************");
		MyLinkedList<Integer> list = new MyLinkedList<>();
		INode<Integer> firstNode = new MyNode<Integer>(56);
		INode<Integer> secondNode = new MyNode<Integer>(70);
		list.addFirst(firstNode);
		list.addLast(secondNode);
		INode<Integer> thirdNode = new MyNode<Integer>(30);
		list.addAtPosition(1, thirdNode);
		System.out.println(list);
		System.out.println();
	}
	//***UC 5*******Popping out first element from Linked List of 56,30,70*****************
	@Test
	public void popFirstTest() {
		System.out.println("********************Popping out the First element from LinkedList****************");
		MyLinkedList<Integer> list = new MyLinkedList<>();
		INode<Integer> firstNode = new MyNode<Integer>(56);
		INode<Integer> secondNode = new MyNode<Integer>(30);
		INode<Integer> thirdNode = new MyNode<Integer>(70);
		list.addFirst(firstNode);
		list.addLast(secondNode);
		list.addLast(thirdNode);
		System.out.println("Printing the LinkedList before Pop Method");
		System.out.println(list);
		boolean popResult = list.popFirst();
		assertEquals(true, popResult);
		System.out.println("Printing the LinkedList after PopFirst Method");
		System.out.println(list);
		System.out.println();
	}
	
	//***UC 6*******Popping out Last element from Linked List of 56,30,70*****************
		@Test
		public void popLastTest() {
			System.out.println("********************Popping out the Last element from LinkedList****************");
			MyLinkedList<Integer> list = new MyLinkedList<>();
			INode<Integer> firstNode = new MyNode<Integer>(56);
			INode<Integer> secondNode = new MyNode<Integer>(30);
			INode<Integer> thirdNode = new MyNode<Integer>(70);
			list.addFirst(firstNode);
			list.addLast(secondNode);
			list.addLast(thirdNode);
			System.out.println("Printing the LinkedList before Pop Method");
			System.out.println(list);
			boolean popResult = list.popLast();
			assertEquals(true, popResult);
			System.out.println("Printing the LinkedList after PopFirst Method");
			System.out.println(list);
			System.out.println();
		}
		

		//***UC 7*******Search Node of value 30*****************
		@Test
		public void searchNodeTest() {
			System.out.println("********************Find Node of value 30****************");
			MyLinkedList<Integer> list = new MyLinkedList<>();
			INode<Integer> firstNode = new MyNode<Integer>(56);
			INode<Integer> secondNode = new MyNode<Integer>(30);
			INode<Integer> thirdNode = new MyNode<Integer>(70);
			list.addFirst(firstNode);
			list.addLast(secondNode);
			list.addLast(thirdNode);
			boolean searchResult = list.searchNode(secondNode);
			System.out.println(searchResult);
			assertEquals(true, searchResult);
		}
		
		//***UC 8*******Search Node of value 30 and Insert 40 after 30*****************
				@Test
				public void searchAndInsertNodeTest() {
					System.out.println("********************Find Node of value 30 and Insert 40 after 30****************");
					MyLinkedList<Integer> list = new MyLinkedList<>();
					INode<Integer> firstNode = new MyNode<Integer>(56);
					INode<Integer> secondNode = new MyNode<Integer>(30);
					INode<Integer> thirdNode = new MyNode<Integer>(70);
					INode<Integer> fourthNode = new MyNode<Integer>(40);
					list.addFirst(firstNode);
					list.addLast(secondNode);
					list.addLast(thirdNode);
					System.out.println("Printing the LinkedList before inserting 40");
					System.out.println(list);
					System.out.println();
					int position = list.searchIndex(secondNode);
					System.out.println("Node is Present at position:" + position);
					list.addAtPosition(position+1, fourthNode);
					System.out.println("Printing the LinkedList after inserting 40");
					System.out.println(list);
					System.out.println();
				}
				
				
		//***UC 7*******Find Node of value 30*****************
				@Test
				public void deleteAndFindSizeTest() {
					System.out.println("********************Find Node of value 30 and Insert 40 after 30****************");
					MyLinkedList<Integer> list = new MyLinkedList<>();
					INode<Integer> firstNode = new MyNode<Integer>(56);
					INode<Integer> secondNode = new MyNode<Integer>(30);
					INode<Integer> thirdNode = new MyNode<Integer>(70);
					INode<Integer> fourthNode = new MyNode<Integer>(40);
					list.addFirst(firstNode);
					list.addLast(secondNode);
					list.addLast(fourthNode);
					list.addLast(thirdNode);
					System.out.println("Printing the LinkedList before any operation!");
					System.out.println(list);
					int posToDelete = list.searchIndex(fourthNode);
					System.out.println("Position of 40 Node is : " + posToDelete);
					System.out.println();
					INode<Integer> deletingNode = list.searchNode(posToDelete);
					list.remove(deletingNode);
					System.out.println();
					System.out.println("Linked list after deleting Node 40");
					System.out.println(list);
					int size = list.size();
					System.out.println("Size is " + size);
					System.out.println();
				}
					
	
	
	
}
