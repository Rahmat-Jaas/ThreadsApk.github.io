package X;

/* renamed from: X.6uB  reason: invalid class name and case insensitive filesystem */
public final class C114946uB {
    public final C115356uv A00;
    public final C115306uq A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114946uB) {
                C114946uB r5 = (C114946uB) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2 = this.A02;
        C115356uv r1 = this.A00;
        String str3 = null;
        if (r1 != null) {
            str = r1.A01;
        } else {
            str = null;
        }
        C115306uq r12 = this.A01;
        if (r12 != null) {
            str3 = r12.A02;
        }
        return C86124wJ.A0I(str2, str, str3);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ECPContactInformation(fullName=");
        A0s.append(this.A02);
        A0s.append(", email=");
        A0s.append(this.A00);
        A0s.append(", phone=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114946uB(C115356uv r1, C115306uq r2, String str) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
