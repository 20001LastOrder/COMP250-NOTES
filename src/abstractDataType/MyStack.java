package abstractDataType;

import java.util.LinkedList;

public class MyStack<T> {
  LinkedList<T> list;
  
  public MyStack(){
    list = new LinkedList<T>();
  } //end MyStack
  
  public void push(T t){
    list.addFirst(t);
  } //end push
  
  public T pop(){
    T t = list.getFirst();
    list.removeFirst();
    return t;
  } //end push
  
  public boolean isEmpty(){
    if(list.size() > 0){
      return true;
    }else{
      return false;
    } //end if
  } // end isEmpty
  
  public T peek(){
    return list.getFirst();
  } //end peek
  
} //end class
