package X;

import com.instagram.user.model.User;

/* renamed from: X.16w  reason: invalid class name and case insensitive filesystem */
public final class C209616w extends AnonymousClass0Sf {
    public final long A00;
    public final long A01;
    public final User A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C209616w(User user, Float f, Float f2, String str, String str2, String str3, long j, long j2) {
        C18210wN.A1M(str, 1, str3);
        this.A05 = str;
        this.A06 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = f;
        this.A02 = user;
        this.A04 = f2;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C209616w) {
                C209616w r8 = (C209616w) obj;
                if (!C04220Ms.A0I(this.A05, r8.A05) || !C04220Ms.A0I(this.A06, r8.A06) || this.A00 != r8.A00 || this.A01 != r8.A01 || !C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A02, r8.A02) || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A07, r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return C18210wN.A05(this.A07, (((((((((((C18180wK.A03(this.A05) + AnonymousClass0wJ.A06(this.A06)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A07(this.A04)) * 31);
    }
}
