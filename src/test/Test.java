package test;

import linearDataStructure.*;

public class Test {

  public static void main(String[] args) {
    MyArrayList<Integer> a = new MyArrayList<Integer>();
    
    for(int i = 0; i<10; i++){
      a.add(new Integer(i));
    }
    
    a.add(5, new Integer(10));
    a.set(10, new Integer(7));
    
    a.remove(new Integer(100));
    
    
    a.reverse();
    for(int i = 0; i<a.size(); i++){
      System.out.print(a.get(i) + " ");
      
    }
    System.out.println("");

    insertSort(a);
    for(int i = 0; i<a.size(); i++){
      System.out.print(a.get(i) + " ");
      
    }
    
   
    
    
  /* SingleLinkedList<Integer> l = new SingleLinkedList<Integer>();
    for(int i = 0; i<10; i++){
      l.addLast(new Integer(i));
    }
    l.addFirst(new Integer(100));
    l.addFirst(new Integer(10));
    l.removeFirst();
    l.printAll();
    System.out.println();
    l.reverse();
    l.printAll();
    */
  }
  
  //N^2 sort algorithm
  public static void bubbleSort(MyArrayList<Integer> list){
    boolean needContinue = false;

    int count = 0;
    do{
      needContinue = false;
      for(int i = 0; i < list.size()-1-count; i++){
        if(list.get(i) > list.get(i+1)){
          list.swap(i, i+1);
          needContinue = true;
        } //end if
      } //end for loop
      count++;
    }while(needContinue);
  } //end bubble sort

  public static void selectionSort(MyArrayList<Integer> list){
    for(int i = 0; i < list.size()-1; i++){
      int index = i;
      int minimum = list.get(i);
      for(int k = i; k < list.size(); k++){
        if(list.get(k) < minimum){
          minimum = list.get(k);
          index = k;
        } //end if
      } //end for
      if(index != i){
        list.swap(index, i);
      } //end if
    } //end for
  }//end selectionSort
  
  public static void insertSort(MyArrayList<Integer> list){
    for(int i = 1; i < list.size(); i++){
      int k = i;
      int element = list.get(i);
      while(k > 0 && element < list.get(k - 1)){
        list.set(k, list.get(k-1));
        k--;
      } //end while
      
      if(k != i){
        list.set(k, element);
      } //end if
    } //end for
  } //end insertSort
  
} //end class


