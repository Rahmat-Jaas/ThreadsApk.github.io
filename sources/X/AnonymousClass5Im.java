package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.5Im  reason: invalid class name */
public final class AnonymousClass5Im extends AnonymousClass0Sf {
    public final KtCSuperShape0S2000000_I2 A00;
    public final AnonymousClass6NY A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final List A07;

    public static /* synthetic */ AnonymousClass5Im A00(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, AnonymousClass5Im r11, AnonymousClass6NY r12, Integer num, String str, String str2, String str3, int i, boolean z) {
        Integer num2 = num;
        boolean z2 = z;
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I22 = ktCSuperShape0S2000000_I2;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        AnonymousClass6NY r3 = r12;
        List list = null;
        int i2 = i;
        if ((i & 1) != 0) {
            r3 = r11.A01;
        }
        if ((i & 2) != 0) {
            str6 = r11.A05;
        }
        if ((i & 4) != 0) {
            str5 = r11.A04;
        }
        if ((i & 8) != 0) {
            str4 = r11.A03;
        }
        if ((i & 16) != 0) {
            list = r11.A07;
        }
        if ((i & 32) != 0) {
            ktCSuperShape0S2000000_I22 = r11.A00;
        }
        if ((i & 64) != 0) {
            z2 = r11.A06;
        }
        if ((i2 & 128) != 0) {
            num2 = r11.A02;
        }
        AnonymousClass0wJ.A1N(r3, str6);
        AnonymousClass0wJ.A1Q(str5, str4);
        C18190wL.A1S(list, 4, ktCSuperShape0S2000000_I22);
        C04220Ms.A0B(num2, 7);
        return new AnonymousClass5Im(ktCSuperShape0S2000000_I22, r3, num2, str6, str5, str4, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Im) {
                AnonymousClass5Im r5 = (AnonymousClass5Im) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A00, r5.A00) || this.A06 != r5.A06 || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A01(String str, C86074wE r18) {
        C86074wE r6 = r18;
        Object value = r6.getValue();
        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
        AnonymousClass5Im r9 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
        String str2 = r9.A00.A00;
        C04220Ms.A0B(str2, 1);
        return r6.ADi(value, new KtCSuperShape0S0130000_I2(A00(new KtCSuperShape0S2000000_I2(str, str2, 16), r9, (AnonymousClass6NY) null, (Integer) null, (String) null, (String) null, (String) null, 223, false), ktCSuperShape0S0130000_I2.A03, ktCSuperShape0S0130000_I2.A02, ktCSuperShape0S0130000_I2.A01));
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A07, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A05, C18210wN.A04(this.A01))))));
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return ((A052 + (z ? 1 : 0)) * 31) + AnonymousClass6NW.A00(this.A02);
    }

    public AnonymousClass5Im(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, AnonymousClass6NY r3, Integer num, String str, String str2, String str3, List list, boolean z) {
        AnonymousClass0wJ.A1Q(str, str2);
        C18230wP.A1R(str3, 4, ktCSuperShape0S2000000_I2);
        C04220Ms.A0B(num, 8);
        this.A01 = r3;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A07 = list;
        this.A00 = ktCSuperShape0S2000000_I2;
        this.A06 = z;
        this.A02 = num;
    }

    public AnonymousClass5Im() {
        this(new KtCSuperShape0S2000000_I2((String) null, (String) null, (DefaultConstructorMarker) null, 3, 16), AnonymousClass5wP.A00, AnonymousClass006.A00, "", "", "", AnonymousClass0ZV.A00, false);
    }
}
