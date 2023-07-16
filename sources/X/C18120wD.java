package X;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: X.0wD  reason: invalid class name and case insensitive filesystem */
public final class C18120wD {
    public static final int[] A02 = new int[3];
    public final int A00;
    public final IntBuffer A01;

    public final int A01(int i, int i2) {
        int i3 = 0;
        do {
            int A022 = ((this.A00 * i3) + A02(i, i2, i3)) * 3;
            IntBuffer intBuffer = this.A01;
            intBuffer.position(A022);
            int i4 = intBuffer.get();
            int i5 = intBuffer.get();
            int i6 = intBuffer.get();
            if (i == i4 && i2 == i5) {
                intBuffer.position(A022);
                intBuffer.put(A02);
                return i6;
            }
            i3++;
        } while (i3 < 2);
        return 0;
    }

    public final void A03(int i, int i2, int i3) {
        int i4 = i3;
        if (i3 != 0) {
            A00(i, i2, i4, 0, 0);
            return;
        }
        throw new IllegalArgumentException("Value 0 is reserved and can't be put into the map");
    }

    private int A00(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        IntBuffer intBuffer;
        int i8;
        int i9 = i;
        if (i5 >= 5) {
            return i9;
        }
        int i10 = 0;
        do {
            i6 = i2;
            int A022 = A02(i9, i6, i10);
            i7 = this.A00;
            intBuffer = this.A01;
            intBuffer.position(((i10 * i7) + A022) * 3);
            int i11 = intBuffer.get();
            int i12 = intBuffer.get();
            i8 = i3;
            if (i11 == i9 && i12 == i6) {
                intBuffer.put(i8);
                return 0;
            }
            i10++;
        } while (i10 < 2);
        int A023 = ((i4 * i7) + A02(i9, i6, i4)) * 3;
        intBuffer.position(A023);
        int i13 = intBuffer.get();
        int i14 = intBuffer.get();
        int i15 = intBuffer.get();
        intBuffer.position(A023);
        intBuffer.put(i9);
        intBuffer.put(i6);
        intBuffer.put(i8);
        if (i13 == 0 && i14 == 0) {
            return 0;
        }
        return A00(i13, i14, i15, (i4 + 1) % 2, i5 + 1);
    }

    public final int A02(int i, int i2, int i3) {
        int abs;
        int i4;
        if (i3 == 0) {
            abs = Math.abs(i + (i2 * 31));
            i4 = this.A00;
        } else if (i3 == 1) {
            i4 = this.A00;
            abs = Math.abs((i + (i2 * 31)) / i4);
        } else {
            throw new IllegalArgumentException("Supporting only 2 hashes at the moment");
        }
        return abs % i4;
    }

    public C18120wD(ByteBuffer byteBuffer) {
        int limit = ((byteBuffer.limit() >> 2) / 3) >> 1;
        this.A01 = byteBuffer.asIntBuffer();
        this.A00 = limit;
    }
}
