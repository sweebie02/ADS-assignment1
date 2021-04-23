package com.company;

class LinkedList<T> {
    node head;

    LinkedList(){
        head = null;
    }

    public void push_front(T data){
        if(head == null){
            head = new node(data);
        } else {
            node temp = head;
            head = new node(data);
            head.nxt = temp;
        }
    }

    public void add(int ind, T value){
        if(ind == 0){
            push_front(value);
        } else {
            int curInd = 0;
            node cur = head;

            while(cur != null){
                if(curInd == ind - 1){
                    node copy = cur.nxt;
                    cur.nxt = new node(value);
                    cur.nxt.nxt = copy;
                }
                curInd++;
                cur = cur.nxt;
            }
        }
    }
    public int find(T keyItem){
        int ind = 0;
        node cur = head;
        while(cur != null){
            if(cur.data == keyItem){
                return ind;
            }
            cur = cur.nxt;
            ind++;
        }
        return -1;
    }
    public void reverse(){
        node prev = null;
        node cur = head;
        while(cur != null){
            node next = cur.nxt;
            cur.nxt = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void printAll(){
        node cur = head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.nxt;
        }
        System.out.println();
    }

}

