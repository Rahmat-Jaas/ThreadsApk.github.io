package X;

import java.util.List;

/* renamed from: X.18X  reason: invalid class name */
public final class AnonymousClass18X extends AnonymousClass0Sf implements C82094p4 {
    public final String A00;
    public final String A01;
    public final List A02;

    public final AnonymousClass18X Czp() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18X) {
                AnonymousClass18X r5 = (AnonymousClass18X) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A02, C18180wK.A03(this.A00)) + AnonymousClass0wJ.A06(this.A01);
    }

    public AnonymousClass18X(String str, String str2, List list) {
        AnonymousClass0wJ.A1O(str, list);
        this.A00 = str;
        this.A02 = list;
        this.A01 = str2;
    }
}
