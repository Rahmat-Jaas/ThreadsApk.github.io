package X;

/* renamed from: X.2JX  reason: invalid class name */
public final class AnonymousClass2JX {
    public static final void A00(AnonymousClass3XX r2, String str, String str2) {
        AnonymousClass0wJ.A1O(str2, r2);
        String A0d = AnonymousClass00U.A0d("[Bloks] ", str, ": ", str2);
        Throwable th = r2.A01;
        if (th != null) {
            C10450iM.A05(A0d, "request failed", 1000, th);
        } else {
            C10450iM.A04(A0d, "request failed", 1000);
        }
    }
}
