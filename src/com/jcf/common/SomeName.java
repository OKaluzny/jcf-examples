package com.jcf.common;

public class SomeName implements Comparable {

    private String name;

    public static void main(String[] args) {

        SomeName nam = new SomeName();
        nam.setName("Jack");

        System.out.println(nam.getName());

    }

    /**
     * public int compareTo(Object obj) { if ( obj instanceof A ) return
     * name.compareTo(((A)obj).name); return ... здесь сравнение с объектом B }
     */

    public int compareTo(Object obj) {
        return name.compareTo(((SomeName) obj).name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
