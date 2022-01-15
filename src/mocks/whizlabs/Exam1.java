package mocks.whizlabs;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Exam1 {

    static void print(int... a2) {
        System.out.printf("int...");
    }

    static void print(long a, long b) {
        System.out.println("long, long");
    }

    static void q14() {
        int[] nums = {1, 2, 3, 4, 5};
        for (var i = 0; i < nums.length; ++i)
            System.out.println(nums[i]);

        int b = 15;
        print(b, b);
    }

    static void q22() throws ParseException {
        String income = "$22,07.99";
        Locale.setDefault(Locale.UK);
        var cf = NumberFormat.getCurrencyInstance();
        Double value = (Double) cf.parse(income);
        System.out.println(value);
    }

    static void multiple() {
        final class C extends Object {}
        int t = 1;
        int v = ++t + 1;
        System.out.println(t);
        var vv = "";
        vv.concat("");
        var vvv = new String("");

        String ss = "asdb";
        System.out.println(ss.substring(3).charAt(2));

        Optional.ofNullable(161).get().equals(161);
        final List<String> al = new ArrayList<>();
        al.add("");
        al.removeIf(s -> s.isEmpty());
    }



    public static void main(String[] args) {

    }
}

