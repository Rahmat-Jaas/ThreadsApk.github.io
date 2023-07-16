package X;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.7X0  reason: invalid class name */
public final class AnonymousClass7X0 implements C146398mB {
    public int A00;
    public Paint A01;
    public Shader A02;
    public C104136bI A03;

    public final int BEW() {
        int i;
        Paint.Cap strokeCap = this.A01.getStrokeCap();
        if (strokeCap == null || (i = AnonymousClass6ZO.A00[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        return 0;
    }

    public final int BEX() {
        int i;
        Paint.Join strokeJoin = this.A01.getStrokeJoin();
        if (!(strokeJoin == null || (i = AnonymousClass6ZO.A01[strokeJoin.ordinal()]) == 1)) {
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public final void Chk(float f) {
        this.A01.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public final void CiJ(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            AnonymousClass6Eb.A00(i, this.A01);
        }
    }

    public final void CjA(long j) {
        this.A01.setColor(C121657He.A01(j));
    }

    public final void CqD(int i) {
        Paint.Join join;
        Paint paint = this.A01;
        if (i != 0) {
            if (i == 2) {
                join = Paint.Join.BEVEL;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            }
            paint.setStrokeJoin(join);
        }
        join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
    }

    public AnonymousClass7X0(Paint paint) {
        this.A01 = paint;
        this.A00 = 3;
    }

    public AnonymousClass7X0() {
        this(C86114wI.A0C(7));
    }
}
