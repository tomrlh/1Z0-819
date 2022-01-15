package concurrency;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class AtomicTests {
    public static void main(String[] args) {
        var value1 = new AtomicLong(0);
        final long[] value2 = {0};
        IntStream.iterate(1, i -> 1).limit(100).parallel()
                .forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel()
                .forEach(i -> ++value2[0]);
        System.out.printf(value1 + " " + value2[0]);

        try(Scanner scanner1 = new Scanner(System.in)) {
            scanner1.close();
        }
        var cf = NumberFormat.getCurrencyInstance();
        new StringBuilder("").equals("");

        if(true)
            if(true)
                System.out.println("");
            else System.out.println("");

            var myVar = "";
            switch(myVar) {}
    }
}
