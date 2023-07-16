package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.172  reason: invalid class name */
public final class AnonymousClass172 extends AnonymousClass0Sf {
    public final User A00;
    public final Boolean A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass172) {
                AnonymousClass172 r5 = (AnonymousClass172) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A0B, r5.A0B) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A0C, r5.A0C) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A0A)) * 31) + AnonymousClass0wJ.A03(this.A0B)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A0C)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + C18200wM.A07(this.A02);
    }

    public AnonymousClass172(User user, Boolean bool, Float f, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4) {
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = bool;
        this.A09 = list;
        this.A0A = list2;
        this.A0B = list3;
        this.A07 = str5;
        this.A0C = list4;
        this.A00 = user;
        this.A08 = str6;
        this.A02 = f;
    }
}
