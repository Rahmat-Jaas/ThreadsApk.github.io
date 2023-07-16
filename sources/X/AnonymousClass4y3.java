package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;

/* renamed from: X.4y3  reason: invalid class name */
public final class AnonymousClass4y3 extends Drawable {
    public Drawable A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final GradientDrawable A09;
    public final C86424xe A0A;
    public final C86794yH A0B;
    public final F10 A0C;
    public final F10 A0D;
    public final F10 A0E;
    public final F10 A0F;
    public final boolean A0G;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c9, code lost:
        if (r13 != null) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4y3(android.content.Context r24, X.C89935Hp r25, int r26, boolean r27) {
        /*
            r23 = this;
            r4 = r26
            r3 = 1
            r6 = r23
            r6.<init>()
            r6.A01 = r4
            r0 = 1090519040(0x41000000, float:8.0)
            r5 = r24
            float r14 = X.C09860go.A00(r5, r0)
            r0 = 16
            int r10 = X.C18240wQ.A02(r5, r0)
            r6.A04 = r10
            r0 = 22
            int r9 = X.C18240wQ.A02(r5, r0)
            r6.A03 = r9
            r1 = 8
            int r0 = X.C18240wQ.A02(r5, r1)
            r6.A02 = r0
            int r8 = X.C18240wQ.A02(r5, r1)
            r6.A06 = r8
            r2 = 14
            int r1 = X.C18240wQ.A02(r5, r2)
            r6.A07 = r1
            r0 = 4
            int r11 = X.C18240wQ.A02(r5, r0)
            r6.A08 = r11
            r0 = 12
            int r0 = X.C18240wQ.A02(r5, r0)
            r6.A05 = r0
            boolean r0 = X.AnonymousClass0hB.A02(r5)
            r6.A0G = r0
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            r13.<init>()
            r7 = 2131099851(0x7f0600cb, float:1.7812067E38)
            if (r27 == 0) goto L_0x005a
            r7 = 2131099954(0x7f060132, float:1.7812276E38)
        L_0x005a:
            r12 = 0
            r13.setShape(r12)
            r13.setCornerRadius(r14)
            int r7 = r5.getColor(r7)
            r13.setColor(r7)
            int r14 = X.C18240wQ.A02(r5, r3)
            r7 = 2131100113(0x7f0601d1, float:1.7812598E38)
            int r7 = r5.getColor(r7)
            r13.setStroke(r14, r7)
            r6.A09 = r13
            r7 = 2131100089(0x7f0601b9, float:1.781255E38)
            int r19 = r5.getColor(r7)
            r7 = r25
            com.instagram.common.typedurl.ImageUrl r14 = r7.A04
            java.lang.String r15 = "threads_quote_post_sticker"
            r18 = -1
            X.4yH r13 = new X.4yH
            r17 = r12
            r16 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r6.A0B = r13
            float r2 = X.C09860go.A03(r5, r2)
            int r9 = r26 - r9
            int r16 = r10 << 1
            int r9 = r9 - r16
            int r8 = r8 << 1
            int r9 = r9 - r8
            double r13 = r7.A00
            android.content.res.Resources r17 = r5.getResources()
            java.lang.Integer r19 = X.AnonymousClass006.A00
            X.68E r18 = X.AnonymousClass68E.MINUTES
            r20 = r13
            r22 = r12
            java.lang.String r10 = X.C19591Ayr.A09(r17, r18, r19, r20, r22)
            X.C04220Ms.A06(r10)
            X.F10 r8 = X.C86164wN.A0T(r5, r9)
            r6.A0C = r8
            r8.A0O(r10)
            java.lang.String r12 = "…"
            r8.A0I(r3, r12)
            r10 = 1017370378(0x3ca3d70a, float:0.02)
            r8.A0C(r10)
            X.C86134wK.A10(r5, r8, r2)
            int r8 = r8.A07
            int r9 = r9 - r8
            boolean r8 = r7.A0F
            if (r8 == 0) goto L_0x00ec
            r8 = 2131233143(0x7f080977, float:1.8082415E38)
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            if (r8 == 0) goto L_0x01d0
            android.graphics.drawable.Drawable r13 = r8.mutate()
            X.C04220Ms.A06(r13)
            r8 = 2131099707(0x7f06003b, float:1.7811775E38)
            X.C63393hP.A03(r5, r13, r8)
            r6.A00 = r13
            int r1 = r1 + r11
            int r9 = r9 - r1
        L_0x00ec:
            X.F10 r8 = X.C86164wN.A0T(r5, r9)
            r6.A0F = r8
            java.lang.String r1 = r7.A0A
            r8.A0O(r1)
            r15 = 1
            r8.A0I(r3, r12)
            android.graphics.Typeface r11 = android.graphics.Typeface.SANS_SERIF
            r8.A0L(r11, r3)
            r8.A0C(r10)
            r8.A0B(r2)
            r14 = 2131100092(0x7f0601bc, float:1.7812556E38)
            X.C86154wM.A19(r5, r8, r14)
            A00(r8, r0)
            int r4 = r26 - r16
            java.lang.String r1 = r7.A05
            int r8 = r1.length()
            if (r8 > 0) goto L_0x011a
            r15 = 0
        L_0x011a:
            r16 = 1066192077(0x3f8ccccd, float:1.1)
            r9 = 0
            r13 = 0
            if (r15 == 0) goto L_0x0147
            X.F10 r8 = X.C86164wN.A0T(r5, r4)
            r8.A0O(r1)
            r1 = 5
            r8.A0I(r1, r12)
            r8.A0K(r11)
            r1 = r16
            r8.A0D(r9, r1)
            r8.A0C(r10)
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r8.A0M(r1)
            r8.A0B(r2)
            X.C86154wM.A19(r5, r8, r14)
            A00(r8, r0)
            r6.A0E = r8
        L_0x0147:
            X.8s2 r8 = r7.A0C
            boolean r1 = X.C18190wL.A1a(r8)
            if (r1 == 0) goto L_0x01ce
            X.4xe r1 = new X.4xe
            r1.<init>(r5, r8, r4, r0)
        L_0x0154:
            r6.A0A = r1
            int r15 = r7.A02
            if (r15 <= 0) goto L_0x01cc
            android.content.res.Resources r14 = r5.getResources()
            X.C04220Ms.A06(r14)
            java.lang.String r8 = X.C86134wK.A0m(r14, r15, r3)
            r1 = 2131689486(0x7f0f000e, float:1.9007989E38)
            java.lang.String r15 = X.C18230wP.A0j(r14, r8, r1, r15)
            X.C04220Ms.A06(r15)
        L_0x016f:
            int r14 = r7.A01
            if (r14 <= 0) goto L_0x018c
            boolean r1 = r7.A0G
            if (r1 != 0) goto L_0x018c
            android.content.res.Resources r8 = r5.getResources()
            X.C04220Ms.A06(r8)
            java.lang.String r7 = X.C86134wK.A0m(r8, r14, r3)
            r1 = 2131689491(0x7f0f0013, float:1.9007999E38)
            java.lang.String r13 = X.C18230wP.A0j(r8, r7, r1, r14)
            X.C04220Ms.A06(r13)
        L_0x018c:
            if (r15 != 0) goto L_0x0192
            if (r13 == 0) goto L_0x01c8
            java.lang.String r15 = ""
        L_0x0192:
            java.lang.StringBuilder r7 = X.C18190wL.A0s(r15)
            int r1 = r7.length()
            if (r1 <= 0) goto L_0x01c9
            if (r13 == 0) goto L_0x01a6
            java.lang.String r1 = " • "
            r7.append(r1)
        L_0x01a3:
            r7.append(r13)
        L_0x01a6:
            X.F10 r4 = X.C86164wN.A0T(r5, r4)
            r4.A0O(r7)
            r4.A0I(r3, r12)
            r4.A0K(r11)
            r1 = r16
            r4.A0D(r9, r1)
            r4.A0C(r10)
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r4.A0M(r1)
            X.C86134wK.A10(r5, r4, r2)
            A00(r4, r0)
            r6.A0D = r4
        L_0x01c8:
            return
        L_0x01c9:
            if (r13 == 0) goto L_0x01a6
            goto L_0x01a3
        L_0x01cc:
            r15 = r13
            goto L_0x016f
        L_0x01ce:
            r1 = r13
            goto L_0x0154
        L_0x01d0:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4y3.<init>(android.content.Context, X.5Hp, int, boolean):void");
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2;
        F10 f10 = this.A0E;
        int i3 = 0;
        if (f10 != null) {
            i = f10.A04;
        } else {
            i = 0;
        }
        C86424xe r0 = this.A0A;
        if (r0 != null) {
            i2 = this.A05 + r0.A00;
        } else {
            i2 = 0;
        }
        F10 f102 = this.A0D;
        if (f102 != null) {
            i3 = this.A05 + f102.A04;
        }
        int i4 = this.A04;
        return this.A03 + i4 + this.A02 + i + i2 + i3 + i4;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        super.setBounds(i7, i8, i3, i4);
        int i9 = this.A01 + i;
        int intrinsicHeight = getIntrinsicHeight() + i2;
        this.A09.setBounds(i7, i8, i9, intrinsicHeight);
        boolean z = this.A0G;
        int i10 = this.A04;
        int i11 = i10 + i;
        int i12 = i11;
        if (z) {
            i11 = (i9 - i10) - this.A03;
        }
        int i13 = i2 + i10;
        int i14 = this.A03;
        int i15 = i11 + i14;
        int i16 = i14 + i13;
        this.A0B.setBounds(i11, i13, i15, i16);
        F10 f10 = this.A0C;
        F10 f102 = f10;
        int i17 = f10.A07;
        int i18 = i9 - i10;
        int i19 = i18;
        if (z) {
            i18 = i12 + i17;
        }
        int i20 = i18 - i17;
        int i21 = this.A06;
        if (z) {
            i5 = i21 + i18;
        } else {
            i5 = i15 + i21;
        }
        float f = ((float) i13) + (((float) i14) / 2.0f);
        F10 f103 = this.A0F;
        float f2 = ((float) f103.A04) / 2.0f;
        int A022 = AnonymousClass8bA.A02(f - f2);
        int A023 = AnonymousClass8bA.A02(f2 + f);
        int i22 = i20 - i21;
        if (z) {
            i22 = i11 - i21;
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            int i23 = this.A07;
            int i24 = this.A08;
            int i25 = i23 + i24;
            if (z) {
                i5 += i25;
            } else {
                i22 -= i25;
            }
            int i26 = f103.A07;
            if (z) {
                i6 = ((i22 - i26) - i24) - i23;
            } else {
                i6 = i26 + i5 + i24;
            }
            float f3 = ((float) i23) / 2.0f;
            drawable.setBounds(i6, AnonymousClass8bA.A02(f - f3), i23 + i6, AnonymousClass8bA.A02(f + f3));
        }
        int i27 = A022;
        int i28 = A023;
        f103.setBounds(i5, i27, i22, i28);
        f102.setBounds(i20, i27, i18, i28);
        int i29 = i16 + this.A02;
        F10 f104 = this.A0E;
        if (f104 != null) {
            int i30 = f104.A04 + i29;
            f104.setBounds(i12, i29, i19, i30);
            i29 = i30;
        }
        C86424xe r1 = this.A0A;
        if (r1 != null) {
            int i31 = i29 + this.A05;
            if (z) {
                i9 = i19;
            } else {
                i7 = i12;
            }
            r1.setBounds(i7, i31, i9, r1.A00 + i31);
        }
        F10 f105 = this.A0D;
        if (f105 != null) {
            int i32 = f105.A04;
            int A024 = AnonymousClass8bA.A02((((float) AnonymousClass8bA.A02(((float) (intrinsicHeight - i10)) - (((float) i32) / 2.0f))) - (((float) i32) / 2.0f)) + (f105.A0R.descent() / 2.0f));
            f105.setBounds(i12, A024, i19, i32 + A024);
        }
    }

    public static final void A00(F10 f10, boolean z) {
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

    public final void draw(Canvas canvas) {
        Rect A0D2 = C86114wI.A0D(this, canvas);
        canvas.save();
        canvas.clipRect(A0D2);
        this.A09.draw(canvas);
        this.A0B.draw(canvas);
        this.A0C.draw(canvas);
        this.A0F.draw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        F10 f10 = this.A0E;
        if (f10 != null) {
            f10.draw(canvas);
        }
        C86424xe r0 = this.A0A;
        if (r0 != null) {
            r0.draw(canvas);
        }
        F10 f102 = this.A0D;
        if (f102 != null) {
            f102.draw(canvas);
        }
        canvas.restore();
    }
}
