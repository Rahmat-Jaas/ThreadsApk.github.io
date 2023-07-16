package X;

/* renamed from: X.5Le  reason: invalid class name and case insensitive filesystem */
public final class C90265Le extends AnonymousClass0Sf implements C146628mY {
    public final int A00;
    public final C970267q A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90265Le) {
                C90265Le r5 = (C90265Le) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00 || !"".equals("") || !"".equals("") || !"".equals("") || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C90265Le(String str, String str2, int i) {
        C970267q r0 = C970267q.POST;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = r0;
        this.A02 = AnonymousClass00U.A0S("threadContainerHeader_", str2, i);
    }

    public final String B2L() {
        return "";
    }

    public final String B7K() {
        return "";
    }

    public final String BGL() {
        return this.A04;
    }

    public final String BGO() {
        return "";
    }

    public final C970267q BIh() {
        return this.A01;
    }

    public final boolean BSX() {
        return false;
    }

    public final boolean BWz() {
        return false;
    }

    public final boolean BZW() {
        return false;
    }

    public final Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, (AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A04)) + this.A00) * 31 * 31 * 31 * 31 * 31);
    }
}
