package X;

import com.instagram.api.schemas.ShowreelNativeClientName;
import java.util.List;

/* renamed from: X.18f  reason: invalid class name */
public final class AnonymousClass18f extends AnonymousClass0Sf implements C82124p7 {
    public final ShowreelNativeClientName A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public AnonymousClass18f(ShowreelNativeClientName showreelNativeClientName, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        C04220Ms.A0B(str, 1);
        C18180wK.A1R(showreelNativeClientName, str2);
        C04220Ms.A0B(str4, 8);
        this.A03 = str;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = showreelNativeClientName;
        this.A04 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = num2;
    }

    public final AnonymousClass18f D0c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18f) {
                AnonymousClass18f r5 = (AnonymousClass18f) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A08, r5.A08) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A00, (((C18180wK.A03(this.A03) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31);
        return AnonymousClass0wJ.A07(this.A06, (((AnonymousClass0wJ.A07(this.A04, A052) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A07(this.A02);
    }
}
