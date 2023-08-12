package main.java.org.kr.exjava09.interfaceprivatemethod;

public interface PrivateMethod {

    default void defaultSysOut(final String msg) {
        System.out.println(this.privateMsg("defaultSysOut: ", msg));
    }

    default String defaultMsg(final String msg) {
        return this.privateMsg("   defaultMsg: ", msg);
    }

    private String privateMsg(final String preMsg, final String msg) {
        return preMsg + msg;
    }
}
