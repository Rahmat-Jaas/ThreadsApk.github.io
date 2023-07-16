package X;

/* renamed from: X.5MW  reason: invalid class name */
public final class AnonymousClass5MW extends AnonymousClass0Sf implements C144678it {
    public final String A00;
    public final boolean A01;

    public /* synthetic */ AnonymousClass5MW(String str, int i) {
        boolean z = (i & 2) != 0;
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MW) {
                AnonymousClass5MW r5 = (AnonymousClass5MW) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean Afe() {
        return this.A01;
    }

    public final int hashCode() {
        return (C18180wK.A03(this.A00) + (C86164wN.A1S(this.A01) ? 1 : 0)) * 31;
    }
}
