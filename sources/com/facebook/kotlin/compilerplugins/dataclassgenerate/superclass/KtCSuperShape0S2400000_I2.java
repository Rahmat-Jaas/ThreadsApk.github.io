package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.ModuleVariant;
import java.util.List;
import kotlin.Pair;

public class KtCSuperShape0S2400000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06 = 2;

    public KtCSuperShape0S2400000_I2(SpannableStringBuilder spannableStringBuilder, String str, String str2, List list, List list2, Pair pair) {
        C04220Ms.A0B(str, 1);
        C18180wK.A1P(str2, 2, spannableStringBuilder);
        C18230wP.A1R(list2, 5, pair);
        this.A04 = str;
        this.A05 = str2;
        this.A01 = spannableStringBuilder;
        this.A00 = list;
        this.A03 = list2;
        this.A02 = pair;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A06) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KtCSuperShape0S2400000_I2)) {
                    return false;
                }
                KtCSuperShape0S2400000_I2 ktCSuperShape0S2400000_I2 = (KtCSuperShape0S2400000_I2) obj;
                if (ktCSuperShape0S2400000_I2.A06 != 0 || !C04220Ms.A0I(this.A04, ktCSuperShape0S2400000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S2400000_I2.A05) || !C04220Ms.A0I(this.A00, ktCSuperShape0S2400000_I2.A00) || !C04220Ms.A0I(this.A01, ktCSuperShape0S2400000_I2.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S2400000_I2.A02) || this.A03 != ktCSuperShape0S2400000_I2.A03) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S2400000_I2) {
                    KtCSuperShape0S2400000_I2 ktCSuperShape0S2400000_I22 = (KtCSuperShape0S2400000_I2) obj;
                    if (ktCSuperShape0S2400000_I22.A06 == 1 && C04220Ms.A0I(this.A04, ktCSuperShape0S2400000_I22.A04) && C04220Ms.A0I(this.A00, ktCSuperShape0S2400000_I22.A00) && C04220Ms.A0I(this.A01, ktCSuperShape0S2400000_I22.A01) && C04220Ms.A0I(this.A05, ktCSuperShape0S2400000_I22.A05) && C04220Ms.A0I(this.A02, ktCSuperShape0S2400000_I22.A02)) {
                        obj2 = this.A03;
                        obj3 = ktCSuperShape0S2400000_I22.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KtCSuperShape0S2400000_I2) {
                    KtCSuperShape0S2400000_I2 ktCSuperShape0S2400000_I23 = (KtCSuperShape0S2400000_I2) obj;
                    if (ktCSuperShape0S2400000_I23.A06 == 2 && C04220Ms.A0I(this.A04, ktCSuperShape0S2400000_I23.A04) && C04220Ms.A0I(this.A05, ktCSuperShape0S2400000_I23.A05) && C04220Ms.A0I(this.A01, ktCSuperShape0S2400000_I23.A01) && C04220Ms.A0I(this.A00, ktCSuperShape0S2400000_I23.A00) && C04220Ms.A0I(this.A03, ktCSuperShape0S2400000_I23.A03)) {
                        obj2 = this.A02;
                        obj3 = ktCSuperShape0S2400000_I23.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!C04220Ms.A0I(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052;
        Object obj;
        int A062;
        switch (this.A06) {
            case 0:
                int A063 = AnonymousClass0wJ.A06(this.A04) * 31;
                A052 = AnonymousClass0wJ.A05(this.A02, (((AnonymousClass0wJ.A07(this.A05, A063) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01)) * 31);
                obj = this.A03;
                break;
            case 1:
                A062 = ((((((((AnonymousClass0wJ.A06(this.A04) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31;
                A052 = C18200wM.A07(this.A03);
                break;
            default:
                A052 = AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A04)))));
                obj = this.A02;
                break;
        }
        A062 = obj.hashCode();
        return A062 + A052;
    }

    public KtCSuperShape0S2400000_I2(KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I22, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I23, String str, String str2, List list) {
        this.A04 = str;
        this.A00 = list;
        this.A01 = ktCSuperShape0S3100000_I2;
        this.A05 = str2;
        this.A02 = ktCSuperShape0S3100000_I22;
        this.A03 = ktCSuperShape0S3100000_I23;
    }

    public KtCSuperShape0S2400000_I2(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I22, ModuleVariant moduleVariant, String str, String str2, List list) {
        C18190wL.A1S(str2, 2, list);
        C04220Ms.A0B(moduleVariant, 6);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = ktCSuperShape0S2100000_I2;
        this.A01 = ktCSuperShape0S2100000_I22;
        this.A02 = list;
        this.A03 = moduleVariant;
    }
}
