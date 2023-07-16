package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4zW  reason: invalid class name and case insensitive filesystem */
public final class C86904zW extends TextPaint {
    public C1201679b A00 = C1201679b.A03;
    public C98126Eh A01;
    public AnonymousClass79I A02 = AnonymousClass79I.A02;
    public final C146398mB A03 = new AnonymousClass7X0(this);

    public C86904zW(float f) {
        super(1);
        this.density = f;
    }

    public final void A00(C111366nD r6, float f, long j) {
        float A012;
        if (((r6 instanceof C876253m) && ((C876253m) r6).A00 != AnonymousClass7KE.A06) || ((r6 instanceof C876753r) && j != AnonymousClass7JK.A01)) {
            C146398mB r2 = this.A03;
            if (Float.isNaN(f)) {
                A012 = ((float) ((AnonymousClass7X0) r2).A01.getAlpha()) / 255.0f;
            } else {
                A012 = AnonymousClass8bI.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            }
            r6.A00(r2, A012, j);
        } else if (r6 == null) {
            AnonymousClass7X0 r0 = (AnonymousClass7X0) this.A03;
            r0.A02 = null;
            r0.A01.setShader((Shader) null);
        }
    }

    public final void A01(C1201679b r7) {
        if (r7 != null && !C04220Ms.A0I(this.A00, r7)) {
            this.A00 = r7;
            if (r7.equals(C1201679b.A03)) {
                clearShadowLayer();
                return;
            }
            C1201679b r5 = this.A00;
            float f = r5.A00;
            if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = Float.MIN_VALUE;
            }
            long j = r5.A02;
            setShadowLayer(f, AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j), C121657He.A01(r5.A01));
        }
    }

    public final void A02(C98126Eh r4) {
        Paint.Cap cap;
        if (r4 != null && !C04220Ms.A0I(this.A01, r4)) {
            this.A01 = r4;
            if (r4.equals(C877353x.A00)) {
                C86134wK.A13(((AnonymousClass7X0) this.A03).A01);
            } else if (r4 instanceof C877253w) {
                C146398mB r1 = this.A03;
                Paint paint = ((AnonymousClass7X0) r1).A01;
                C86134wK.A12(paint);
                C877253w r42 = (C877253w) r4;
                paint.setStrokeWidth(r42.A01);
                paint.setStrokeMiter(r42.A00);
                r1.CqD(r42.A03);
                int i = r42.A02;
                if (i == 2) {
                    cap = Paint.Cap.SQUARE;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                paint.setStrokeCap(cap);
                paint.setPathEffect((PathEffect) null);
            }
        }
    }

    public final void A03(AnonymousClass79I r4) {
        if (r4 != null && !C04220Ms.A0I(this.A02, r4)) {
            this.A02 = r4;
            C04220Ms.A0B(AnonymousClass79I.A03, 0);
            int i = r4.A00;
            setUnderlineText(AnonymousClass0wJ.A1T(i | 1, i));
            AnonymousClass79I r1 = this.A02;
            C04220Ms.A0B(AnonymousClass79I.A01, 0);
            int i2 = r1.A00;
            setStrikeThruText(AnonymousClass0wJ.A1T(i2 | 2, i2));
        }
    }
}
