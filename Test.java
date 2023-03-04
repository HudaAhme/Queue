/**
 * Created by DELL on 04/03/2023.
 */
public class Test {
    public static void main(String[] args) {
        ArrayQueue queue= new ArrayQueue() {
            @Override
            public void enqueue(Object element) {

            }
        };
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
    }
}
