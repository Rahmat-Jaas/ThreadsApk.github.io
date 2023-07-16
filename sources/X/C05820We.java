package X;

/* renamed from: X.0We  reason: invalid class name and case insensitive filesystem */
public final class C05820We {
    public static final C05820We A01 = new C05820We(0);
    public final int A00;

    static {
        new C05820We(2);
    }

    public C05820We(int i) {
        if (((i - 1) & i) == 0) {
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0S("Only one flag must be set for a listener, ", " passed", i));
    }
}
