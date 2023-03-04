/**
 * Created by DELL on 04/03/2023.
 */
public interface Queue<E> {

    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();
}
