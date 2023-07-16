package X;

import java.util.List;

/* renamed from: X.6un  reason: invalid class name and case insensitive filesystem */
public final class C115276un {
    public final AnonymousClass22C A00;
    public final AnonymousClass680 A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115276un) {
                C115276un r5 = (C115276un) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || this.A01 != r5.A01 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A03(this.A00) * 31);
        return C18220wO.A06(this.A02, (AnonymousClass0wJ.A05(this.A03, A05) + C18200wM.A07(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FeatureConfig(appName=");
        A0s.append(this.A00);
        A0s.append(", surfaces=");
        A0s.append(this.A04);
        A0s.append(", contentTypes=");
        A0s.append(this.A03);
        A0s.append(", behavior=");
        A0s.append(this.A01);
        A0s.append(", additionalEligibilityRules=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C115276un(AnonymousClass22C r1, AnonymousClass680 r2, List list, List list2, List list3) {
        this.A00 = r1;
        this.A04 = list;
        this.A03 = list2;
        this.A01 = r2;
        this.A02 = list3;
    }
}
