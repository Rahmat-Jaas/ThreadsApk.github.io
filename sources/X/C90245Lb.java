package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Lb  reason: invalid class name and case insensitive filesystem */
public final class C90245Lb extends AnonymousClass0Sf implements C146178lm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Medium A03;
    public final ImageUrl A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90245Lb) {
                C90245Lb r5 = (C90245Lb) obj;
                if (!(this.A01 == r5.A01 && C04220Ms.A0I(this.A04, r5.A04) && this.A02 == r5.A02 && this.A00 == r5.A00 && C04220Ms.A0I(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int AnQ() {
        return this.A01;
    }

    public final Medium Av8() {
        return this.A03;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A02;
    }

    public final int hashCode() {
        int i = this.A01 * 31;
        return C18220wO.A06(this.A03, (((AnonymousClass0wJ.A05(this.A04, i) + this.A02) * 31) + this.A00) * 31);
    }

    public C90245Lb(Medium medium, ImageUrl imageUrl, int i, int i2, int i3) {
        this.A01 = i;
        this.A04 = imageUrl;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = medium;
    }
}
