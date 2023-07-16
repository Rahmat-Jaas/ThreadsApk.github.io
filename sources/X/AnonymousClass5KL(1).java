package X;

import android.graphics.Path;

/* renamed from: X.5KL  reason: invalid class name */
public final class AnonymousClass5KL extends AnonymousClass0Sf implements C39447Ktk {
    public final IMT A00;
    public final C34382ILw A01;

    public AnonymousClass5KL(IMT imt, C34382ILw iLw) {
        C04220Ms.A0B(iLw, 2);
        this.A00 = imt;
        this.A01 = iLw;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5KL) {
                AnonymousClass5KL r5 = (AnonymousClass5KL) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public final void A90(Path path, C36993JiQ jiQ) {
        AnonymousClass0wJ.A1N(path, jiQ);
        IMT imt = this.A00;
        C34382ILw iLw = this.A01;
        Path A002 = jiQ.A00(imt, iLw);
        jiQ.A01(iLw, C86164wN.A0q(A002, 42));
        path.addPath(A002);
    }
}
