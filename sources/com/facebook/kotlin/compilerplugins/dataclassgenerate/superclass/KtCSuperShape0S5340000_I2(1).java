package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8s2;
import X.C04220Ms;
import X.C100156Mf;
import X.C146628mY;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C86124wJ;
import X.C970267q;

public class KtCSuperShape0S5340000_I2 extends AnonymousClass0Sf implements C146628mY {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final int A09 = 1;

    public KtCSuperShape0S5340000_I2(Integer num, String str, String str2, String str3, String str4, boolean z) {
        C970267q r0 = C970267q.POST;
        this.A09 = 1;
        AnonymousClass0wJ.A1Q(str2, str3);
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = num;
        this.A08 = z;
        this.A05 = null;
        this.A02 = r0;
        this.A00 = C100156Mf.A00(this, "uploadfailure");
    }

    public final String B2L() {
        return this.A04;
    }

    public final String B7K() {
        return this.A05;
    }

    public final String BGL() {
        return this.A06;
    }

    public final String BGO() {
        return this.A07;
    }

    public final C970267q BIh() {
        return (C970267q) this.A02;
    }

    public final boolean BSX() {
        return false;
    }

    public final boolean BWz() {
        return false;
    }

    public final boolean BZW() {
        return false;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S5340000_I2 ktCSuperShape0S5340000_I2;
        if (this.A09 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S5340000_I2)) {
                return false;
            }
            ktCSuperShape0S5340000_I2 = (KtCSuperShape0S5340000_I2) obj;
            if (ktCSuperShape0S5340000_I2.A09 != 1 || !C04220Ms.A0I(this.A06, ktCSuperShape0S5340000_I2.A06) || !C04220Ms.A0I(this.A07, ktCSuperShape0S5340000_I2.A07) || !C04220Ms.A0I(this.A04, ktCSuperShape0S5340000_I2.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S5340000_I2.A03) || this.A01 != ktCSuperShape0S5340000_I2.A01 || this.A08 != ktCSuperShape0S5340000_I2.A08) {
                return false;
            }
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S5340000_I2)) {
                return false;
            }
            ktCSuperShape0S5340000_I2 = (KtCSuperShape0S5340000_I2) obj;
            if (ktCSuperShape0S5340000_I2.A09 != 0 || !C04220Ms.A0I(this.A06, ktCSuperShape0S5340000_I2.A06) || !C04220Ms.A0I(this.A07, ktCSuperShape0S5340000_I2.A07) || !C04220Ms.A0I(this.A04, ktCSuperShape0S5340000_I2.A04) || this.A08 != ktCSuperShape0S5340000_I2.A08 || !C04220Ms.A0I(this.A03, ktCSuperShape0S5340000_I2.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S5340000_I2.A00)) {
                return false;
            }
        }
        if (!C04220Ms.A0I(this.A05, ktCSuperShape0S5340000_I2.A05) || this.A02 != ktCSuperShape0S5340000_I2.A02) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        if (this.A09 != 0) {
            return this.A00;
        }
        return this.A01;
    }

    public final int hashCode() {
        int A062;
        int A032;
        String str;
        int i = this.A09;
        int A072 = AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A07, C18180wK.A03(this.A06)));
        if (i != 0) {
            A062 = 1;
            int A063 = ((A072 * 31) + AnonymousClass0wJ.A06(this.A03)) * 31;
            int A042 = AnonymousClass0wJ.A04(this.A01);
            switch (A042) {
                case 1:
                    str = "WaitingForAutoRetry";
                    break;
                case 2:
                    str = "CannotRetry";
                    break;
                default:
                    str = "CanManualRetry";
                    break;
            }
            A032 = C86124wJ.A0J(str, A042, A063);
            if (!this.A08) {
                A062 = 0;
            }
        } else {
            int i2 = 1;
            int i3 = A072 * 31;
            if (!this.A08) {
                i2 = 0;
            }
            A062 = (((i3 + i2) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31;
            A032 = AnonymousClass0wJ.A03(this.A00);
        }
        return C18220wO.A06(this.A02, (((A032 + A062) * 31) + C18200wM.A09(this.A05)) * 31);
    }

    public KtCSuperShape0S5340000_I2(String str, String str2, String str3, String str4, String str5, AnonymousClass8s2 r8) {
        C970267q r0 = C970267q.POST;
        this.A09 = 0;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A08 = false;
        this.A03 = str4;
        this.A00 = r8;
        this.A05 = str5;
        this.A02 = r0;
        this.A01 = C100156Mf.A00(this, "overlayview");
    }
}
