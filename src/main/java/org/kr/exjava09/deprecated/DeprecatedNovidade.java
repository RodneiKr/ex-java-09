package main.java.org.kr.exjava09.deprecated;

public class DeprecatedNovidade {

    public static void main(String[] args) {
        deprecated();
    }

    // os 2 atributos (da anotacao) sao NOVOS
    @Deprecated(since = "1.0", forRemoval = true)
    private static void deprecated() {
        System.out.println("os 2 atributos (do anotacao) sao NOVOS");
    }
}
