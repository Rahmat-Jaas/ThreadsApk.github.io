package X;

/* renamed from: X.86X  reason: invalid class name */
public final class AnonymousClass86X implements C146038lW {
    public final float A00;
    public final float A01;

    public final /* bridge */ /* synthetic */ Comparable Afl() {
        return Float.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ Comparable BDJ() {
        return Float.valueOf(this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass86X)) {
            return false;
        }
        if (!isEmpty() || !((AnonymousClass86X) obj).isEmpty()) {
            AnonymousClass86X r4 = (AnonymousClass86X) obj;
            if (!(this.A01 == r4.A01 && this.A00 == r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return C18180wK.A1X((this.A01 > this.A00 ? 1 : (this.A01 == this.A00 ? 0 : -1)));
    }

    public AnonymousClass86X(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return C86144wL.A03(C86134wK.A03(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A01);
        A0r.append("..");
        A0r.append(this.A00);
        return A0r.toString();
    }
}
