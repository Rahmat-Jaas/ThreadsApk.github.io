package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5My  reason: invalid class name and case insensitive filesystem */
public final class C90665My extends AnonymousClass0Sf implements C28032ExM {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90665My) {
                C90665My r5 = (C90665My) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A03 != r5.A03 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = (C18210wN.A04(this.A01) + AnonymousClass0wJ.A03(this.A00)) * 31;
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return ((A04 + (z ? 1 : 0)) * 31) + C18200wM.A07(this.A02);
    }

    public C90665My(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, boolean z) {
        this.A01 = imageUrl;
        this.A00 = imageUrl2;
        this.A03 = z;
        this.A02 = num;
    }
}
