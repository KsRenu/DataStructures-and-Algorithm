package com.implementation.Queue;

import java.util.LinkedList;
import java.util.List;

public class CircularQueue {
    int size, front,rear,data;
    public CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    List<Integer> q = new LinkedList<>();
    void enqueue(int data){
        if((rear==size-1 && front == 0)||(rear == (front-1)%(size-1))){
            System.out.println("Queue is full");
        }
        else if(front==-1){
            front=0;
            rear =0;
            q.add(rear, data);
        }
        else if(rear==size-1 && front!=0){
            rear=0;
            q.set(rear, data);
        }
        else{
            rear = rear+1;
            if(front<=rear){
                q.add(rear,data);
            }
            else{
                q.set(rear,data);
            }

        }
    }

    void dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
        } else if (front==rear) {
            front = rear =-1;
        } else if (front==size-1) {
            front=0;
        }
        else{
            front=front+1;
        }
    }
    void display(){
        if(front==-1){
            System.out.println("Circular queue is empty");
        }
        else if(rear>=front){
            for( int i=front;i<=rear;i++){
                System.out.print(q.get(i)+" ");
            }
        }
        else{
            for(int i = front; i < size; i++)
            {
                System.out.print(q.get(i));
                System.out.print(" ");
            }

            // Loop for printing elements from
            // 0th index till rear position
            for(int i = 0; i <= rear; i++)
            {
                System.out.print(q.get(i));
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        for (int i = 1; i < 6; i++) {
            q.enqueue(i);
        }
        q.display();
        q.dequeue();
        System.out.println();
        q.display();

    }

}
