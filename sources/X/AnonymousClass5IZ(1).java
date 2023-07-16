package X;

import java.util.Map;

/* renamed from: X.5IZ  reason: invalid class name */
public final class AnonymousClass5IZ extends AnonymousClass0Sf {
    public static final AnonymousClass5IZ A02 = new AnonymousClass5IZ((C98936Hm) null, AnonymousClass4WJ.A0A());
    public final C98936Hm A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IZ) {
                AnonymousClass5IZ r5 = (AnonymousClass5IZ) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A03(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RpState(rsysAppModel=");
        A0s.append(this.A00);
        A0s.append(", nonRsysStateMap=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public AnonymousClass5IZ(C98936Hm r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public AnonymousClass5IZ() {
        this((C98936Hm) null, AnonymousClass4WJ.A0A());
    }
}
