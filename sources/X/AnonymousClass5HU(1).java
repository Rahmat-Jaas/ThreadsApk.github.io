package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.5HU  reason: invalid class name */
public final class AnonymousClass5HU extends AnonymousClass0Sf {
    public boolean A00 = true;
    public int A01;
    public final int A02;
    public final Drawable A03;
    public final float A04;

    public AnonymousClass5HU(Drawable drawable, float f, int i, int i2) {
        this.A03 = drawable;
        this.A01 = i;
        this.A04 = f;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HU) {
                AnonymousClass5HU r5 = (AnonymousClass5HU) obj;
                if (!(C04220Ms.A0I(this.A03, r5.A03) && this.A01 == r5.A01 && this.A00 == r5.A00 && Float.compare(this.A04, r5.A04) == 0 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A042 = (C18210wN.A04(this.A03) + this.A01) * 31;
        boolean z = this.A00;
        if (z) {
            z = true;
        }
        return C86104wH.A05((A042 + (z ? 1 : 0)) * 31, this.A04) + this.A02;
    }
}
