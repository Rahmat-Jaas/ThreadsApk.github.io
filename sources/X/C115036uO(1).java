package X;

import java.util.List;

/* renamed from: X.6uO  reason: invalid class name and case insensitive filesystem */
public final class C115036uO {
    public final AnonymousClass69O A00;
    public final AnonymousClass680 A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115036uO) {
                C115036uO r5 = (C115036uO) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C04220Ms.A0I(this.A02, r5.A02))) {
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
        StringBuilder A0s = C18190wL.A0s("FeatureValidationResult(featureId=");
        A0s.append(this.A00);
        A0s.append(", behavior=");
        A0s.append(this.A01);
        A0s.append(", failedRules=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C115036uO(AnonymousClass69O r1, AnonymousClass680 r2, List list) {
        AnonymousClass0wJ.A1O(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
    }
}
