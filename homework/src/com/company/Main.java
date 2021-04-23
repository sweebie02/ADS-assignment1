package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add(5, 0);
        a.add(2, 1);
        a.add(9, 0);
        for(int i = 0; i < a.getSize(); i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        a.reverse();

        for(int i = 0; i < a.getSize(); i++){
            System.out.print(a.get(i) + " ");
        }

        System.out.println();

        System.out.print(a.find(9) + " ");
        System.out.println(a.find(-232412));

        System.out.println("---------------------------");

        LinkedList ll = new LinkedList();

        ll.push_front(10);

        ll.push_front(20);
        ll.push_front(31);

        ll.printAll();

        ll.reverse();

        ll.printAll();

        ll.add(1, -234);

        ll.printAll();


    }
}
