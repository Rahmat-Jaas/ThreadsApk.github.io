package X;

/* renamed from: X.5I3  reason: invalid class name */
public final class AnonymousClass5I3 extends AnonymousClass0Sf {
    public static final AnonymousClass5I3 A02 = new AnonymousClass5I3((float) 32, (float) 16);
    public static final AnonymousClass5I3 A03 = new AnonymousClass5I3((float) 26, (float) 12);
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I3) {
                AnonymousClass5I3 r5 = (AnonymousClass5I3) obj;
                if (!C18180wK.A1W(Float.compare(this.A01, r5.A01)) || !C18180wK.A1W(Float.compare(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A01), this.A00);
    }

    public AnonymousClass5I3(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
