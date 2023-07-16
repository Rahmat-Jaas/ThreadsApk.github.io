package X;

import java.util.Arrays;

/* renamed from: X.0Wf  reason: invalid class name and case insensitive filesystem */
public final class C05830Wf {
    public static final C05830Wf A02 = new C05830Wf(-1);
    public static final C05830Wf A03 = new C05830Wf(AnonymousClass0Wg.A00, (int[]) null);
    public static final C05830Wf A04 = new C05830Wf(-2);
    public static final C05830Wf A05 = new C05830Wf(new int[0]);
    public final int[] A00;
    public final int[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C05830Wf r5 = (C05830Wf) obj;
            if (!Arrays.equals(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals((int[]) null, (int[]) null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.A00) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode((int[]) null);
    }

    public final String toString() {
        return AnonymousClass00U.A0j("{normalMarkers: ", Arrays.toString(this.A00), ", quickMarkers: ", Arrays.toString(this.A01), ", metadataMarkers: ", Arrays.toString((int[]) null), "}");
    }

    public C05830Wf(int... iArr) {
        this.A00 = iArr;
        this.A01 = iArr;
    }

    public C05830Wf(int[] iArr, int[] iArr2) {
        this.A00 = iArr;
        this.A01 = iArr2;
    }
}
