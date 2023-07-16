package X;

/* renamed from: X.0NQ  reason: invalid class name */
public enum AnonymousClass0NQ {
    A0E("No status", '0', 0),
    A0B("Initial", 'i', 1),
    A0C("JavaCrash", 'j', 2),
    A0D("JavaExit", 'x', 23),
    A04("ANR", 'r', 28),
    A09("ANRRecovered", 'c', 29),
    A0A("AnrSigquit", 'q', 31),
    A08("AnrMtUnblocked", 'u', 32),
    A05("AnrAmConfirmed", 'R', 33),
    A06("AnrAmConfirmedMtUnblocked", 'U', 34),
    A07("AnrAmExpired", 'm', 35);
    
    public Integer A00;
    public final char A01;
    public final String A02;

    /* access modifiers changed from: public */
    AnonymousClass0NQ(String str, char c, int i) {
        this.A01 = c;
        this.A02 = str;
        this.A00 = r1;
    }

    public final String toString() {
        return this.A02;
    }
}
