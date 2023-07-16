package X;

/* renamed from: X.5Mb  reason: invalid class name and case insensitive filesystem */
public final class C90455Mb extends AnonymousClass0Sf implements C145948lN {
    public final String A00;
    public final String A01;

    public final C90455Mb D3a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90455Mb) {
                C90455Mb r5 = (C90455Mb) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AYO() {
        return this.A00;
    }

    public final String AYQ() {
        return this.A01;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public C90455Mb(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
