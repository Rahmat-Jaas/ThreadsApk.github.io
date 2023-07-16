package X;

/* renamed from: X.0qb  reason: invalid class name and case insensitive filesystem */
public final class C15030qb {
    public final /* bridge */ /* synthetic */ void A00(Object obj, String str, String[] strArr) {
        C15680ri r6 = (C15680ri) obj;
        C15560rW r4 = new C15560rW();
        int length = strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = Boolean.parseBoolean(strArr[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            r4.A05(zArr[i2]);
        }
        r6.A08(r4, str);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, String str, String[] strArr) {
        C15680ri r7 = (C15680ri) obj;
        C15560rW r5 = new C15560rW();
        int length = strArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(strArr[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            r5.A00(dArr[i2]);
        }
        r7.A08(r5, str);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, String str, String[] strArr) {
        C15680ri r7 = (C15680ri) obj;
        C15560rW r5 = new C15560rW();
        int length = strArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Long.parseLong(strArr[i]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            r5.A02(jArr[i2]);
        }
        r7.A08(r5, str);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, String str, String[] strArr) {
        C15680ri r5 = (C15680ri) obj;
        C15560rW r3 = new C15560rW();
        for (String A04 : strArr) {
            r3.A04(A04);
        }
        r5.A08(r3, str);
    }
}
