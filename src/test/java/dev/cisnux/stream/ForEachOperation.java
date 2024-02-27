package dev.cisnux.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperation {
    @Test
    void testPeekBefore() {
        List.of("Fajra", "Risqulla", "Cisnux").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Fajra", "Risqulla", "Cisnux").stream()
                .peek(name -> System.out.println("Before Change Name to Upper : " + name))
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("Change Name to Upper : " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));
    }
}
