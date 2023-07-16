package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C33442Fs;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S0610000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final int A07 = 1;

    public KtCSuperShape0S0610000_I2(MultiProductComponent multiProductComponent, Boolean bool, Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        Integer num3 = AnonymousClass006.A01;
        this.A07 = 1;
        this.A03 = null;
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
        this.A06 = false;
        this.A05 = num3;
        this.A02 = num3;
    }

    public static /* synthetic */ KtCSuperShape0S0610000_I2 A00(KtCSuperShape0S0610000_I2 ktCSuperShape0S0610000_I2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, int i, boolean z) {
        Integer num6 = num4;
        Integer num7 = num3;
        Integer num8 = num2;
        Integer num9 = num;
        Integer num10 = num5;
        boolean z2 = z;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = (List) ktCSuperShape0S0610000_I2.A01;
        }
        if ((i & 2) != 0) {
            z2 = ktCSuperShape0S0610000_I2.A06;
        }
        if ((i & 4) != 0) {
            num9 = (Integer) ktCSuperShape0S0610000_I2.A00;
        }
        if ((i & 8) != 0) {
            num8 = (Integer) ktCSuperShape0S0610000_I2.A02;
        }
        if ((i & 16) != 0) {
            num7 = (Integer) ktCSuperShape0S0610000_I2.A04;
        }
        if ((i & 32) != 0) {
            num6 = (Integer) ktCSuperShape0S0610000_I2.A03;
        }
        if ((i & 64) != 0) {
            num10 = (Integer) ktCSuperShape0S0610000_I2.A05;
        }
        C04220Ms.A0B(list2, 0);
        AnonymousClass0wJ.A1Q(num9, num8);
        C18190wL.A1S(num7, 4, num6);
        C04220Ms.A0B(num10, 6);
        return new KtCSuperShape0S0610000_I2(num9, num8, num7, num6, num10, list2, z2);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S0610000_I2)) {
                return false;
            }
            KtCSuperShape0S0610000_I2 ktCSuperShape0S0610000_I2 = (KtCSuperShape0S0610000_I2) obj;
            if (ktCSuperShape0S0610000_I2.A07 != 1 || !C04220Ms.A0I(this.A03, ktCSuperShape0S0610000_I2.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S0610000_I2.A00) || !C04220Ms.A0I(this.A04, ktCSuperShape0S0610000_I2.A04) || !C04220Ms.A0I(this.A01, ktCSuperShape0S0610000_I2.A01) || this.A06 != ktCSuperShape0S0610000_I2.A06 || this.A05 != ktCSuperShape0S0610000_I2.A05) {
                return false;
            }
            obj2 = this.A02;
            obj3 = ktCSuperShape0S0610000_I2.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S0610000_I2)) {
                return false;
            }
            KtCSuperShape0S0610000_I2 ktCSuperShape0S0610000_I22 = (KtCSuperShape0S0610000_I2) obj;
            if (ktCSuperShape0S0610000_I22.A07 != 0 || !C04220Ms.A0I(this.A01, ktCSuperShape0S0610000_I22.A01) || this.A06 != ktCSuperShape0S0610000_I22.A06 || this.A00 != ktCSuperShape0S0610000_I22.A00 || this.A02 != ktCSuperShape0S0610000_I22.A02 || this.A04 != ktCSuperShape0S0610000_I22.A04 || this.A03 != ktCSuperShape0S0610000_I22.A03) {
                return false;
            }
            obj2 = this.A05;
            obj3 = ktCSuperShape0S0610000_I22.A05;
        }
        if (obj2 != obj3) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002;
        int A003;
        String str;
        String str2;
        if (this.A07 != 0) {
            int A032 = ((((((AnonymousClass0wJ.A03(this.A03) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + C18200wM.A07(this.A01)) * 31;
            boolean z = this.A06;
            if (z) {
                z = true;
            }
            int i = (A032 + (z ? 1 : 0)) * 31;
            int A042 = AnonymousClass0wJ.A04(this.A05);
            if (1 != A042) {
                str = "DROPDOWN";
            } else {
                str = "UNKNOWN";
            }
            A002 = C86124wJ.A0J(str, A042, i);
            int A043 = AnonymousClass0wJ.A04(this.A02);
            switch (A043) {
                case 1:
                    str2 = "TEXT_ONLY";
                    break;
                case 2:
                    str2 = "TEXT_WITH_ICON";
                    break;
                case 3:
                    str2 = "TEXT_WITH_POST_PENDED_ICON";
                    break;
                default:
                    str2 = AnonymousClass000.A00(656);
                    break;
            }
            A003 = C86144wL.A0B(str2, A043);
        } else {
            int A044 = C18210wN.A04(this.A01);
            boolean z2 = this.A06;
            if (z2) {
                z2 = true;
            }
            A002 = (((((((((A044 + (z2 ? 1 : 0)) * 31) + C33442Fs.A00((Integer) this.A00)) * 31) + C33442Fs.A00((Integer) this.A02)) * 31) + C33442Fs.A00((Integer) this.A04)) * 31) + C33442Fs.A00((Integer) this.A03)) * 31;
            A003 = C33442Fs.A00((Integer) this.A05);
        }
        return A002 + A003;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KtCSuperShape0S0610000_I2(java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.util.List r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9, boolean r10) {
        /*
            r0 = this;
            r7 = 0
            r0.A07 = r7
            X.0ZV r6 = X.AnonymousClass0ZV.A00
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int, boolean):void");
    }

    public KtCSuperShape0S0610000_I2(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, boolean z) {
        AnonymousClass0wJ.A1R(num, num2);
        C04220Ms.A0B(num3, 5);
        C86104wH.A1P(num4, 6, num5);
        this.A01 = list;
        this.A06 = z;
        this.A00 = num;
        this.A02 = num2;
        this.A04 = num3;
        this.A03 = num4;
        this.A05 = num5;
    }

    public KtCSuperShape0S0610000_I2() {
        this((MultiProductComponent) null, (Boolean) null, (Integer) null, (Integer) null, (ArrayList) null, (ArrayList) null, (DefaultConstructorMarker) null, (int) StringTreeSet.MAX_SYMBOL_COUNT, 1, false);
    }
}
