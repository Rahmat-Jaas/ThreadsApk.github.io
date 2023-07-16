package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.8AP  reason: invalid class name */
public final class AnonymousClass8AP extends AnonymousClass8AQ {
    public static final int A01(Object[] objArr, Object obj) {
        C04220Ms.A0B(objArr, 0);
        int i = 0;
        int length = objArr.length;
        if (obj == null) {
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static final Double A02(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return null;
        }
        double d = dArr[0];
        C1367083z A01 = AnonymousClass8bH.A01(1, length - 1);
        while (A01.hasNext()) {
            d = Math.max(d, dArr[A01.A00()]);
        }
        return Double.valueOf(d);
    }

    public static final Integer A03(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return null;
        }
        int i = iArr[0];
        C1367083z A01 = AnonymousClass8bH.A01(1, length - 1);
        while (A01.hasNext()) {
            int i2 = iArr[A01.A00()];
            if (i < i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Integer A04(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return null;
        }
        int i = iArr[0];
        C1367083z A01 = AnonymousClass8bH.A01(1, length - 1);
        while (A01.hasNext()) {
            int i2 = iArr[A01.A00()];
            if (i > i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Object A05(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException(C28174Ezk.A00(50));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r1 > r7) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        r4.append(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.String A06(java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, X.AnonymousClass0YY r11, java.lang.Object[] r12, int r13) {
        /*
            r6 = 0
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0007
            java.lang.String r8 = ", "
        L_0x0007:
            r0 = r13 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000e
            r9 = r1
        L_0x000e:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0013
            r10 = r1
        L_0x0013:
            r0 = r13 & 8
            r7 = 0
            if (r0 == 0) goto L_0x0019
            r7 = -1
        L_0x0019:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x001f
            java.lang.String r6 = "..."
        L_0x001f:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0024
            r11 = 0
        L_0x0024:
            r5 = 1
            X.C04220Ms.A0B(r8, r5)
            X.AnonymousClass0wJ.A1Q(r9, r10)
            r0 = 5
            X.C04220Ms.A0B(r6, r0)
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            r4.append(r9)
            int r3 = r12.length
            r2 = 0
            r1 = 0
        L_0x0039:
            if (r2 >= r3) goto L_0x004e
            r0 = r12[r2]
            int r1 = r1 + 1
            if (r1 <= r5) goto L_0x0044
            r4.append(r8)
        L_0x0044:
            if (r7 < 0) goto L_0x0048
            if (r1 > r7) goto L_0x0052
        L_0x0048:
            X.AnonymousClass726.A0B(r4, r0, r11)
            int r2 = r2 + 1
            goto L_0x0039
        L_0x004e:
            if (r7 < 0) goto L_0x0055
            if (r1 <= r7) goto L_0x0055
        L_0x0052:
            r4.append(r6)
        L_0x0055:
            r4.append(r10)
            java.lang.String r0 = X.C18190wL.A0n(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AP.A06(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, X.0YY, java.lang.Object[], int):java.lang.String");
    }

    public static final List A07(Comparator comparator, Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        if (length != 0) {
            objArr = C86124wJ.A1b(objArr, length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List asList = Arrays.asList(objArr);
        C04220Ms.A06(asList);
        return asList;
    }

    public static final List A08(float[] fArr) {
        int i = 0;
        C04220Ms.A0B(fArr, 0);
        int length = fArr.length;
        if (length == 0) {
            return AnonymousClass0ZV.A00;
        }
        if (length == 1) {
            return C18180wK.A0n(Float.valueOf(fArr[0]));
        }
        ArrayList A0k = C18240wQ.A0k(length);
        do {
            A0k.add(Float.valueOf(fArr[i]));
            i++;
        } while (i < length);
        return A0k;
    }

    public static final List A09(int[] iArr) {
        int i = 0;
        int length = iArr.length;
        if (length == 0) {
            return AnonymousClass0ZV.A00;
        }
        if (length == 1) {
            return C18180wK.A0n(Integer.valueOf(iArr[0]));
        }
        ArrayList A0k = C18240wQ.A0k(length);
        do {
            C18200wM.A1U(A0k, iArr[i]);
            i++;
        } while (i < length);
        return A0k;
    }

    public static final List A0A(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object obj : objArr) {
            if (obj != null) {
                A0v.add(obj);
            }
        }
        return A0v;
    }

    public static final List A0B(Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        if (length == 0) {
            return AnonymousClass0ZV.A00;
        }
        if (length != 1) {
            return C18200wM.A0s(new AnonymousClass83W(objArr, false));
        }
        return C18180wK.A0n(objArr[0]);
    }

    public static final Set A0C(Object[] objArr) {
        int i = 0;
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        if (length == 0) {
            return AnonymousClass84Y.A00;
        }
        if (length == 1) {
            return C18250wR.A0c(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass4WK.A0N(length));
        do {
            linkedHashSet.add(objArr[i]);
            i++;
        } while (i < length);
        return linkedHashSet;
    }

    public static final void A0D(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        if (length != 1) {
            ArrayList A0k = C18240wQ.A0k(length);
            do {
                A0k.add(Byte.valueOf(bArr[i]));
                i++;
            } while (i < length);
            return;
        }
        C18180wK.A0n(Byte.valueOf(bArr[0]));
    }

    public static final boolean A0E(Object obj, Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        return C86114wI.A1S(A01(objArr, obj));
    }

    public static final byte[] A0F(AnonymousClass8bH r3, byte[] bArr) {
        if (r3.isEmpty()) {
            return new byte[0];
        }
        int i = r3.A00;
        int i2 = r3.A01 + 1;
        C102556Vq.A00(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C04220Ms.A06(copyOfRange);
        return copyOfRange;
    }
}
