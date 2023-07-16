package X;

/* renamed from: X.18O  reason: invalid class name */
public final class AnonymousClass18O extends AnonymousClass0Sf implements C84024sQ {
    public final AnonymousClass18S A00;
    public final AnonymousClass18T A01;

    public final AnonymousClass18O Cya() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18O) {
                AnonymousClass18O r5 = (AnonymousClass18O) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C84044sS AsG() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C84524tI AsH() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass18O(AnonymousClass18S r1, AnonymousClass18T r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
