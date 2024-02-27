package dev.cisnux.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {
    Stream<String> getStream() {
        return Stream.of("Fajra", "Risqulla", "Cisnux", "Cisnux");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        // it will return the immutable list as well
        List<String> otherImmutableList = getStream().toList();
        System.out.println(immutableList);
        System.out.println(otherImmutableList);
        // immutable
//        immutableList.add("new data");
//        otherImmutableList.add("new data");
    }

    @Test
    void testMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name -> UUID.randomUUID().toString(),
                String::length
        ));
        map.forEach((s, integer) -> System.out.println(s + ": " + integer));
    }
}
