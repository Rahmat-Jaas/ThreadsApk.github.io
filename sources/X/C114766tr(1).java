package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.6tr  reason: invalid class name and case insensitive filesystem */
public final class C114766tr {
    public final Feature A00;
    public final C113816sC A01;

    public /* synthetic */ C114766tr(Feature feature, C113816sC r2) {
        this.A01 = r2;
        this.A00 = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C114766tr)) {
            return false;
        }
        C114766tr r4 = (C114766tr) obj;
        if (C117046y2.A01(this.A01, r4.A01)) {
            return C117046y2.A00(this.A00, r4.A00);
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A01, this.A00);
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        r2.A00(this.A01, "key");
        r2.A00(this.A00, "feature");
        return r2.toString();
    }
}
