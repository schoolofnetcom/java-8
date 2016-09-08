package com.schoolofnet.java8;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String... args) throws InterruptedException {
//        List<String> strs = Arrays.asList("Leonan", "SON", "Java 8", "Leonidas");
//        for (String str: strs) {
//            System.out.println(str);
//        }
//
//        System.out.println("LAMBDAS!");
//
//        Person.say();

//        strs.forEach(str -> System.out.println(str));
//
//        List<String> result = strs.stream()
//                                  .filter(str -> str.startsWith("L"))
//                                  .collect(Collectors.toList());
//        result.forEach(Person::say);

        // java 7
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public void print() {
//                System.out.println("Java 7 implementation - Function interface");
//            }
//        };

//        myInterface.print();

        //java 8
//        MyInterface my1 = (String s) -> {
//            System.out.println("Java 8 Implementation - Function interface " + s);
//        };
//
////        my1.print();
//        result.forEach(my1::print);
//        my1.body1();


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 0, 9, 10, 0);
//        List<String> texts = Arrays.asList("a", "b", "c", "", "", "", "e", "f", "g");
//
//        List<Integer> filteredNumbers = numbers.stream()
//                                               .filter(number -> number != 0)
//                                               .collect(Collectors.toList());
//
//        String filteredText = texts.parallelStream()
//                                         .filter(str -> !str.isEmpty())
//                                         .collect(Collectors.joining(","));
//
//        filteredNumbers.forEach(System.out::println);
//        System.out.print(filteredText);
//        filteredText.forEach(System.out::println);

//        Random hash = new Random();
//
//        hash.doubles()
//            .limit(2)
//            .forEach(System.out::println);

//        List<Person> people = new ArrayList<Person>();
//
//        Person person1 = new Person("Leonan");
//        Person person2 = new Person("Luiz");
//        Person person3 = new Person("Wesley");
//        Person person4 = new Person(null);
//
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);
//        people.add(person4);
//
//        String name = person4.getName();
//
//        Optional<String> op = Optional.ofNullable(name);
//
//        op.ifPresent(System.out::println);
//        people.forEach(p -> {
//            System.out.println(p.getName());
//        });


//        Instant now = Instant.now();
//
//        Thread.sleep(1000);
//        Instant now2 = Instant.now();
//
//        Duration dur = Duration.between(now, now2);
//
//        System.out.println(dur.getSeconds());
//
//
//        LocalDate local = LocalDate.now();
//        System.out.println(local);
//
//        LocalDate birthday1 = LocalDate.of(1990, 2, 10);
//        LocalDate birthday2 = LocalDate.of(2016, 9, 8);
//
//        Period period = Period.between(birthday1, birthday2);
//
//        System.out.printf("%s %s %s", period.getYears(), period.getMonths(), period.getDays());


        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");


        try {
            nashorn.eval("print('HELLO WORLD FROM NASHORN')");
        } catch(ScriptException ex) {
            ex.getStackTrace();
        }
    }
}
