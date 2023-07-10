package com.implementation.Stack;

public class StackRaw {

        int a[];
        int top;
        int capacity;
        StackRaw(int size){

            a = new int[size];
            capacity = size;
            top = -1;
        }



    void push(int data){
            if(isFull()){
                System.out.println("Stack is full");
                System.exit(1);
            }
            else{
                System.out.println("Inserting "+ data);
                a[++top] = data;
                System.out.println("top: "+top);
            }
           // return top;
        }
        int pop(){
            if(top==-1){
                //System.out.println(top);
                System.out.println("Stack is empty");
                System.exit(1);
            }
            //else{
                System.out.println("\nDeleting elements");
                return a[top--];
           // }

        }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    void display(){
        System.out.println("Displaying elements: ");
         //   int i=0;
        for (int j = 0; j < top; j++) {
            System.out.print(a[j]+" ");
        }

    }

    public static void main(String[] args) {
        StackRaw s = new StackRaw(6);
        for (int i = 10; i < 15; i++) {
            s.push(i);
        }
        s.display();

        s.pop();
        System.out.println("After Removal");
        s.display();;
    }
}




