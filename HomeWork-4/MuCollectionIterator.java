import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MuCollectionIterator<T> implements Iterator<T> {
    private T[] data;
    private int cursor;
    public MuCollectionIterator(T[] data){
        cursor = 0;
        this.data = data;
    }
    @Override
    public boolean hasNext() {
        boolean flag = false;
        for (int i = cursor; i >= 0 && !flag; i--) {
            if(data[i] != null) flag = true;
        }
        return flag;
    }

    @Override
    public T next() {
        try {
            T r = data[cursor];
            cursor++;
            return r;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new NoSuchElementException("Error");
        }
    }
    @Override
    public void remove() {
        if (data[cursor] == null) throw new IllegalStateException("error");
        data[cursor] = null;

    }

    @Override
    public String toString() {
        return "MuCollectionIterator{" +
                "data=" + Arrays.toString(data) +
                ", cursor=" + cursor +
                '}';
    }
}