package X;

/* renamed from: X.5Lf  reason: invalid class name and case insensitive filesystem */
public final class C90275Lf extends AnonymousClass0Sf implements C146628mY {
    public final C970267q A00;
    public final Object A01 = C100156Mf.A00(this, "hushcontrol");
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90275Lf) {
                C90275Lf r5 = (C90275Lf) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A02, r5.A02) || this.A07 != r5.A07 || this.A06 != r5.A06 || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C90275Lf(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C970267q r0 = C970267q.POST;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = str4;
        this.A00 = r0;
    }

    public final String B2L() {
        return this.A02;
    }

    public final String B7K() {
        return this.A03;
    }

    public final String BGL() {
        return this.A04;
    }

    public final String BGO() {
        return this.A05;
    }

    public final C970267q BIh() {
        return this.A00;
    }

    public final boolean BSX() {
        return this.A07;
    }

    public final boolean BWz() {
        return false;
    }

    public final boolean BZW() {
        return false;
    }

    public final Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A05, C18180wK.A03(this.A04)));
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A072 + (z ? 1 : 0)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return C18220wO.A06(this.A00, (((i2 + i) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31);
    }
}
