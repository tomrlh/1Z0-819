package mocks.ocptests;

import java.io.Serializable;
import java.util.List;

public class Chapter2 {

    static void q4() {
        var quest = new String[3];
        for(var zelda : quest) {}
    }

    static void q1() {
        var v = 'a';

        Object obj = new Object();

        switch(1) {
            default:
        }
    }

    static void q8() {
        var plan = 1;
        plan = plan++ + --plan; // 1 + 0;
        // plan++ = 2
        System.out.println(plan);
    }

    static void q9() {
        var v = 10;
        do {
            System.out.println("inside do");
            break;
        } while(v != 10);
    }

    static void q18() {
        for( ; ; ) {} // infinite loop
    }

    public static void main(String[] args) {
        q18();
    }
}
