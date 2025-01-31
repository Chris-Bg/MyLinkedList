package MyLinkedList;

import java.util.*;
import java.io.*;

public class MyIterator {
    public boolean hasNext(){
        return (boolean) next();
    }
    public Object next() throws NoSuchElementException{
        if (!hasNext()) throw new NoSuchElementException();
        return new Object();
    }
    public void remove() throws IllegalStateException, UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}
