package X;

import com.instagram.user.model.User;

/* renamed from: X.5L2  reason: invalid class name */
public final class AnonymousClass5L2 extends AnonymousClass0Sf implements C145468kY {
    public final long A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final AnonymousClass5L2 D0L(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass5L2 D0M(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5L2) {
                AnonymousClass5L2 r8 = (AnonymousClass5L2) obj;
                if (!C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A04, r8.A04) || this.A00 != r8.A00 || !C04220Ms.A0I(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C86104wH.A06(AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A06(this.A02) * 31)), this.A00));
    }

    public AnonymousClass5L2(User user, String str, String str2, String str3, long j) {
        AnonymousClass0wJ.A1Q(str2, str3);
        C04220Ms.A0B(user, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A01 = user;
    }
}
