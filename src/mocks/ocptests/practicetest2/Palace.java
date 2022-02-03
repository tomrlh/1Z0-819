package mocks.ocptests.practicetest2;

import java.io.*;

public class Palace {
    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("Problem");
        }
        catch(IOException e) {
            throw new IOException();
        }
        catch(FileNotFoundException e) {
            try {
                throw new IOException();
            }
            catch(Exception e) {

            }
            finally {
                throw new RuntimeException("Undending problem");
            }
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        new Palace().openDrawbridge();
    }
}
