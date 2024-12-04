package com.in28minutes.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsageOfFlatMap {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("A", "Smith", 20000));
        users.add(new User("E", "Smith", 10000));
        users.add(new User("F", "Smith", 15000));

        List<User> users1 = new ArrayList<>();
        users1.add(new User("A", "Smith", 20000));
        users1.add(new User("E", "Smith", 5000));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a","smith", users));
        employees.add(new Employee("b","smith", users1));

//        findCommonUserInBothEmployee(employees);

//        groupby example
        getUserDataBySalary(employees);
    }

    private static void getUserDataBySalary(List<Employee> employees) {
//        users.stream()
//                .map(employee -> employee.getUsers().stream().map(User::getSalary).distinct()
//                        .sorted(Comparator.reverseOrder()).skip(1)).forEach(System.out::println);
        employees.stream().collect(Collectors.groupingBy(Employee::getUsers)).forEach((users, employee)->{
            findCommonUserInBothEmployee(employee);
        });
    }

    private static void findCommonUserInBothEmployee(List<Employee> employees) {
        employees.stream()
                .flatMap(employee -> employee.getUsers().stream().map(User::getSalary).distinct()
                        .sorted(Comparator.reverseOrder()).skip(1)).forEach(System.out::println);
    }
}
