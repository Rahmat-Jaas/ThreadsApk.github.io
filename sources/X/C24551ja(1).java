package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.1ja  reason: invalid class name and case insensitive filesystem */
public final class C24551ja extends C555933v {
    public final C121997Jj A00;
    public final AnonymousClass3SZ A01;
    public final List A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24551ja(C121997Jj r3, AnonymousClass3SZ r4) {
        super(r4);
        C04220Ms.A0B(r4, 2);
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        AnonymousClass4To A002 = AnonymousClass4To.A00();
        this.A00 = r3;
        this.A02 = r1;
        this.A03 = A002;
        this.A01 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24551ja) {
                C24551ja r5 = (C24551ja) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A00))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Success(data=");
        A0s.append(this.A00);
        A0s.append(", actions=");
        A0s.append(this.A02);
        A0s.append(", externalVariables=");
        A0s.append(this.A03);
        A0s.append(", fetchSummaryData=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
