package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass6NW;
import X.C04220Ms;
import X.C18200wM;
import X.C86104wH;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class KtCSuperShape0S3310000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final int A07 = 0;

    public KtCSuperShape0S3310000_I2(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, ImageUrl imageUrl, Integer num, String str, String str2, String str3, boolean z) {
        AnonymousClass0wJ.A1Q(str, str2);
        C86104wH.A1P(str3, 4, num);
        this.A01 = imageUrl;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = ktCSuperShape0S2000000_I2;
        this.A06 = z;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S3310000_I2)) {
                return false;
            }
            KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I2 = (KtCSuperShape0S3310000_I2) obj;
            if (ktCSuperShape0S3310000_I2.A07 != 1 || !C04220Ms.A0I(this.A01, ktCSuperShape0S3310000_I2.A01) || !C04220Ms.A0I(this.A00, ktCSuperShape0S3310000_I2.A00) || !C04220Ms.A0I(this.A02, ktCSuperShape0S3310000_I2.A02) || !C04220Ms.A0I(this.A04, ktCSuperShape0S3310000_I2.A04) || !C04220Ms.A0I(this.A05, ktCSuperShape0S3310000_I2.A05) || !C04220Ms.A0I(this.A03, ktCSuperShape0S3310000_I2.A03) || this.A06 != ktCSuperShape0S3310000_I2.A06) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S3310000_I2)) {
                return false;
            }
            KtCSuperShape0S3310000_I2 ktCSuperShape0S3310000_I22 = (KtCSuperShape0S3310000_I2) obj;
            if (ktCSuperShape0S3310000_I22.A07 != 0 || !C04220Ms.A0I(this.A01, ktCSuperShape0S3310000_I22.A01) || !C04220Ms.A0I(this.A05, ktCSuperShape0S3310000_I22.A05) || !C04220Ms.A0I(this.A04, ktCSuperShape0S3310000_I22.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S3310000_I22.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S3310000_I22.A00) || this.A06 != ktCSuperShape0S3310000_I22.A06 || this.A02 != ktCSuperShape0S3310000_I22.A02) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int i;
        int A002;
        int i2 = this.A07;
        int A032 = AnonymousClass0wJ.A03(this.A01);
        if (i2 != 0) {
            i = (((((AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A00, A032 * 31)) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A09(this.A03)) * 31;
            A002 = this.A06;
            if (A002 != 0) {
                A002 = 1;
            }
        } else {
            int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A05, A032 * 31))));
            boolean z = this.A06;
            if (z) {
                z = true;
            }
            i = (A052 + (z ? 1 : 0)) * 31;
            A002 = AnonymousClass6NW.A00((Integer) this.A02);
        }
        return i + A002;
    }

    public KtCSuperShape0S3310000_I2(ImageUrl imageUrl, String str, String str2, String str3, List list, List list2, boolean z) {
        this.A01 = imageUrl;
        this.A00 = list;
        this.A02 = list2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A06 = z;
    }

    public KtCSuperShape0S3310000_I2() {
        this(new KtCSuperShape0S2000000_I2((String) null, (String) null, (DefaultConstructorMarker) null, 3, 16), (ImageUrl) null, AnonymousClass006.A00, "", "", "", false);
    }
}
