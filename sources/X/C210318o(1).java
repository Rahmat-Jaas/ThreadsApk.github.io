package X;

import com.instagram.api.schemas.XFBYPRequestStatus;

/* renamed from: X.18o  reason: invalid class name and case insensitive filesystem */
public final class C210318o extends AnonymousClass0Sf implements C84454tA {
    public final XFBYPRequestStatus A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C210318o D2t() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210318o) {
                C210318o r5 = (C210318o) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AcN() {
        return this.A02;
    }

    public final Integer Akw() {
        return this.A01;
    }

    public final XFBYPRequestStatus BDh() {
        return this.A00;
    }

    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A02) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A07(this.A00);
    }

    public C210318o(XFBYPRequestStatus xFBYPRequestStatus, Integer num, String str, String str2) {
        this.A02 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A00 = xFBYPRequestStatus;
    }
}
