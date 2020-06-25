
package com.example.demo;



import java.util.Objects;
import java.util.Stack;


public class ListProblemInPlace {

    public ListProblemInPlace() {

    }

    public void processLinkedList(String[] args) {

        if (Objects.nonNull(args) && args.length > 0) {

            // input 2 18 24 3 5 7 9 6 12

            // output 24 18 2 3 5 7 9 12 6

            LinkedList originalLinkedList = new LinkedList();
            constructLinkedListFromArguments(args, originalLinkedList);
            System.out.println("Original Linked List");
            originalLinkedList.printList();
            System.out.println();
            System.out.println("Original Linked List With Contiguous Even Numbers In Reversed Order");
            printOriginalLinkedListWithContiguousEvenNumbersReversed(originalLinkedList);
            System.out.println();
        }
        else {
            System.out.println("NO ARGUMENTS PROVODED ! : Please Provide elements of linked list as program arguments");
        }
    }

    private void printOriginalLinkedListWithContiguousEvenNumbersReversed(LinkedList linkedList) {

        LinkedList finalLinkedList = new LinkedList();

        LinkedList.Node currentNode = linkedList.head;

        while (Objects.nonNull(currentNode)) {

            if (currentNode.data % 2 == 0) {
                finalLinkedList.insert(currentNode.data);
            }
            else {
                if(finalLinkedList.head != null) {
                    finalLinkedList.reverse();
                    finalLinkedList.printList();
                    finalLinkedList.head = null;
                }
                System.out.print(currentNode.data  + " ");
            }
            currentNode = currentNode.next;
        }
        finalLinkedList.printList();
    }


    private LinkedList constructLinkedListFromArguments(String[] args, LinkedList list) {

        for(int i=0; i< args.length;i++)
        {
            list.insert(Integer.parseInt(args[i]));
        }
        return list;
    }

}