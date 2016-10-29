package Deque;

public interface Deque<E> {
	public void insertFront(E e);
	public void insertRear(E e);
	public E removeFront() throws EmptyQueueException;
	public E removeRear() throws EmptyQueueException;
	public E getFront() throws EmptyQueueException;
	public E getRear() throws EmptyQueueException;
	public void clear();
	public boolean isEmpty();
	public int size();
	public String toString();
}
