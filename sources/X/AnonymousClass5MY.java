package X;

/* renamed from: X.5MY  reason: invalid class name */
public final class AnonymousClass5MY extends AnonymousClass0Sf implements C144678it {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MY) {
                AnonymousClass5MY r5 = (AnonymousClass5MY) obj;
                if (!(C04220Ms.A0I(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass5MY(Integer num, String str, int i, int i2) {
        num = (i2 & 4) != 0 ? AnonymousClass006.A00 : num;
        boolean A1V = C18180wK.A1V(i2 & 8);
        C18180wK.A1P(str, 1, num);
        this.A02 = str;
        this.A00 = i;
        this.A01 = num;
        this.A03 = A1V;
    }

    public final boolean Afe() {
        return this.A03;
    }

    public final int hashCode() {
        String str;
        int A032 = (C18180wK.A03(this.A02) + this.A00) * 31;
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "START";
        } else {
            str = "END";
        }
        return (C86124wJ.A0J(str, intValue, A032) + (C86164wN.A1S(this.A03) ? 1 : 0)) * 31;
    }
}
