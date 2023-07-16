package X;

/* renamed from: X.6tG  reason: invalid class name and case insensitive filesystem */
public final class C114416tG {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114416tG) && this.A00 == ((C114416tG) obj).A00);
    }

    public final int hashCode() {
        int A03 = C86134wK.A03(this.A00);
        int floatToIntBits = Float.floatToIntBits(10.0f);
        return ((A03 + floatToIntBits) * 31) + floatToIntBits;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ResistanceConfig(basis=");
        A0s.append(this.A00);
        A0s.append(", factorAtMin=");
        A0s.append(10.0f);
        A0s.append(", factorAtMax=");
        A0s.append(10.0f);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114416tG(float f) {
        this.A00 = f;
    }
}
