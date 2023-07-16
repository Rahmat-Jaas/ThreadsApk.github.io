package X;

import java.util.Map;

/* renamed from: X.1jZ  reason: invalid class name */
public final class AnonymousClass1jZ extends C555933v {
    public final C61323St A00;
    public final Map A01;
    public final AnonymousClass3SZ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jZ(C61323St r2, AnonymousClass3SZ r3, Map map) {
        super(r3);
        C04220Ms.A0B(map, 2);
        this.A00 = r2;
        this.A01 = map;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1jZ) {
                AnonymousClass1jZ r5 = (AnonymousClass1jZ) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A00)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SuccessWithAction(action=");
        A0s.append(this.A00);
        A0s.append(", externalVariables=");
        A0s.append(this.A01);
        A0s.append(", fetchSummaryData=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
