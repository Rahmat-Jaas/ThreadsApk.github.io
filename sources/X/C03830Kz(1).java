package X;

import java.util.Arrays;

/* renamed from: X.0Kz  reason: invalid class name and case insensitive filesystem */
public class C03830Kz implements AnonymousClass0SC {
    public static final int[] A03 = new int[0];
    public static final Object[] A04 = new Object[0];
    public int A00 = 0;
    public int[] A01 = A03;
    public Object[] A02 = A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C03830Kz r5 = (C03830Kz) obj;
            if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public static void A00(C03830Kz r8, Object obj, int i) {
        int i2;
        int binarySearch = Arrays.binarySearch(r8.A01, 0, r8.A00, i);
        if (binarySearch >= 0) {
            r8.A02[binarySearch] = obj;
            return;
        }
        int i3 = binarySearch ^ -1;
        int[] iArr = r8.A01;
        int i4 = r8.A00;
        int i5 = i4 + 1;
        int length = iArr.length;
        if (i5 <= length) {
            i2 = i3 + 1;
            System.arraycopy(iArr, i3, iArr, i2, i4 - i3);
            iArr[i3] = i;
        } else {
            int i6 = i4 << 1;
            if (i4 <= 2) {
                i6 = 4;
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            iArr2[i3] = i;
            i2 = i3 + 1;
            System.arraycopy(iArr, i3, iArr2, i2, length - i3);
            iArr = iArr2;
        }
        r8.A01 = iArr;
        Object[] objArr = r8.A02;
        int i7 = r8.A00;
        int i8 = i7 + 1;
        int length2 = objArr.length;
        if (i8 <= length2) {
            System.arraycopy(objArr, i3, objArr, i2, i7 - i3);
            objArr[i3] = obj;
        } else {
            int i9 = i7 << 1;
            if (i7 <= 2) {
                i9 = 4;
            }
            Object[] objArr2 = new Object[i9];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            objArr2[i3] = obj;
            System.arraycopy(objArr, i3, objArr2, i2, length2 - i3);
            objArr = objArr2;
        }
        r8.A02 = objArr;
        r8.A00++;
    }

    public final Object AyJ(int i) {
        int binarySearch = Arrays.binarySearch(this.A01, 0, this.A00, i);
        if (binarySearch < 0) {
            return null;
        }
        return this.A02[binarySearch];
    }

    public final int hashCode() {
        return (((this.A00 * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02);
    }
}
