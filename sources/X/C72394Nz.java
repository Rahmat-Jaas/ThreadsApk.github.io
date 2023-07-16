package X;

/* renamed from: X.4Nz  reason: invalid class name and case insensitive filesystem */
public final class C72394Nz implements Comparable {
    public int A00;
    public final float[] A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C72394Nz r3 = (C72394Nz) obj;
        C04220Ms.A0B(r3, 0);
        return this.A00 - r3.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C72394Nz) || ((C72394Nz) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C72394Nz(int i, float[] fArr) {
        this.A00 = i;
        this.A01 = fArr;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A00);
        A0r.append('_');
        float[] fArr = this.A01;
        StringBuilder A0r2 = C18200wM.A0r();
        A0r2.append("");
        int i = 0;
        for (float f : fArr) {
            i++;
            if (i > 1) {
                A0r2.append(" ");
            }
            A0r2.append(String.valueOf(f));
        }
        A0r2.append("");
        return C18180wK.A0i(C18190wL.A0n(A0r2), A0r);
    }
}
