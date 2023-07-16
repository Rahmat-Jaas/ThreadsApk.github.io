package X;

/* renamed from: X.18s  reason: invalid class name and case insensitive filesystem */
public final class C210518s extends AnonymousClass0Sf implements C144448iW {
    public final BKU A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210518s) {
                C210518s r5 = (C210518s) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String As4() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A01)));
    }

    public C210518s(BKU bku, String str, String str2) {
        AnonymousClass0wJ.A1P(str, bku);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bku;
    }
}
