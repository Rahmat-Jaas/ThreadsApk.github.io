package X;

/* renamed from: X.6tt  reason: invalid class name and case insensitive filesystem */
public abstract class C114786tt {
    public final int A00;
    public final int A01;

    public final byte[] A00() {
        if (this instanceof AnonymousClass5sX) {
            AnonymousClass5sX r8 = (AnonymousClass5sX) this;
            int i = r8.A01;
            int i2 = r8.A00;
            int i3 = r8.A01;
            if (i == i3 && i2 == r8.A00) {
                return r8.A02;
            }
            int i4 = i * i2;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            if (i == i3) {
                System.arraycopy(r8.A02, 0, bArr, 0, i4);
                return bArr;
            }
            for (int i6 = 0; i6 < i2; i6++) {
                System.arraycopy(r8.A02, i5, bArr, i6 * i, i);
                i5 += i3;
            }
            return bArr;
        } else if (this instanceof AnonymousClass5sW) {
            AnonymousClass5sW r82 = (AnonymousClass5sW) this;
            int i7 = r82.A01;
            int i8 = r82.A00;
            int i9 = r82.A01;
            if (i7 == i9 && i8 == r82.A00) {
                return r82.A02;
            }
            int i10 = i7 * i8;
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            if (i7 == i9) {
                System.arraycopy(r82.A02, 0, bArr2, 0, i10);
                return bArr2;
            }
            for (int i12 = 0; i12 < i8; i12++) {
                System.arraycopy(r82.A02, i11, bArr2, i12 * i7, i7);
                i11 += i9;
            }
            return bArr2;
        } else {
            AnonymousClass5sV r1 = (AnonymousClass5sV) this;
            byte[] A002 = r1.A00.A00();
            int i13 = r1.A01 * r1.A00;
            byte[] bArr3 = new byte[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                bArr3[i14] = (byte) (255 - (A002[i14] & 255));
            }
            return bArr3;
        }
    }

    public final byte[] A01(byte[] bArr, int i) {
        int i2;
        int i3;
        byte[] bArr2;
        if (this instanceof AnonymousClass5sX) {
            AnonymousClass5sX r1 = (AnonymousClass5sX) this;
            if (i < 0 || i >= r1.A00) {
                throw C18190wL.A0a(AnonymousClass00U.A0J("Requested row is outside the image: ", i));
            }
            i2 = r1.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = i * r1.A01;
            bArr2 = r1.A02;
        } else if (this instanceof AnonymousClass5sW) {
            AnonymousClass5sW r12 = (AnonymousClass5sW) this;
            if (i < 0 || i >= r12.A00) {
                throw C18190wL.A0a(AnonymousClass00U.A0J("Requested row is outside the image: ", i));
            }
            i2 = r12.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            i3 = i * r12.A01;
            bArr2 = r12.A02;
        } else {
            AnonymousClass5sV r13 = (AnonymousClass5sV) this;
            byte[] A012 = r13.A00.A01(bArr, i);
            int i4 = r13.A01;
            for (int i5 = 0; i5 < i4; i5++) {
                A012[i5] = (byte) (255 - (A012[i5] & 255));
            }
            return A012;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i2);
        return bArr;
    }

    public final String toString() {
        char c;
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder A0s = C86114wI.A0s((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(bArr, i3);
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4] & 255;
                if (b < 64) {
                    c = '#';
                } else if (b < 128) {
                    c = '+';
                } else {
                    c = ' ';
                    if (b < 192) {
                        c = '.';
                    }
                }
                A0s.append(c);
            }
            A0s.append(10);
        }
        return A0s.toString();
    }

    public C114786tt(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
