package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0xF  reason: invalid class name and case insensitive filesystem */
public final class C18470xF extends Drawable implements Drawable.Callback {
    public Bitmap A00;
    public boolean A01 = true;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = new Paint(3);
    public final Integer A07;
    public final List A08;
    public final List A09 = AnonymousClass0wJ.A0v();
    public final List A0A = AnonymousClass0wJ.A0v();
    public final List A0B = AnonymousClass0wJ.A0v();

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A01 = true;
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A05;
    }

    public final void setAlpha(int i) {
        for (Drawable alpha : this.A08) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (Drawable colorFilter2 : this.A08) {
            colorFilter2.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x010b, code lost:
        if (r8 < 0) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18470xF(android.content.Context r16, java.lang.Integer r17, java.util.List r18, float r19, int r20, int r21, int r22) {
        /*
            r15 = this;
            r15.<init>()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r15.A08 = r2
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r15.A09 = r0
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r15.A0A = r0
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r15.A0B = r0
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r15.A06 = r0
            r9 = 1
            r15.A01 = r9
            r11 = r20
            r15.A04 = r11
            r10 = r21
            r15.A03 = r10
            r13 = r17
            r15.A07 = r13
            boolean r0 = X.AnonymousClass0hB.A02(r16)
            r12 = r18
            if (r0 == 0) goto L_0x00ff
            java.util.Collections.reverse(r12)
            int r8 = r12.size()
            int r8 = r8 - r9
            int r8 = r8 - r22
        L_0x0044:
            r2.addAll(r12)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x013e
            float r14 = (float) r10
            r0 = r19
            float r0 = -r0
            float r14 = r14 * r0
            int r7 = r12.size()
            int r7 = r7 - r9
            int r7 = r7 * r21
            int r1 = r12.size()
            int r1 = r1 - r9
            int r0 = java.lang.Math.round(r14)
            int r1 = r1 * r0
            int r7 = r7 + r1
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x0069:
            int r0 = r12.size()
            if (r6 >= r0) goto L_0x0103
            java.lang.Object r1 = r12.get(r6)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r1.setCallback(r15)
            r5 = r10
            if (r6 != r8) goto L_0x007c
            r5 = r11
        L_0x007c:
            r0 = 0
            r1.setBounds(r0, r0, r5, r5)
            java.util.List r5 = r15.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5.add(r0)
            java.util.List r5 = r15.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.add(r0)
            java.util.List r5 = r15.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.add(r0)
            int r5 = r13.intValue()
            r0 = 2
            if (r5 == r0) goto L_0x00ea
            if (r5 == r9) goto L_0x00ea
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.width()
            int r5 = r3 + r0
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.height()
            int r4 = java.lang.Math.max(r4, r0)
        L_0x00ba:
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.width()
            int r3 = r3 + r0
            float r0 = (float) r3
            float r0 = r0 + r14
            int r3 = java.lang.Math.round(r0)
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.height()
            int r2 = r2 + r0
            float r0 = (float) r2
            float r0 = r0 + r14
            int r2 = java.lang.Math.round(r0)
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.width()
            int r7 = r7 - r0
            float r0 = (float) r7
            float r0 = r0 - r14
            int r7 = java.lang.Math.round(r0)
            int r6 = r6 + 1
            goto L_0x0069
        L_0x00ea:
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.width()
            int r5 = r3 + r0
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.height()
            int r4 = r2 + r0
            goto L_0x00ba
        L_0x00ff:
            r8 = r22
            goto L_0x0044
        L_0x0103:
            int r3 = r12.size()
            r2 = 0
            if (r3 <= r8) goto L_0x010d
            r0 = 1
            if (r8 >= 0) goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            X.AnonymousClass7Ko.A0B(r0)
            java.util.ArrayList r1 = X.C18240wQ.A0k(r3)
        L_0x0115:
            if (r2 >= r8) goto L_0x011d
            X.C18200wM.A1U(r1, r2)
            int r2 = r2 + 1
            goto L_0x0115
        L_0x011d:
            int r3 = r3 - r9
        L_0x011e:
            if (r3 <= r8) goto L_0x0126
            X.C18200wM.A1U(r1, r3)
            int r3 = r3 + -1
            goto L_0x011e
        L_0x0126:
            X.C18200wM.A1U(r1, r8)
            java.util.List r0 = r15.A08
            A00(r1, r0)
            java.util.List r0 = r15.A0B
            A00(r1, r0)
            java.util.List r0 = r15.A09
            A00(r1, r0)
            java.util.List r0 = r15.A0A
            A00(r1, r0)
            goto L_0x0140
        L_0x013e:
            r4 = 0
            r5 = 0
        L_0x0140:
            r15.A02 = r4
            r15.A05 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18470xF.<init>(android.content.Context, java.lang.Integer, java.util.List, float, int, int, int):void");
    }

    public static void A00(List list, List list2) {
        ArrayList A0s = C18200wM.A0s(list2);
        list2.clear();
        for (Object A042 : list) {
            list2.add(A0s.get(AnonymousClass0wJ.A04(A042)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7 A[EDGE_INSN: B:44:0x00c7->B:37:0x00c7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            android.graphics.Rect r4 = r11.getBounds()
            int r0 = r4.width()
            if (r0 <= 0) goto L_0x00e6
            int r0 = r4.height()
            if (r0 <= 0) goto L_0x00e6
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00c7
            android.graphics.Bitmap r0 = r11.A00
            r3 = 0
            if (r0 == 0) goto L_0x00b5
            int r1 = r0.getWidth()
            int r0 = r4.width()
            if (r1 != r0) goto L_0x00b0
            android.graphics.Bitmap r0 = r11.A00
            int r1 = r0.getHeight()
            int r0 = r4.height()
            if (r1 != r0) goto L_0x00b0
            android.graphics.Bitmap r0 = r11.A00
            r0.eraseColor(r3)
        L_0x0034:
            android.graphics.Bitmap r0 = r11.A00
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r0)
            int r1 = r11.A04
            int r0 = r11.A03
            int r1 = r1 - r0
            float r5 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
        L_0x0044:
            java.util.List r7 = r11.A08
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00c7
            java.util.List r0 = r11.A09
            java.lang.Object r0 = r0.get(r3)
            int r10 = X.AnonymousClass0wJ.A04(r0)
            java.util.List r0 = r11.A0B
            java.lang.Object r0 = r0.get(r3)
            int r9 = X.AnonymousClass0wJ.A04(r0)
            java.util.List r0 = r11.A0A
            java.lang.Object r0 = r0.get(r3)
            int r2 = X.AnonymousClass0wJ.A04(r0)
            r6.save()
            java.lang.Integer r0 = r11.A07
            int r1 = r0.intValue()
            r8 = 1
            r0 = 2
            if (r1 == r0) goto L_0x00aa
            if (r1 == r8) goto L_0x00a8
            r0 = 3
            r2 = 0
            if (r1 == r0) goto L_0x009b
            r0 = 0
            if (r1 != r0) goto L_0x008c
            float r1 = (float) r10
            int r0 = r7.size()
            int r0 = r0 - r8
            if (r3 == r0) goto L_0x0089
            r2 = r5
        L_0x0089:
            r6.translate(r1, r2)
        L_0x008c:
            java.lang.Object r0 = r7.get(r3)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.draw(r6)
            r6.restore()
            int r3 = r3 + 1
            goto L_0x0044
        L_0x009b:
            int r0 = r7.size()
            int r0 = r0 - r8
            if (r3 == r0) goto L_0x00a3
            r2 = r5
        L_0x00a3:
            float r0 = (float) r9
            r6.translate(r2, r0)
            goto L_0x008c
        L_0x00a8:
            float r1 = (float) r10
            goto L_0x00ab
        L_0x00aa:
            float r1 = (float) r2
        L_0x00ab:
            float r0 = (float) r9
            r6.translate(r1, r0)
            goto L_0x008c
        L_0x00b0:
            android.graphics.Bitmap r0 = r11.A00
            r0.recycle()
        L_0x00b5:
            int r2 = r4.width()
            int r1 = r4.height()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r11.A00 = r0
            goto L_0x0034
        L_0x00c7:
            android.graphics.Bitmap r0 = r11.A00
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00df
            android.graphics.Bitmap r3 = r11.A00
            int r0 = r4.left
            float r2 = (float) r0
            int r0 = r4.top
            float r1 = (float) r0
            android.graphics.Paint r0 = r11.A06
            r12.drawBitmap(r3, r2, r1, r0)
            return
        L_0x00df:
            java.lang.String r1 = "PileDrawable"
            java.lang.String r0 = "bitmap is null or recycled"
            X.C10450iM.A03(r1, r0)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18470xF.draw(android.graphics.Canvas):void");
    }
}
