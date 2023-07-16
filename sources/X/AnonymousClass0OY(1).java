package X;

/* renamed from: X.0OY  reason: invalid class name */
public class AnonymousClass0OY {
    public static final C04530Oa A01(Integer num, AnonymousClass0ZU r4) {
        C04530Oa r0;
        C04220Ms.A0B(r4, 1);
        int intValue = num.intValue();
        if (intValue == 0) {
            r0 = new C06780aL(r4);
        } else if (intValue != 1) {
            r0 = new AnonymousClass4UQ(r4);
        } else {
            r0 = new AnonymousClass4US(r4);
        }
        return r0;
    }

    public static final C04530Oa A02(AnonymousClass0ZU r1) {
        C04220Ms.A0B(r1, 0);
        return new C06780aL(r1);
    }
}
