package X;

import com.instagram.user.model.User;

/* renamed from: X.16m  reason: invalid class name and case insensitive filesystem */
public final class C208816m extends AnonymousClass0Sf {
    public final int A00;
    public final AnonymousClass5HW A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C208816m) {
                C208816m r5 = (C208816m) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || this.A04 != r5.A04 || !C04220Ms.A0I(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A03, C18210wN.A04(this.A01));
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        return AnonymousClass0wJ.A05(this.A02, (A07 + (z ? 1 : 0)) * 31) + this.A00;
    }

    public C208816m(AnonymousClass5HW r2, User user, String str, int i, boolean z) {
        AnonymousClass0wJ.A1O(r2, str);
        C04220Ms.A0B(user, 4);
        this.A01 = r2;
        this.A03 = str;
        this.A04 = z;
        this.A02 = user;
        this.A00 = i;
    }
}
