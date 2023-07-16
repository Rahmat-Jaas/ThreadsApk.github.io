package X;

/* renamed from: X.6E8  reason: invalid class name */
public final class AnonymousClass6E8 {
    public static final long A00(String str, int i, int i2, boolean z, boolean z2) {
        int A00;
        if (i2 == 0) {
            return AnonymousClass6FM.A00(i, i);
        }
        if (i == 0) {
            int A002 = JYE.A00(str, 0);
            if (z) {
                return AnonymousClass6FM.A00(A002, 0);
            }
            return AnonymousClass6FM.A00(0, A002);
        } else if (i == i2) {
            int A01 = JYE.A01(str, i2);
            if (z) {
                return AnonymousClass6FM.A00(A01, i2);
            }
            return AnonymousClass6FM.A00(i2, A01);
        } else if (z) {
            if (!z2) {
                A00 = JYE.A01(str, i);
            } else {
                A00 = JYE.A00(str, i);
            }
            return AnonymousClass6FM.A00(A00, i);
        } else if (!z2) {
            return AnonymousClass6FM.A00(i, JYE.A00(str, i));
        } else {
            return AnonymousClass6FM.A00(i, JYE.A01(str, i));
        }
    }
}
