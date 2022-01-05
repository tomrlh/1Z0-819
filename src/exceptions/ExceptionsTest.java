package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsTest {

    static void test1() {
        try {
            throw new IOException();
        }
        catch(FileNotFoundException e) {}
        catch(IOException e) {}
    }
}
