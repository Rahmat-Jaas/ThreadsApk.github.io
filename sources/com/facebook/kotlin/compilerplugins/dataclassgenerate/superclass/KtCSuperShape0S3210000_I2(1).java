package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C86164wN;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.user.model.User;
import java.util.List;

public class KtCSuperShape0S3210000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final int A06 = 0;

    public KtCSuperShape0S3210000_I2(ThreadContainerType threadContainerType, String str, String str2, String str3, List list, boolean z) {
        C04220Ms.A0B(str2, 2);
        C18190wL.A1S(list, 4, threadContainerType);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A00 = list;
        this.A01 = threadContainerType;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A06) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S3210000_I2) {
                    KtCSuperShape0S3210000_I2 ktCSuperShape0S3210000_I2 = (KtCSuperShape0S3210000_I2) obj;
                    if (ktCSuperShape0S3210000_I2.A06 == 0 && C04220Ms.A0I(this.A02, ktCSuperShape0S3210000_I2.A02) && C04220Ms.A0I(this.A03, ktCSuperShape0S3210000_I2.A03) && this.A05 == ktCSuperShape0S3210000_I2.A05 && C04220Ms.A0I(this.A00, ktCSuperShape0S3210000_I2.A00) && this.A01 == ktCSuperShape0S3210000_I2.A01) {
                        str = this.A04;
                        str2 = ktCSuperShape0S3210000_I2.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S3210000_I2)) {
                    return false;
                }
                KtCSuperShape0S3210000_I2 ktCSuperShape0S3210000_I22 = (KtCSuperShape0S3210000_I2) obj;
                if (ktCSuperShape0S3210000_I22.A06 != 1 || !C04220Ms.A0I(this.A04, ktCSuperShape0S3210000_I22.A04) || !C04220Ms.A0I(this.A02, ktCSuperShape0S3210000_I22.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S3210000_I22.A03) || !C04220Ms.A0I(this.A01, ktCSuperShape0S3210000_I22.A01) || this.A00 != ktCSuperShape0S3210000_I22.A00 || this.A05 != ktCSuperShape0S3210000_I22.A05) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S3210000_I2) {
                    KtCSuperShape0S3210000_I2 ktCSuperShape0S3210000_I23 = (KtCSuperShape0S3210000_I2) obj;
                    if (ktCSuperShape0S3210000_I23.A06 == 2 && C04220Ms.A0I(this.A00, ktCSuperShape0S3210000_I23.A00) && C04220Ms.A0I(this.A02, ktCSuperShape0S3210000_I23.A02) && C04220Ms.A0I(this.A04, ktCSuperShape0S3210000_I23.A04) && C04220Ms.A0I(this.A01, ktCSuperShape0S3210000_I23.A01) && this.A05 == ktCSuperShape0S3210000_I23.A05) {
                        str = this.A03;
                        str2 = ktCSuperShape0S3210000_I23.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!C04220Ms.A0I(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052;
        String str;
        int A07;
        switch (this.A06) {
            case 0:
                int A062 = AnonymousClass0wJ.A06(this.A02) * 31;
                A052 = AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A00, (AnonymousClass0wJ.A07(this.A03, A062) + (C86164wN.A1S(this.A05) ? 1 : 0)) * 31));
                str = this.A04;
                break;
            case 1:
                A07 = (((((AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A04)) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A00)) * 31;
                A052 = this.A05;
                if (A052 != 0) {
                    A052 = 1;
                    break;
                }
                break;
            default:
                int A042 = (((((C18210wN.A04(this.A00) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31;
                boolean z = this.A05;
                if (z) {
                    z = true;
                }
                A052 = (A042 + (z ? 1 : 0)) * 31;
                str = this.A03;
                break;
        }
        A07 = C18200wM.A09(str);
        return A052 + A07;
    }

    public KtCSuperShape0S3210000_I2(IgFundedIncentiveBannerButton igFundedIncentiveBannerButton, IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType, String str, String str2, String str3, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = igFundedIncentiveBannerButton;
        this.A00 = igFundedIncentiveBannerIconType;
        this.A05 = z;
    }

    public KtCSuperShape0S3210000_I2(User user, Integer num, String str, String str2, String str3, boolean z) {
        this.A00 = user;
        this.A02 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A05 = z;
        this.A03 = str3;
    }
}
