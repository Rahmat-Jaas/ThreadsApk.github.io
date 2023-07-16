package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;

/* renamed from: X.4y4  reason: invalid class name */
public final class AnonymousClass4y4 extends Drawable {
    public Path A00;
    public Drawable A01;
    public C86424xe A02;
    public C18450xD A03;
    public C86284xK A04;
    public C18430xB A05;
    public AnonymousClass4y3 A06;
    public C86794yH A07;
    public F10 A08;
    public F10 A09;
    public F10 A0A;
    public F10 A0B;
    public final int A0C;
    public final int A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final Paint A0U;
    public final Drawable A0V;
    public final GradientDrawable A0W;
    public final F10 A0X;
    public final Integer A0Y;
    public final boolean A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x039d, code lost:
        if (r2 != null) goto L_0x032a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x039b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4y4(android.content.Context r33, X.C973468z r34, java.util.List r35, boolean r36) {
        /*
            r32 = this;
            r9 = 1
            r23 = 2
            r22 = 3
            r10 = r34
            r0 = r22
            X.C04220Ms.A0B(r10, r0)
            r12 = r32
            r12.<init>()
            java.lang.Integer r0 = r10.A01
            r11 = r33
            if (r0 == 0) goto L_0x0284
            int r0 = r0.intValue()
            int r0 = X.C18240wQ.A02(r11, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0023:
            r12.A0Y = r0
            int r0 = r10.A00
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0D = r0
            r3 = 1098907648(0x41800000, float:16.0)
            float r4 = X.C09860go.A00(r11, r3)
            r12.A0E = r4
            r1 = 4
            int r0 = X.C18240wQ.A02(r11, r1)
            r12.A0C = r0
            r0 = r23
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0M = r0
            r0 = 16
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0N = r0
            r0 = 34
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0H = r0
            r0 = 17
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0F = r0
            r0 = 9
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0G = r0
            r2 = 14
            int r0 = X.C18240wQ.A02(r11, r2)
            r12.A0S = r0
            int r0 = X.C18240wQ.A02(r11, r1)
            r12.A0T = r0
            r0 = 12
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0O = r0
            r1 = 20
            int r0 = X.C18240wQ.A02(r11, r1)
            r12.A0R = r0
            r21 = 8
            r0 = r21
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0Q = r0
            r0 = 18
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0J = r0
            int r0 = X.C18240wQ.A02(r11, r2)
            r12.A0I = r0
            r0 = r21
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0P = r0
            int r0 = X.C18240wQ.A02(r11, r1)
            r12.A0L = r0
            r20 = 10
            r0 = r20
            int r0 = X.C18240wQ.A02(r11, r0)
            r12.A0K = r0
            android.graphics.Paint r1 = X.C86114wI.A0C(r22)
            r0 = 2131099685(0x7f060025, float:1.781173E38)
            int r0 = r11.getColor(r0)
            r8 = 0
            r1.setShadowLayer(r3, r8, r8, r0)
            r12.A0U = r1
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r1 = 2131099851(0x7f0600cb, float:1.7812067E38)
            r24 = r36
            if (r36 == 0) goto L_0x00d2
            r1 = 2131099954(0x7f060132, float:1.7812276E38)
        L_0x00d2:
            r19 = 0
            r0 = r19
            r3.setShape(r0)
            r3.setCornerRadius(r4)
            int r0 = r11.getColor(r1)
            r3.setColor(r0)
            r12.A0W = r3
            r0 = 2131232250(0x7f0805fa, float:1.8080604E38)
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            if (r0 == 0) goto L_0x03a0
            android.graphics.drawable.Drawable r1 = r0.mutate()
            r0 = 2131099961(0x7f060139, float:1.781229E38)
            X.C63393hP.A03(r11, r1, r0)
            r12.A0V = r1
            boolean r0 = X.AnonymousClass0hB.A02(r11)
            r12.A0Z = r0
            android.graphics.Path r0 = X.C86144wL.A0G()
            r12.A00 = r0
            float r7 = X.C09860go.A03(r11, r2)
            java.util.ArrayList r18 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r17 = r35.iterator()
            r1 = 0
            r6 = 0
            r2 = 0
            r5 = 0
            r0 = 0
            r16 = 0
        L_0x0119:
            boolean r3 = r17.hasNext()
            java.lang.String r4 = "…"
            if (r3 == 0) goto L_0x028c
            java.lang.Object r3 = r17.next()
            X.8mY r3 = (X.C146628mY) r3
            boolean r13 = r3 instanceof X.C90335Ll
            if (r13 == 0) goto L_0x01b3
            int r13 = r12.A0H
            r15 = r13
            r30 = -1
            r13 = 2131100089(0x7f0601b9, float:1.781255E38)
            int r31 = r11.getColor(r13)
            X.5Ll r3 = (X.C90335Ll) r3
            com.instagram.common.typedurl.ImageUrl r14 = r3.A02
            java.lang.String r27 = "threads_post_sticker"
            X.4yH r13 = new X.4yH
            r25 = r13
            r26 = r14
            r28 = r15
            r29 = r19
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r12.A07 = r13
            int r14 = r12.A0D
            int r13 = r12.A0N
            int r13 = r13 * 3
            int r14 = r14 - r13
            int r13 = r12.A0H
            int r14 = r14 - r13
            int r13 = r12.A0L
            int r14 = r14 - r13
            int r13 = r12.A0K
            int r14 = r14 - r13
            boolean r13 = r3.A0J
            if (r13 == 0) goto L_0x017e
            r13 = 2131233143(0x7f080977, float:1.8082415E38)
            android.graphics.drawable.Drawable r13 = r11.getDrawable(r13)
            if (r13 == 0) goto L_0x0287
            android.graphics.drawable.Drawable r15 = r13.mutate()
            X.C04220Ms.A06(r15)
            r13 = 2131099707(0x7f06003b, float:1.7811775E38)
            X.C63393hP.A03(r11, r15, r13)
            r12.A01 = r15
            int r15 = r12.A0S
            int r13 = r12.A0T
            int r15 = r15 + r13
            int r14 = r14 - r15
        L_0x017e:
            X.F10 r13 = X.C86164wN.A0T(r11, r14)
            r12.A0B = r13
            java.lang.String r3 = r3.A05
            r13.A0O(r3)
            X.F10 r3 = r12.A0B
            r3.A0I(r9, r4)
            X.F10 r4 = r12.A0B
            android.graphics.Typeface r3 = android.graphics.Typeface.SANS_SERIF
            r4.A0L(r3, r9)
            X.F10 r4 = r12.A0B
            r3 = 1017370378(0x3ca3d70a, float:0.02)
            r4.A0C(r3)
            X.F10 r3 = r12.A0B
            r3.A0B(r7)
            X.F10 r4 = r12.A0B
            r3 = 2131100092(0x7f0601bc, float:1.7812556E38)
            X.C86154wM.A19(r11, r4, r3)
            X.F10 r4 = r12.A0B
            boolean r3 = r12.A0Z
            A01(r4, r3)
            goto L_0x0119
        L_0x01b3:
            boolean r4 = r3 instanceof X.C90285Lg
            if (r4 == 0) goto L_0x01c4
            r4 = 2131822183(0x7f110667, float:1.927713E38)
            X.5Lg r3 = (X.C90285Lg) r3
            java.lang.String r3 = r3.A03
            java.lang.String r5 = X.AnonymousClass0wJ.A0l(r11, r3, r4)
            goto L_0x0119
        L_0x01c4:
            boolean r4 = r3 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2
            if (r4 == 0) goto L_0x01d3
            r13 = r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2 r13 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5240000_I2) r13
            int r4 = r13.A0B
            if (r4 != r9) goto L_0x01d3
            java.lang.String r0 = r13.A04
            goto L_0x0119
        L_0x01d3:
            boolean r4 = r3 instanceof X.C90315Lj
            if (r4 == 0) goto L_0x01f2
            X.68z r4 = X.C973468z.A04
            if (r10 != r4) goto L_0x0119
            boolean r13 = r12.A0Z
            X.0xB r4 = new X.0xB
            r4.<init>(r11, r13)
            r12.A05 = r4
            if (r6 != 0) goto L_0x01ef
            X.5Lj r3 = (X.C90315Lj) r3
            com.instagram.api.schemas.LineType r4 = r3.A00
            com.instagram.api.schemas.LineType r3 = com.instagram.api.schemas.LineType.SQUIGGLE
            r6 = 0
            if (r4 != r3) goto L_0x0119
        L_0x01ef:
            r6 = 1
            goto L_0x0119
        L_0x01f2:
            boolean r4 = r3 instanceof X.C90325Lk
            if (r4 == 0) goto L_0x023f
            X.5Lk r3 = (X.C90325Lk) r3
            X.8s2 r13 = r3.A09
            boolean r4 = X.C18190wL.A1a(r13)
            if (r4 == 0) goto L_0x0207
            X.0xD r4 = new X.0xD
            r4.<init>(r11, r13)
            r12.A03 = r4
        L_0x0207:
            int r14 = r3.A01
            if (r14 <= 0) goto L_0x0220
            android.content.res.Resources r15 = r11.getResources()
            X.C04220Ms.A06(r15)
            java.lang.String r4 = X.C86134wK.A0m(r15, r14, r9)
            r13 = 2131689486(0x7f0f000e, float:1.9007989E38)
            java.lang.String r16 = X.C18230wP.A0j(r15, r4, r13, r14)
            X.C04220Ms.A06(r16)
        L_0x0220:
            int r13 = r3.A00
            if (r13 <= 0) goto L_0x0119
            boolean r3 = r3.A0H
        L_0x0226:
            if (r3 != 0) goto L_0x0119
            android.content.res.Resources r4 = r11.getResources()
            X.C04220Ms.A06(r4)
            java.lang.String r3 = X.C86134wK.A0m(r4, r13, r9)
            r2 = 2131689491(0x7f0f0013, float:1.9007999E38)
            java.lang.String r2 = X.C18230wP.A0j(r4, r3, r2, r13)
            X.C04220Ms.A06(r2)
            goto L_0x0119
        L_0x023f:
            boolean r4 = r3 instanceof X.C90295Lh
            if (r4 == 0) goto L_0x024c
            X.5Lh r3 = (X.C90295Lh) r3
            int r13 = r3.A00
            if (r13 <= 0) goto L_0x0119
            boolean r3 = r3.A0B
            goto L_0x0226
        L_0x024c:
            r4 = r22
            boolean r4 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2.A00(r4, r3)
            if (r4 == 0) goto L_0x025f
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.Object r4 = r3.A01
            r3 = r18
            r3.add(r4)
            goto L_0x0119
        L_0x025f:
            r4 = r19
            boolean r4 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2.A00(r4, r3)
            if (r4 == 0) goto L_0x0274
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.Object r4 = r3.A01
            java.util.Collection r4 = (java.util.Collection) r4
            r3 = r18
            r3.addAll(r4)
            goto L_0x0119
        L_0x0274:
            r4 = r23
            boolean r4 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2.A00(r4, r3)
            if (r4 == 0) goto L_0x0119
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2) r3
            java.lang.Object r1 = r3.A02
            X.5Hp r1 = (X.C89935Hp) r1
            goto L_0x0119
        L_0x0284:
            r0 = 0
            goto L_0x0023
        L_0x0287:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x028c:
            int r13 = r12.A0D
            int r3 = r12.A0N
            int r3 = r3 << 1
            int r13 = r13 - r3
            X.0xD r3 = r12.A03
            if (r3 == 0) goto L_0x02a4
            X.4xK r3 = new X.4xK
            r3.<init>(r11, r6)
            r12.A04 = r3
            int r6 = r12.A0H
            int r3 = r12.A0N
            int r6 = r6 + r3
            int r13 = r13 - r6
        L_0x02a4:
            boolean r3 = X.C18250wR.A1K(r18)
            if (r3 == 0) goto L_0x02b5
            boolean r14 = r12.A0Z
            X.4xe r6 = new X.4xe
            r3 = r18
            r6.<init>(r11, r3, r13, r14)
            r12.A02 = r6
        L_0x02b5:
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            if (r5 == 0) goto L_0x02dc
            X.F10 r6 = X.C86164wN.A0T(r11, r13)
            r6.A0O(r5)
            r6.A0I(r9, r4)
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            r6.A0K(r5)
            r6.A0D(r8, r3)
            r5 = 1017370378(0x3ca3d70a, float:0.02)
            r6.A0C(r5)
            X.C86134wK.A10(r11, r6, r7)
            boolean r5 = r12.A0Z
            A01(r6, r5)
            r12.A09 = r6
        L_0x02dc:
            if (r0 == 0) goto L_0x0308
            X.F10 r5 = X.C86164wN.A0T(r11, r13)
            r5.A0O(r0)
            r0 = 15
            r5.A0I(r0, r4)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r5.A0K(r0)
            r5.A0D(r8, r3)
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            r5.A0C(r0)
            r5.A0B(r7)
            r0 = 2131100092(0x7f0601bc, float:1.7812556E38)
            X.C86154wM.A19(r11, r5, r0)
            boolean r0 = r12.A0Z
            A01(r5, r0)
            r12.A0A = r5
        L_0x0308:
            if (r1 == 0) goto L_0x0313
            X.4y3 r5 = new X.4y3
            r0 = r24
            r5.<init>(r11, r1, r13, r0)
            r12.A06 = r5
        L_0x0313:
            if (r16 != 0) goto L_0x0319
            if (r2 == 0) goto L_0x034f
            java.lang.String r16 = ""
        L_0x0319:
            java.lang.StringBuilder r5 = X.C18190wL.A0s(r16)
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x039d
            if (r2 == 0) goto L_0x032d
            java.lang.String r0 = " • "
            r5.append(r0)
        L_0x032a:
            r5.append(r2)
        L_0x032d:
            X.F10 r1 = X.C86164wN.A0T(r11, r13)
            r1.A0O(r5)
            r1.A0I(r9, r4)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r1.A0K(r0)
            r1.A0D(r8, r3)
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            r1.A0C(r0)
            X.C86134wK.A10(r11, r1, r7)
            boolean r0 = r12.A0Z
            A01(r1, r0)
            r12.A08 = r1
        L_0x034f:
            X.68z r0 = X.C973468z.A04
            if (r10 != r0) goto L_0x039b
            int r0 = r12.A0D
            X.F10 r2 = X.C86164wN.A0T(r11, r0)
            r0 = 2131820557(0x7f11000d, float:1.9273832E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r11, r0)
            r0 = 2131822107(0x7f11061b, float:1.9276976E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r11, r1, r0)
            r2.A0O(r0)
            r2.A0I(r9, r4)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r2.A0L(r0, r9)
            r2.A0D(r8, r3)
            r0 = r20
            float r1 = X.C09860go.A03(r11, r0)
            r0 = r21
            float r0 = X.C09860go.A03(r11, r0)
            r2.A0E(r1, r0)
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            r2.A0C(r0)
            r0 = 12
            float r0 = X.C09860go.A03(r11, r0)
            X.C86134wK.A10(r11, r2, r0)
            boolean r0 = r12.A0Z
            A01(r2, r0)
        L_0x0398:
            r12.A0X = r2
            return
        L_0x039b:
            r2 = 0
            goto L_0x0398
        L_0x039d:
            if (r2 == 0) goto L_0x032d
            goto L_0x032a
        L_0x03a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4y4.<init>(android.content.Context, X.68z, java.util.List, boolean):void");
    }

    public final void draw(Canvas canvas) {
        String str;
        C04220Ms.A0B(canvas, 0);
        canvas.drawPath(this.A00, this.A0U);
        this.A0W.draw(canvas);
        C86794yH r0 = this.A07;
        if (r0 == null) {
            str = "avatarDrawable";
        } else {
            r0.draw(canvas);
            F10 f10 = this.A0B;
            if (f10 == null) {
                str = "usernameDrawable";
            } else {
                f10.draw(canvas);
                Drawable drawable = this.A01;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                this.A0V.draw(canvas);
                F10 f102 = this.A09;
                if (f102 != null) {
                    f102.draw(canvas);
                }
                F10 f103 = this.A0A;
                if (f103 != null) {
                    f103.draw(canvas);
                }
                C18430xB r02 = this.A05;
                if (r02 != null) {
                    r02.draw(canvas);
                }
                C86284xK r03 = this.A04;
                if (r03 != null) {
                    r03.draw(canvas);
                }
                C18450xD r04 = this.A03;
                if (r04 != null) {
                    r04.draw(canvas);
                }
                F10 f104 = this.A08;
                if (f104 != null) {
                    f104.draw(canvas);
                }
                C86424xe r05 = this.A02;
                if (r05 != null) {
                    r05.draw(canvas);
                }
                AnonymousClass4y3 r06 = this.A06;
                if (r06 != null) {
                    r06.draw(canvas);
                }
                F10 f105 = this.A0X;
                if (f105 != null) {
                    f105.draw(canvas);
                    return;
                }
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final int A00() {
        int i;
        int i2;
        int i3;
        int i4;
        C18450xD r1 = this.A03;
        int i5 = 0;
        if (r1 != null) {
            i = 0;
        } else {
            i = this.A0G;
        }
        F10 f10 = this.A09;
        if (f10 != null) {
            i2 = f10.A04 + this.A0O;
        } else {
            i2 = 0;
        }
        if (this.A05 != null) {
            i3 = this.A0O + this.A0R;
        } else {
            i3 = 0;
        }
        if (r1 == null && this.A08 == null) {
            i4 = 0;
        } else {
            i4 = this.A0I + this.A0J;
        }
        F10 f102 = this.A0X;
        if (f102 != null) {
            i5 = f102.A04;
        }
        return this.A0F + this.A0H + i + i2 + i3 + i4 + this.A0N + i5;
    }

    public final int getIntrinsicWidth() {
        return this.A0D + (this.A0C << 1);
    }

    public final void setAlpha(int i) {
        String str;
        this.A0U.setAlpha(i);
        this.A0W.setAlpha(i);
        C86794yH r0 = this.A07;
        if (r0 == null) {
            str = "avatarDrawable";
        } else {
            r0.setAlpha(i);
            F10 f10 = this.A0B;
            if (f10 == null) {
                str = "usernameDrawable";
            } else {
                f10.setAlpha(i);
                Drawable drawable = this.A01;
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                this.A0V.setAlpha(i);
                F10 f102 = this.A0A;
                if (f102 != null) {
                    f102.setAlpha(i);
                }
                F10 f103 = this.A09;
                if (f103 != null) {
                    f103.setAlpha(i);
                }
                C18430xB r02 = this.A05;
                if (r02 != null) {
                    r02.setAlpha(i);
                }
                C86284xK r03 = this.A04;
                if (r03 != null) {
                    r03.setAlpha(i);
                }
                C18450xD r04 = this.A03;
                if (r04 != null) {
                    r04.setAlpha(i);
                }
                F10 f104 = this.A08;
                if (f104 != null) {
                    f104.setAlpha(i);
                }
                C86424xe r05 = this.A02;
                if (r05 != null) {
                    r05.setAlpha(i);
                }
                F10 f105 = this.A0X;
                if (f105 != null) {
                    f105.setAlpha(i);
                    return;
                }
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        int i10;
        int intrinsicHeight;
        int i11;
        int i12;
        int i13;
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        int i14 = this.A0D;
        int i15 = this.A0C;
        float f3 = ((float) (i14 + (i15 << 1))) / 2.0f;
        int A022 = AnonymousClass8bA.A02(f - f3);
        int A023 = AnonymousClass8bA.A02(f2 - (((float) getIntrinsicHeight()) / 2.0f));
        int A024 = AnonymousClass8bA.A02(f + f3);
        int A025 = AnonymousClass8bA.A02(f2 + (((float) getIntrinsicHeight()) / 2.0f));
        F10 f10 = this.A0X;
        if (f10 != null) {
            i5 = f10.A04;
        } else {
            i5 = 0;
        }
        int i16 = A022 + i15;
        int i17 = A024 - i15;
        int i18 = A023 + i15;
        int i19 = A025 - i5;
        this.A0W.setBounds(i16, i18, i17, i19);
        Path A0G2 = C86144wL.A0G();
        this.A00 = A0G2;
        float f4 = (float) this.A0M;
        float f5 = this.A0E;
        A0G2.addRoundRect(((float) i16) + f4, ((float) i18) + f4, ((float) i17) - f4, ((float) i19) - f4, f5, f5, Path.Direction.CW);
        if (f10 != null) {
            f10.setBounds(i16, i19, i17, A025);
        }
        boolean z = this.A0Z;
        int i20 = this.A0N;
        if (z) {
            i6 = (i17 - i20) - this.A0H;
        } else {
            i6 = i20 + i16;
        }
        int i21 = i18 + this.A0F;
        int i22 = this.A0H;
        int i23 = i6 + i22;
        int i24 = i22 + i21;
        C86794yH r10 = this.A07;
        if (r10 == null) {
            str = "avatarDrawable";
        } else {
            r10.setBounds(i6, i21, i23, i24);
            float f6 = ((float) i21) + (((float) i22) / 2.0f);
            if (z) {
                i7 = i20 + i16 + this.A0L;
            } else {
                i7 = i17 - i20;
            }
            int i25 = this.A0L;
            int i26 = i7 - i25;
            float f7 = ((float) i25) / 2.0f;
            int A026 = AnonymousClass8bA.A02(f6 - f7);
            int A027 = AnonymousClass8bA.A02(f7 + f6);
            F10 f102 = this.A0B;
            str = "usernameDrawable";
            if (f102 != null) {
                float f8 = ((float) f102.A04) / 2.0f;
                int A028 = AnonymousClass8bA.A02(f6 - f8);
                int A029 = AnonymousClass8bA.A02(f8 + f6);
                if (z) {
                    i8 = this.A0K + i7;
                } else {
                    i8 = i20 + i23;
                }
                if (z) {
                    i9 = i6 - i20;
                } else {
                    i9 = i26 - this.A0K;
                }
                Drawable drawable = this.A01;
                Drawable drawable2 = drawable;
                if (drawable != null) {
                    int i27 = this.A0S;
                    int i28 = this.A0T;
                    int i29 = i28;
                    int i30 = i28 + i27;
                    if (z) {
                        i8 += i30;
                        i13 = ((i9 - f102.A07) - i29) - i27;
                    } else {
                        i9 -= i30;
                        i13 = f102.A07 + i8 + i29;
                    }
                    float A012 = C86134wK.A01(i27);
                    drawable2.setBounds(i13, AnonymousClass8bA.A02(f6 - A012), i13 + i27, AnonymousClass8bA.A02(f6 + A012));
                }
                f102.setBounds(i8, A028, i9, A029);
                this.A0V.setBounds(i26, A026, i7, A027);
                C18450xD r12 = this.A03;
                if (r12 != null) {
                    if (z) {
                        i7 = i9;
                    } else {
                        i26 = i8;
                    }
                    i10 = i24;
                } else {
                    if (z) {
                        i7 = i23;
                    } else {
                        i26 = i6;
                    }
                    i10 = this.A0G + i24;
                }
                F10 f103 = this.A09;
                if (f103 != null) {
                    int i31 = f103.A04 + i10;
                    f103.setBounds(i26, i10, i7, i31);
                    i10 = this.A0O + i31;
                }
                int A002 = A00();
                F10 f104 = this.A0A;
                if (f104 != null) {
                    Integer num = this.A0Y;
                    if (num != null) {
                        int lineCount = f104.A0D.getLineCount();
                        int intValue = num.intValue() - A002;
                        while (lineCount > 0 && f104.A04 >= intValue) {
                            lineCount--;
                            f104.A0I(lineCount, "…");
                        }
                        A002 += f104.A04;
                    }
                    int i32 = f104.A04 + i10;
                    f104.setBounds(i26, i10, i7, i32);
                    i10 = i32;
                }
                C86424xe r14 = this.A02;
                if (r14 != null) {
                    int i33 = i26;
                    int i34 = i17;
                    if (z) {
                        i33 = i16;
                        i34 = i7;
                    }
                    Integer num2 = this.A0Y;
                    if (num2 != null) {
                        int i35 = this.A0O;
                        int intValue2 = (num2.intValue() - A002) - i35;
                        if (intValue2 > 0) {
                            i11 = i10 + i35;
                            int min = Math.min(r14.A00, intValue2);
                            i12 = i11 + min;
                            A002 += i35 + min;
                        }
                    } else {
                        i11 = i10 + this.A0O;
                        i12 = r14.A00 + i11;
                    }
                    r14.setBounds(i33, i11, i34, i12);
                    i10 = i12;
                }
                AnonymousClass4y3 r142 = this.A06;
                if (r142 != null) {
                    int i36 = this.A0O;
                    int i37 = i36 + i10;
                    int i38 = i26;
                    int i39 = i17 - i20;
                    if (z) {
                        i38 = i16 + i20;
                        i39 = i7;
                    }
                    Integer num3 = this.A0Y;
                    if (num3 != null) {
                        int intValue3 = (num3.intValue() - A002) - i36;
                        if (intValue3 > 0) {
                            intrinsicHeight = Math.min(r142.getIntrinsicHeight(), intValue3);
                        }
                    } else {
                        intrinsicHeight = r142.getIntrinsicHeight();
                    }
                    i10 = intrinsicHeight + i37;
                    r142.setBounds(i38, i37, i39, i10);
                }
                C18430xB r1 = this.A05;
                if (r1 != null) {
                    int i40 = i10 + this.A0O;
                    r1.setBounds(i26, i40, i7, this.A0R + i40);
                }
                int i41 = i19 - i20;
                int i42 = i41;
                if (r12 != null) {
                    int i43 = this.A0J;
                    int i44 = i41 - i43;
                    r12.setBounds(i6, i44, i23, i43 + i44);
                    i41 = i44 - this.A0P;
                }
                int i45 = i24 + this.A0Q;
                C86284xK r4 = this.A04;
                if (r4 != null) {
                    r4.setBounds(i6, i45, i23, i41);
                }
                F10 f105 = this.A08;
                if (f105 != null) {
                    int A0210 = AnonymousClass8bA.A02(((float) i42) - (((float) this.A0J) / 2.0f));
                    int i46 = f105.A04;
                    int A0211 = AnonymousClass8bA.A02((((float) A0210) - (((float) i46) / 2.0f)) + (f105.A0R.descent() / 2.0f));
                    f105.setBounds(i26, A0211, i7, i46 + A0211);
                    return;
                }
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A01(F10 f10, boolean z) {
        Layout.Alignment alignment;
        f10.A0F = Boolean.valueOf(z);
        if (z) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        f10.A0M(alignment);
        f10.A0H = true;
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2;
        int A002 = A00();
        F10 f10 = this.A0A;
        int i3 = 0;
        if (f10 != null) {
            i = f10.A04;
        } else {
            i = 0;
        }
        C86424xe r0 = this.A02;
        if (r0 != null) {
            i2 = r0.A00 + this.A0O;
        } else {
            i2 = 0;
        }
        AnonymousClass4y3 r02 = this.A06;
        if (r02 != null) {
            i3 = r02.getIntrinsicHeight() + this.A0O;
        }
        int i4 = A002 + i + i2 + i3;
        Integer num = this.A0Y;
        if (num != null) {
            return Math.min(i4, num.intValue());
        }
        return i4;
    }
}
