package X;

import java.util.Map;

/* renamed from: X.3IA  reason: invalid class name */
public final class AnonymousClass3IA {
    public final Boolean A00;
    public final String A01;
    public final Map A02;
    public final Map A03;

    public AnonymousClass3IA(Boolean bool, String str, Map map, Map map2) {
        C04220Ms.A0B(map, 1);
        this.A03 = map;
        this.A01 = str;
        this.A02 = map2;
        this.A00 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IA) {
                AnonymousClass3IA r5 = (AnonymousClass3IA) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((C18210wN.A04(this.A03) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A07(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ScreenConfig(props=");
        A0s.append(this.A03);
        A0s.append(", analyticsModule=");
        A0s.append(this.A01);
        A0s.append(", analyticsExtras=");
        A0s.append(this.A02);
        A0s.append(", animatedOnNavigation=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
