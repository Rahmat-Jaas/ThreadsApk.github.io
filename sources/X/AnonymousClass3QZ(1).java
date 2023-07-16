package X;

/* renamed from: X.3QZ  reason: invalid class name */
public final class AnonymousClass3QZ {
    public static final String[] A00 = {"cache", "files", "databases"};

    public static final String A00(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1b = C18200wM.A1b(str, i2);
            if (z) {
                if (!A1b) {
                    break;
                }
                length--;
            } else if (!A1b) {
                z = true;
            } else {
                i++;
            }
        }
        String A01 = C18250wR.A0h("/+$").A01(C18250wR.A0h("^/+").A01(C18220wO.A0s(str, length, i), ""), "");
        int length2 = A01.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length2) {
            int i4 = length2;
            if (!z2) {
                i4 = i3;
            }
            boolean A1b2 = C18200wM.A1b(A01, i4);
            if (z2) {
                if (!A1b2) {
                    break;
                }
                length2--;
            } else if (!A1b2) {
                z2 = true;
            } else {
                i3++;
            }
        }
        return C18220wO.A0s(A01, length2, i3);
    }
}
