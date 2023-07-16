package X;

/* renamed from: X.7ZI  reason: invalid class name */
public final class AnonymousClass7ZI implements C147168nV {
    public final float A00;
    public final float A01;

    public final /* synthetic */ int CfL(float f) {
        return AnonymousClass7FU.A01(this, f);
    }

    public final /* synthetic */ float CxE(int i) {
        return C147168nV.A00(this, (float) i);
    }

    public final /* synthetic */ long CxF(long j) {
        return AnonymousClass7FU.A02(this, j);
    }

    public final /* synthetic */ float CxK(long j) {
        return AnonymousClass7FU.A00(this, j);
    }

    public final /* synthetic */ long D7K(long j) {
        return AnonymousClass7FU.A03(this, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZI) {
                AnonymousClass7ZI r5 = (AnonymousClass7ZI) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float Acr() {
        return this.A00;
    }

    public final float AjK() {
        return this.A01;
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A00), this.A01);
    }

    public final String toString() {
        return AnonymousClass00U.A0O("DensityImpl(density=", C18170wI.A00(543), ')', this.A00, this.A01);
    }

    public AnonymousClass7ZI(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* synthetic */ int CfK(long j) {
        return C147168nV.A01(this, j);
    }

    public final /* synthetic */ float CxD(float f) {
        return C147168nV.A00(this, f);
    }

    public final /* synthetic */ float CxL(float f) {
        return f * Acr();
    }
}
