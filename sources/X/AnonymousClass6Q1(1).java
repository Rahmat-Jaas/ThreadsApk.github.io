package X;

/* renamed from: X.6Q1  reason: invalid class name */
public final class AnonymousClass6Q1 {
    public static final C112506pi A00(MMo mMo) {
        long currentMonotonicTimestamp = AnonymousClass01V.A0p.currentMonotonicTimestamp();
        C105886e9 A00 = C120497Bd.A00(new C130817qp(mMo));
        C04220Ms.A06(A00);
        C111266n3 r3 = A00.A00;
        if (r3 != null) {
            C112506pi r2 = new C112506pi();
            long currentMonotonicTimestamp2 = AnonymousClass01V.A0p.currentMonotonicTimestamp();
            r2.A02 = r3;
            r2.A01 = currentMonotonicTimestamp;
            r2.A00 = currentMonotonicTimestamp2;
            return r2;
        }
        throw C86154wM.A0V("failed to parse bloks payload");
    }
}
