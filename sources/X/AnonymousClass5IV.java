package X;

import java.util.List;

/* renamed from: X.5IV  reason: invalid class name */
public final class AnonymousClass5IV extends AnonymousClass0Sf {
    public final ILj A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public AnonymousClass5IV(ILj iLj, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, boolean z) {
        C18210wN.A1M(str, 1, num);
        C04220Ms.A0B(num2, 9);
        this.A05 = str;
        this.A07 = list;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A00 = iLj;
        this.A08 = z;
        this.A02 = num;
        this.A01 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IV) {
                AnonymousClass5IV r5 = (AnonymousClass5IV) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A00, r5.A00) || this.A08 != r5.A08 || this.A02 != r5.A02 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AnonymousClass5IV A00(AnonymousClass5IV r11, ILj iLj, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, int i, boolean z) {
        int i2 = i;
        Integer num3 = num2;
        Integer num4 = num;
        boolean z2 = z;
        ILj iLj2 = iLj;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        List list2 = list;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = r11.A05;
        }
        if ((i & 2) != 0) {
            list2 = r11.A07;
        }
        if ((i & 4) != 0) {
            str7 = r11.A03;
        }
        if ((i & 8) != 0) {
            str6 = r11.A04;
        }
        if ((i & 16) != 0) {
            str5 = r11.A06;
        }
        if ((i & 32) != 0) {
            iLj2 = r11.A00;
        }
        if ((i & 64) != 0) {
            z2 = r11.A08;
        }
        if ((i2 & 128) != 0) {
            num4 = r11.A02;
        }
        if ((i2 & 256) != 0) {
            num3 = r11.A01;
        }
        AnonymousClass0wJ.A1N(str8, list2);
        C18210wN.A1M(num4, 7, num3);
        return new AnonymousClass5IV(iLj2, num4, num3, str8, str7, str6, str5, list2, z2);
    }

    public final int hashCode() {
        String str;
        String str2;
        int A052 = (((((((AnonymousClass0wJ.A05(this.A07, C18180wK.A03(this.A05)) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + C18200wM.A07(this.A00)) * 31;
        boolean z = this.A08;
        if (z) {
            z = true;
        }
        int i = (A052 + (z ? 1 : 0)) * 31;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "IDLE";
        } else {
            str = "SEARCH";
        }
        int A0J = C86124wJ.A0J(str, intValue, i);
        int intValue2 = this.A01.intValue();
        switch (intValue2) {
            case 1:
                str2 = "LOADED";
                break;
            case 2:
                str2 = "LOADING_MORE";
                break;
            default:
                str2 = "LOADING";
                break;
        }
        return A0J + C86144wL.A0B(str2, intValue2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5IV() {
        /*
            r10 = this;
            r1 = 0
            java.lang.String r4 = ""
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            r9 = 1
            java.lang.Integer r2 = X.AnonymousClass006.A00
            r0 = r10
            r3 = r2
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IV.<init>():void");
    }
}
