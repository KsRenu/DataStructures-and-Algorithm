package com.implementation.LinkedList.LinkedListRaw;

public class DoublyLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head=null;
    Node tail = null;
    void addNodeAtFront(int data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head= newNode;
        }
    }

    void addAtMiddle(int data,int position){
        Node newNode= new Node(data);
        Node current = head;
        int currentPosition =1;
        if (position==1){
            addNodeAtFront(data);
        }
        else{
            while(current !=null && currentPosition<position){
                current = current.next;
                currentPosition+=1;
            }
            if(current==null){
                addNodeAtFront(data);
            }
            else{
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }
    void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            addNodeAtFront(data);
        }
        else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

    void deleteAtBeginning(){
        System.out.println("Deleting first node: ");
        if(head==null){
            System.out.println("Empty list");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
    }
    void deleteAtEnd(){
        Node temp= tail;
        System.out.println("Deleting at the end: ");
        if(head==null){
            System.out.println("Empty list");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail = tail.prev;
            tail.next =null;
        }
    }
    void deleteAtMiddle(int position){
        System.out.println("Deleting at middle: ");
        Node current= head;
        int currentPostion = 1;
        if(position==1){
            deleteAtBeginning();
        }
        else{
            while(current!=null && currentPostion<position){
                current = current.next;
                currentPostion+=1;

            }
            if(current==null){
                System.out.println("postion wrong");
            }
            else if(head==tail){
                deleteAtEnd();
            }
            else{
                current.next.prev = current.prev.next ;
                current.prev.next = current.next;
                current.next =null;
                current.prev = null;


            }

        }
    }
    void display(){
        int x=1;
        Node current =head;
        if (head==null){
            System.out.println("Empty list");
        }
        else{
            while(current!=null){
                System.out.print("Index: "+x+" ");
                System.out.println(current.data);
                current=current.next;
                x+=1;
            }
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList n1 = new DoublyLinkedList();
        n1.display();
        n1.addNodeAtFront(1);
        n1.addNodeAtFront(2);
        n1.addNodeAtFront(3);
        //n1.display();
        n1.addAtMiddle(5, 2);
        //n1.display();
        n1.addAtEnd(6);

        n1.display();
        n1.deleteAtBeginning();
        n1.display();
        n1.deleteAtEnd();
        n1.display();
        n1.deleteAtMiddle(2);
        n1.display();

    }

}
