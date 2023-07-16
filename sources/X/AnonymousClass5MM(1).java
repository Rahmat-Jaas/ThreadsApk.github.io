package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;

/* renamed from: X.5MM  reason: invalid class name */
public final class AnonymousClass5MM extends AnonymousClass0Sf implements C41882MfV {
    public final AvatarCoinFlipBackgroundOptionResponse A00;
    public final AnonymousClass0YY A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MM) {
                AnonymousClass5MM r5 = (AnonymousClass5MM) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A02 != r5.A02 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A02;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A01, (A04 + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AvatarCustomizationItemViewModel(backgroundOption=");
        A0s.append(this.A00);
        A0s.append(", isSelected=");
        A0s.append(this.A02);
        A0s.append(", onBackgroundSelected=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public AnonymousClass5MM(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, AnonymousClass0YY r2, boolean z) {
        this.A00 = avatarCoinFlipBackgroundOptionResponse;
        this.A02 = z;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
