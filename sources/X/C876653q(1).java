package X;

import java.util.List;

/* renamed from: X.53q  reason: invalid class name and case insensitive filesystem */
public final class C876653q extends C876753r {
    public final long A00;
    public final long A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C876653q) {
                C876653q r8 = (C876653q) obj;
                if (!(C04220Ms.A0I(this.A02, r8.A02) && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86104wH.A06(C86104wH.A06(C18210wN.A04(this.A02) * 31, this.A01), this.A00);
    }

    public final String toString() {
        String str;
        long j = this.A01;
        String str2 = "";
        if (AnonymousClass7FN.A03(j)) {
            StringBuilder A0s = C18190wL.A0s("start=");
            C86164wN.A14(j, A0s);
            str = C18180wK.A0i(", ", A0s);
        } else {
            str = str2;
        }
        long j2 = this.A00;
        if (AnonymousClass7FN.A03(j2)) {
            StringBuilder A0s2 = C18190wL.A0s("end=");
            C86164wN.A14(j2, A0s2);
            str2 = C18180wK.A0i(", ", A0s2);
        }
        StringBuilder A0s3 = C18190wL.A0s("LinearGradient(colors=");
        A0s3.append(this.A02);
        A0s3.append(", stops=");
        A0s3.append((Object) null);
        C18230wP.A1S(", ", str, str2, A0s3);
        A0s3.append("tileMode=");
        return C86104wH.A0y("Clamp", A0s3);
    }

    public C876653q(List list, long j, long j2) {
        this.A02 = list;
        this.A01 = j;
        this.A00 = j2;
    }
}
