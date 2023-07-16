package X;

/* renamed from: X.6Ls  reason: invalid class name and case insensitive filesystem */
public final class C100036Ls {
    public static final int A00(String str, String str2, int i) {
        String str3 = str;
        int A01 = AnonymousClass0hA.A01(str3);
        String str4 = str2;
        int A012 = AnonymousClass0hA.A01(str4);
        if (A01 == 0) {
            return A012;
        }
        if (A012 == 0) {
            return A01;
        }
        int i2 = A01 + 1;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        if (A01 >= 0) {
            int i3 = 0;
            while (true) {
                iArr[i3] = i3;
                if (i3 == A01) {
                    break;
                }
                i3++;
            }
        }
        if (1 <= A012) {
            int i4 = 1;
            while (true) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
                char codePointAt = (char) str4.codePointAt(i4 - 1);
                iArr[0] = i4;
                int i5 = i;
                int i6 = i + 1;
                int i7 = i6;
                if (1 <= A01) {
                    int i8 = 1;
                    while (true) {
                        int i9 = i8 - 1;
                        int i10 = 1;
                        if (((char) str3.codePointAt(i9)) == codePointAt) {
                            i10 = 0;
                        }
                        int min = Math.min(Math.min(iArr[i9] + 1, iArr3[i8] + 1), iArr3[i9] + i10);
                        iArr[i8] = min;
                        if (i7 > min) {
                            i7 = iArr[i8];
                        }
                        if (i8 == A01) {
                            break;
                        }
                        i8++;
                    }
                }
                if (i4 == A012) {
                    if (iArr[A01] <= i5) {
                        i6 = iArr[A01];
                    }
                    i7 = i6;
                }
                if (i7 <= i5) {
                    if (i4 == A012) {
                        break;
                    }
                    i4++;
                } else {
                    return i7;
                }
            }
        }
        return iArr[A01];
    }
}
