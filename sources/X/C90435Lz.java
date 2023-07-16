package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5Lz  reason: invalid class name and case insensitive filesystem */
public final class C90435Lz extends AnonymousClass0Sf implements AnonymousClass8iT {
    public final ImageUrl A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final Object A0B = "bio";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90435Lz) {
                C90435Lz r5 = (C90435Lz) obj;
                if (!C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || this.A0A != r5.A0A || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || this.A09 != r5.A09 || !C04220Ms.A0I(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return "bio";
    }

    public final int hashCode() {
        int A052 = (AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A07)) + AnonymousClass0wJ.A06(this.A03)) * 31;
        boolean z = this.A0A;
        int i = 1;
        if (z) {
            z = true;
        }
        int A072 = (((((((AnonymousClass0wJ.A07(this.A06, (A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31;
        if (!this.A09) {
            i = 0;
        }
        return ((A072 + i) * 31) + C18200wM.A07(this.A08);
    }

    public C90435Lz(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        this.A07 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A0A = z;
        this.A06 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A04 = str6;
        this.A01 = num;
        this.A09 = z2;
        this.A08 = list;
    }
}
