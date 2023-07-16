package X;

import java.util.Map;

/* renamed from: X.6tz  reason: invalid class name and case insensitive filesystem */
public final class C114846tz {
    public final Map A00;
    public final AnonymousClass22C A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114846tz) {
                C114846tz r5 = (C114846tz) obj;
                if (this.A01 != r5.A01 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("XpostContentCompatConfigModel(sourceAppName=");
        A0s.append(this.A01);
        A0s.append(", featureConfigMap=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114846tz(AnonymousClass22C r1, Map map) {
        this.A01 = r1;
        this.A00 = map;
    }
}
