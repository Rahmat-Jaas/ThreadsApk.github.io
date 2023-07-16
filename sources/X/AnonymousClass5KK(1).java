package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.5KK  reason: invalid class name */
public final class AnonymousClass5KK extends AnonymousClass0Sf implements C143428gh {
    public final float A00;
    public final int A01;
    public final long A02;
    public final IMT A03;
    public final List A04;
    public final C34382ILw A05;

    public final void AIi(Canvas canvas, C36993JiQ jiQ) {
        C04220Ms.A0B(jiQ, 1);
        jiQ.A01(this.A05, C86154wM.A0y(canvas, this, jiQ, 27));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KK) {
                AnonymousClass5KK r8 = (AnonymousClass5KK) obj;
                if (!C04220Ms.A0I(this.A05, r8.A05) || this.A02 != r8.A02 || !C04220Ms.A0I(this.A03, r8.A03) || Float.compare(this.A00, r8.A00) != 0 || this.A01 != r8.A01 || !C04220Ms.A0I(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A04, (C86104wH.A05((C86104wH.A06(C18210wN.A04(this.A05), this.A02) + AnonymousClass0wJ.A03(this.A03)) * 31, this.A00) + this.A01) * 31);
    }

    public AnonymousClass5KK(IMT imt, C34382ILw iLw, List list, float f, int i, long j) {
        this.A05 = iLw;
        this.A02 = j;
        this.A03 = imt;
        this.A00 = f;
        this.A01 = i;
        this.A04 = list;
    }
}
