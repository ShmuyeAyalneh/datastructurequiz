//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinearQueue queue = new LinearQueue(5);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 1
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 2

        // Enqueue more elements
        queue.enqueue(5);
        queue.enqueue(6);

        // Dequeue remaining elements
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());

        }


    }
}
