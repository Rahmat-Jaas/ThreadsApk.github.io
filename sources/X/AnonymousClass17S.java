package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.17S  reason: invalid class name */
public final class AnonymousClass17S extends AnonymousClass0Sf {
    public final KtCSuperShape0S1200000_I2 A00;
    public final KtCSuperShape1S0200000_I2_1 A01;
    public final AnonymousClass22M A02;
    public final Venue A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public AnonymousClass17S() {
        this(new KtCSuperShape0S1200000_I2((C26743EUq) null, (ImageUrl) null, (String) null, (DefaultConstructorMarker) null, 7, 13), (KtCSuperShape1S0200000_I2_1) null, AnonymousClass22M.UNINITIALIZED, (Venue) null, "", "", (String) null, AnonymousClass0ZV.A00, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass17S) {
                AnonymousClass17S r5 = (AnonymousClass17S) obj;
                if (!C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A03, r5.A03) || this.A08 != r5.A08 || this.A09 != r5.A09 || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02 || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AnonymousClass17S A00(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1, AnonymousClass22M r11, AnonymousClass17S r12, Venue venue, String str, String str2, String str3, List list, int i, boolean z, boolean z2) {
        int i2 = i;
        String str4 = str3;
        AnonymousClass22M r4 = r11;
        KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_12 = ktCSuperShape1S0200000_I2_1;
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I22 = ktCSuperShape0S1200000_I2;
        List list2 = list;
        boolean z3 = z2;
        boolean z4 = z;
        Venue venue2 = venue;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = r12.A06;
        }
        if ((i & 2) != 0) {
            str5 = r12.A05;
        }
        if ((i & 4) != 0) {
            venue2 = r12.A03;
        }
        if ((i & 8) != 0) {
            z4 = r12.A08;
        }
        if ((i & 16) != 0) {
            z3 = r12.A09;
        }
        if ((i & 32) != 0) {
            list2 = r12.A07;
        }
        if ((i & 64) != 0) {
            ktCSuperShape0S1200000_I22 = r12.A00;
        }
        if ((i2 & 128) != 0) {
            ktCSuperShape1S0200000_I2_12 = r12.A01;
        }
        if ((i2 & 256) != 0) {
            r4 = r12.A02;
        }
        if ((i2 & 512) != 0) {
            str4 = r12.A04;
        }
        AnonymousClass0wJ.A1N(str6, str5);
        C04220Ms.A0B(list2, 5);
        C18210wN.A1M(ktCSuperShape0S1200000_I22, 6, r4);
        return new AnonymousClass17S(ktCSuperShape0S1200000_I22, ktCSuperShape1S0200000_I2_12, r4, venue2, str6, str5, str4, list2, z4, z3);
    }

    public final int hashCode() {
        int A072 = (AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A06)) + AnonymousClass0wJ.A03(this.A03)) * 31;
        boolean z = this.A08;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        if (!this.A09) {
            i = 0;
        }
        int A052 = AnonymousClass0wJ.A05(this.A07, (i2 + i) * 31);
        return AnonymousClass0wJ.A05(this.A02, (AnonymousClass0wJ.A05(this.A00, A052) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A09(this.A04);
    }

    public AnonymousClass17S(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1, AnonymousClass22M r4, Venue venue, String str, String str2, String str3, List list, boolean z, boolean z2) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(r4, 9);
        this.A06 = str;
        this.A05 = str2;
        this.A03 = venue;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = list;
        this.A00 = ktCSuperShape0S1200000_I2;
        this.A01 = ktCSuperShape1S0200000_I2_1;
        this.A02 = r4;
        this.A04 = str3;
    }
}
