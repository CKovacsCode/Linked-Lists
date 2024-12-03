package osu.cse2123;

/**
 * An implementation of a Stack on a manual linked list
 *
 */
public class SimpleStackOnLL<E> implements SimpleStack<E> {
	
	private class Node {
		E data;
		Node next;
	}
	
	private Node top;
	private int size;
	
	/**
	 * Creates an empty queue
	 */
	public SimpleStackOnLL() {
		this.top = null;
		this.size = 0;
	}

	@Override
	public void push(E val) {
		Node tmp = new Node();
		tmp.data = val;
		tmp.next = this.top;
		this.top = tmp;
		this.size++;
	}
	

	@Override
	public E pop() {
		E result = this.top.data;
		this.top = this.top.next;
		this.size--;
		return result;
	}
	
	@Override
	public E top() {
		return this.top.data;
	}


	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		String str = "<";
		Node tmp = this.top;
		while (tmp != null) {
			str = str+" "+tmp.data;
			tmp = tmp.next;
		}
		str += ">";
		return str;
	}
	
}
