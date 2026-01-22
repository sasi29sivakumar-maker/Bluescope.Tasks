package org.example;

import java.util.*;
public class CollectionDemo{
    public static void main(String[] args) {
        List<Integer> accnumbers = new ArrayList<>();
        accnumbers.add(100);
        accnumbers.add(101);
        accnumbers.add(102);
        accnumbers.add(102); // List allow duplicates
        accnumbers.add(104);

        for (Integer x : accnumbers) {
            System.out.println(x);
        }

    }
}
