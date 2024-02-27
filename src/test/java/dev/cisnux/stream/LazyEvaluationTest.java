package dev.cisnux.stream;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Fajra", "Cisnux", "Risqulla");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Fajra", "Cisnux", "Risqulla");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr." + upper;
                })
                .forEach(System.out::println);

    }
}
