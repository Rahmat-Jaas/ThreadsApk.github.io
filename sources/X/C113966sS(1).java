package X;

import android.graphics.Matrix;

/* renamed from: X.6sS  reason: invalid class name and case insensitive filesystem */
public final class C113966sS {
    public boolean A00 = true;
    public boolean A01 = true;
    public Matrix A02;
    public Matrix A03;
    public boolean A04 = true;
    public float[] A05;
    public float[] A06;
    public final AnonymousClass0YP A07;

    public C113966sS(AnonymousClass0YP r2) {
        this.A07 = r2;
    }

    public final float[] A00(Object obj) {
        float[] fArr = this.A05;
        if (fArr == null) {
            fArr = AnonymousClass7Hf.A04();
            this.A05 = fArr;
        }
        if (this.A01) {
            this.A04 = C115926w8.A01(A01(obj), fArr);
            this.A01 = false;
        }
        if (this.A04) {
            return fArr;
        }
        return null;
    }

    public final float[] A01(Object obj) {
        float[] fArr = this.A06;
        if (fArr == null) {
            fArr = AnonymousClass7Hf.A04();
            this.A06 = fArr;
        }
        if (this.A00) {
            Matrix matrix = this.A02;
            if (matrix == null) {
                matrix = C86164wN.A0E();
                this.A02 = matrix;
            }
            this.A07.invoke(obj, matrix);
            Matrix matrix2 = this.A03;
            if (matrix2 == null || !matrix.equals(matrix2)) {
                C98066Ea.A00(matrix, fArr);
                this.A02 = matrix2;
                this.A03 = matrix;
            }
            this.A00 = false;
        }
        return fArr;
    }
}
