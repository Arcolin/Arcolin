package Deque;

public class dequeClass<E> implements Deque<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;

	public void insertRear(E e) {
		Node<E> newNode = new Node<E>(e, null);
		if(size == 0){
			head = newNode;
		}
		else{
			tail.link = newNode;
		}
		tail = newNode;
		size++;
	}
	
	public void insertFront(E e) {
		Node<E> newNode = new Node<E>(e, null);
		if(size != 0){
		tail.link = newNode;
		}
		head = newNode;
		size++;
	}

	public E removeFront() throws EmptyQueueException {
		if(isEmpty()){
			throw new EmptyQueueException("There are no nodes in this list");
		}
		E e = head.data;
		head = head.link;
		size--;
		if(size == 0){
			tail = null;
		}
		return e;
	}
	
	public E removeRear() throws EmptyQueueException {
		if(isEmpty()){
			throw new EmptyQueueException("There are no nodes in this list");
		}
		E e = tail.data;
		while(tail.link != null){
			tail = tail.link;
		}
		size--;
		if(size == 0){
			tail = null;
		}
		return e;
	}

	public E getFront() throws EmptyQueueException {
		if(isEmpty()){
			throw new EmptyQueueException("There are no nodes in this list");
		}
		return head.data;
	}
	
	public E getRear() throws EmptyQueueException {
		if(isEmpty()){
			throw new EmptyQueueException("There are no nodes in this list");
		}
		return tail.data;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public String toString(){
		StringBuilder string = new StringBuilder("[");
		Node<E> pointer = head;
		while(pointer != null){
			string.append(pointer.data.toString());
			if(pointer.link != null){
				string.append(",");
			}
		}
		string.append("]");
		return string.toString();
	}
	
	private class Node<T>{
		private T data;
		private Node<T> link;
		
		public Node(){
			this(null, null);
		}
		
		public Node(T data, Node<T> link){
			this.data = data;
			this.link = link;
		}
	}
}
