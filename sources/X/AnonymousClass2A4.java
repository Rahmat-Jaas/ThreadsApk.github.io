package X;

/* renamed from: X.2A4  reason: invalid class name */
public enum AnonymousClass2A4 implements C021109v {
    IMPRESSION("impression"),
    TAP("tap"),
    TOGGLE("toggle"),
    VIEW("view");
    
    public final String A00;

    public static void A00(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "event");
        r2.A0O(TAP, "action");
    }

    /* access modifiers changed from: public */
    AnonymousClass2A4(String str) {
        this.A00 = str;
    }
}
