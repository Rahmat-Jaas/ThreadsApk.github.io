package X;

import com.facebook.redex.IDxJHelperShape836S0100000_1_I2;

/* renamed from: X.3XY  reason: invalid class name */
public final class AnonymousClass3XY {
    public static AnonymousClass3XY A02;
    public final C37228Jmt A00 = new C37228Jmt(C10600ic.A00.getApplicationContext(), new IDxJHelperShape836S0100000_1_I2(this, 0), 1863054121);
    public final AnonymousClass3Y6 A01 = new AnonymousClass3Y6();

    public static C62303Ye A00(AnonymousClass3XY r1, String str, String str2) {
        return (C62303Ye) r1.A01.A01.get(AnonymousClass00U.A0L(str, str2));
    }

    public static synchronized AnonymousClass3XY A01() {
        AnonymousClass3XY r0;
        synchronized (AnonymousClass3XY.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new AnonymousClass3XY();
                A02 = r0;
            }
        }
        return r0;
    }

    public AnonymousClass3XY() {
        AnonymousClass0gN.A00().AKp(new AnonymousClass1mN(this));
    }
}
