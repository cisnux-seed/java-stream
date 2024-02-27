package dev.cisnux.stream;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    void testLimit() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .takeWhile(name -> name.length() <= 8)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .dropWhile(name -> name.length() <= 8)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .findAny();

        optional.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .findFirst();

        optional.ifPresent(System.out::println);
    }
}
