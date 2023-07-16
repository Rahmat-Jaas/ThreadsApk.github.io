package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.6pS  reason: invalid class name and case insensitive filesystem */
public final class C112366pS {
    public final View A00;
    public final Matrix A01 = C86164wN.A0E();
    public final float[] A02 = new float[2];

    public final PointF A00(PointF pointF) {
        float[] fArr = this.A02;
        float f = pointF.x;
        View view = this.A00;
        fArr[0] = f - ((float) view.getLeft());
        fArr[1] = pointF.y - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = this.A01;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }

    public C112366pS(View view) {
        this.A00 = view;
    }
}
