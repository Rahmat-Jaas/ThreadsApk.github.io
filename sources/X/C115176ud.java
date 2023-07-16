package X;

/* renamed from: X.6ud  reason: invalid class name and case insensitive filesystem */
public final class C115176ud {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115176ud) {
                C115176ud r5 = (C115176ud) obj;
                if (!(this.A01 == r5.A01 && C04220Ms.A0I(this.A03, r5.A03) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A07(this.A03, this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BSCHomeTab(tabTitleRes=");
        A0s.append(this.A01);
        A0s.append(", fragmentId=");
        A0s.append(this.A03);
        A0s.append(", tabHintRes=");
        A0s.append(this.A00);
        A0s.append(", viewModelId=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115176ud(int i, int i2, String str, int i3) {
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = i3;
    }
}
