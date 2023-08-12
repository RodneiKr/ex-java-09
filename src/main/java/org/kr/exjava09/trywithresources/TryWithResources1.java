package main.java.org.kr.exjava09.trywithresources;

public class TryWithResources1 {

    public static void main(String[] args) {
        try (final NotaFiscalCabecalho nfc = new NotaFiscalCabecalho();
             final NotaFiscalItem nfi = new NotaFiscalItem()) {
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
    }

    static class NotaFiscalCabecalho implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("NFC.close()");
        }
    }

    static class NotaFiscalItem implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("NFI.close()");
        }
    }
}
