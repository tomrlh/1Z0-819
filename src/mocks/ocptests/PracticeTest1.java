package mocks.ocptests;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PracticeTest1 {

    void methodThrowsException() throws Exception {

    }

    void q11() throws SQLException {
    }

    enum E {
        A
    }

    static void q36() {
        Path x = Paths.get(".", "song", "..", "/note");
        Path y = Paths.get("/dance/move.txt");
        Path z = Paths.get("dance/test/file.txt");

        Path abs = Paths.get("/absolute");
        Path rel = Paths.get("relative");

        System.out.println(rel.resolve(abs)); // /absolute
        System.out.println(abs.resolve(rel)); // /absolute/relative

        System.out.println(x.normalize());
        System.out.println(x.resolve(y));
        System.out.println(y.resolve(x));
        System.out.println(z.resolve(x));
    }

    public static void main(String[] args) throws Exception {
        switch(E.A) {}
        new PracticeTest1().methodThrowsException();
        q36();
    }
}

interface Bass {
    default void method1() {}
}

interface Guitar {
    default void method1() {}
}

abstract class BassAbs implements Bass, Guitar {
    public void method1() {}
}