package linearDataStructure;

public class SingleLinkedList<E> {
  SingleNode<E> head;
  SingleNode<E> tail;
  int size;
  
  public SingleLinkedList(){
    size = 0;
  } //end singleLinkedList
  
  //*****************************public method**********************
  public void addFirst(E e){
    SingleNode<E> newNode = new SingleNode<E>();
    newNode.element = e;
    newNode.next = this.head;
    
    //edge case for the list is empty
    if(head == null){
      this.tail = newNode;
    } //end if
    
    this.head = newNode; 
    this.size++;
  } //end add First
  
  public E removeFirst(){
    if(this.head != null){
      SingleNode<E> tmp = head;
      
      //if head = tail, there is only one element in the list, remove it.
      if(this.head == this.tail){
        this.head = null;
        this.tail = null;
      }else{
        this.head = this.head.next;
        tmp.next = null;
      } //end if
      this.size--;
      return tmp.element;
    }else{
      System.out.println("no element");
      return null;
    } //end if
    
  } //end removeFirst
  
  public void addLast(E e){
    SingleNode<E> newNode = new SingleNode<E>();
    newNode.element = e;
    //edge case
    if(this.tail == null){
     this.head = newNode;
    }else{
      this.tail.next = newNode;
    } //end if
    
    this.tail = newNode;
    this.size++;
  } //end addLast
  
  public E removeLast(){
    if(this.tail != null){
      SingleNode<E> tmp = head;
      SingleNode<E> removedTail = tail;
      //case when there is only one element
      if(this.head == this.tail){
        this.head = null;
        this.tail = null;
        return removedTail.element;
      }else{
        //go through the list until the one before the tail 
        while(tmp.next != this.tail){
          tmp = tmp.next;
        } //end while loop
        //make this element become tail
        tmp.next = null; 
        this.tail = tmp;
        return removedTail.element;
      } //end if
    }else{
      System.out.println("empty list!");
      return null;
    } //end if
  }//end removedLast
  
  public void printAll(){
    SingleNode<E> tmp = head;
    while(tmp != tail){
      System.out.print(tmp.element + " ");
      tmp = tmp.next;
    } //end while loop
    System.out.print(tmp.element + " ");
  } //end printAll
  
  //return size of the array list
  public int size(){
    return this.size;
  } //end size
  
  public E get(int i){
    if(i >= 0 && i < this.size){
      SingleNode<E> n = head;
      for(int j = 0; j < i; j++){
        n = n.next;
      } //end for loop
      return n.element;
    }else{
      System.out.println("INVALID INDEX");
      return null;
    } //end if 
  } //end get 
  
  public void reverse(){
    SingleNode<E> newHead = this.tail;
    SingleNode<E> tmp = this.tail;
    for(int i = this.size-1; i >= 0; i--){
      SingleNode<E> tmpNode = this.head;
      for(int j = 0; j < i; j++){
        tmpNode = tmpNode.next;
      } //end for loop
      tmp.next = tmpNode;
      tmp = tmp.next;
    } //end for loop
    tmp.next = null;
    this.tail = tmp;
    this.head = newHead; 
  } //end reverse
  
  
} //end SingleLinkedList
