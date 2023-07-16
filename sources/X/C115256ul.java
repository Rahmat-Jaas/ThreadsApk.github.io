package X;

import java.util.Map;

/* renamed from: X.6ul  reason: invalid class name and case insensitive filesystem */
public final class C115256ul {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115256ul) {
                C115256ul r5 = (C115256ul) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A06(this.A00) * 31))) + C18200wM.A09(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("VerifyAuthFactor(authType=");
        A0s.append(this.A00);
        A0s.append(", paymentType=");
        A0s.append(this.A01);
        A0s.append(I17.A00(340));
        A0s.append(this.A02);
        A0s.append(", authParam=");
        A0s.append(this.A04);
        A0s.append(", targetAccountId=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115256ul(String str, String str2, String str3, String str4, Map map) {
        AnonymousClass0wJ.A1Q(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = map;
        this.A03 = str4;
    }
}
