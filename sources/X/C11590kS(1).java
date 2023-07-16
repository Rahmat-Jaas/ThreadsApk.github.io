package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0kS  reason: invalid class name and case insensitive filesystem */
public final class C11590kS {
    public int A00;
    public ArrayList A01 = new ArrayList(32);

    public final Object A01(String str) {
        for (int i = 0; i < this.A00; i++) {
            ArrayList arrayList = this.A01;
            int i2 = i << 1;
            if (arrayList.get(i2).equals(str)) {
                return arrayList.get(i2 + 1);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (X.C32572Cj.A00(r3, r9.A01(r4)) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r8 == r9) goto L_0x0049
            boolean r0 = r9 instanceof X.C11590kS
            r6 = 0
            if (r0 == 0) goto L_0x0048
            X.0kS r9 = (X.C11590kS) r9
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x0048
            r5 = 0
        L_0x0011:
            int r0 = r8.A00
            if (r5 >= r0) goto L_0x0049
            java.util.ArrayList r1 = r8.A01
            int r0 = r5 << 1
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            int r0 = r0 + 1
            java.lang.Object r3 = r1.get(r0)
            r2 = 0
        L_0x0026:
            int r0 = r9.A00
            if (r2 >= r0) goto L_0x0048
            java.util.ArrayList r1 = r9.A01
            int r0 = r2 << 1
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r9.A01(r4)
            boolean r0 = X.C32572Cj.A00(r3, r0)
            if (r0 == 0) goto L_0x0048
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0048:
            return r6
        L_0x0049:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11590kS.equals(java.lang.Object):boolean");
    }

    public static void A00(C11590kS r3, int i, int i2) {
        if (i < 0 || i >= r3.A00) {
            throw new ArrayIndexOutOfBoundsException(AnonymousClass00U.A01(i, r3.A00, "Index: ", ", Size: "));
        } else if (i2 < 0 || i2 >= r3.A01.size()) {
            throw new ArrayIndexOutOfBoundsException(AnonymousClass00U.A01(i2, r3.A01.size(), "Internal Index: ", ", Internal Size: "));
        }
    }

    public final void A02(String str, Object obj) {
        if (str != null && !str.isEmpty()) {
            if (obj instanceof Float) {
                float floatValue = ((Number) obj).floatValue();
                if (Float.isNaN(floatValue) || Float.isInfinite(floatValue)) {
                    return;
                }
            }
            if (obj instanceof Double) {
                double doubleValue = ((Number) obj).doubleValue();
                if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                    return;
                }
            }
            ArrayList arrayList = this.A01;
            arrayList.add(str);
            arrayList.add(obj);
            this.A00++;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00)});
    }
}
