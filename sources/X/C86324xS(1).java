package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xS  reason: invalid class name and case insensitive filesystem */
public final class C86324xS extends Drawable {
    public Paint A00;
    public Paint A01;
    public Drawable A02;
    public Rect A03;
    public final Context A04;
    public final Path A05 = C86144wL.A0G();
    public final C114616tc A06;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Paint paint = this.A01;
        if (paint != null) {
            canvas.drawPath(this.A05, paint);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            Path path = this.A05;
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Paint paint2 = this.A00;
        if (paint2 != null) {
            canvas.drawPath(this.A05, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01e8, code lost:
        if (r5 == r0) goto L_0x01ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBoundsChange(android.graphics.Rect r39) {
        /*
            r38 = this;
            r3 = 0
            r1 = r39
            X.C04220Ms.A0B(r1, r3)
            r14 = r38
            super.onBoundsChange(r1)
            android.graphics.Rect r0 = r14.A03
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 != 0) goto L_0x0243
            r14.A03 = r1
            X.6tc r1 = r14.A06
            android.graphics.Path r0 = r14.A05
            r37 = r0
            X.6up r0 = r1.A00
            r36 = r0
            float r6 = r0.A01
            X.6uk r5 = r1.A01
            android.graphics.RectF r0 = r5.A01
            r35 = r0
            X.68f r4 = r5.A04
            X.68p r0 = r5.A03
            r34 = r0
            r25 = 1
            r13 = 2
            r24 = 3
            android.graphics.Path r23 = X.C86144wL.A0G()
            r22 = 8
            X.68f r2 = X.C971768f.TOP
            X.68p r0 = X.AnonymousClass68p.EDGE_LEFT
            kotlin.Pair r7 = X.C18180wK.A0p(r2, r0)
            r21 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            r20 = 7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
            kotlin.Pair r1 = X.C18180wK.A0p(r12, r9)
            kotlin.Pair r26 = X.C18180wK.A0p(r7, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            X.68p r19 = X.AnonymousClass68p.EDGE_RIGHT
            r1 = r19
            kotlin.Pair r2 = X.C18180wK.A0p(r2, r1)
            r18 = 4
            java.lang.Integer r17 = java.lang.Integer.valueOf(r18)
            r16 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            r1 = r17
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r15)
            kotlin.Pair r27 = X.C18180wK.A0p(r2, r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r25)
            X.68f r1 = X.C971768f.RIGHT
            X.68p r8 = X.AnonymousClass68p.EDGE_TOP
            kotlin.Pair r7 = X.C18180wK.A0p(r1, r8)
            kotlin.Pair r2 = X.C18180wK.A0p(r11, r10)
            kotlin.Pair r28 = X.C18180wK.A0p(r7, r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            X.68p r2 = X.AnonymousClass68p.EDGE_BOTTOM
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r2)
            kotlin.Pair r9 = X.C18180wK.A0p(r12, r9)
            kotlin.Pair r29 = X.C18180wK.A0p(r1, r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            X.68f r9 = X.C971768f.BOTTOM
            kotlin.Pair r0 = X.C18180wK.A0p(r9, r0)
            kotlin.Pair r10 = X.C18180wK.A0p(r11, r10)
            kotlin.Pair r30 = X.C18180wK.A0p(r0, r10)
            r0 = r19
            kotlin.Pair r9 = X.C18180wK.A0p(r9, r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r7, r1)
            kotlin.Pair r31 = X.C18180wK.A0p(r9, r0)
            X.68f r0 = X.C971768f.LEFT
            kotlin.Pair r8 = X.C18180wK.A0p(r0, r8)
            kotlin.Pair r1 = X.C18180wK.A0p(r7, r1)
            kotlin.Pair r32 = X.C18180wK.A0p(r8, r1)
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r2)
            r0 = r17
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r15)
            kotlin.Pair r33 = X.C18180wK.A0p(r1, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r26, r27, r28, r29, r30, r31, r32, r33}
            java.util.HashMap r2 = X.AnonymousClass4WJ.A09(r0)
            r0 = r22
            float[] r7 = new float[r0]
            r7[r3] = r6
            r7[r25] = r6
            r7[r13] = r6
            r7[r24] = r6
            r7[r18] = r6
            r7[r16] = r6
            r7[r21] = r6
            r7[r20] = r6
            int r1 = r34.ordinal()
            if (r1 == r13) goto L_0x011d
            r0 = r24
            if (r1 == r0) goto L_0x011d
            r0 = r34
            kotlin.Pair r0 = X.C18180wK.A0p(r4, r0)
            java.lang.Object r1 = r2.get(r0)
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L_0x011d
            java.lang.Object r0 = r1.A00
            int r2 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r1.A01
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r0 = 0
            r7[r2] = r0
            r7[r1] = r0
        L_0x011d:
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CCW
            r1 = r23
            r0 = r35
            r1.addRoundRect(r0, r7, r2)
            r1 = r37
            r0 = r23
            r1.set(r0)
            android.content.Context r6 = r14.A04
            android.graphics.RectF r2 = r5.A00
            r0 = r36
            java.lang.Integer r0 = r0.A05
            X.C04220Ms.A0B(r6, r3)
            int r1 = r0.intValue()
            if (r1 == r13) goto L_0x0228
            if (r1 == r3) goto L_0x03ad
            r0 = r25
            if (r1 != r0) goto L_0x03be
            X.5CV r1 = new X.5CV
            r0 = r34
            r1.<init>(r6, r2, r0, r4)
        L_0x014b:
            boolean r0 = r1 instanceof X.AnonymousClass5CV
            if (r0 == 0) goto L_0x0308
            X.5CV r1 = (X.AnonymousClass5CV) r1
            X.68p r5 = r1.A02
            int r2 = r5.ordinal()
            if (r2 == r13) goto L_0x0258
            r0 = r24
            if (r2 == r0) goto L_0x0258
            android.content.Context r4 = r1.A00
            android.graphics.Path r15 = X.C86144wL.A0G()
            android.graphics.RectF r2 = r1.A01
            float r6 = r2.width()
            r0 = 0
            r15.moveTo(r6, r0)
            r6 = 1100195529(0x4193a6c9, float:18.456438)
            float r7 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1057698238(0x3f0b31be, float:0.54372776)
            float r8 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1099120798(0x4183409e, float:16.406551)
            float r9 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1073884914(0x40022ef2, float:2.0341153)
            float r10 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1097338737(0x41680f71, float:14.50377)
            float r11 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1080130887(0x40617d47, float:3.5232713)
            float r12 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = r15
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r6 = 1085068990(0x40acd6be, float:5.4012136)
            float r7 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1093602135(0x412f0b57, float:10.9402685)
            float r6 = X.AnonymousClass6QB.A00(r4, r6)
            r15.lineTo(r7, r6)
            r6 = 1079508673(0x4057fec1, float:3.374924)
            float r7 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1096004422(0x4153b346, float:13.231268)
            float r8 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = -1123573603(0xffffffffbd07a09d, float:-0.033112157)
            float r9 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1094252252(0x4138f6dc, float:11.560268)
            float r10 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = 1090825507(0x4104ad23, float:8.29227)
            float r12 = X.AnonymousClass6QB.A00(r4, r6)
            r6 = r15
            r11 = r0
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r15.lineTo(r0, r0)
            float r4 = r2.width()
            r15.lineTo(r4, r0)
            r15.close()
            r0 = r19
            if (r5 == r0) goto L_0x01ea
            X.68p r0 = X.AnonymousClass68p.EDGE_BOTTOM
        L_0x01e7:
            r8 = 0
            if (r5 != r0) goto L_0x01eb
        L_0x01ea:
            r8 = 1
        L_0x01eb:
            X.68f r0 = r1.A03
            int r6 = r0.ordinal()
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r6 == r3) goto L_0x024e
            r0 = 0
            r1 = r24
            if (r6 == r1) goto L_0x0390
            r1 = r25
            if (r6 == r1) goto L_0x0246
            if (r6 != r13) goto L_0x03b4
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            if (r8 != 0) goto L_0x020b
            X.C116136wU.A00(r7, r2, r5, r4)
        L_0x020b:
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r7.postRotate(r1, r0, r0)
            float r1 = r2.width()
            r7.postTranslate(r0, r1)
        L_0x0217:
            float r1 = r2.left
            float r0 = r2.top
            r7.postTranslate(r1, r0)
            r15.transform(r7)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0 = r37
            r0.op(r15, r1)
        L_0x0228:
            android.graphics.RectF r2 = X.C86134wK.A0E()
            r0 = r37
            r0.computeBounds(r2, r3)
            android.graphics.Rect r1 = X.C86134wK.A0D()
            r2.round(r1)
            r0 = r36
            android.graphics.drawable.Drawable r0 = r0.A03
            if (r0 == 0) goto L_0x0244
            r0.setBounds(r1)
        L_0x0241:
            r14.A02 = r0
        L_0x0243:
            return
        L_0x0244:
            r0 = 0
            goto L_0x0241
        L_0x0246:
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            X.C116136wU.A00(r7, r2, r4, r5)
            goto L_0x0252
        L_0x024e:
            android.graphics.Matrix r7 = X.C86164wN.A0E()
        L_0x0252:
            if (r8 == 0) goto L_0x0217
            X.C116136wU.A00(r7, r2, r5, r4)
            goto L_0x0217
        L_0x0258:
            android.content.Context r0 = r1.A00
            android.graphics.Path r15 = X.C86144wL.A0G()
            android.graphics.RectF r2 = r1.A01
            float r6 = r2.width()
            r4 = 0
            r15.moveTo(r6, r4)
            r6 = 1101928553(0x41ae1869, float:21.761919)
            float r16 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1100286926(0x41950bce, float:18.630764)
            float r18 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1070664146(0x3fd109d2, float:1.6331122)
            float r19 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1099313212(0x4186303c, float:16.773552)
            float r20 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1080278157(0x4063bc8d, float:3.5583832)
            float r21 = X.AnonymousClass6QB.A00(r0, r6)
            r17 = r4
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            r6 = 1088742272(0x40e4e380, float:7.152771)
            float r7 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1093225300(0x41294b54, float:10.580891)
            float r6 = X.AnonymousClass6QB.A00(r0, r6)
            r15.lineTo(r7, r6)
            r6 = 1083606066(0x40968432, float:4.703637)
            float r16 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1095889401(0x4151f1f9, float:13.121575)
            float r17 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r18 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1094950089(0x41439cc9, float:12.225778)
            float r19 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r20 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1090617917(0x4101823d, float:8.094296)
            float r21 = X.AnonymousClass6QB.A00(r0, r6)
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            r6 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r7 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1074099317(0x40057475, float:2.085233)
            float r6 = X.AnonymousClass6QB.A00(r0, r6)
            r15.lineTo(r7, r6)
            r6 = 1068484091(0x3fafc5fb, float:1.3732294)
            float r7 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1066951682(0x3f986402, float:1.190552)
            float r8 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1062766946(0x3f588962, float:0.8458463)
            float r9 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = 1054343040(0x3ed7ff80, float:0.4218712)
            float r10 = X.AnonymousClass6QB.A00(r0, r6)
            r6 = r15
            r11 = r4
            r12 = r4
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r15.close()
            X.68p r0 = X.AnonymousClass68p.INSET_RIGHT
            goto L_0x01e7
        L_0x0308:
            X.5CU r1 = (X.AnonymousClass5CU) r1
            android.content.Context r4 = r1.A00
            android.graphics.Path r15 = X.C86144wL.A0G()
            r0 = 0
            r15.moveTo(r0, r0)
            r2 = 1082130432(0x40800000, float:4.0)
            float r16 = X.AnonymousClass6QB.A00(r4, r2)
            float r17 = X.AnonymousClass6QB.A00(r4, r0)
            r2 = 1090139455(0x40fa353f, float:7.819)
            float r18 = X.AnonymousClass6QB.A00(r4, r2)
            android.graphics.RectF r2 = r1.A01
            float r19 = r2.height()
            r5 = 1093140480(0x41280000, float:10.5)
            float r20 = X.AnonymousClass6QB.A00(r4, r5)
            float r21 = r2.height()
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            r5 = 1095952237(0x4152e76d, float:13.1815)
            float r6 = X.AnonymousClass6QB.A00(r4, r5)
            float r7 = r2.height()
            r5 = 1099432198(0x41880106, float:17.0005)
            float r8 = X.AnonymousClass6QB.A00(r4, r5)
            float r10 = r2.width()
            r5 = r15
            r9 = r0
            r11 = r0
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            r15.lineTo(r0, r0)
            r15.close()
            X.68f r1 = r1.A02
            int r4 = r1.ordinal()
            if (r4 == r3) goto L_0x03a7
            r1 = r24
            if (r4 == r1) goto L_0x038b
            r1 = r25
            if (r4 == r1) goto L_0x0372
            if (r4 != r13) goto L_0x03b9
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            goto L_0x020b
        L_0x0372:
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            float r0 = r2.height()
            float r0 = r0 / r1
            r7.postScale(r6, r5, r4, r0)
            goto L_0x0217
        L_0x038b:
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            goto L_0x0399
        L_0x0390:
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            if (r8 == 0) goto L_0x0399
            X.C116136wU.A00(r7, r2, r5, r4)
        L_0x0399:
            r1 = 1119092736(0x42b40000, float:90.0)
            r7.postRotate(r1, r0, r0)
            float r1 = r2.height()
            r7.postTranslate(r1, r0)
            goto L_0x0217
        L_0x03a7:
            android.graphics.Matrix r7 = X.C86164wN.A0E()
            goto L_0x0217
        L_0x03ad:
            X.5CU r1 = new X.5CU
            r1.<init>(r6, r2, r4)
            goto L_0x014b
        L_0x03b4:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x03b9:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x03be:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86324xS.onBoundsChange(android.graphics.Rect):void");
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (android.graphics.Color.alpha(r4.A02) != 255) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getOpacity() {
        /*
            r5 = this;
            X.6tc r0 = r5.A06
            X.6up r4 = r0.A00
            float r2 = r4.A00
            r1 = 1
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0031
        L_0x0010:
            r3 = 1
            if (r1 == 0) goto L_0x001e
            int r0 = r4.A02
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == r0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            android.graphics.drawable.Drawable r0 = r4.A03
            r1 = -1
            if (r0 == 0) goto L_0x002f
            int r0 = r0.getOpacity()
            if (r0 != r1) goto L_0x002f
        L_0x002a:
            if (r2 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            return r1
        L_0x002f:
            r3 = 0
            goto L_0x002a
        L_0x0031:
            r1 = 0
            goto L_0x0010
        L_0x0033:
            r1 = -3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86324xS.getOpacity():int");
    }

    public C86324xS(Context context, C114616tc r8) {
        int i;
        int i2;
        this.A04 = context;
        this.A06 = r8;
        C115296up r4 = r8.A00;
        float f = r4.A00;
        if (!(f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || (i2 = r4.A02) == 0)) {
            Paint A0C = C86114wI.A0C(5);
            C86134wK.A12(A0C);
            A0C.setStrokeWidth(f);
            A0C.setColor(i2);
            this.A00 = A0C;
        }
        C115136uZ r5 = r4.A04;
        if (r5 != null) {
            float f2 = r5.A02;
            if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && (i = r5.A03) != 0) {
                Paint A0C2 = C86114wI.A0C(5);
                C86134wK.A13(A0C2);
                A0C2.setColor(i);
                A0C2.setShadowLayer(f2, r5.A00, r5.A01, i);
                this.A01 = A0C2;
            }
        }
    }
}
