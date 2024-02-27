package dev.cisnux.stream;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        Stream<String> oneStream = Stream.of("Fajra");
        oneStream.forEach(System.out::println);

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray() {
        final Stream<String> arrayStream = Stream.of("Fajra", "Risqulla", "Cisnux");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);

        final String[] array = new String[]{
                "Fajra", "Risqulla", "Cisnux"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        final List<String> collection = List.of("Fajra", "Risqulla", "Cisnux");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Cisnux Predator");
        // stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//         iterate.forEach(System.out::println);
    }
}
