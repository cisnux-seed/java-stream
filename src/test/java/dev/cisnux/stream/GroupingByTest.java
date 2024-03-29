package dev.cisnux.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> {
                    if (number > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(number -> {
                    return number > 5;
                }));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<Integer, List<String>> map = Stream.of("Fajra", "Riski", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla")
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> map = Stream.of("Fajra", "Risqulla", "Cisnux", "Cisnux Predator", "Fajra Risqulla")
                .collect(Collectors.groupingBy(name -> {
                    return name.length() > 4;
                }));

        System.out.println(map);
    }
}
