package X;

/* renamed from: X.0Ln  reason: invalid class name */
public final class AnonymousClass0Ln {
    public static final String A00(C05920Wy r1) {
        String obj = r1.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
