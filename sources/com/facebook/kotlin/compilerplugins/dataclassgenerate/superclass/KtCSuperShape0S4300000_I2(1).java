package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorLevel;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteButtonAction;
import java.util.List;

public class KtCSuperShape0S4300000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final int A07 = 1;

    public KtCSuperShape0S4300000_I2(InstagramMediaProductType instagramMediaProductType, PromoteButtonAction promoteButtonAction, PromoteButtonAction promoteButtonAction2, String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A00 = instagramMediaProductType;
        this.A01 = promoteButtonAction;
        this.A02 = promoteButtonAction2;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S4300000_I2 ktCSuperShape0S4300000_I2;
        switch (this.A07) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S4300000_I2)) {
                    return false;
                }
                KtCSuperShape0S4300000_I2 ktCSuperShape0S4300000_I22 = (KtCSuperShape0S4300000_I2) obj;
                if (ktCSuperShape0S4300000_I22.A07 != 0 || !C04220Ms.A0I(this.A03, ktCSuperShape0S4300000_I22.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S4300000_I22.A00) || !C04220Ms.A0I(this.A04, ktCSuperShape0S4300000_I22.A04) || this.A01 != ktCSuperShape0S4300000_I22.A01 || !C04220Ms.A0I(this.A05, ktCSuperShape0S4300000_I22.A05) || !C04220Ms.A0I(this.A06, ktCSuperShape0S4300000_I22.A06) || this.A02 != ktCSuperShape0S4300000_I22.A02) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S4300000_I2)) {
                    return false;
                }
                ktCSuperShape0S4300000_I2 = (KtCSuperShape0S4300000_I2) obj;
                if (ktCSuperShape0S4300000_I2.A07 != 1 || !C04220Ms.A0I(this.A03, ktCSuperShape0S4300000_I2.A03) || !C04220Ms.A0I(this.A04, ktCSuperShape0S4300000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S4300000_I2.A05) || !C04220Ms.A0I(this.A06, ktCSuperShape0S4300000_I2.A06) || !C04220Ms.A0I(this.A00, ktCSuperShape0S4300000_I2.A00)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S4300000_I2)) {
                    return false;
                }
                ktCSuperShape0S4300000_I2 = (KtCSuperShape0S4300000_I2) obj;
                if (ktCSuperShape0S4300000_I2.A07 != 2 || !C04220Ms.A0I(this.A05, ktCSuperShape0S4300000_I2.A05) || !C04220Ms.A0I(this.A04, ktCSuperShape0S4300000_I2.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S4300000_I2.A03) || !C04220Ms.A0I(this.A06, ktCSuperShape0S4300000_I2.A06) || this.A00 != ktCSuperShape0S4300000_I2.A00) {
                    return false;
                }
        }
        if (!C04220Ms.A0I(this.A01, ktCSuperShape0S4300000_I2.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S4300000_I2.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object obj;
        int hashCode;
        switch (this.A07) {
            case 0:
                i = ((((((((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A09(this.A06)) * 31;
                obj = this.A02;
                break;
            case 1:
                hashCode = AnonymousClass0wJ.A05(this.A01, ((((((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31);
                i = C18200wM.A07(this.A02);
                break;
            default:
                i = AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A06, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A04, C18180wK.A03(this.A05))))));
                obj = this.A02;
                if (obj == null) {
                    hashCode = 0;
                    break;
                }
                break;
        }
        hashCode = obj.hashCode();
        return i + hashCode;
    }

    public final String toString() {
        if (2 - this.A07 != 0) {
            return super.toString();
        }
        StringBuilder A0s = C18190wL.A0s("PromotionInformationData(screenTitle=");
        A0s.append(this.A05);
        A0s.append(", displayTitle=");
        A0s.append(this.A04);
        A0s.append(", displayBody=");
        A0s.append(this.A03);
        A0s.append(", thumbnailUrl=");
        A0s.append(this.A06);
        A0s.append(", mediaProductType=");
        A0s.append(this.A00);
        A0s.append(", primaryButtonAction=");
        A0s.append(this.A01);
        A0s.append(", secondaryButtonAction=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public KtCSuperShape0S4300000_I2(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I22, String str, String str2, String str3, String str4, List list) {
        C04220Ms.A0B(list, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = ktCSuperShape0S2100000_I2;
        this.A01 = list;
        this.A02 = ktCSuperShape0S2100000_I22;
    }

    public KtCSuperShape0S4300000_I2(ErrorHandlingResponseType errorHandlingResponseType, ErrorLevel errorLevel, String str, String str2, String str3, String str4, List list) {
        C04220Ms.A0B(errorHandlingResponseType, 7);
        this.A03 = str;
        this.A00 = list;
        this.A04 = str2;
        this.A01 = errorLevel;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = errorHandlingResponseType;
    }
}
