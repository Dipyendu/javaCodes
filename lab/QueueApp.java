class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Enqueued " + value + " into the queue.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value to indicate an error.
        } else {
            int dequeuedValue = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            System.out.println("Dequeued " + dequeuedValue + " from the queue.");
            return dequeuedValue;
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int count = 0;
            int index = front;
            while (count < currentSize) {
                System.out.print(queueArray[index] + " ");
                index = (index + 1) % maxSize;
                count++;
            }
            System.out.println();
        }
    }
}

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        int dequeuedValue = queue.dequeue();
        System.out.println("Dequeued value: " + dequeuedValue);

        queue.display();
    }
}
