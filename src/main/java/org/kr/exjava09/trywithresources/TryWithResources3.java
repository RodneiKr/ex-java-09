package main.java.org.kr.exjava09.trywithresources;

public class TryWithResources3 {

	public static void main(String[] args) {
		final NotaFiscalCabecalho nfc = new NotaFiscalCabecalho();
		final NotaFiscalItem nfi = new NotaFiscalItem();
		try (nfc;nfi) {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch: " + e.getMessage());
		}
	}
	
	static class NotaFiscalCabecalho implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("NFC.close()");
		}
	}
	
	static class NotaFiscalItem implements AutoCloseable {
		public NotaFiscalItem() {
			throw new RuntimeException("xiii");
		}
		@Override
		public void close() throws Exception {
			System.out.println("NFI.close()");
		}
	}
}
