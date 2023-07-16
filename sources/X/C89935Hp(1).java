package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Hp  reason: invalid class name and case insensitive filesystem */
public final class C89935Hp extends AnonymousClass0Sf {
    public final double A00;
    public final int A01;
    public final int A02;
    public final KtCSuperShape0S3200000_I2 A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final AnonymousClass8s2 A0B;
    public final AnonymousClass8s2 A0C;
    public final AnonymousClass8s2 A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C89935Hp(KtCSuperShape0S3200000_I2 ktCSuperShape0S3200000_I2, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass8s2 r10, AnonymousClass8s2 r11, AnonymousClass8s2 r12, double d, int i, int i2, boolean z, boolean z2, boolean z3) {
        C18190wL.A1S(str3, 4, str4);
        C86154wM.A1R(str5, 8, r10);
        this.A07 = str;
        this.A08 = str2;
        this.A04 = imageUrl;
        this.A0A = str3;
        this.A09 = str4;
        this.A0F = z;
        this.A00 = d;
        this.A05 = str5;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = r10;
        this.A0G = z2;
        this.A0C = r11;
        this.A03 = ktCSuperShape0S3200000_I2;
        this.A0E = z3;
        this.A06 = str6;
        this.A0B = r12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89935Hp) {
                C89935Hp r7 = (C89935Hp) obj;
                if (!C04220Ms.A0I(this.A07, r7.A07) || !C04220Ms.A0I(this.A08, r7.A08) || !C04220Ms.A0I(this.A04, r7.A04) || !C04220Ms.A0I(this.A0A, r7.A0A) || !C04220Ms.A0I(this.A09, r7.A09) || this.A0F != r7.A0F || Double.compare(this.A00, r7.A00) != 0 || !C04220Ms.A0I(this.A05, r7.A05) || this.A02 != r7.A02 || this.A01 != r7.A01 || !C04220Ms.A0I(this.A0D, r7.A0D) || this.A0G != r7.A0G || !C04220Ms.A0I(this.A0C, r7.A0C) || !C04220Ms.A0I(this.A03, r7.A03) || this.A0E != r7.A0E || !C04220Ms.A0I(this.A06, r7.A06) || !C04220Ms.A0I(this.A0B, r7.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A07(this.A0A, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A07(this.A08, C18180wK.A03(this.A07)))));
        boolean z = this.A0F;
        int i = 1;
        if (z) {
            z = true;
        }
        int A062 = C86104wH.A06((A072 + (z ? 1 : 0)) * 31, Double.doubleToLongBits(this.A00));
        int A052 = AnonymousClass0wJ.A05(this.A0D, (((AnonymousClass0wJ.A07(this.A05, A062) + this.A02) * 31) + this.A01) * 31);
        boolean z2 = this.A0G;
        if (z2) {
            z2 = true;
        }
        int A053 = (AnonymousClass0wJ.A05(this.A0C, (A052 + (z2 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31;
        if (!this.A0E) {
            i = 0;
        }
        return ((((A053 + i) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + C18200wM.A07(this.A0B);
    }
}
