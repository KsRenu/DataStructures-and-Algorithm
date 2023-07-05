package com.implementation.LinkedList.LinkedListRaw;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
            this.next = null;
        }}
        Node head = null;
        Node tail = null;

        void addNode(int data){
            Node n1 = new Node(data);
            if(head==null){
                head = n1;
                tail = n1;
            }
            else{
                tail.next = n1;
                tail=n1;
            }
        }

        void displayNodes(){
            Node current = head;
            if(head==null){
                System.out.println("Empty list");
            }
            else{
                System.out.println("Nodes: ");
                while(current!=null){
                    System.out.println(current.data+" ");
                    current = current.next;
                }
                //System.out.println();
            }
        }
        void count(){
            int count=0;
            Node current = head;
            while(current!=null){
                count+=1;
                current = current.next;
            }
            System.out.println("No.of.nodes: "+ count);
        }

    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
        l1.addNode(5);
        l1.displayNodes();
        l1.count();
    }



}
