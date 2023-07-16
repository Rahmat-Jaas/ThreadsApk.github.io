package X;

import com.instagram.model.shopping.merchant.MicroMerchantDict;
import java.util.List;

/* renamed from: X.5Mt  reason: invalid class name and case insensitive filesystem */
public final class C90625Mt extends AnonymousClass0Sf implements C21405Bto {
    public final MicroMerchantDict A00;
    public final Long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final C90625Mt D6I() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90625Mt) {
                C90625Mt r5 = (C90625Mt) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A09(this.A06);
    }

    public C90625Mt(MicroMerchantDict microMerchantDict, Long l, Long l2, String str, String str2, String str3, String str4, List list) {
        this.A03 = str;
        this.A01 = l;
        this.A00 = microMerchantDict;
        this.A07 = list;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = l2;
        this.A06 = str4;
    }
}
