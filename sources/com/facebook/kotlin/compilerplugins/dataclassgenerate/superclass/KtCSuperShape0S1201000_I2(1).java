package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C1533493t;
import X.C18180wK;
import X.C18210wN;
import X.C302320f;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedComponentType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S1201000_I2 extends AnonymousClass0Sf {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04 = 2;

    public KtCSuperShape0S1201000_I2(C1533493t r7, ShoppingTaggingFeedComponentType shoppingTaggingFeedComponentType, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3) {
        this(new C1533493t((KtCSuperShape0S1200000_I2) null, 511), ShoppingTaggingFeedComponentType.UNRECOGNIZED, "", 0);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A04) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S1201000_I2)) {
                    return false;
                }
                KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I2 = (KtCSuperShape0S1201000_I2) obj;
                if (ktCSuperShape0S1201000_I2.A04 == 0 && C04220Ms.A0I(this.A03, ktCSuperShape0S1201000_I2.A03) && this.A00 == ktCSuperShape0S1201000_I2.A00 && C04220Ms.A0I(this.A02, ktCSuperShape0S1201000_I2.A02) && this.A01 == ktCSuperShape0S1201000_I2.A01) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S1201000_I2) {
                    KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I22 = (KtCSuperShape0S1201000_I2) obj;
                    if (ktCSuperShape0S1201000_I22.A04 == 1 && this.A02 == ktCSuperShape0S1201000_I22.A02 && C04220Ms.A0I(this.A01, ktCSuperShape0S1201000_I22.A01) && this.A00 == ktCSuperShape0S1201000_I22.A00) {
                        obj2 = this.A03;
                        obj3 = ktCSuperShape0S1201000_I22.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S1201000_I2) {
                    KtCSuperShape0S1201000_I2 ktCSuperShape0S1201000_I23 = (KtCSuperShape0S1201000_I2) obj;
                    if (ktCSuperShape0S1201000_I23.A04 == 2 && this.A01 == ktCSuperShape0S1201000_I23.A01 && C04220Ms.A0I(this.A03, ktCSuperShape0S1201000_I23.A03) && this.A00 == ktCSuperShape0S1201000_I23.A00) {
                        obj2 = this.A02;
                        obj3 = ktCSuperShape0S1201000_I23.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!C04220Ms.A0I(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05;
        Object obj;
        int A06;
        switch (this.A04) {
            case 0:
                A05 = AnonymousClass0wJ.A05(this.A02, (C18180wK.A03(this.A03) + this.A00) * 31);
                obj = this.A01;
                break;
            case 1:
                A05 = (AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02)) + this.A00) * 31;
                A06 = AnonymousClass0wJ.A06(this.A03);
                break;
            default:
                A05 = (AnonymousClass0wJ.A07(this.A03, C18210wN.A04(this.A01)) + this.A00) * 31;
                obj = this.A02;
                break;
        }
        A06 = obj.hashCode();
        return A05 + A06;
    }

    public KtCSuperShape0S1201000_I2(SocialContextType socialContextType, String str, List list, int i, int i2) {
        list = (i2 & 2) != 0 ? AnonymousClass0ZV.A00 : list;
        i = (i2 & 4) != 0 ? -1 : i;
        str = (i2 & 8) != 0 ? null : str;
        this.A04 = 1;
        AnonymousClass0wJ.A1M(socialContextType, 1, list);
        this.A02 = socialContextType;
        this.A01 = list;
        this.A00 = i;
        this.A03 = str;
    }

    public KtCSuperShape0S1201000_I2(C1533493t r3, ShoppingTaggingFeedComponentType shoppingTaggingFeedComponentType, String str, int i) {
        C04220Ms.A0B(shoppingTaggingFeedComponentType, 1);
        C04220Ms.A0B(str, 2);
        this.A01 = shoppingTaggingFeedComponentType;
        this.A03 = str;
        this.A00 = i;
        this.A02 = r3;
    }

    public KtCSuperShape0S1201000_I2(C302320f r2, String str, List list, int i) {
        C04220Ms.A0B(r2, 4);
        this.A03 = str;
        this.A00 = i;
        this.A02 = list;
        this.A01 = r2;
    }

    public KtCSuperShape0S1201000_I2() {
        this((C1533493t) null, (ShoppingTaggingFeedComponentType) null, (String) null, (DefaultConstructorMarker) null, 0, 15, 2);
    }
}
