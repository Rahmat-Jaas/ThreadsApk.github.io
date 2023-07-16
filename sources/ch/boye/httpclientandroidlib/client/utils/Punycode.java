package ch.boye.httpclientandroidlib.client.utils;

public class Punycode {
    public static final Idn impl;

    static {
        Idn idn;
        try {
            idn = new JdkIdn();
        } catch (Exception unused) {
            idn = new Rfc3492Idn();
        }
        impl = idn;
    }

    public static String toUnicode(String str) {
        return impl.toUnicode(str);
    }
}
