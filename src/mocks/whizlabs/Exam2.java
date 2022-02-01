package mocks.whizlabs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

abstract class Abs1 {
}

@interface Exercise {
    int hoursPerDay();
}

@interface Lambda {
    Exercise exercise() default @Exercise(hoursPerDay=2);
    Exercise[] exercises() default @Exercise(hoursPerDay=2); // array of annotations
}

class A1 {
    public void m(CharSequence cs) {}
}

class A2 extends A1 {
    // @Override
    public void m(String cs) {}
}

class C {
    protected transient String type;
}

interface Inter1 {
    default void f() {
        System.out.println("Inter1");
    }


}

interface Inter2 extends Inter1 {
    default void f() {
        System.out.println("Inter2");
    }
}

interface Inter22 {
    default void f() {
        System.out.println("Inter22");
    }
}

interface Inter3 {
    public static void f() {
        System.out.println("Inter3");
    }
}

class InterTest implements Inter2, Inter3, Inter22 {
    public void f() {}
}

// q6
class TargetRunnable extends Thread {
    public void run() {}
}

public class Exam2 {

    static void q21() {
        Locale.setDefault(Locale.US);
        String input = "Jan 03 20";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yy");
        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }

    static void q9() {
        InterTest obj = new InterTest();
        obj.f();
    }

    static void q25() {
        List<Integer> arraysAsList = Arrays.asList(1, 2, 3);
        arraysAsList.add(0, 0);
        System.out.println(arraysAsList);
    }

    static void q6() {
        Runnable target = new TargetRunnable();
        Thread myThread = new Thread(target);
    }

    public static void main(String[] args) {
        q25();
    }
}
