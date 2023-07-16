package X;

import java.util.List;

/* renamed from: X.6uN  reason: invalid class name and case insensitive filesystem */
public final class C115026uN {
    public final AnonymousClass69O A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115026uN) {
                C115026uN r5 = (C115026uN) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C115026uN(AnonymousClass69O r3) {
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        C04220Ms.A0B(r3, 1);
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r1;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A00)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FeatureValidationParam(featureId=");
        A0s.append(this.A00);
        A0s.append(", sourceRuleValidationParams=");
        A0s.append(this.A02);
        A0s.append(", destinationRuleValidationParams=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
