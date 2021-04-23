package com.company;

public class ArrayList<T> {

    private Object[] a;
    private int size;
    private int capacity = 5;

    public ArrayList(){
        a = new Object[capacity];
    }

    public int getSize(){
        return this.size;
    }

    public T get(int ind){
        return (T)a[ind];
    }
    public void add(T newItem, int index){
        if(a.length == size){
            increaseBuffer();
        }
        for(int i = size; i > index; i--){
            a[i] = a[i - 1];
        }
        a[index] = newItem;
        size++;
    }
    public T remove(int index){
        T item = (T)a[index];
        for(int i = index; i < size - 1; i++){
            a[i] = a[i + 1];
        }
        size--;
        return item;
    }

    public int find(T keyitem){
        for(int i = 0; i < size; i++){
            if(a[i] == keyitem){
                return i;
            }
        }
        return -1;
    }

    public void reverse(){
        for(int i = 0; i < size / 2; i++){

            T temp = (T) a[(size - 1) - i];
            a[(size - 1) - i] = a[i];
            a[i] = temp;
        }
    }

    private void increaseBuffer(){
        capacity = (int)(1.5 * capacity);
        Object[] a2 = new Object[capacity];
        for(int i = 0; i < size; i++){
            a2[i] = a[i];
        }
        a = a2;
    }
}


