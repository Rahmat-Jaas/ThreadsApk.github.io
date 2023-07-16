package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.1pG  reason: invalid class name */
public final class AnonymousClass1pG extends AnonymousClass2O9 {
    public C57943Dd A00;
    public final KtCSuperShape0S0210000_I2 A01;
    public final KtCSuperShape0S0400000_I2 A02;
    public final C81474nr A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1pG) {
                AnonymousClass1pG r5 = (AnonymousClass1pG) obj;
                if (!C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A0B, r5.A0B) || !C04220Ms.A0I(this.A0D, r5.A0D) || !C04220Ms.A0I(this.A00, r5.A00) || this.A0E != r5.A0E || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A0C, r5.A0C) || this.A0F != r5.A0F) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A07));
        int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A0D, AnonymousClass0wJ.A05(this.A0B, (((((AnonymousClass0wJ.A05(this.A09, A072) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31)));
        boolean z = this.A0E;
        int i = 1;
        if (z) {
            z = true;
        }
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = this.A01;
        int A053 = AnonymousClass0wJ.A05(this.A0C, AnonymousClass0wJ.A05(this.A0A, AnonymousClass0wJ.A05(this.A03, (AnonymousClass0wJ.A05(ktCSuperShape0S0210000_I2, (A052 + (z ? 1 : 0)) * 31) + C18200wM.A07(this.A02)) * 31)));
        if (!this.A0F) {
            i = 0;
        }
        return A053 + i;
    }

    public /* synthetic */ AnonymousClass1pG(KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2, KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2, C57943Dd r25, C81474nr r26, Integer num, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, int i, boolean z, boolean z2) {
        KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I22 = ktCSuperShape0S0400000_I2;
        C81474nr r2 = r26;
        C57943Dd r4 = r25;
        Integer num2 = num;
        int i2 = i;
        List list6 = list4;
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I22 = ktCSuperShape0S0210000_I2;
        List list7 = list5;
        List list8 = list2;
        String str5 = str4;
        String str6 = str3;
        List list9 = list3;
        List list10 = (i & 4) != 0 ? AnonymousClass0ZV.A00 : list;
        str6 = (i & 8) != 0 ? null : str6;
        str5 = (i & 16) != 0 ? null : str5;
        num2 = (i & 32) != 0 ? null : num2;
        list8 = (i & 64) != 0 ? AnonymousClass0ZV.A00 : list8;
        list9 = (i2 & 128) != 0 ? AnonymousClass0ZV.A00 : list9;
        r4 = (i2 & 256) != 0 ? AnonymousClass2LU.A00("") : r4;
        boolean A1R = C18240wQ.A1R(i2 & 512, z);
        ktCSuperShape0S0210000_I22 = (i2 & 1024) != 0 ? new KtCSuperShape0S0210000_I2((C57943Dd) null, (C170019uI) null, (DefaultConstructorMarker) null, 7, 9, false) : ktCSuperShape0S0210000_I22;
        ktCSuperShape0S0400000_I22 = (i2 & 2048) != 0 ? null : ktCSuperShape0S0400000_I22;
        r2 = (i2 & 4096) != 0 ? AnonymousClass4CB.A00 : r2;
        list6 = (i2 & 8192) != 0 ? AnonymousClass0ZV.A00 : list6;
        list7 = (i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? AnonymousClass0ZV.A00 : list7;
        boolean A1R2 = C18240wQ.A1R(i & 32768, z2);
        C18210wN.A1M(list8, 7, list9);
        C04220Ms.A0B(r2, 13);
        C04220Ms.A0B(list6, 14);
        this.A07 = str;
        this.A05 = str2;
        this.A09 = list10;
        this.A06 = str6;
        this.A08 = str5;
        this.A04 = num2;
        this.A0B = list8;
        this.A0D = list9;
        this.A00 = r4;
        this.A0E = A1R;
        this.A01 = ktCSuperShape0S0210000_I22;
        this.A02 = ktCSuperShape0S0400000_I22;
        this.A03 = r2;
        this.A0A = list6;
        this.A0C = list7;
        this.A0F = A1R2;
    }
}
