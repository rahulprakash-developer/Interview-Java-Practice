package com.java.coding.interview.java21;

import java.util.List;
import java.util.Optional;


public class SecondHighestExampleUsingStream {

    public static void main(String[] args) {

        List<Person> personList = List.of(

                new Person(1, "Rahul", 70000),
                new Person(2, "Ram", 60000),
                new Person(3, "Raju", 90000),
                new Person(4, "Raaz", 40000)


        );

/*        Person secondHigest = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second higest : " + secondHigest);*/

        Optional<Person> secondHigest = personList.stream().
                reduce((p1, p2) -> p1.getSalary() > p2.getSalary() ? p1 : p2);

        if (secondHigest.isPresent()) {
            Person highest = secondHigest.get();
            secondHigest = personList.stream()
                    .filter(p -> p != highest)
                    .reduce((p1, p2) -> p1.getSalary() > p2.getSalary() ? p1 : p2);
        }
       // System.out.println(STR."Second highest employee: \{secondHigest.orElse(null)}");

    }
}


class Person {

    int id;
    String name;

    double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}