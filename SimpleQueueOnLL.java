package osu.cse2123;

/**
 * An implementation of a Queue on a manual linked list
 *
 * @author Connor Kovacs
 * @version 11102023
 */
public class SimpleQueueOnLL<E> implements SimpleQueue<E> {

	public class Node {
		E data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	/**
	 * Creates an empty queue
	 */
	public SimpleQueueOnLL() {
		// TODO: Your code here
		//here we intialize our head and tail to null
		this.head = null;
		this.tail = null;
		//set our size of array to zero
		this.size = 0;
	}

	@Override
	public void add(E val) {
		this.size++;//add an element to our array so we increment size 
		Node addNode = new Node();//we create our new node
		addNode.data = val;//add the data to the node 
		addNode.next = null;//set next node
		if(this.head == null)//if the head is null -- execute
		{
			this.head = addNode;//add head to our new node
			this.tail = addNode;//add tail to new node
			return;//return to que
		}
		this.tail.next = addNode;//if above doesnt exe we have to add our tail to the addNode
		this.tail = addNode;
	}

	@Override
	public E front() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code

		return head.data;//front of list return head of data
	}

	@Override
	public E remove() {
		E result;
		if(this.head == null) {//if our head is null
			this.size--;//for remove every element removed we have to decrease size
			result = head.data;//set result to head 
		}else {
		result = this.head.data;//set our result
		this.head = this.head.next;//put head to next if above does not execute
		this.size--;
		}
		return result;//return result
	}

	@Override
	public int size() {
		// TODO: Your code here

		//TODO: Replace the line below with your own code
		return this.size;//return size
	}

	@Override
	public String toString() {
		String result =  "< ";
		//new node to start at head
		Node str = this.head;
		while(str != null)//loop till not null
		{
			//add our head to new str 
			result += str.data + " ";
			str = str.next;
		}
		//add the end of String assign to result
		result += ">";
		//return our result
		return result;
	}

}
