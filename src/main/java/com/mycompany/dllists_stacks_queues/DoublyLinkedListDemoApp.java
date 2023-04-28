
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
public class DoublyLinkedListDemoApp {
   public static void main(String[] args) {
      DoublyLinkedList numList = new DoublyLinkedList();
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);
// Name of list that we are creating is called numList//
      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeF);   // Add 20, make the tail
//14 2 20//
      numList.prepend(nodeD);  // Add 31, make the head
//31 14 2 20//
      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();

      // Remove the tail node, then the head node
    
      numList.remove(nodeD);

int sum = numList.sumList();
System.out.println(sum);
      // Output final list
      System.out.print("List after removing nodes: ");
      numList.printList();
      
      
      //output the reverse order//
    System.out.println("The reverse order of the list is ");
    numList.printRevList();
      
    
      //output the size//
      System.out.println("The size of the list is " +numList.size());
      
      
      // output the min and max//
int[] arr = numList.toArray();

System.out.println("Array" +numList.toArray());

DoublyLinkedList list = new DoublyLinkedList();
list.append(new Node(1));
list.append(new Node(2));
list.append(new Node(3));
int index = list.indexOf(2);
System.out.println(index);
      
   }
}
