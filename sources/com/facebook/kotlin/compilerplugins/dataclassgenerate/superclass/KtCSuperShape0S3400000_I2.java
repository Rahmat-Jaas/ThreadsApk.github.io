package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C23894D0g;
import X.C86104wH;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.mediakit.model.MediaKitSectionType;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

public class KtCSuperShape0S3400000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public String A06;
    public final int A07 = 1;

    public KtCSuperShape0S3400000_I2(KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2, MediaKitSectionType mediaKitSectionType, String str, String str2, String str3, List list, List list2) {
        C04220Ms.A0B(str2, 3);
        C86104wH.A1P(str3, 6, mediaKitSectionType);
        this.A00 = list;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = list2;
        this.A02 = ktCSuperShape0S0110000_I2;
        this.A06 = str3;
        this.A03 = mediaKitSectionType;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S3400000_I2 ktCSuperShape0S3400000_I2;
        switch (this.A07) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S3400000_I2)) {
                    return false;
                }
                ktCSuperShape0S3400000_I2 = (KtCSuperShape0S3400000_I2) obj;
                if (ktCSuperShape0S3400000_I2.A07 != 0 || !C04220Ms.A0I(this.A04, ktCSuperShape0S3400000_I2.A04) || !C04220Ms.A0I(this.A00, ktCSuperShape0S3400000_I2.A00) || !C04220Ms.A0I(this.A05, ktCSuperShape0S3400000_I2.A05) || !C04220Ms.A0I(this.A06, ktCSuperShape0S3400000_I2.A06) || !C04220Ms.A0I(this.A01, ktCSuperShape0S3400000_I2.A01)) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S3400000_I2)) {
                    return false;
                }
                KtCSuperShape0S3400000_I2 ktCSuperShape0S3400000_I22 = (KtCSuperShape0S3400000_I2) obj;
                if (ktCSuperShape0S3400000_I22.A07 != 1 || !C04220Ms.A0I(this.A00, ktCSuperShape0S3400000_I22.A00) || !C04220Ms.A0I(this.A04, ktCSuperShape0S3400000_I22.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S3400000_I22.A05) || !C04220Ms.A0I(this.A01, ktCSuperShape0S3400000_I22.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S3400000_I22.A02) || !C04220Ms.A0I(this.A06, ktCSuperShape0S3400000_I22.A06) || this.A03 != ktCSuperShape0S3400000_I22.A03) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S3400000_I2)) {
                    return false;
                }
                ktCSuperShape0S3400000_I2 = (KtCSuperShape0S3400000_I2) obj;
                if (ktCSuperShape0S3400000_I2.A07 != 2 || !C04220Ms.A0I(this.A01, ktCSuperShape0S3400000_I2.A01) || !C04220Ms.A0I(this.A05, ktCSuperShape0S3400000_I2.A05) || !C04220Ms.A0I(this.A06, ktCSuperShape0S3400000_I2.A06) || !C04220Ms.A0I(this.A04, ktCSuperShape0S3400000_I2.A04) || this.A00 != ktCSuperShape0S3400000_I2.A00) {
                    return false;
                }
        }
        if (!C04220Ms.A0I(this.A02, ktCSuperShape0S3400000_I2.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S3400000_I2.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A062;
        int A072;
        switch (this.A07) {
            case 0:
                A062 = ((((((((((AnonymousClass0wJ.A06(this.A04) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31;
                A072 = C18200wM.A07(this.A03);
                break;
            case 1:
                String str = this.A05;
                return C18220wO.A06(this.A03, AnonymousClass0wJ.A07(this.A06, (((AnonymousClass0wJ.A07(str, ((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A02)) * 31));
            default:
                int A042 = C18210wN.A04(this.A01);
                A062 = AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A00, (((AnonymousClass0wJ.A07(this.A05, A042) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31));
                A072 = C18200wM.A07(this.A03);
                break;
        }
        return A062 + A072;
    }

    public KtCSuperShape0S3400000_I2(ImageUrl imageUrl, Reel reel, C23894D0g d0g, User user, String str, String str2, String str3) {
        C18190wL.A1S(str, 2, d0g);
        this.A01 = imageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = d0g;
        this.A02 = user;
        this.A03 = reel;
    }

    public KtCSuperShape0S3400000_I2(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3) {
        this.A04 = str;
        this.A00 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = l;
        this.A02 = num2;
        this.A03 = num3;
    }
}
