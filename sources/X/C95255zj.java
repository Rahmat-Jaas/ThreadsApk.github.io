package X;

import java.util.Map;

/* renamed from: X.5zj  reason: invalid class name and case insensitive filesystem */
public final class C95255zj extends C112506pi {
    public static final AnonymousClass3TW A01 = new AnonymousClass3TW();
    public Map A00 = AnonymousClass4WJ.A0A();

    public static final C95255zj A00(MMo mMo) {
        long currentMonotonicTimestamp = AnonymousClass01V.A0p.currentMonotonicTimestamp();
        C95255zj r5 = new C95255zj();
        Map A012 = AnonymousClass70J.A01(new C130817qp(mMo));
        C04220Ms.A06(A012);
        r5.A00 = A012;
        C130837qr r0 = new C130837qr(mMo, AnonymousClass0wJ.A0z(A012));
        r0.Bhu();
        C111266n3 r2 = C120497Bd.A00(r0).A00;
        if (r2 != null) {
            long currentMonotonicTimestamp2 = AnonymousClass01V.A0p.currentMonotonicTimestamp();
            r5.A02 = r2;
            r5.A01 = currentMonotonicTimestamp;
            r5.A00 = currentMonotonicTimestamp2;
            return r5;
        }
        throw C86154wM.A0V("failed to parse bloks payload");
    }
}
