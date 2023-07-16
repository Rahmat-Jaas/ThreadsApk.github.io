package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0jJ  reason: invalid class name and case insensitive filesystem */
public final class C11000jJ {
    public final C03710Kk A00;
    public final AnonymousClass0X4 A01;
    public final Map A02 = new HashMap();
    public volatile long A03;

    public final synchronized List A00() {
        ArrayList arrayList;
        synchronized (this) {
            Map map = this.A02;
            arrayList = new ArrayList(map.size());
            for (AnonymousClass0X2 r7 : map.values()) {
                long[] jArr = r7.A02;
                long[] jArr2 = jArr;
                String[] strArr = new String[jArr.length];
                String[] strArr2 = r7.A04;
                String[] strArr3 = strArr2;
                String[] strArr4 = new String[strArr2.length];
                long[] jArr3 = r7.A03;
                String[] strArr5 = new String[jArr3.length];
                double[] dArr = r7.A01;
                String[] strArr6 = new String[dArr.length];
                String[] strArr7 = r7.A05;
                String[] strArr8 = new String[strArr7.length];
                AnonymousClass0X4 r14 = this.A01;
                int i = 0;
                int i2 = 0;
                for (C11680kb r0 : r14.A03) {
                    if (r0 instanceof C11730ki) {
                        int i3 = i + 1;
                        strArr[i] = r0.getName();
                        i = i3;
                    } else if (r0 instanceof C03260Fd) {
                        strArr4[i2] = r0.getName();
                        i2++;
                    } else {
                        throw new UnsupportedOperationException(AnonymousClass00U.A0L("Unsupported Dimension: ", r0.getClass().getName()));
                    }
                }
                int i4 = 0;
                int i5 = 0;
                for (AnonymousClass0X8 r1 : r14.A02) {
                    if (r1.A00().intValue() != 0) {
                        strArr6[i5] = AnonymousClass00U.A0L(r1.A00.getName(), ".sum");
                        i5++;
                    } else {
                        strArr5[i4] = AnonymousClass00U.A0L(r1.A00.getName(), ".sum");
                        i4++;
                    }
                }
                arrayList.add(new AnonymousClass0X6(dArr, jArr2, jArr3, strArr, strArr4, strArr3, strArr5, strArr6, strArr8, strArr7, r7.A00));
            }
        }
        return arrayList;
    }

    public C11000jJ(C03710Kk r2, AnonymousClass0X4 r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
