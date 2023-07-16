package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.5Mj  reason: invalid class name and case insensitive filesystem */
public final class C90535Mj extends AnonymousClass0Sf implements C146468mI {
    public final RepostRestrictedReason A00;
    public final BKU A01;
    public final BKU A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final C90535Mj D4U(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90535Mj) {
                C90535Mj r5 = (C90535Mj) obj;
                if (!(this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05 && C04220Ms.A0I(this.A01, r5.A01) && this.A00 == r5.A00 && C04220Ms.A0I(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean AVg() {
        return this.A03;
    }

    public final boolean AVk() {
        return this.A04;
    }

    public final BKU B5g() {
        return this.A01;
    }

    public final RepostRestrictedReason B7L() {
        return this.A00;
    }

    public final BKU B7M() {
        return this.A02;
    }

    public final boolean BXt() {
        return this.A05;
    }

    public final int hashCode() {
        boolean z = this.A03;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (((z ? 1 : 0) * true) + (C86164wN.A1S(this.A04) ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        return ((((((i2 + i) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A02);
    }

    public C90535Mj(RepostRestrictedReason repostRestrictedReason, BKU bku, BKU bku2, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A01 = bku;
        this.A00 = repostRestrictedReason;
        this.A02 = bku2;
    }
}
