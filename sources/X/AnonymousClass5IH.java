package X;

import com.instagram.api.schemas.ProfileTheme;
import java.util.List;

/* renamed from: X.5IH  reason: invalid class name */
public final class AnonymousClass5IH extends AnonymousClass0Sf {
    public final ProfileTheme A00;
    public final AnonymousClass676 A01;
    public final Integer A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public AnonymousClass5IH(ProfileTheme profileTheme, AnonymousClass676 r3, Integer num, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C18240wQ.A1J(num, 1, r3);
        this.A02 = num;
        this.A08 = z;
        this.A03 = list;
        this.A00 = profileTheme;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A09 = z5;
        this.A04 = z6;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IH) {
                AnonymousClass5IH r5 = (AnonymousClass5IH) obj;
                if (!(this.A02 == r5.A02 && this.A08 == r5.A08 && C04220Ms.A0I(this.A03, r5.A03) && C04220Ms.A0I(this.A00, r5.A00) && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A07 == r5.A07 && this.A09 == r5.A09 && this.A04 == r5.A04 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = C101716Si.A00(this.A02) * 31;
        boolean z = this.A08;
        int i = 1;
        if (z) {
            z = true;
        }
        int A052 = (AnonymousClass0wJ.A05(this.A03, (A002 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31;
        boolean z2 = this.A06;
        if (z2) {
            z2 = true;
        }
        int i2 = (A052 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A05;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A07;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A09;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        if (!this.A04) {
            i = 0;
        }
        return C18220wO.A06(this.A01, (i5 + i) * 31);
    }

    public AnonymousClass5IH() {
        this((ProfileTheme) null, AnonymousClass676.Theme, AnonymousClass006.A00, AnonymousClass0ZV.A00, false, false, false, false, false, false);
    }
}
