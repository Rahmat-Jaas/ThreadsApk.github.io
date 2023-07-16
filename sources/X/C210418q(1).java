package X;

/* renamed from: X.18q  reason: invalid class name and case insensitive filesystem */
public final class C210418q extends AnonymousClass0Sf implements C144438iV {
    public final Integer A00;
    public final String A01;

    public C210418q(String str, Integer num) {
        C04220Ms.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210418q) {
                C210418q r5 = (C210418q) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return "build_info_row";
    }

    public final int hashCode() {
        String str;
        int A03 = C18180wK.A03(this.A01);
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "NEW";
                break;
            case 1:
                str = "STALE";
                break;
            default:
                str = "OLD";
                break;
        }
        return A03 + str.hashCode() + intValue;
    }
}
