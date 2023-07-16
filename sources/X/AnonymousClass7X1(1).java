package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.7X1  reason: invalid class name */
public final class AnonymousClass7X1 implements C147018nF {
    public final Matrix A00;
    public final Path A01;
    public final RectF A02;
    public final float[] A03;

    public final void A7Y(C1203079q r8) {
        RectF rectF = this.A02;
        rectF.set(r8.A01, r8.A03, r8.A02, r8.A00);
        float[] fArr = this.A03;
        long j = r8.A06;
        fArr[0] = C86124wJ.A02(j);
        fArr[1] = Float.intBitsToFloat(C86104wH.A08(j));
        long j2 = r8.A07;
        fArr[2] = C86124wJ.A02(j2);
        fArr[3] = Float.intBitsToFloat(C86104wH.A08(j2));
        long j3 = r8.A05;
        fArr[4] = C86124wJ.A02(j3);
        fArr[5] = Float.intBitsToFloat(C86104wH.A08(j3));
        long j4 = r8.A04;
        fArr[6] = C86124wJ.A02(j4);
        fArr[7] = Float.intBitsToFloat(C86104wH.A08(j4));
        this.A01.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    public final boolean CVP(C147018nF r6, C147018nF r7, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            op = Path.Op.INTERSECT;
        }
        Path path = this.A01;
        if (r6 instanceof AnonymousClass7X1) {
            Path path2 = ((AnonymousClass7X1) r6).A01;
            if (r7 instanceof AnonymousClass7X1) {
                return path.op(path2, ((AnonymousClass7X1) r7).A01, op);
            }
            throw C86134wK.A0s("Unable to obtain android.graphics.Path");
        }
        throw C86134wK.A0s("Unable to obtain android.graphics.Path");
    }

    public final void A7N(AnonymousClass7F6 r7) {
        float f = r7.A01;
        if (!Float.isNaN(f)) {
            float f2 = r7.A03;
            if (!Float.isNaN(f2)) {
                float f3 = r7.A02;
                if (!Float.isNaN(f3)) {
                    float f4 = r7.A00;
                    if (!Float.isNaN(f4)) {
                        RectF rectF = this.A02;
                        rectF.set(f, f2, f3, f4);
                        this.A01.addRect(rectF, Path.Direction.CCW);
                        return;
                    }
                    throw C18180wK.A0a("Rect.bottom is NaN");
                }
                throw C18180wK.A0a("Rect.right is NaN");
            }
            throw C18180wK.A0a("Rect.top is NaN");
        }
        throw C18180wK.A0a("Rect.left is NaN");
    }

    public AnonymousClass7X1(Path path) {
        this.A01 = path;
        this.A02 = C86134wK.A0E();
        this.A03 = new float[8];
        this.A00 = C86164wN.A0E();
    }

    public AnonymousClass7X1() {
        this(C86144wL.A0G());
    }
}
