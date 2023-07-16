package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5MC  reason: invalid class name */
public final class AnonymousClass5MC extends AnonymousClass0Sf implements C144518id {
    public final User A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public AnonymousClass5MC(User user, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, List list) {
        C86114wI.A1I(str3, 5, user);
        this.A04 = str;
        this.A01 = bool;
        this.A05 = str2;
        this.A02 = num;
        this.A06 = str3;
        this.A03 = num2;
        this.A07 = str4;
        this.A08 = list;
        this.A00 = user;
    }

    public final AnonymousClass5MC D3S(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MC) {
                AnonymousClass5MC r5 = (AnonymousClass5MC) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A06;
        return C18220wO.A06(this.A00, (((((AnonymousClass0wJ.A07(str, ((((((AnonymousClass0wJ.A06(this.A04) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + C18200wM.A07(this.A08)) * 31);
    }
}
