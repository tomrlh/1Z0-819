package functionalprogramming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.List;

public class Streams {

    static void iterateTest() {
        var stream = Stream.iterate("", (s) -> s + "1");
        stream
                .limit(2)
                .map(s -> s + "2")
                .forEach(System.out::println);

        Stream<Integer> iterate1 = Stream.iterate(0, (n) -> n + 1);
        Stream<Integer> iterate2 = Stream.iterate(0, n -> n == 0, (n) -> n + 2);

        iterate2.forEach(System.out::println);
    }

    static void anyMatchTest() {
        Predicate<String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl!");
        var stream2 = Stream.generate(() -> "growl!");
        var b1 = stream1.anyMatch(predicate);
        System.out.println(b1);
    }

    static void allMatchTest() {
        Predicate<String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl!");
        var stream2 = Stream.generate(() -> "growl!");
        var b1 = stream1.anyMatch(predicate);
        System.out.println(b1);
    }

    static void noneMatchTest() {
        var list = List.of("2monkey", "2m", "2chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().noneMatch(predicate));
    }

    static void anyMatchTest2() {
        var list = List.of("2monkey", "a2m", "2chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(predicate));
    }

    static void longStreamTest1() {
        double result1 = LongStream.of(6L, 8L, 16L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        double result2 = LongStream.of(6L, 8L, 16L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(LongStream.of(6L, 8L, 16L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x)));
    }

    static void sixth() {
        var s = Stream.generate(() -> "meow");
        var match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }

    static void fourteenth() {
        Stream<Integer> s = Stream.of(1);
        // IntStream is = s.boxed();
    }

    static void range() {
        IntStream.range(1, 6)
                .mapToObj(i -> i)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        range();
    }
}

