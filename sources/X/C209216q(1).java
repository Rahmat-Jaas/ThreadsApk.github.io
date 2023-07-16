package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.16q  reason: invalid class name and case insensitive filesystem */
public final class C209216q extends AnonymousClass0Sf {
    public final ImageUrl A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C209216q(ImageUrl imageUrl, Integer num, Object obj, String str, String str2) {
        C04220Ms.A0B(num, 4);
        this.A00 = imageUrl;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A02 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209216q) {
                C209216q r5 = (C209216q) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || this.A01 != r5.A01 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = ((((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31;
        Integer num = this.A01;
        return C18220wO.A05(num, C59973Nd.A00(num), A032) + C18200wM.A07(this.A02);
    }
}
