package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.3IH  reason: invalid class name */
public final class AnonymousClass3IH {
    public final C109326jp A00;
    public final C109326jp A01;
    public final C109326jp A02;
    public final C109326jp A03;
    public final String A04;
    public final Map A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IH) {
                AnonymousClass3IH r5 = (AnonymousClass3IH) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A01, r5.A01) || this.A07 != r5.A07 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = (((((((((AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A04)) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        if (!this.A08) {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ScopedBloksComponentQueryDefinition(id=");
        A0s.append(this.A04);
        A0s.append(", appIdExpression=");
        A0s.append(this.A00);
        A0s.append(", paramsExpression=");
        A0s.append(this.A03);
        A0s.append(", clientParamsExpression=");
        A0s.append(this.A02);
        A0s.append(", dependencies=");
        A0s.append(this.A06);
        A0s.append(", targets=");
        A0s.append(this.A05);
        A0s.append(", cacheTTLExpression=");
        A0s.append(this.A01);
        A0s.append(", isDiskCacheEnabled=");
        A0s.append(this.A07);
        A0s.append(", isScoped=");
        A0s.append(this.A08);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass3IH(C109326jp r1, C109326jp r2, C109326jp r3, C109326jp r4, String str, Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = r4;
        this.A07 = z;
        this.A08 = z2;
    }
}
