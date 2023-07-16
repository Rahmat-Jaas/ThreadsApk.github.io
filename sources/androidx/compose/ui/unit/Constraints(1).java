package androidx.compose.ui.unit;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C1203579v;
import X.C18190wL;
import X.C86134wK;

public final class Constraints {
    public static final C1203579v A01 = new C1203579v();
    public static final int[] A02 = {32767, 8191, 65535, 262143};
    public static final int[] A03 = {18, 20, 17, 15};
    public static final int[] A04 = {65535, 262143, 32767, 8191};
    public final long A00;

    public static int A00(long j) {
        int i = (int) (j & 3);
        return ((int) (j >> (A03[i] + 31))) & A02[i];
    }

    public static final int A02(long j) {
        int i = ((int) (j >> 33)) & A04[(int) (j & 3)];
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public static final int A03(long j) {
        int i = (int) (j & 3);
        return ((int) (j >> A03[i])) & A02[i];
    }

    public static final int A04(long j) {
        return ((int) (j >> 2)) & A04[(int) (j & 3)];
    }

    public static final long A05(int i, int i2, int i3, int i4) {
        if (i3 < 0 || i < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("minHeight(", ") and minWidth(", ") must be >= 0", i3, i));
        } else if (i2 < i) {
            throw C18190wL.A0a(C86134wK.A0l(i2, i, "maxWidth(", ") must be >= minWidth("));
        } else if (i4 >= i3) {
            return A01.A04(i, i2, i3, i4);
        } else {
            throw C18190wL.A0a(C86134wK.A0l(i4, i3, "maxHeight(", ") must be >= minHeight("));
        }
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof Constraints) || j != ((Constraints) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return A06(this.A00);
    }

    public /* synthetic */ Constraints(long j) {
        this.A00 = j;
    }

    public static final int A01(long j) {
        int A002 = A00(j);
        int i = A002 - 1;
        if (A002 == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static String A06(long j) {
        String valueOf;
        int A022 = A02(j);
        String str = "Infinity";
        if (A022 == Integer.MAX_VALUE) {
            valueOf = str;
        } else {
            valueOf = String.valueOf(A022);
        }
        int A012 = A01(j);
        if (A012 != Integer.MAX_VALUE) {
            str = String.valueOf(A012);
        }
        StringBuilder A0s = C18190wL.A0s("Constraints(minWidth = ");
        A0s.append(A04(j));
        A0s.append(", maxWidth = ");
        A0s.append(valueOf);
        A0s.append(", minHeight = ");
        A0s.append(A03(j));
        A0s.append(", maxHeight = ");
        A0s.append(str);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
