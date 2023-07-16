package X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.0Tn  reason: invalid class name and case insensitive filesystem */
public final class C05410Tn {
    public final short[] A00 = new short[2];
    public final short[] A01;
    public final short[][] A02;
    public final short[][] A03;
    public final /* synthetic */ AnonymousClass0Tb A04;
    public final /* synthetic */ AnonymousClass0Tb A05;

    public C05410Tn(AnonymousClass0Tb r4) {
        this.A05 = r4;
        Class<short> cls = short.class;
        this.A04 = r4;
        this.A02 = (short[][]) Array.newInstance(cls, new int[]{16, 8});
        this.A03 = (short[][]) Array.newInstance(cls, new int[]{16, 8});
        this.A01 = new short[256];
    }

    public final int A00(int i) {
        int length;
        int i2;
        int length2;
        int length3;
        AnonymousClass0Ta r3 = this.A05.A06;
        short[] sArr = this.A00;
        if (r3.A00(sArr, 0) == 0) {
            short[] sArr2 = this.A02[i];
            int i3 = 1;
            do {
                i3 = r3.A00(sArr2, i3) | (i3 << 1);
                length3 = sArr2.length;
            } while (i3 < length3);
            return (i3 - length3) + 2;
        }
        if (r3.A00(sArr, 1) == 0) {
            short[] sArr3 = this.A03[i];
            int i4 = 1;
            do {
                i4 = r3.A00(sArr3, i4) | (i4 << 1);
                length2 = sArr3.length;
            } while (i4 < length2);
            i2 = (i4 - length2) + 2;
        } else {
            short[] sArr4 = this.A01;
            int i5 = 1;
            do {
                i5 = r3.A00(sArr4, i5) | (i5 << 1);
                length = sArr4.length;
            } while (i5 < length);
            i2 = (i5 - length) + 2 + 8;
        }
        return i2 + 8;
    }

    public final void A01() {
        int length;
        Arrays.fill(this.A00, 1024);
        int i = 0;
        while (true) {
            short[][] sArr = this.A02;
            length = sArr.length;
            if (i >= length) {
                break;
            }
            Arrays.fill(sArr[i], 1024);
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Arrays.fill(this.A03[i2], 1024);
        }
        Arrays.fill(this.A01, 1024);
    }
}
