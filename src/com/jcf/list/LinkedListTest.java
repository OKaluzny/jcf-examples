package com.jcf.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {

        List<String> engineers = new LinkedList<>();

        engineers.add("Amy");
        engineers.add("Carl");
        engineers.add("Erica");

        engineers.add(0, "Oleg");
        engineers.add(1, "Eric");
        engineers.remove(2);

        // engineers.forEach(s->System.out.println(s)); // lambda
        engineers.forEach(System.out::println);        // lambda

        System.out.println("Engineers: " + engineers); // 1
        // System.out.println(engineers.get(0)); //2
        // System.out.println(engineers.size()); //3
        // System.out.println(engineers.isEmpty()); //4

        List<String> architects = new LinkedList<>();

        architects.add("Bob");
        architects.add("Doug");
        architects.add("Doug");
        architects.add("Frances");
        architects.add("Gloria");
        System.out.println(architects.contains("Doug"));
        System.out.println(architects.toString());

        System.out.println("Architects: " + architects); // 5

        ListIterator<String> aIter = engineers.listIterator();
        Iterator<String> bIter = architects.iterator();

        System.out.println("1 " + bIter.hasNext());
        System.out.println("Name-" + bIter.next());
        System.out.println("2 " + bIter.hasNext());
        System.out.println("Name-" + bIter.next());
        System.out.println("3 " + bIter.hasNext());
        System.out.println("Name-" + bIter.next());
        System.out.println("4 " + bIter.hasNext());
        System.out.println("Name-" + bIter.next());
        System.out.println("5 " + bIter.hasNext());
        System.out.println("Name-" + bIter.next());
        System.out.println("6 " + bIter.hasNext());

        while (bIter.hasNext()) {
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println("Union " + engineers);

        bIter = architects.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(architects);
        engineers.removeAll(architects);
        System.out.println(engineers);

        List<String> staff = new LinkedList<>();
        staff.add("Julis");
        staff.add("Benny");
        staff.add("Mick");
        Iterator iter = staff.iterator();
        String first = (String) iter.next();
        String second = (String) iter.next();
        iter.remove();
        System.out.println(staff);
    }
}
