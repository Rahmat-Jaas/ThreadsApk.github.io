package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.BKU;
import X.C04220Ms;
import X.C18200wM;
import X.C18210wN;
import X.C86144wL;
import X.C968566y;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import java.util.List;
import java.util.Map;

public class KtCSuperShape0S0510000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06 = 0;

    public KtCSuperShape0S0510000_I2(C968566y r8, List list) {
        this(r8, (Integer) null, list, (List) AnonymousClass0ZV.A00, AnonymousClass4WJ.A0A(), false);
    }

    public static /* synthetic */ KtCSuperShape0S0510000_I2 A00(KtCSuperShape0S0510000_I2 ktCSuperShape0S0510000_I2, C968566y r8, Integer num, List list, Map map, int i, boolean z) {
        Integer num2 = num;
        boolean z2 = z;
        Map map2 = map;
        List list2 = list;
        C968566y r1 = r8;
        List list3 = null;
        if ((i & 1) != 0) {
            list3 = (List) ktCSuperShape0S0510000_I2.A00;
        }
        if ((i & 2) != 0) {
            r1 = (C968566y) ktCSuperShape0S0510000_I2.A03;
        }
        if ((i & 4) != 0) {
            list2 = (List) ktCSuperShape0S0510000_I2.A02;
        }
        if ((i & 8) != 0) {
            map2 = (Map) ktCSuperShape0S0510000_I2.A04;
        }
        if ((i & 16) != 0) {
            z2 = ktCSuperShape0S0510000_I2.A05;
        }
        if ((i & 32) != 0) {
            num2 = (Integer) ktCSuperShape0S0510000_I2.A01;
        }
        AnonymousClass0wJ.A1N(list3, r1);
        AnonymousClass0wJ.A1Q(list2, map2);
        return new KtCSuperShape0S0510000_I2(r1, num2, list3, list2, map2, z2);
    }

    public final boolean equals(Object obj) {
        if (this.A06 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0510000_I2)) {
                return false;
            }
            KtCSuperShape0S0510000_I2 ktCSuperShape0S0510000_I2 = (KtCSuperShape0S0510000_I2) obj;
            if (ktCSuperShape0S0510000_I2.A06 != 1 || !C04220Ms.A0I(this.A00, ktCSuperShape0S0510000_I2.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S0510000_I2.A01) || !C04220Ms.A0I(this.A04, ktCSuperShape0S0510000_I2.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S0510000_I2.A03) || !C04220Ms.A0I(this.A02, ktCSuperShape0S0510000_I2.A02) || this.A05 != ktCSuperShape0S0510000_I2.A05) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0510000_I2)) {
                return false;
            }
            KtCSuperShape0S0510000_I2 ktCSuperShape0S0510000_I22 = (KtCSuperShape0S0510000_I2) obj;
            if (ktCSuperShape0S0510000_I22.A06 == 0 && C04220Ms.A0I(this.A00, ktCSuperShape0S0510000_I22.A00) && this.A03 == ktCSuperShape0S0510000_I22.A03 && C04220Ms.A0I(this.A02, ktCSuperShape0S0510000_I22.A02) && C04220Ms.A0I(this.A04, ktCSuperShape0S0510000_I22.A04) && this.A05 == ktCSuperShape0S0510000_I22.A05 && this.A01 == ktCSuperShape0S0510000_I22.A01) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i;
        String str;
        int A0B;
        int i2 = this.A06;
        Object obj = this.A00;
        if (i2 != 0) {
            Object obj2 = this.A04;
            i = AnonymousClass0wJ.A05(this.A02, (AnonymousClass0wJ.A05(obj2, (C18210wN.A04(obj) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A03)) * 31);
            A0B = this.A05;
            if (A0B != 0) {
                A0B = 1;
            }
        } else {
            int A052 = AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A03, C18210wN.A04(obj))));
            boolean z = this.A05;
            if (z) {
                z = true;
            }
            i = (A052 + (z ? 1 : 0)) * 31;
            Number number = (Number) this.A01;
            if (number == null) {
                A0B = 0;
            } else {
                int intValue = number.intValue();
                switch (intValue) {
                    case 1:
                        str = "PostNotificationsOff";
                        break;
                    case 2:
                        str = "PostNotificationsError";
                        break;
                    default:
                        str = "PostNotificationsOn";
                        break;
                }
                A0B = C86144wL.A0B(str, intValue);
            }
        }
        return i + A0B;
    }

    public KtCSuperShape0S0510000_I2(C968566y r2, Integer num, List list, List list2, Map map, boolean z) {
        C04220Ms.A0B(r2, 2);
        this.A00 = list;
        this.A03 = r2;
        this.A02 = list2;
        this.A04 = map;
        this.A05 = z;
        this.A01 = num;
    }

    public KtCSuperShape0S0510000_I2(BKU bku, ProductCollectionCover productCollectionCover, CharSequence charSequence, CharSequence charSequence2, List list, boolean z) {
        this.A00 = productCollectionCover;
        this.A01 = bku;
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A02 = list;
        this.A05 = z;
    }
}
