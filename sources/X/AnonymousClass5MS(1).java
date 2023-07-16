package X;

/* renamed from: X.5MS  reason: invalid class name */
public final class AnonymousClass5MS extends AnonymousClass0Sf implements C146348m5 {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public final float BgG(C968666z r3) {
        int i;
        int A04 = C18230wP.A04(r3, 0);
        if (A04 == 0) {
            i = 32;
        } else if (A04 == 1) {
            i = 44;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return (float) i;
    }

    public final C145068jm CVs(C968666z r4) {
        float f;
        int i;
        int A04 = C18230wP.A04(r4, 0);
        if (A04 == 0) {
            f = (float) 16;
            i = 5;
        } else if (A04 == 1) {
            f = (float) 20;
            i = 13;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        float f2 = (float) i;
        return new AnonymousClass7V9(f, f2, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MS) {
                AnonymousClass5MS r8 = (AnonymousClass5MS) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && Float.compare(this.A00, r8.A00) == 0 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long AA7(boolean z) {
        long j = this.A01;
        if (!z) {
            return j;
        }
        return C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), this.A00 * AnonymousClass7KE.A00(j));
    }

    public final long AEL(boolean z) {
        if (z) {
            return this.A02;
        }
        return this.A03;
    }

    public final float AdL() {
        return this.A00;
    }

    public final int hashCode() {
        return C86134wK.A06(C86104wH.A05(C86104wH.A06(C86154wM.A04(this.A01), this.A02), this.A00), this.A03);
    }

    public AnonymousClass5MS(float f, long j, long j2, long j3) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A03 = j3;
    }
}
