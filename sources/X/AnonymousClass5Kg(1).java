package X;

import com.instagram.api.schemas.CreateModeType;
import java.util.List;

/* renamed from: X.5Kg  reason: invalid class name */
public final class AnonymousClass5Kg extends AnonymousClass0Sf implements C145448kW {
    public final CreateModeType A00;
    public final C90055Ki A01;
    public final C90065Kj A02;
    public final AnonymousClass5N0 A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final AnonymousClass5Kg CyQ(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass5Kg CyR(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Kg) {
                AnonymousClass5Kg r5 = (AnonymousClass5Kg) obj;
                if (!C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A05, r5.A05) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass0wJ.A03(this.A06) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A07(this.A00);
    }

    public AnonymousClass5Kg(CreateModeType createModeType, C90055Ki r2, C90065Kj r3, AnonymousClass5N0 r4, String str, String str2, List list, List list2, List list3) {
        this.A06 = list;
        this.A07 = list2;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A08 = list3;
        this.A03 = r4;
        this.A05 = str2;
        this.A00 = createModeType;
    }
}
