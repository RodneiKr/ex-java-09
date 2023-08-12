package main.java.org.kr.exjava09.integerlong;

public class IntegerLong {

    public static void main(String[] args) {

        // o exemplo abaixo se aplica tambem para:
        // Long
        // Float
        // Double
        // ...

        // construtores obsoletos
//        final Integer integer0 = new Integer(100);
//        final Integer integer1 = new Integer("100");

        final Integer integerValueOf0 = Integer.valueOf(100);
        final Integer integerValueOf1 = Integer.valueOf("100");

        final int integerParseInt = Integer.parseInt("100");
    }
}
