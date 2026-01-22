package org.example;

import java.util.*;
public class CollectionSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("sasi");
        set.add("bharani");
        set.add("sk");
        set.add("sasi"); // duplicates not allowed in set
        set.add("kumar");

        for (String x : set){
            System.out.println(x);
        }
    }
}

