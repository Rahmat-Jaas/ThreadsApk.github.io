package X;

/* renamed from: X.2tP  reason: invalid class name and case insensitive filesystem */
public final class C50692tP {
    public static final AnonymousClass24N A00(String str) {
        C04220Ms.A0B(str, 0);
        for (AnonymousClass24N r1 : AnonymousClass24N.values()) {
            if (str.equalsIgnoreCase(r1.A00)) {
                return r1;
            }
        }
        throw C18180wK.A0a(AnonymousClass00U.A0V("Prefill source '", str, "' not supported."));
    }
}
