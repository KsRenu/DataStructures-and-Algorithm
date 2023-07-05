package com.implementation.Queue;

import java.util.Queue;

public class QueueRaw {
    int size = 5;
    int a[] = new int[size];
    int front,rear;
    QueueRaw(){
        front =-1;
        rear = -1;
    }
    void enqueue(int data){
        if(front == 0 && rear == size - 1){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        a[rear]= data;
            }
    void dequeue(){
        int element = a[front];
        if(front==-1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
       else if (front >= rear) {
            front = -1;
            rear = -1;
        }
       else{
            front++;
        }

        System.out.println("Deleted: "+ element);
           }
    void display(){
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i]+" ");
        }
    }       

    public static void main(String[] args) {
        QueueRaw q = new QueueRaw();
        for (int i = 10; i <15; i++) {
            q.enqueue(i);
        }
        q.display();
        q.dequeue();
        q.display();
        
    }       
}
