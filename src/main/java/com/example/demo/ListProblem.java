
package com.example.demo;



import java.util.Objects;
import java.util.Stack;



class Node {

    private Object data;

    private Node next;



    public Node() {

    }



    public Object getData() {

        return data;

    }



    public void setData(Object data) {

        this.data = data;

    }



    public Node getNext() {

        return next;

    }



    public void setNext(Node next) {

        this.next = next;

    }



}



public class ListProblem {



    public ListProblem() {

    }



    public static void main(String[] args) {



        if (Objects.nonNull(args) && args.length > 0) {



            // sample

            // input 2 18 24 3 5 7 9 6 12

            // output 24 18 2 3 5 7 9 12 6

            Node node = constructLinkedList(args);

            printLinkedList(node);

            System.out.println();

            printOriginalLinkedList(node);

            System.out.println();



        } else {

            System.out.println("provide elements of linked list");

        }



    }



    private static void printOriginalLinkedList(Node node) {



        Stack<Node> subPart = new Stack<>();

        Node currentNode = node;

        while (Objects.nonNull(currentNode)) {

            // if current node is even

            if (Integer.valueOf((String) currentNode.getData()) % 2 == 0) {

                // next node is also even

                if (Objects.nonNull(currentNode.getNext())

                        && Integer.valueOf((String) currentNode.getNext().getData()) % 2 == 0) {

                    subPart.push(currentNode);

                } else {

                    System.out.print(currentNode.getData() + " ");

                    while (!subPart.isEmpty()) {

                        Node t = subPart.pop();

                        System.out.print(t.getData() + " ");

                    }

                }



            } else {

                System.out.print(currentNode.getData() + " ");

            }

            currentNode = currentNode.getNext();



        }



    }



    private static void printLinkedList(Node node) {

        while (Objects.nonNull(node)) {

            System.out.print(node.getData() + " ");

            node = node.getNext();



        }

    }



    private static Node constructLinkedList(String[] args) {

        Node root = null;

        Node currentNode = null;

        Node prevNode = null;

        for (int i = 0; i < args.length; i++) {

            currentNode = new Node();

            currentNode.setData(args[i]);

            if (Objects.isNull(root)) {

                root = currentNode;

            }

            if (Objects.nonNull(prevNode)) {

                prevNode.setNext(currentNode);

            }

            prevNode = currentNode;



        }

        return root;

    }



}