package X;

import com.fbpay.w3c.CardDetails;

/* renamed from: X.6ue  reason: invalid class name and case insensitive filesystem */
public final class C115186ue {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass771 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115186ue) {
                C115186ue r8 = (C115186ue) obj;
                if (!C04220Ms.A0I(this.A00, r8.A00) || !C04220Ms.A0I(this.A03, r8.A03) || this.A01 != r8.A01 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86104wH.A06(((AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A03)) * 31, this.A01), this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DemaskResults(cardDetails=");
        A0s.append(this.A00);
        A0s.append(", failure=");
        A0s.append(this.A03);
        A0s.append(", timeInMs=");
        A0s.append(this.A01);
        A0s.append(", timeInMsForBindCard=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115186ue(CardDetails cardDetails, AnonymousClass771 r2, long j, long j2) {
        this.A00 = cardDetails;
        this.A03 = r2;
        this.A01 = j;
        this.A02 = j2;
    }
}
