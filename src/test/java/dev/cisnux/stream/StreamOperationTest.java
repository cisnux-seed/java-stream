package dev.cisnux.stream;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testStreamOperation() {
        List<String> names = List.of("Fajra", "Risqulla", "Cisnux");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(String::toUpperCase);

        streamUpper.forEach(System.out::println);

        names.forEach(System.out::println);
    }
}
