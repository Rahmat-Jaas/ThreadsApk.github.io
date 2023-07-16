package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1410000_I2;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5IX  reason: invalid class name */
public final class AnonymousClass5IX extends AnonymousClass0Sf {
    public final KtCSuperShape0S1410000_I2 A00;
    public final KtCSuperShape0S1410000_I2 A01;
    public final C971468c A02;
    public final ImageUrl A03;
    public final C169839tz A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public AnonymousClass5IX(KtCSuperShape0S1410000_I2 ktCSuperShape0S1410000_I2, KtCSuperShape0S1410000_I2 ktCSuperShape0S1410000_I22, C971468c r4, ImageUrl imageUrl, C169839tz r6, Integer num, String str, String str2, String str3, String str4, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C18180wK.A1Q(r4, 1, str);
        C04220Ms.A0B(r6, 7);
        this.A02 = r4;
        this.A0I = z;
        this.A0A = list;
        this.A09 = str;
        this.A03 = imageUrl;
        this.A0J = z2;
        this.A04 = r6;
        this.A0D = z3;
        this.A0B = list2;
        this.A05 = num;
        this.A06 = str2;
        this.A08 = str3;
        this.A0C = list3;
        this.A0H = z4;
        this.A0E = z5;
        this.A0F = z6;
        this.A0G = z7;
        this.A0M = z8;
        this.A07 = str4;
        this.A00 = ktCSuperShape0S1410000_I2;
        this.A01 = ktCSuperShape0S1410000_I22;
        this.A0L = z9;
        this.A0K = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IX) {
                AnonymousClass5IX r5 = (AnonymousClass5IX) obj;
                if (!(this.A02 == r5.A02 && this.A0I == r5.A0I && C04220Ms.A0I(this.A0A, r5.A0A) && C04220Ms.A0I(this.A09, r5.A09) && C04220Ms.A0I(this.A03, r5.A03) && this.A0J == r5.A0J && this.A04 == r5.A04 && this.A0D == r5.A0D && C04220Ms.A0I(this.A0B, r5.A0B) && C04220Ms.A0I(this.A05, r5.A05) && C04220Ms.A0I(this.A06, r5.A06) && C04220Ms.A0I(this.A08, r5.A08) && C04220Ms.A0I(this.A0C, r5.A0C) && this.A0H == r5.A0H && this.A0E == r5.A0E && this.A0F == r5.A0F && this.A0G == r5.A0G && this.A0M == r5.A0M && C04220Ms.A0I(this.A07, r5.A07) && C04220Ms.A0I(this.A00, r5.A00) && C04220Ms.A0I(this.A01, r5.A01) && this.A0L == r5.A0L && this.A0K == r5.A0K)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static List A01(AnonymousClass56Z r0) {
        return ((AnonymousClass5IX) r0.A0E.getValue()).A0B;
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A02);
        boolean z = this.A0I;
        int i = 1;
        if (z) {
            z = true;
        }
        int A072 = (AnonymousClass0wJ.A07(this.A09, AnonymousClass0wJ.A05(this.A0A, (A042 + (z ? 1 : 0)) * 31)) + AnonymousClass0wJ.A03(this.A03)) * 31;
        boolean z2 = this.A0J;
        if (z2) {
            z2 = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A04, (A072 + (z2 ? 1 : 0)) * 31);
        boolean z3 = this.A0D;
        if (z3) {
            z3 = true;
        }
        List list = this.A0B;
        String str = this.A06;
        int A053 = AnonymousClass0wJ.A05(this.A0C, (AnonymousClass0wJ.A07(str, (AnonymousClass0wJ.A05(list, (A052 + (z3 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31);
        boolean z4 = this.A0H;
        if (z4) {
            z4 = true;
        }
        int i2 = (A053 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A0E;
        if (z5) {
            z5 = true;
        }
        int i3 = (i2 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0F;
        if (z6) {
            z6 = true;
        }
        int i4 = (i3 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.A0G;
        if (z7) {
            z7 = true;
        }
        int i5 = (i4 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.A0M;
        if (z8) {
            z8 = true;
        }
        int A062 = (((((((i5 + (z8 ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z9 = this.A0L;
        if (z9) {
            z9 = true;
        }
        int i6 = (A062 + (z9 ? 1 : 0)) * 31;
        if (!this.A0K) {
            i = 0;
        }
        return i6 + i;
    }

    public static /* synthetic */ AnonymousClass5IX A00(KtCSuperShape0S1410000_I2 ktCSuperShape0S1410000_I2, KtCSuperShape0S1410000_I2 ktCSuperShape0S1410000_I22, C971468c r32, AnonymousClass5IX r33, Integer num, String str, String str2, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List list3;
        String str3;
        ImageUrl imageUrl;
        boolean z8;
        C169839tz r5;
        boolean z9;
        boolean z10;
        int i2 = i;
        KtCSuperShape0S1410000_I2 ktCSuperShape0S1410000_I23 = ktCSuperShape0S1410000_I22;
        C971468c r14 = r32;
        boolean z11 = z6;
        boolean z12 = z;
        boolean z13 = z2;
        List list4 = list;
        Integer num2 = num;
        String str4 = str;
        String str5 = str2;
        boolean z14 = z7;
        boolean z15 = z3;
        List list5 = list2;
        boolean z16 = z4;
        boolean z17 = z5;
        KtCSuperShape0S1410000_I2 ktCSuperShape0S1410000_I24 = ktCSuperShape0S1410000_I2;
        String str6 = null;
        AnonymousClass5IX r15 = r33;
        if ((i2 & 1) != 0) {
            r14 = r15.A02;
        }
        if ((i2 & 2) != 0) {
            z12 = r15.A0I;
        }
        if ((i2 & 4) != 0) {
            list3 = r15.A0A;
        } else {
            list3 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = r15.A09;
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            imageUrl = r15.A03;
        } else {
            imageUrl = null;
        }
        if ((i2 & 32) != 0) {
            z8 = r15.A0J;
        } else {
            z8 = false;
        }
        if ((i2 & 64) != 0) {
            r5 = r15.A04;
        } else {
            r5 = null;
        }
        if ((i2 & 128) != 0) {
            z13 = r15.A0D;
        }
        if ((i2 & 256) != 0) {
            list4 = r15.A0B;
        }
        if ((i2 & 512) != 0) {
            num2 = r15.A05;
        }
        if ((i2 & 1024) != 0) {
            str4 = r15.A06;
        }
        if ((i2 & 2048) != 0) {
            str5 = r15.A08;
        }
        if ((i2 & 4096) != 0) {
            list5 = r15.A0C;
        }
        if ((i2 & 8192) != 0) {
            z15 = r15.A0H;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z16 = r15.A0E;
        }
        if ((32768 & i2) != 0) {
            z17 = r15.A0F;
        }
        if ((65536 & i2) != 0) {
            z11 = r15.A0G;
        }
        if ((131072 & i2) != 0) {
            z9 = r15.A0M;
        } else {
            z9 = false;
        }
        if ((262144 & i2) != 0) {
            str6 = r15.A07;
        }
        if ((524288 & i2) != 0) {
            ktCSuperShape0S1410000_I24 = r15.A00;
        }
        if ((1048576 & i2) != 0) {
            ktCSuperShape0S1410000_I23 = r15.A01;
        }
        if ((2097152 & i2) != 0) {
            z10 = r15.A0L;
        } else {
            z10 = false;
        }
        if ((i2 & 4194304) != 0) {
            z14 = r15.A0K;
        }
        C04220Ms.A0B(r14, 0);
        AnonymousClass0wJ.A1Q(list3, str3);
        C18210wN.A1M(r5, 6, list4);
        C04220Ms.A0B(str4, 10);
        C04220Ms.A0B(list5, 12);
        return new AnonymousClass5IX(ktCSuperShape0S1410000_I24, ktCSuperShape0S1410000_I23, r14, imageUrl, r5, num2, str3, str4, str5, str6, list3, list4, list5, z12, z8, z13, z15, z16, z17, z11, z9, z10, z14);
    }
}
