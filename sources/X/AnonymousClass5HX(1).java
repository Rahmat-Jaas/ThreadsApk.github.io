package X;

import com.instagram.model.mediatype.ProductType;
import java.util.List;

/* renamed from: X.5HX  reason: invalid class name */
public final class AnonymousClass5HX extends AnonymousClass0Sf {
    public final int A00;
    public final int A01;
    public final ProductType A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    public AnonymousClass5HX(ProductType productType, String str, List list, int i, int i2, boolean z) {
        C04220Ms.A0B(str, 3);
        this.A02 = productType;
        this.A04 = list;
        this.A03 = str;
        this.A05 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HX) {
                AnonymousClass5HX r5 = (AnonymousClass5HX) obj;
                if (!(this.A02 == r5.A02 && C04220Ms.A0I(this.A04, r5.A04) && C04220Ms.A0I(this.A03, r5.A03) && this.A05 == r5.A05 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A05(this.A04, C18210wN.A04(this.A02)));
        boolean z = this.A05;
        if (z) {
            z = true;
        }
        return ((((A07 + (z ? 1 : 0)) * 31) + this.A01) * 31) + this.A00;
    }
}
