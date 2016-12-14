package com.jcf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListTest {

    private ArrayList list = new ArrayList();
    private Random generator = new Random();

    public static void main(String args[]) {
        ArrayListTest test = new ArrayListTest();
        for (int i = 0; i < 12; i++)
            test.addRandom();
        System.out.println(test.toString());
    }

    // public String toString() {
    // return lst.toString();
    // }

    private void addRandom() {
        list.add(new Integer(generator.nextInt()));
    }

    public String toString() {
        String res = "";
        Iterator iter = list.iterator();
        for (int i = 0; iter.hasNext(); i++) {
            if (i % 6 == 0)
                res += "\n";
            res += " " + iter.next().toString(); // !!!
        }
        return res;
    }
}
