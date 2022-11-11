package Orgraph;

import java.util.*;

public class SimpleQueue<T> {
    private List<T> list = new LinkedList<>();

    public void add (T user) {
        list.add(user);
    }

    public T remove(){
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
