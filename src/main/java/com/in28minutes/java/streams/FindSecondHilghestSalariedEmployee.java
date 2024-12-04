package com.in28minutes.java.streams;

import java.util.*;

public class FindSecondHilghestSalariedEmployee {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("A", "Smith", 20000));
        users.add(new User("B", "Smith", 20000));
        users.add(new User("C", "Smith", 500));
        users.add(new User("D", "Smith", 200));
        users.add(new User("E", "Smith", 10000));

        //find the second highest salary using stream
        System.out.println(findSecondHighestSalariedEmployee(users));
    }

    private static Integer findSecondHighestSalariedEmployee(List<User> users) {
        return users.stream()
                .map(User::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
}
