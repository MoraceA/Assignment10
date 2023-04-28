
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;
 

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   
          
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
    int count =0;
        int sum = 0;
   public DoublyLinkedList() {
      head = null;
      tail = null;
      count =0;
      sum = 0;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      count ++;
      sum++;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      count ++;
      sum++;
   }
   
   public void printList() {
      Node node = head; //any time node = node, next//
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
 public void printRevList(){
     Node node = tail;
  while (node != null) {
         System.out.print(node.data + " ");
         node = node.previous;
      }
 
  System.out.println();
         
     
 }
   
   
   
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      count ++;
         sum++;
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
      
   
          count --;
   }
   public int size(){
       return count;
       
   }
   //To Array Method///
public int[] toArray() {
      int[] arr = new int[count];
      int i = 0;
      Node node = head;
      while (node != null) {
         arr[i++] = node.data;
         node = node.next;
      }
      return arr;
   }

// Sum of Elements of ListN//
       public int sumList() {

    Node current = head;
    while (current != null) {
        sum += current.data;
        current = current.next;
    }
    return sum;
    
}
       
       

    public  static int sumOfPrimeNumbersWith5(int n) {
    int sum = 0;
   
    for (int i = 5; i <= n; i++) {
        if (i % 2 == 0) {
            continue; // skip even numbers
        }
        if (String.valueOf(i).contains("5") && isPrime(i)) {
            sum += i;
        }
    }
    return sum;
}

private static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

    //Index of Object//
          public int indexOf(Object obj) {
    Node current = head;
    int index = 0;
    while (current != null) {
        if (obj.equals(current.data)) {
            return index;
        }
        current = current.next;
        index++;
    }
    return -1;
      }
    
    
}
       

  
   
   
   
   

