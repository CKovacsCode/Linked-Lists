package osu.cse2123;

import osu.cse2123.SimpleQueueOnLL.Node;

/**
 * A manual implementation of the SimpledLinkedList class
 *
 * @author Connor Kovacs
 * @version 11102023
 */

public class SimpleLinkedListManual<E> implements SimpleLinkedList<E> {

	private class Node {
		E element;
		Node next;
	}

	private Node front;
	private Node back;
	private int size;

	/**
	 * Creates an empty linked list
	 */
	public SimpleLinkedListManual() {
		// TODO: Your code here
		//set all null pointer exceptions
		this.front = null;
		this.back = null;
		this.size = 0;
	}

	@Override
	public void addFront(E element) {
		// TODO: Your code here
		
		Node addNode = new Node();//we create our new node
		addNode.element = element;//add the elements to the node 
		addNode.next = null;//set next node
		if(this.front == null)//if the front is null -- execute
		{
			this.front = addNode;//add front to our new node
			this.back = addNode;//add back to new node
			//return to que
		}else {
			this.front.next = addNode;//if above doesnt exe we have to add our front to the addNode
			this.front = addNode;
		}
		this.size++;//add an element to our array so we increment size 
	}


	@Override
	public E removeFront() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code
		E result;
		if(this.front == null) {//if our front is null
			this.size--;//for remove every element removed we have to decrease size
			result = this.back.element;//set result to front
		}else {
			result = this.front.element;//set our result
			this.front = this.front.next;//put front to next if above does not execute
			this.size--;
		}
		return result;//return result
	}

	@Override
	public void addEnd(E element) {
		// TODO: Your code here
		Node addNode = new Node();//we create our new node
		addNode.element = element;//add the element to the node 
		addNode.next = null;//set next node
		if(this.back == null)//if the back is null -- execute
		{
			this.front = addNode;//add front to our new node
			this.back = addNode;//add back to new node
			//return to que
		}
		else {
			this.back.next = addNode;//if above doesnt exe we have to add our back to the addNode
			this.back = addNode;

		}
		this.size++;//add an element to our array so we increment size 
	}

	@Override
	public E removeEnd() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code
		E result;
		if(this.back == null) {//if our back is null
			this.size--;//for remove every element removed we have to decrease size
			result = this.front.element;//set result to front 
		}else {
			result = this.back.element;//set our result
			this.back = this.back.next;//put back to next if above does not execute
			this.size--;
		}
		return result;//return result
	}

	@Override
	public E front() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code
		return this.front.element;//return front
	}

	@Override
	public E end() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code
		return this.back.element;//return back
	}

	@Override
	public int size() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code
		return this.size;//pull size
	}

	@Override
	public String toString() {
		String result =  "< ";
		//new node to start at head
		
		result += this.front.element;//set result to front element
		Node subsequentNode = this.front.next;//new node added
		while (subsequentNode != null) {
		    result += subsequentNode.element;//set next element
		    result += this.front.element;//front elelemnt must be set
		    subsequentNode = subsequentNode.next;//next set next
		    
		}
		//add the end of String assign to result
		result += " >";//string end of toString add to result to close

		//return our result
		return result;//return our string
	}}

