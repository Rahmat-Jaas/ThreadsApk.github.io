package X;

import androidx.compose.ui.unit.Constraints;
import java.util.NoSuchElementException;

/* renamed from: X.8bI  reason: invalid class name */
public final class AnonymousClass8bI extends AnonymousClass6D0 {
    public static final Comparable A08(Comparable comparable, AnonymousClass86X r4) {
        C04220Ms.A0B(r4, 1);
        if (!r4.isEmpty()) {
            Float valueOf = Float.valueOf(r4.A01);
            if (C18240wQ.A00(comparable) > C18240wQ.A00(valueOf) || C18240wQ.A00(valueOf) <= C18240wQ.A00(comparable)) {
                valueOf = Float.valueOf(r4.A00);
                if (C18240wQ.A00(valueOf) > C18240wQ.A00(comparable) || C18240wQ.A00(comparable) <= C18240wQ.A00(valueOf)) {
                    return comparable;
                }
            }
            return valueOf;
        }
        StringBuilder A0s = C18190wL.A0s("Cannot coerce value to an empty range: ");
        A0s.append(r4);
        throw C18190wL.A0a(C86114wI.A0q(A0s, '.'));
    }

    public static final C134937yc A09(int i, int i2) {
        return new C134937yc(i, i2, -1);
    }

    public static final double A00(double d, double d2, double d3) {
        if (d2 > d3) {
            StringBuilder A0s = C18190wL.A0s("Cannot coerce value to an empty range: maximum ");
            A0s.append(d3);
            A0s.append(" is less than minimum ");
            A0s.append(d2);
            throw C18190wL.A0a(C86114wI.A0q(A0s, '.'));
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    public static final float A01(float f, float f2, float f3) {
        if (f2 > f3) {
            throw C18190wL.A0a(AnonymousClass00U.A0O("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', f3, f2));
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    public static final int A02(int i, int i2, int i3) {
        if (i2 > i3) {
            throw C18190wL.A0a(AnonymousClass00U.A0P("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', i3, i2));
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final int A06(C146038lW r2, int i) {
        Comparable BDJ;
        if (r2 instanceof AnonymousClass86X) {
            BDJ = A08(Integer.valueOf(i), (AnonymousClass86X) r2);
        } else if (!r2.isEmpty()) {
            BDJ = r2.BDJ();
            if (i >= AnonymousClass0wJ.A04(BDJ)) {
                BDJ = r2.Afl();
                if (i <= AnonymousClass0wJ.A04(BDJ)) {
                    return i;
                }
            }
        } else {
            StringBuilder A0s = C18190wL.A0s("Cannot coerce value to an empty range: ");
            A0s.append(r2);
            throw C18190wL.A0a(C86114wI.A0q(A0s, '.'));
        }
        return AnonymousClass0wJ.A04(BDJ);
    }

    public static final long A07(long j, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder A0s = C18190wL.A0s("Cannot coerce value to an empty range: maximum ");
            A0s.append(j3);
            A0s.append(" is less than minimum ");
            A0s.append(j2);
            throw C18190wL.A0a(C86114wI.A0q(A0s, '.'));
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static final C134937yc A0A(C134937yc r4) {
        return new C134937yc(r4.A01, r4.A00, -r4.A02);
    }

    public static final C134937yc A0B(C134937yc r3, int i) {
        int i2 = r3.A00;
        int i3 = r3.A01;
        if (r3.A02 <= 0) {
            i = -i;
        }
        return new C134937yc(i2, i3, i);
    }

    public static final AnonymousClass8bH A0C(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return AnonymousClass8bH.A00;
        }
        return AnonymousClass8bH.A02(i, i2 - 1);
    }

    public static int A03(long j, int i) {
        return A02(i, Constraints.A03(j), Constraints.A01(j));
    }

    public static int A04(long j, int i) {
        return A02(i, Constraints.A04(j), Constraints.A02(j));
    }

    public static final int A05(AnonymousClass7AM r3, AnonymousClass8bH r4) {
        try {
            if (!r4.isEmpty()) {
                int i = r4.A01;
                int i2 = r4.A00;
                if (i < Integer.MAX_VALUE) {
                    return r3.A04(i2, i + 1);
                }
                if (i2 > Integer.MIN_VALUE) {
                    return r3.A04(i2 - 1, i) + 1;
                }
                return r3.A01();
            }
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Cannot get random in empty range: ", r4));
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
