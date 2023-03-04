/**
 * Created by DELL on 04/03/2023.
 */
abstract class ArrayQueue<E>  implements Queue {




    E data[];
    int sz = 0;
    int f = 0;
    static final int CAPACITY = 100;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }


    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E del= data[f];
        data[f]= null;
        f=(f+1)%data.length;
        sz--;
        return del;
    }
}
