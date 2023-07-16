package X;

/* renamed from: X.6Fp  reason: invalid class name and case insensitive filesystem */
public final class C98456Fp {
    public static final boolean A00(AnonymousClass67E r3, C1202279h r4, C1202279h r5) {
        AnonymousClass0wJ.A1M(r4, 0, r3);
        if (r5 == null) {
            return true;
        }
        if ((r5 instanceof C885859i) && (r4 instanceof C885959j)) {
            return true;
        }
        if ((r4 instanceof C885859i) && (r5 instanceof C885959j)) {
            return false;
        }
        if (r4.A00 == r5.A00 && r4.A01 == r5.A01 && r5.A01(r3) <= r4.A01(r3)) {
            return false;
        }
        return true;
    }
}
