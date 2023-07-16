package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.5KJ  reason: invalid class name */
public final class AnonymousClass5KJ extends AnonymousClass0Sf implements C143428gh {
    public final long A00;
    public final IMT A01;
    public final List A02;
    public final boolean A03;
    public final C34382ILw A04;

    public final void AIi(Canvas canvas, C36993JiQ jiQ) {
        C04220Ms.A0B(jiQ, 1);
        jiQ.A01(this.A04, C86154wM.A0y(canvas, this, jiQ, 26));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KJ) {
                AnonymousClass5KJ r8 = (AnonymousClass5KJ) obj;
                if (!C04220Ms.A0I(this.A04, r8.A04) || this.A00 != r8.A00 || !C04220Ms.A0I(this.A01, r8.A01) || this.A03 != r8.A03 || !C04220Ms.A0I(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A06 = (C86104wH.A06(C18210wN.A04(this.A04), this.A00) + AnonymousClass0wJ.A03(this.A01)) * 31;
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A02, (A06 + (z ? 1 : 0)) * 31);
    }

    public AnonymousClass5KJ(IMT imt, C34382ILw iLw, List list, long j, boolean z) {
        this.A04 = iLw;
        this.A00 = j;
        this.A01 = imt;
        this.A03 = z;
        this.A02 = list;
    }
}
