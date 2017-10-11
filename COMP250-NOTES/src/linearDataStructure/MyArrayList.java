package linearDataStructure;

public class MyArrayList<E> {
  private Object[] a;
  int size; // how many elements in the array list

  public MyArrayList() {
    a = new Object[1];
    size = 0; // initiate with 0 element
  }

  public MyArrayList(int initialLength) {
    a = new Object[initialLength];
    size = 0; // initiate with 0 element
  }

  // get element from array list
  @SuppressWarnings("unchecked")
  public E get(int i) {
    if (i >= 0 && i < size) {
      return (E) a[i];
    } else {
      return null;
    } // end if
  } // end get

  // replace the object at index i
  public void set(int i, E e) {
    if (i >= 0 && i < size) {
      a[i] = (Object) e;
    } else {
      System.out.println("Invalid Index");
    } // end if
  } // end set

  // make room by shifting and then change the reference to a specific index
  public void add(int i, E e) {
    if (this.size == a.length) {
      this.createNewArray();
    }

    if (i >= 0 && i <= size) {
      for (int j = size; j > i; j--) {
        a[j] = a[j - 1]; // shift right by 1
      } // end loop
      a[i] = (Object) e; // replace value
      size++;
    } // end if
  } // end add

  // add and element at the end of the list
  public void add(E e) {
    if (this.size == a.length) {
      this.createNewArray();
    }

    a[size] = (Object) e;
    size++;

  } // end add

  // remove element at i
  @SuppressWarnings("unchecked")
  public E remove(int i) {
    Object tem = a[i];
    for (int j = i; j < this.size; j++) {
      a[j] = a[j + 1];
    } // end for

    size--;
    a[size] = null; // clear
    return (E) tem;

  } // end remove
  
  //remove the first instance
  @SuppressWarnings("unchecked")
  public E remove(E e){
    for(int i = 0; i < this.size; i++){
      E e2 = (E)a[i];
      if(e2.equals(e)){
        return this.remove(i);
      } //end if
    } //end for loop;
    System.out.println("No Such Object in list");
    return null;
  } //end remove

  //return size of the array list
  public int size(){
    return this.size;
  } //end size
  
  //reverse all elements in the array list
  public void reverse(){
    for(int i = 0; i < this.size/2; i++){
      swap(i,this.size-1-i);
    } //end for loop
  } //end reverse
  
  
  //N^2 sort algorithm
 

  // ************************Private Method*******************************
  private void createNewArray() {
    Object[] b = new Object[a.length * 2]; //in real java implementation of java
                                           //the length goes up by 50% rather than 100%
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    } // end loop
    a = b;
  } // end creatNewArray

  public void swap(int i1, int i2){
    Object tmp = a[i1];
    a[i1] = a[i2];
    a[i2] = tmp;
  } //end swap

} // end
