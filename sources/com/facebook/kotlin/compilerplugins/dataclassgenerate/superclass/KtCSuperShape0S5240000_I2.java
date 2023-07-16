package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C100156Mf;
import X.C146628mY;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C86154wM;
import X.C970267q;
import com.instagram.api.schemas.LineType;

public class KtCSuperShape0S5240000_I2 extends AnonymousClass0Sf implements C146628mY {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;

    public KtCSuperShape0S5240000_I2(LineType lineType, C970267q r4, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.A0B = 0;
        this.A0B = 0;
        C04220Ms.A0B(str, 1);
        C18190wL.A1S(str4, 4, lineType);
        C04220Ms.A0B(r4, 11);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A00 = lineType;
        this.A0A = z;
        this.A03 = str5;
        this.A08 = z2;
        this.A09 = z3;
        this.A07 = false;
        this.A01 = r4;
    }

    public final String B2L() {
        return this.A02;
    }

    public final String B7K() {
        return this.A03;
    }

    public final String BGL() {
        if (this.A0B != 0) {
            return this.A05;
        }
        return this.A04;
    }

    public final String BGO() {
        if (this.A0B != 0) {
            return this.A06;
        }
        return this.A05;
    }

    public final C970267q BIh() {
        return (C970267q) this.A01;
    }

    public final boolean BSX() {
        if (this.A0B != 0) {
            return this.A09;
        }
        return this.A08;
    }

    public final boolean BWz() {
        if (this.A0B != 0) {
            return this.A0A;
        }
        return this.A09;
    }

    public final boolean BZW() {
        return this.A07;
    }

    public final boolean equals(Object obj) {
        KtCSuperShape0S5240000_I2 ktCSuperShape0S5240000_I2;
        if (this.A0B != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S5240000_I2)) {
                return false;
            }
            ktCSuperShape0S5240000_I2 = (KtCSuperShape0S5240000_I2) obj;
            if (ktCSuperShape0S5240000_I2.A0B != 1 || !C04220Ms.A0I(BGL(), ktCSuperShape0S5240000_I2.BGL()) || !C04220Ms.A0I(BGO(), ktCSuperShape0S5240000_I2.BGO()) || !C04220Ms.A0I(this.A02, ktCSuperShape0S5240000_I2.A02) || BSX() != ktCSuperShape0S5240000_I2.BSX() || !C04220Ms.A0I(this.A04, ktCSuperShape0S5240000_I2.A04) || this.A08 != ktCSuperShape0S5240000_I2.A08 || this.A00 != ktCSuperShape0S5240000_I2.A00 || !C04220Ms.A0I(this.A03, ktCSuperShape0S5240000_I2.A03)) {
                return false;
            }
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S5240000_I2)) {
                return false;
            }
            ktCSuperShape0S5240000_I2 = (KtCSuperShape0S5240000_I2) obj;
            if (ktCSuperShape0S5240000_I2.A0B != 0 || !C04220Ms.A0I(BGL(), ktCSuperShape0S5240000_I2.BGL()) || !C04220Ms.A0I(BGO(), ktCSuperShape0S5240000_I2.BGO()) || !C04220Ms.A0I(this.A02, ktCSuperShape0S5240000_I2.A02) || !C04220Ms.A0I(this.A06, ktCSuperShape0S5240000_I2.A06) || this.A00 != ktCSuperShape0S5240000_I2.A00 || this.A0A != ktCSuperShape0S5240000_I2.A0A || !C04220Ms.A0I(this.A03, ktCSuperShape0S5240000_I2.A03) || BSX() != ktCSuperShape0S5240000_I2.BSX()) {
                return false;
            }
        }
        if (BWz() == ktCSuperShape0S5240000_I2.BWz() && this.A07 == ktCSuperShape0S5240000_I2.A07 && this.A01 == ktCSuperShape0S5240000_I2.A01) {
            return true;
        }
        return false;
    }

    public final Object getKey() {
        String str;
        if (this.A0B != 0) {
            str = "text";
        } else {
            str = "reposted";
        }
        return C100156Mf.A00(this, str);
    }

    public final int hashCode() {
        int i;
        int A062;
        int BSX;
        int i2 = this.A0B;
        int A072 = AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(BGO(), C18180wK.A03(BGL())));
        if (i2 != 0) {
            boolean BSX2 = BSX();
            i = 1;
            if (BSX2) {
                BSX2 = true;
            }
            int A073 = AnonymousClass0wJ.A07(this.A04, (A072 + (BSX2 ? 1 : 0)) * 31);
            boolean z = this.A08;
            if (z) {
                z = true;
            }
            A062 = AnonymousClass0wJ.A05(this.A00, (A073 + (z ? 1 : 0)) * 31);
            BSX = AnonymousClass0wJ.A06(this.A03);
        } else {
            int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A06, A072));
            boolean z2 = this.A0A;
            i = 1;
            if (z2) {
                z2 = true;
            }
            A062 = (((A052 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31;
            BSX = BSX();
            if (BSX != 0) {
                BSX = 1;
            }
        }
        int i3 = (A062 + BSX) * 31;
        boolean BWz = BWz();
        if (BWz) {
            BWz = true;
        }
        int i4 = (i3 + (BWz ? 1 : 0)) * 31;
        if (!this.A07) {
            i = 0;
        }
        return C18220wO.A06(this.A01, (i4 + i) * 31);
    }

    public KtCSuperShape0S5240000_I2(LineType lineType, C970267q r3, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0B = 1;
        C18190wL.A1S(str, 1, str4);
        C86154wM.A1R(lineType, 7, r3);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = str3;
        this.A09 = z;
        this.A04 = str4;
        this.A08 = z2;
        this.A00 = lineType;
        this.A03 = str5;
        this.A0A = z3;
        this.A07 = z4;
        this.A01 = r3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KtCSuperShape0S5240000_I2(LineType lineType, C970267q r16, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3) {
        this(lineType, r16, str, str2, str3, str4, str5, z, z2, C18240wQ.A1R(i & 256, z3), false);
        this.A0B = 1;
    }
}
