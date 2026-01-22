package org.example;
import java.util.*;
public class CollectionMap {
    public static void main(String[] args) {
        Map<Object,Object> mp = new HashMap<>();
        mp.put (1,"apple");
        mp.put (2,"banana");
        mp.put ("carrot",'s');
        mp.put (22,"sasi");
        mp.put (22,"sasi"); // key does not allow duplicate

        for (Map.Entry<Object,Object>entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

}
