package X;

/* renamed from: X.5N3  reason: invalid class name */
public final class AnonymousClass5N3 extends AnonymousClass0Sf implements C81674oB {
    public final float A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5N3) {
                AnonymousClass5N3 r5 = (AnonymousClass5N3) obj;
                if (!(this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return C86144wL.A03((z ? 1 : 0) * true, this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RtcCallBottomSheetViewModel(show=");
        A0s.append(this.A01);
        A0s.append(", translationY=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass5N3(float f, boolean z) {
        this.A01 = z;
        this.A00 = f;
    }
}
