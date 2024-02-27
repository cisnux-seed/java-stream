package dev.cisnux.stream;

import org.junit.jupiter.api.*;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .filter(name -> name.length() > 6)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla", "Cisnux").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
