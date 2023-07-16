package X;

/* renamed from: X.0TJ  reason: invalid class name */
public final class AnonymousClass0TJ implements Cloneable {
    public static final AnonymousClass0TJ A04;
    public static final AnonymousClass0TJ A05 = new AnonymousClass0TJ();
    public static final AnonymousClass0TJ A06;
    public AnonymousClass0TO A00 = AnonymousClass0TO.A01;
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;

    static {
        AnonymousClass0TJ A002 = A00(new AnonymousClass0TJ());
        A002.A01 = true;
        A04 = A002;
        AnonymousClass0TJ A003 = A00(new AnonymousClass0TJ());
        A003.A03 = true;
        A06 = A003;
    }

    public static AnonymousClass0TJ A00(AnonymousClass0TJ r1) {
        if (r1 != A05 && r1 != A04 && r1 != A06) {
            return r1;
        }
        try {
            return (AnonymousClass0TJ) r1.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("");
        }
    }
}
