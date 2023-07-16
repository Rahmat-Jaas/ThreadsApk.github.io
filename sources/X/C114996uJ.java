package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;

/* renamed from: X.6uJ  reason: invalid class name and case insensitive filesystem */
public final class C114996uJ {
    public final GQLCallInputCInputShape0S0000000 A00;
    public final C120967Dk A01;
    public final C120977Dl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114996uJ) {
                C114996uJ r5 = (C114996uJ) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, (C18210wN.A04(this.A00) + AnonymousClass0wJ.A03(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PaymentComponentPttRequest(saveCredentialInput=");
        A0s.append(this.A00);
        A0s.append(", authTicket=");
        A0s.append(this.A01);
        A0s.append(", pttRequestParam=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C114996uJ(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000, C120967Dk r2, C120977Dl r3) {
        this.A00 = gQLCallInputCInputShape0S0000000;
        this.A01 = r2;
        this.A02 = r3;
    }
}
