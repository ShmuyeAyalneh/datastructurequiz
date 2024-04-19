public class LinearQueue {
    private int[]queue;
    private int front;
    private int rear;
    private int capacity;
    public LinearQueue(int capacity){
        queue = new int[capacity];
        this.capacity = capacity;
        rear = -1;
        front = -1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return rear == capacity - 1;
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("queue is full.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        queue[++rear] = item;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty ");
            return -1;
        }
        int item = queue[front];
                if (front == rear){
                    front = rear = -1;
                }else {
                    front++;
                }
                return item;
        }
    }

