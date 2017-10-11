package example_project;

import java.util.*;


//import java.util.Arrays;

public class Example {

    public static void swap(int[] arr, int ind1, int ind2){
        final int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    
    public static void main(String[] args) {
      ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2,3,56,2,67,11,2,6,7));
      a = mergesort(a);
      System.out.println(a.toString());
   
    }
    
    public static int factorial(int n){
      if(n == 1){
        return 1;
      }else{
        return factorial(n-1)*n;
      }
    } //end factorial
    
    public static int fibonacci(int n){
      if(n == 0 || n ==1){
        return n;
      }else{
        return fibonacci(n-1)+fibonacci(n-2);
      }
    }
    
    public static int binarySearch(int n, int[] list, int low, int high){
      int mid = (high + low) /2;
        if(low <= high){
        if(n <list[mid]){
          return binarySearch(n, list, low, mid-1);
        }else if(n > list[mid]){
          return binarySearch(n, list, mid+1, high);
        }else{
          return mid;
        }
      }else{
        return -1;
      }
      
    }
    
    public static ArrayList<Integer> mergesort(ArrayList<Integer> list){
      if(list.size() == 1){
        return list;
      }else{
        int mid = (list.size()-1)/2;
        ArrayList<Integer> list1 = new ArrayList<Integer>(list.subList(0, mid+1));
        ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(mid+1, list.size()));
        list1 = mergesort(list1);
        list2 = mergesort(list2);
        return merge(list1,list2);
      }
      
    }
    
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
      ArrayList<Integer> list = new ArrayList<Integer>();
      while(list1.size() != 0 && list2.size() != 0){
        if(list1.get(0) < list2.get(0)){
          list.add(list1.remove(0));
        }else{
          list.add(list2.remove(0));
        }
      }
      
      while(list1.size() != 0){
        list.add(list1.remove(0));
      }
      while(list2.size() != 0){
        list.add(list2.remove(0));
      }
      return list;
    }
    
    
}
