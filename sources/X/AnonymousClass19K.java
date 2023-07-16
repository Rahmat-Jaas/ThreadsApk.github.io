package X;

import java.util.List;

/* renamed from: X.19K  reason: invalid class name */
public final class AnonymousClass19K extends AnonymousClass0Sf implements C81454np {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public AnonymousClass19K(String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, boolean z) {
        C04220Ms.A0B(str, 1);
        C18180wK.A1S(str5, list, list2);
        C18240wQ.A1J(list3, 9, list4);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A09 = z;
        this.A00 = str5;
        this.A08 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A07 = list4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19K) {
                AnonymousClass19K r5 = (AnonymousClass19K) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || this.A09 != r5.A09 || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A032 = (((((C18180wK.A03(this.A01) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A09(this.A04)) * 31;
        boolean z = this.A09;
        if (z) {
            z = true;
        }
        return C18220wO.A06(this.A07, AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A05(this.A06, AnonymousClass0wJ.A05(this.A08, AnonymousClass0wJ.A07(this.A00, (A032 + (z ? 1 : 0)) * 31)))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DogfoodingAssistantSession(id=");
        A0s.append(this.A01);
        A0s.append(", name=");
        A0s.append(this.A03);
        A0s.append(", minAppVersion=");
        A0s.append(this.A02);
        A0s.append(", tag=");
        A0s.append(this.A04);
        A0s.append(", isOverridingAll=");
        A0s.append(this.A09);
        A0s.append(", currentVariantName=");
        A0s.append(this.A00);
        A0s.append(", variantNames=");
        A0s.append(this.A08);
        A0s.append(", currentLauncherParams=");
        A0s.append(this.A06);
        A0s.append(", currentGkNames=");
        A0s.append(this.A05);
        A0s.append(", currentQeNames=");
        A0s.append(this.A07);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
