package X;

import com.facebook.dcp.model.Matrix;
import java.util.List;

/* renamed from: X.5KI  reason: invalid class name */
public final class AnonymousClass5KI extends AnonymousClass0Sf implements C146518mN {
    public final Matrix A00;
    public final Matrix A01;
    public final List A02;
    public final float[] A03;
    public final float[] A04;
    public final int[] A05;
    public final Matrix[] A06;
    public final float[][] A07;

    public final float[] AT5(int i) {
        return this.A00.A00[i - 1];
    }

    public final float[] AT6(int i) {
        return this.A01.A00[i - 1];
    }

    public final float[] ATH(int i) {
        return this.A07[i - 1];
    }

    public final int[] AxG() {
        return this.A05;
    }

    public final List B2V() {
        return this.A02;
    }

    public final Matrix BM5(int i) {
        return this.A06[i - 1];
    }

    public AnonymousClass5KI(Matrix matrix, Matrix matrix2, List list, float[] fArr, float[] fArr2, int[] iArr, Matrix[] matrixArr, float[][] fArr3) {
        this.A02 = list;
        this.A05 = iArr;
        this.A03 = fArr;
        this.A04 = fArr2;
        this.A06 = matrixArr;
        this.A07 = fArr3;
        this.A00 = matrix;
        this.A01 = matrix2;
    }

    public final float[] Ats(int i) {
        return this.A03;
    }

    public final float[] BKD(int i) {
        return this.A04;
    }
}
