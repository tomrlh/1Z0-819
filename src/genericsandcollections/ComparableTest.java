package genericsandcollections;

import java.util.stream.LongStream;

class Simple implements Comparable<Simple> {
    int value;

    Simple(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Simple o) {
        return this.value - o.value;
    }

    static void ninethQuestion() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5)
                .findFirst();

        opt.getAsLong();
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        Simple s1 = new Simple(1);
        Simple s2 = new Simple(2);
        System.out.println(s1.compareTo(s2));
    }
}
