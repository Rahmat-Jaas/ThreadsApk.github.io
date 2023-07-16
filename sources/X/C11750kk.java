package X;

/* renamed from: X.0kk  reason: invalid class name and case insensitive filesystem */
public final class C11750kk {
    public static final String A00 = A00("graph.instagram.com");

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.contains("://")) {
            sb.append("https://");
        }
        sb.append(str);
        sb.append("/logging_client_events");
        return sb.toString();
    }
}
