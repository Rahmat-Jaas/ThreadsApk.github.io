package X;

/* renamed from: X.3VW  reason: invalid class name */
public final class AnonymousClass3VW {
    public String A00;
    public String A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3VW) {
                AnonymousClass3VW r5 = (AnonymousClass3VW) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass3VW() {
        this("", "", "");
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A00)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FxIdentity(identityId=");
        A0s.append(this.A00);
        A0s.append(", identityType=");
        A0s.append(this.A01);
        A0s.append(", obfuscatedId=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass3VW(String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
