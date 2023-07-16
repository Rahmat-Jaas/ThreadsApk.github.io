package X;

/* renamed from: X.0wF  reason: invalid class name and case insensitive filesystem */
public final class C18140wF {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FBNS";
            case 2:
                return "PreloadedFBNS";
            case 3:
                return "MqttDirect";
            default:
                return "MqttSimpleClient";
        }
    }
}
