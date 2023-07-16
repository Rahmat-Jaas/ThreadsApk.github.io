package X;

/* renamed from: X.6uU  reason: invalid class name and case insensitive filesystem */
public final class C115086uU {
    public int A00 = -1;
    public int A01 = -1;
    public C112606pt A02;
    public String A03;

    public final void A01(int i, int i2, String str) {
        int i3;
        C04220Ms.A0B(str, 2);
        if (i > i2) {
            throw C18190wL.A0a(AnonymousClass00U.A01(i, i2, "start index must be less than or equal to end index: ", " > "));
        } else if (i >= 0) {
            C112606pt r7 = this.A02;
            if (r7 == null) {
                int length = str.length();
                int max = Math.max(255, length + 128);
                char[] cArr = new char[max];
                int min = Math.min(i, 64);
                String str2 = this.A03;
                int min2 = Math.min(str2.length() - i2, 64);
                int i4 = i - min;
                str2.getChars(i4, i, cArr, 0);
                String str3 = this.A03;
                int i5 = max - min2;
                int i6 = min2 + i2;
                C04220Ms.A0B(str3, 0);
                str3.getChars(i2, i6, cArr, i5);
                str.getChars(0, length, cArr, min);
                this.A02 = new C112606pt(cArr, min + length, i5);
                this.A01 = i4;
                this.A00 = i6;
                return;
            }
            int i7 = this.A01;
            int i8 = i - i7;
            int i9 = i2 - i7;
            if (i8 >= 0) {
                int i10 = r7.A00;
                int i11 = r7.A01;
                int i12 = r7.A02;
                int i13 = i11 - i12;
                if (i9 <= i10 - i13) {
                    int length2 = str.length();
                    int i14 = length2 - (i9 - i8);
                    if (i14 > i13) {
                        int i15 = i14 - i13;
                        int i16 = i10;
                        do {
                            i16 <<= 1;
                        } while (i16 - i10 < i15);
                        char[] cArr2 = new char[i16];
                        System.arraycopy(r7.A03, 0, cArr2, 0, i12);
                        int i17 = r7.A00;
                        int i18 = r7.A01;
                        int i19 = i17 - i18;
                        i11 = i16 - i19;
                        System.arraycopy(r7.A03, i18, cArr2, i11, (i19 + i18) - i18);
                        r7.A03 = cArr2;
                        r7.A00 = i16;
                        r7.A01 = i11;
                    }
                    int i20 = r7.A02;
                    if (i8 < i20 && i9 <= i20) {
                        int i21 = i20 - i9;
                        char[] cArr3 = r7.A03;
                        System.arraycopy(cArr3, i9, cArr3, i11 - i21, i21);
                        r7.A02 = i8;
                        i3 = r7.A01 - i21;
                    } else if (i8 >= i20 || i9 < i20) {
                        int i22 = i11 - i20;
                        i3 = i9 + i22;
                        int i23 = (i8 + i22) - i11;
                        char[] cArr4 = r7.A03;
                        System.arraycopy(cArr4, i11, cArr4, i20, i23);
                        int i24 = r7.A02 + i23;
                        r7.A02 = i24;
                        i8 = i24;
                    } else {
                        r7.A01 = i9 + (i11 - i20);
                        r7.A02 = i8;
                        str.getChars(0, length2, r7.A03, i8);
                        r7.A02 += length2;
                        return;
                    }
                    r7.A01 = i3;
                    str.getChars(0, length2, r7.A03, i8);
                    r7.A02 += length2;
                    return;
                }
            }
            this.A03 = toString();
            this.A02 = null;
            this.A01 = -1;
            this.A00 = -1;
            A01(i, i2, str);
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0J("start must be non-negative, but was ", i));
        }
    }

    public final int A00() {
        C112606pt r4 = this.A02;
        int length = this.A03.length();
        if (r4 != null) {
            return (length - (this.A00 - this.A01)) + (r4.A00 - (r4.A01 - r4.A02));
        }
        return length;
    }

    public final String toString() {
        C112606pt r4 = this.A02;
        if (r4 == null) {
            return this.A03;
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A03, 0, this.A01);
        A0r.append(r4.A03, 0, r4.A02);
        char[] cArr = r4.A03;
        int i = r4.A01;
        A0r.append(cArr, i, r4.A00 - i);
        String str = this.A03;
        A0r.append(str, this.A00, str.length());
        return C18190wL.A0n(A0r);
    }

    public C115086uU(String str) {
        this.A03 = str;
    }
}
