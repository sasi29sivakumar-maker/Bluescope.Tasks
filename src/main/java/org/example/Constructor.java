package org.example;


class Students {
    String name;
    int age;

    Students() {
        name = "";
        age = 0;
    }

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("sasii", 22);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
    }
}