package X;

/* renamed from: X.5M1  reason: invalid class name */
public final class AnonymousClass5M1 extends AnonymousClass0Sf implements AnonymousClass8iU {
    public final C89905Hm A00;
    public final Integer A01;
    public final String A02;
    public final Object A03;

    public AnonymousClass5M1(C89905Hm r2, Integer num, String str) {
        C18180wK.A1P(str, 1, r2);
        this.A02 = str;
        this.A01 = num;
        this.A00 = r2;
        this.A03 = AnonymousClass00U.A0L("SearchResult_", str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M1) {
                AnonymousClass5M1 r5 = (AnonymousClass5M1) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || this.A01 != r5.A01 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        String str;
        int A032 = C18180wK.A03(this.A02);
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "RECENT_SEARCH";
                break;
            case 2:
                str = "RECOMMENDED";
                break;
            default:
                str = "TYPEAHEAD";
                break;
        }
        return C18220wO.A06(this.A00, C86124wJ.A0J(str, intValue, A032));
    }
}
