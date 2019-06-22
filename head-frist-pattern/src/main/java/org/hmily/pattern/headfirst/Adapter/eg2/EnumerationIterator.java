package com.hmily.pattern.Adapter.eg2;

import java.util.Iterator;

/**
 * Created by zyzhmily on 2018/8/23.
 */
public class EnumerationIterator implements Iterator{

   private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.next();
    }

    @Override
    public void remove() {
         throw new UnsupportedOperationException();
    }
}
