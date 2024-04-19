import java.util.Stack;

public class LinearQueueS {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public LinearQueueS() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
        public static void main (String[]args){
            LinearQueueS queue = new LinearQueueS();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);

            System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 1
            System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 2

            queue.enqueue(4);
            queue.enqueue(5);

            System.out.println("Size of queue: " + queue.size()); // Size is 3 (3 elements remaining)

            System.out.println("Peek: " + queue.peek());
        }
    }




