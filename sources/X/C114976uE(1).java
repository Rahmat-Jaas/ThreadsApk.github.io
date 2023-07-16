package X;

/* renamed from: X.6uE  reason: invalid class name and case insensitive filesystem */
public final class C114976uE {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C114976uE(String str, String str2, boolean z) {
        C04220Ms.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114976uE) {
                C114976uE r5 = (C114976uE) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A01));
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return A07 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Item(item=");
        A0s.append(this.A01);
        A0s.append(", hint=");
        A0s.append(this.A00);
        A0s.append(", useDefaultClickHint=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
