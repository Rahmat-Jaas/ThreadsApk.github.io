package X;

import java.util.Map;

/* renamed from: X.6ur  reason: invalid class name and case insensitive filesystem */
public final class C115316ur {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public C115316ur(String str, String str2, String str3, String str4, Map map, boolean z) {
        C04220Ms.A0B(str2, 2);
        this.A03 = str;
        this.A00 = str2;
        this.A05 = z;
        this.A04 = map;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115316ur) {
                C115316ur r5 = (C115316ur) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !"UNKNOWN".equals("UNKNOWN") || this.A05 != r5.A05 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = (AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A03)) + 433141802) * 31;
        boolean z = this.A05;
        if (z) {
            z = true;
        }
        return ((((((((A07 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + 1) * 31) + C18200wM.A09(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("UserInfoForButtonAvailability(securityOriginUrlHost=");
        A0s.append(this.A03);
        A0s.append(", clickSourceOfIAWLink=");
        A0s.append(this.A00);
        A0s.append(", errorCode=");
        A0s.append("UNKNOWN");
        A0s.append(", isButtonGkEnabled=");
        A0s.append(this.A05);
        A0s.append(", additionalInfo=");
        A0s.append(this.A04);
        A0s.append(", sdkFeatureFlags=");
        A0s.append(this.A02);
        C86164wN.A1M(A0s, ", getCardInfoForAwarenessPrompt=");
        A0s.append(", iawAdId=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
