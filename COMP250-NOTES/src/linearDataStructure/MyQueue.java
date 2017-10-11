package linearDataStructure;

public class MyQueue<T> {
	private Object[] queue;
	private int tail;
	private int head;
	private int size;
	public MyQueue(){
		queue = new Object[1];
		tail = -1;
		head = 0;
		size = 0;
	} //end the constructor of MyQueue;
	
	public void enqueue(T t){
		if(this.size >= this.queue.length){
			this.increaseLength();
		}
		if(this.size < this.queue.length){
			this.size++;
			queue[(tail + 1) % this.queue.length] = t;
			tail = head + (this.size - 1) % this.queue.length;
		} //end if
			
	} //end enqueue
	
	@SuppressWarnings("unchecked")
	public T dequeue(){
		T tmp = (T)this.queue[head];
		queue[head] = null;
		head = (head + 1) % this.queue.length;
		size--;
		return tmp;
	} //end dequeue
	
	@SuppressWarnings("unchecked")
	public T peek(){
		return (T)(this.queue[head]);
	} //end peek
	
	public int size(){
		return this.size();
	} //end size
	
	private void increaseLength(){
		Object[] newArray = new Object[this.size * 2];
		for(int i = 0; i < this.size; i++){
			newArray[i] = this.queue[(head + i) % this.size];
		} //end for loop
		this.queue = newArray;
	} //end increasingLength
	
}
