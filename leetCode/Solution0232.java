package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution0232 {
    public static void main(String[] args) {
        // Create a new MyQueue instance
        MyStack myStack = new MyStack();

        // Push elements into the queue
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Peek the front element
        try {
            int peeked = myStack.peek();
            System.out.println("Peeked element: " + peeked);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Pop the front element
        try {
            int popped = myStack.pop();
            System.out.println("Popped element: " + popped);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Check if the queue is empty
        boolean isEmpty = myStack.empty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}


class MyStack {
    Deque<Integer> q;

    public MyStack() {
        this.q = new ArrayDeque<>();
    }

    public void push(int x) {
        this.q.addLast(x);
    }

    public int pop() {
        int size = this.q.size();
        for (int i = 0; i < size - 1; i++)
            this.push(this.q.pollFirst());
        return this.q.pollFirst();
    }

    public int peek() {
        int size = q.size();
        for (int i = 0; i < size - 1; i++)
            this.push(this.q.pollFirst());

        int res = this.q.peekFirst();
        this.push(this.q.pollFirst());
        return res;
    }

    public boolean empty() {
        return this.q.size() == 0;
    }
}