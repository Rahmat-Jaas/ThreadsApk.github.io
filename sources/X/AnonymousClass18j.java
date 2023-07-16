package X;

import java.util.List;

/* renamed from: X.18j  reason: invalid class name */
public final class AnonymousClass18j extends AnonymousClass0Sf implements C21553BwH {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final AnonymousClass18j D2L(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass18j D2M(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18j) {
                AnonymousClass18j r5 = (AnonymousClass18j) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A05(this.A03, C18180wK.A03(this.A01)) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A02);
    }

    public AnonymousClass18j(Integer num, String str, String str2, List list) {
        AnonymousClass0wJ.A1O(str, list);
        this.A01 = str;
        this.A03 = list;
        this.A00 = num;
        this.A02 = str2;
    }
}
