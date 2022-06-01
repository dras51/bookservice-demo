package com.company;

import java.util.ArrayList;

public class SDAArrayList<E> extends ArrayList<E> {
    int count = 1;
    Object[] list = new Object[count];

    @Override
    public boolean add(E o) {
        list[count++ - 1] = o;
        return true;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    public void list() {
        System.out.println(this);
    }
}
