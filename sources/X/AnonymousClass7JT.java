package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.7JT  reason: invalid class name */
public final class AnonymousClass7JT {
    public static long A00(int i) {
        return A02(0, Integer.MAX_VALUE, 0, i);
    }

    public static long A01(int i) {
        return A02(0, i, 0, Integer.MAX_VALUE);
    }

    public static final long A02(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw C18190wL.A0a(C86134wK.A0l(i2, i, "maxWidth(", ") must be >= than minWidth("));
        } else if (i4 < i3) {
            throw C18190wL.A0a(C86134wK.A0l(i4, i3, "maxHeight(", ") must be >= than minHeight("));
        } else if (i >= 0 && i3 >= 0) {
            return Constraints.A01.A04(i, i2, i3, i4);
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("minWidth(", ") and minHeight(", ") must be >= 0", i, i3));
        }
    }

    public static final long A03(long j, int i, int i2) {
        int A04 = Constraints.A04(j) + i;
        if (A04 < 0) {
            A04 = 0;
        }
        int A02 = Constraints.A02(j);
        if (A02 != Integer.MAX_VALUE && (A02 = A02 + i) < 0) {
            A02 = 0;
        }
        int A03 = Constraints.A03(j) + i2;
        if (A03 < 0) {
            A03 = 0;
        }
        int A01 = Constraints.A01(j);
        if (A01 != Integer.MAX_VALUE && (A01 = A01 + i2) < 0) {
            A01 = 0;
        }
        return A02(A04, A02, A03, A01);
    }

    public static final long A04(long j, long j2) {
        return AnonymousClass7FV.A00(AnonymousClass8bI.A04(j, C86104wH.A07(j2)), AnonymousClass8bI.A03(j, C86104wH.A08(j2)));
    }

    public static final long A05(long j, long j2) {
        int A04 = Constraints.A04(j2);
        int A042 = Constraints.A04(j);
        int A02 = Constraints.A02(j);
        int A022 = AnonymousClass8bI.A02(A04, A042, A02);
        int A023 = AnonymousClass8bI.A02(Constraints.A02(j2), A042, A02);
        int A03 = Constraints.A03(j2);
        int A032 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        return A02(A022, A023, AnonymousClass8bI.A02(A03, A032, A01), AnonymousClass8bI.A02(Constraints.A01(j2), A032, A01));
    }

    public static final boolean A06(long j, long j2) {
        int A04 = Constraints.A04(j);
        int A02 = Constraints.A02(j);
        int A07 = C86104wH.A07(j2);
        if (A04 > A07 || A07 > A02) {
            return false;
        }
        int A03 = Constraints.A03(j);
        int A01 = Constraints.A01(j);
        int A08 = C86104wH.A08(j2);
        if (A03 > A08 || A08 > A01) {
            return false;
        }
        return true;
    }
}
