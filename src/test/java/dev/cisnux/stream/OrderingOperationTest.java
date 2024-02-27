package dev.cisnux.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        final Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
