package X;

import android.util.SparseArray;

/* renamed from: X.07d  reason: invalid class name and case insensitive filesystem */
public final class C015407d extends AnonymousClass0DW {
    public static final C015607g A03 = new C015607g();
    public boolean A00;
    public final SparseArray A01;
    public final C015607g A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i = 0;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C015407d r7 = (C015407d) obj;
        if (this.A00 == r7.A00 && this.A02.equals(r7.A02)) {
            SparseArray sparseArray = this.A01;
            SparseArray sparseArray2 = r7.A01;
            if (sparseArray == sparseArray2) {
                return true;
            }
            if (sparseArray.size() == sparseArray2.size()) {
                while (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    if (sparseArray.get(keyAt).equals(sparseArray2.get(keyAt))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A04((C015407d) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        C015407d r52 = (C015407d) r5;
        C015407d r62 = (C015407d) r6;
        if (r62 == null) {
            r62 = new C015407d(this.A00);
        }
        if (r52 == null) {
            r62.A04(this);
        } else {
            this.A02.A02(r52.A02, r62.A02);
            if (r62.A00) {
                A00(this.A01, r52.A01, r62.A01, -1);
                return r62;
            }
        }
        return r62;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r5, AnonymousClass0DW r6) {
        C015407d r52 = (C015407d) r5;
        C015407d r62 = (C015407d) r6;
        if (r62 == null) {
            r62 = new C015407d(this.A00);
        }
        if (r52 == null) {
            r62.A04(this);
        } else {
            this.A02.A03(r52.A02, r62.A02);
            if (r62.A00) {
                A00(this.A01, r52.A01, r62.A01, 1);
                return r62;
            }
        }
        return r62;
    }

    public final void A04(C015407d r7) {
        this.A02.A06(r7.A02);
        if (this.A00 && r7.A00) {
            SparseArray sparseArray = this.A01;
            sparseArray.clear();
            SparseArray sparseArray2 = r7.A01;
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
            }
        }
    }

    public final int hashCode() {
        return ((((this.A00 ? 1 : 0) * true) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorMetrics{isAttributionEnabled=");
        sb.append(this.A00);
        sb.append(", total=");
        sb.append(this.A02);
        sb.append(", sensorConsumption=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public C015407d(boolean z) {
        this.A02 = new C015607g();
        this.A01 = new SparseArray();
        this.A00 = z;
    }

    public static void A00(SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, int i) {
        AnonymousClass0DW A022;
        AnonymousClass0DW A023;
        sparseArray3.clear();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            AnonymousClass0DW r3 = (AnonymousClass0DW) sparseArray.valueAt(i2);
            C015607g r2 = A03;
            AnonymousClass0DW r1 = (AnonymousClass0DW) sparseArray2.get(keyAt, r2);
            if (i > 0) {
                A023 = r3.A03(r1, (AnonymousClass0DW) null);
            } else {
                A023 = r3.A02(r1, (AnonymousClass0DW) null);
            }
            if (!r2.equals(A023)) {
                sparseArray3.put(keyAt, A023);
            }
        }
        int size2 = sparseArray2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            int keyAt2 = sparseArray2.keyAt(i3);
            if (sparseArray.get(keyAt2) == null) {
                C015607g r22 = A03;
                AnonymousClass0DW r12 = (AnonymousClass0DW) sparseArray2.valueAt(i3);
                if (i > 0) {
                    A022 = r22.A03(r12, (AnonymousClass0DW) null);
                } else {
                    A022 = r22.A02(r12, (AnonymousClass0DW) null);
                }
                if (!r22.equals(A022)) {
                    sparseArray3.put(keyAt2, A022);
                }
            }
        }
    }

    public C015407d() {
        this(false);
    }
}
