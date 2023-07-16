package X;

/* renamed from: X.5Ks  reason: invalid class name and case insensitive filesystem */
public final class C90155Ks extends AnonymousClass0Sf implements C145458kX {
    public final AnonymousClass5KU A00;
    public final C90135Kq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90155Ks) {
                C90155Ks r5 = (C90155Ks) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C145888lH AWt() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C27954Ew4 B1z() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public C90155Ks(AnonymousClass5KU r1, C90135Kq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
