package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2500000_I2;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.MidCardLayoutType;

/* renamed from: X.5Ha  reason: invalid class name */
public final class AnonymousClass5Ha extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final KtCSuperShape0S2500000_I2 A02;
    public final ClipsMidCardSubtype A03;
    public final ClipsMidCardType A04;
    public final MidCardLayoutType A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Ha) {
                AnonymousClass5Ha r5 = (AnonymousClass5Ha) obj;
                if (!(C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A06, r5.A06) && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A06, C18210wN.A04(this.A02));
        return ((AnonymousClass0wJ.A05(this.A04, (AnonymousClass0wJ.A05(this.A05, A07) + AnonymousClass0wJ.A03(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public AnonymousClass5Ha(KtCSuperShape0S2500000_I2 ktCSuperShape0S2500000_I2, ClipsMidCardSubtype clipsMidCardSubtype, ClipsMidCardType clipsMidCardType, MidCardLayoutType midCardLayoutType, String str, int i, int i2) {
        AnonymousClass0wJ.A1O(ktCSuperShape0S2500000_I2, str);
        C18190wL.A1S(midCardLayoutType, 3, clipsMidCardType);
        this.A02 = ktCSuperShape0S2500000_I2;
        this.A06 = str;
        this.A05 = midCardLayoutType;
        this.A03 = clipsMidCardSubtype;
        this.A04 = clipsMidCardType;
        this.A00 = i;
        this.A01 = i2;
    }
}
