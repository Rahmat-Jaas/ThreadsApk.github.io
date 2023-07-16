package X;

/* renamed from: X.69V  reason: invalid class name */
public enum AnonymousClass69V {
    ;

    public static AnonymousClass69V A01(String str, int i) {
        return new AnonymousClass69V(str, i);
    }

    public static AnonymousClass69V A00(String str) {
        for (AnonymousClass69V r1 : values()) {
            if (r1.name().equalsIgnoreCase(str)) {
                return r1;
            }
        }
        return null;
    }
}
