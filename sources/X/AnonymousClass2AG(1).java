package X;

/* renamed from: X.2AG  reason: invalid class name */
public enum AnonymousClass2AG implements C021109v {
    BROADCAST("broadcast"),
    INSTAGRAM("instagram"),
    SUBSCRIBER_BROADCAST("subscriber_broadcast");
    
    public final String A00;

    public static String A00(C021109v r1, AnonymousClass0A3 r2, AnonymousClass49Y r3) {
        r2.A0O(r1, "source");
        r2.A0O(AnonymousClass2AA.A04, "surface");
        r2.A0O(BROADCAST, "parent_surface");
        return r3.A00;
    }

    public static void A01(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "surface");
        r2.A0O(BROADCAST, "parent_surface");
        r2.Bb4();
    }

    /* access modifiers changed from: public */
    AnonymousClass2AG(String str) {
        this.A00 = str;
    }
}
