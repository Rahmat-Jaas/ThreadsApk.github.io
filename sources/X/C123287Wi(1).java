package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.7Wi  reason: invalid class name and case insensitive filesystem */
public final class C123287Wi implements Alignment {
    public final float A00;
    public final float A01;

    public final long A88(AnonymousClass69J r7, long j, long j2) {
        float f;
        C04220Ms.A0B(r7, 2);
        float f2 = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float f3 = ((float) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) / 2.0f;
        if (r7 == AnonymousClass69J.Ltr) {
            f = this.A00;
        } else {
            f = ((float) -1) * this.A00;
        }
        float f4 = (float) 1;
        return AnonymousClass7Hh.A00(AnonymousClass8bA.A02(f2 * (f + f4)), AnonymousClass8bA.A02(f3 * (f4 + this.A01)));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123287Wi) {
                C123287Wi r5 = (C123287Wi) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0O("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A00), this.A01);
    }

    public C123287Wi(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
