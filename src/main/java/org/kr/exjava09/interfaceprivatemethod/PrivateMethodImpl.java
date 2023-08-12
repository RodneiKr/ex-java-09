package main.java.org.kr.exjava09.interfaceprivatemethod;

import java.time.LocalDateTime;
import java.util.Optional;

public class PrivateMethodImpl implements PrivateMethod {

    public static void main(String[] args) {
        final PrivateMethod privateMethod = new PrivateMethodImpl();

        Optional.ofNullable(LocalDateTime.now().toString())
                .ifPresent(privateMethod::defaultSysOut);

        System.out.println(
                Optional.ofNullable(LocalDateTime.now().toString())
                .map(privateMethod::defaultMsg)
                .orElse("xiii"));
    }
}