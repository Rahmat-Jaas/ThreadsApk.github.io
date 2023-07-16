package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5HS  reason: invalid class name */
public final class AnonymousClass5HS extends AnonymousClass0Sf {
    public final long A00;
    public final AnonymousClass3I0 A01;
    public final C57943Dd A02;
    public final ImageUrl A03;
    public final boolean A04;

    public AnonymousClass5HS(AnonymousClass3I0 r2, C57943Dd r3, ImageUrl imageUrl, long j, boolean z) {
        C04220Ms.A0B(r3, 5);
        this.A00 = j;
        this.A03 = imageUrl;
        this.A01 = r2;
        this.A04 = z;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HS) {
                AnonymousClass5HS r8 = (AnonymousClass5HS) obj;
                if (this.A00 != r8.A00 || !C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A01, r8.A01) || this.A04 != r8.A04 || !C04220Ms.A0I(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A022 = ((((C18190wL.A02(this.A00) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A02, (A022 + (z ? 1 : 0)) * 31);
    }
}
