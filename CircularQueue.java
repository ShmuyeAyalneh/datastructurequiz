public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;

    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty.");
            return -1;
        }
        int item = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5); // Now the queue is full

        // Try enqueueing one more element
        queue.enqueue(6);

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 1
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 2

        // Enqueue more elements
        queue.enqueue(6);
        queue.enqueue(7);

        // Dequeue remaining elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Try to dequeue from an empty queue
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
