package X;

import java.util.Arrays;

/* renamed from: X.7Gg  reason: invalid class name and case insensitive filesystem */
public final class C121467Gg {
    public int A00;
    public final int A01;
    public final C122147Ku A02;

    public static Object A00(C121467Gg r4, int i) {
        int i2 = r4.A00;
        boolean z = true;
        if (C86114wI.A1T(i2, -1)) {
            if (i >= i2) {
                z = false;
            }
            AnonymousClass6QH.A00(z, "invalid instr stack argument");
            return r4.A02.A05[r4.A01 + i];
        }
        throw C18180wK.A0a("InstrStackArgs is not initialized");
    }

    public static void A01(C121467Gg r6, Object obj) {
        int i = r6.A00;
        if (C86114wI.A1T(i, -1)) {
            C122147Ku r3 = r6.A02;
            int i2 = r3.A01 - i;
            r3.A01 = i2;
            Arrays.fill(r3.A05, i2, i + i2, (Object) null);
            r3.A0P(obj);
            r6.A00 = -1;
            return;
        }
        throw C18180wK.A0a("InstrStackArgs is not initialized");
    }

    public static boolean A02(double d) {
        double floor;
        if (d < 0.0d) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return C18180wK.A1W((floor > d ? 1 : (floor == d ? 0 : -1)));
    }

    public C121467Gg(C122147Ku r3, int i) {
        int i2;
        this.A02 = r3;
        this.A00 = i;
        if (i > 0) {
            i2 = (r3.A01 - 1) - (i - 1);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
