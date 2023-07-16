package X;

/* renamed from: X.79i  reason: invalid class name and case insensitive filesystem */
public final class C1202379i {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1202379i) {
                C1202379i r5 = (C1202379i) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A06(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ServerKeyQuery(targetAccountId=");
        A0s.append(this.A03);
        A0s.append(", otcSessionId=");
        A0s.append(this.A00);
        A0s.append(", otcType=");
        A0s.append(this.A01);
        A0s.append(", receiverId=");
        A0s.append(this.A02);
        A0s.append(", paymentType=");
        A0s.append((String) null);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C1202379i(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public C1202379i() {
        this((String) null, (String) null, (String) null, (String) null);
    }
}
