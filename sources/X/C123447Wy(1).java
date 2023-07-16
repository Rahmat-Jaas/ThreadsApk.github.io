package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Wy  reason: invalid class name and case insensitive filesystem */
public final class C123447Wy implements C146678mg {
    public Canvas A00 = C102726Wh.A00;
    public final Rect A01 = C86134wK.A0D();
    public final Rect A02 = C86134wK.A0D();

    public final void AIl(C146398mB r10, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.A00.drawArc(f, f2, f3, f4, f5, f6, false, ((AnonymousClass7X0) r10).A01);
    }

    public final void ADN(C147018nF r4, int i) {
        Canvas canvas = this.A00;
        if (r4 instanceof AnonymousClass7X1) {
            canvas.clipPath(((AnonymousClass7X1) r4).A01, Region.Op.INTERSECT);
            return;
        }
        throw C86134wK.A0s("Unable to obtain android.graphics.Path");
    }

    public final void ADO(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.A00;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    public final void ADu(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (i == i2) {
                    f = 1.0f;
                }
                float[] fArr2 = fArr;
                if (fArr[(i << 2) + i2] == f) {
                    i2++;
                } else {
                    Matrix A0E = C86164wN.A0E();
                    float f2 = fArr[2];
                    if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        float f3 = fArr[6];
                        if (f3 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && fArr[10] == 1.0f && fArr[14] == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            float f4 = fArr[8];
                            if (f4 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && fArr[9] == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && fArr[11] == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                float f5 = fArr[0];
                                float f6 = fArr[1];
                                float f7 = fArr[3];
                                float f8 = fArr[4];
                                float f9 = fArr[5];
                                float f10 = fArr[7];
                                float f11 = fArr[12];
                                float f12 = fArr[13];
                                float f13 = fArr[15];
                                fArr[0] = f5;
                                fArr[1] = f8;
                                fArr[2] = f11;
                                fArr[3] = f6;
                                fArr[4] = f9;
                                fArr[5] = f12;
                                fArr[6] = f7;
                                fArr[7] = f10;
                                fArr[8] = f13;
                                A0E.setValues(fArr2);
                                fArr[0] = f5;
                                fArr[1] = f6;
                                fArr[2] = f2;
                                fArr[3] = f7;
                                fArr[4] = f8;
                                fArr[5] = f9;
                                fArr[6] = f3;
                                fArr[7] = f10;
                                fArr[8] = f4;
                                this.A00.concat(A0E);
                                return;
                            }
                        }
                    }
                    throw C18190wL.A0a("Android does not support arbitrary transforms");
                }
            } while (i2 < 4);
        }
    }

    public final void AI4() {
        AnonymousClass6aB.A00(this.A00, false);
    }

    public final void AIo(C146398mB r5, float f, long j) {
        this.A00.drawCircle(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j), f, ((AnonymousClass7X0) r5).A01);
    }

    public final void AIv(C146868n0 r6, C146398mB r7, long j) {
        Canvas canvas = this.A00;
        if (r6 instanceof C31336Gmy) {
            canvas.drawBitmap(((C31336Gmy) r6).A00, AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j), ((AnonymousClass7X0) r7).A01);
            return;
        }
        throw C86134wK.A0s("Unable to obtain android.graphics.Bitmap");
    }

    public final void AIx(C146868n0 r16, C146398mB r17, long j, long j2, long j3, long j4) {
        C146868n0 r1 = r16;
        C146398mB r7 = r17;
        Canvas canvas = this.A00;
        if (r1 instanceof C31336Gmy) {
            Bitmap bitmap = ((C31336Gmy) r1).A00;
            Rect rect = this.A02;
            int i = (int) (j >> 32);
            rect.left = i;
            int A08 = C86104wH.A08(j);
            rect.top = A08;
            rect.right = i + ((int) (j2 >> 32));
            rect.bottom = A08 + ((int) (j2 & 4294967295L));
            Rect rect2 = this.A01;
            int i2 = (int) (j3 >> 32);
            rect2.left = i2;
            int A082 = C86104wH.A08(j3);
            rect2.top = A082;
            rect2.right = i2 + ((int) (j4 >> 32));
            rect2.bottom = A082 + ((int) (j4 & 4294967295L));
            canvas.drawBitmap(bitmap, rect, rect2, ((AnonymousClass7X0) r7).A01);
            return;
        }
        throw C86134wK.A0s("Unable to obtain android.graphics.Bitmap");
    }

    public final void AJ4(C146398mB r7, long j, long j2) {
        this.A00.drawLine(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j), AnonymousClass7KC.A01(j2), AnonymousClass7KC.A02(j2), ((AnonymousClass7X0) r7).A01);
    }

    public final void AJ5(C146398mB r4, C147018nF r5) {
        Canvas canvas = this.A00;
        if (r5 instanceof AnonymousClass7X1) {
            canvas.drawPath(((AnonymousClass7X1) r5).A01, ((AnonymousClass7X0) r4).A01);
            return;
        }
        throw C86134wK.A0s("Unable to obtain android.graphics.Path");
    }

    public final void AJ8(C146398mB r7, float f, float f2, float f3, float f4) {
        this.A00.drawRect(f, f2, f3, f4, ((AnonymousClass7X0) r7).A01);
    }

    public final void AJB(C146398mB r9, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00.drawRoundRect(f, f2, f3, f4, f5, f6, ((AnonymousClass7X0) r9).A01);
    }

    public final void AJl() {
        AnonymousClass6aB.A00(this.A00, true);
    }

    public final void Ces() {
        this.A00.restore();
    }

    public final void CfI(float f) {
        this.A00.rotate(f);
    }

    public final void Cfm() {
        this.A00.save();
    }

    public final void Cfv(AnonymousClass7F6 r8, C146398mB r9) {
        this.A00.saveLayer(r8.A01, r8.A03, r8.A02, r8.A00, ((AnonymousClass7X0) r9).A01, 31);
    }

    public final void Cg2(float f, float f2) {
        this.A00.scale(f, f2);
    }

    public final void D7f(float f, float f2) {
        this.A00.translate(f, f2);
    }
}
