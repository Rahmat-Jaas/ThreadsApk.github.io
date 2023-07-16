package X;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7Ye  reason: invalid class name and case insensitive filesystem */
public final class C123707Ye implements C143058g2 {
    public final long A00;
    public final C115526vM A01;
    public final C123727Yg A02;
    public final CharSequence A03;
    public final List A04;
    public final C04530Oa A05;
    public final int A06;

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b1, code lost:
        if (r1.length == 0) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0222, code lost:
        if (r9 <= r15.A01.A08.getEllipsisStart(r13)) goto L_0x0224;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b9 A[LOOP:1: B:116:0x01b7->B:117:0x01b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C123707Ye(X.C123727Yg r25, int r26, long r27, boolean r29) {
        /*
            r24 = this;
            r15 = r24
            r15.<init>()
            r6 = r25
            r15.A02 = r6
            r5 = r26
            r15.A06 = r5
            r8 = r27
            r15.A00 = r8
            int r0 = androidx.compose.ui.unit.Constraints.A03(r8)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x02cd
            int r0 = androidx.compose.ui.unit.Constraints.A04(r8)
            if (r0 != 0) goto L_0x02cd
            if (r5 < r3) goto L_0x02c6
            X.7If r2 = r6.A02
            r12 = 0
            if (r29 == 0) goto L_0x0047
            X.7F0 r0 = r2.A02
            long r0 = r0.A02
            long r10 = X.AnonymousClass7Hi.A03(r4)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0047
            long r10 = X.AnonymousClass7HC.A01
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0047
            X.7Ex r0 = r2.A00
            X.7Ee r1 = r0.A08
            if (r1 == 0) goto L_0x0047
            r0 = 5
            int r1 = r1.A00
            if (r1 == r0) goto L_0x0047
            r0 = 4
            if (r1 == r0) goto L_0x0047
            r12 = 1
        L_0x0047:
            java.lang.CharSequence r10 = r6.A06
            if (r12 == 0) goto L_0x0071
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0071
            boolean r0 = r10 instanceof android.text.Spannable
            if (r0 != 0) goto L_0x005b
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r10)
            r10 = r0
        L_0x005b:
            android.text.Spannable r10 = (android.text.Spannable) r10
            X.7QH r7 = new X.7QH
            r7.<init>()
            int r6 = r10.length()
            int r6 = r6 - r3
            int r1 = r10.length()
            int r1 = r1 - r3
            r0 = 33
            r10.setSpan(r7, r6, r1, r0)
        L_0x0071:
            r15.A03 = r10
            X.7Ex r1 = r2.A00
            X.7Ee r6 = r1.A08
            r17 = 0
            if (r6 == 0) goto L_0x0081
            int r7 = r6.A00
            if (r7 != r3) goto L_0x0140
            r17 = 3
        L_0x0081:
            r7 = 4
            if (r6 != 0) goto L_0x0138
            r18 = 0
        L_0x0086:
            X.6sy r0 = r1.A05
            int r20 = X.AnonymousClass6FJ.A00(r0)
            X.6t2 r6 = r1.A06
            r14 = 0
            if (r6 == 0) goto L_0x0135
            int r0 = r6.A00
            r1 = r0 & 255(0xff, float:3.57E-43)
            X.6sz r0 = new X.6sz
            r0.<init>(r1)
        L_0x009a:
            r21 = 0
            if (r0 == 0) goto L_0x00a7
            int r1 = r0.A00
            if (r1 == r3) goto L_0x00a7
            r0 = 2
            if (r1 != r0) goto L_0x012e
            r21 = 1
        L_0x00a7:
            if (r6 == 0) goto L_0x012c
            int r0 = r6.A00
            int r0 = r0 >> 8
            r1 = r0 & 255(0xff, float:3.57E-43)
            X.6t0 r0 = new X.6t0
            r0.<init>(r1)
        L_0x00b4:
            r22 = 0
            if (r0 == 0) goto L_0x00c1
            int r1 = r0.A00
            if (r1 == r3) goto L_0x00c1
            r0 = 2
            if (r1 != r0) goto L_0x0121
            r22 = 1
        L_0x00c1:
            if (r6 == 0) goto L_0x011f
            int r0 = r6.A00
            int r0 = r0 >> 16
            r1 = r0 & 255(0xff, float:3.57E-43)
            X.6t1 r0 = new X.6t1
            r0.<init>(r1)
        L_0x00ce:
            r23 = 0
            if (r0 == 0) goto L_0x00db
            int r1 = r0.A00
            if (r1 == r3) goto L_0x00db
            r0 = 2
            if (r1 != r0) goto L_0x00db
            r23 = 1
        L_0x00db:
            if (r29 == 0) goto L_0x011c
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
        L_0x00df:
            r19 = r5
            X.6vM r6 = r15.A00(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r29 == 0) goto L_0x0158
            boolean r0 = r6.A0B
            android.text.Layout r1 = r6.A08
            if (r0 == 0) goto L_0x0117
            int r0 = r6.A04
            int r0 = r0 + -1
            int r1 = r1.getLineBottom(r0)
        L_0x00f5:
            int r0 = r6.A05
            int r1 = r1 + r0
            int r0 = r6.A02
            int r1 = r1 + r0
            int r0 = r6.A03
            int r1 = r1 + r0
            int r7 = androidx.compose.ui.unit.Constraints.A01(r8)
            if (r1 <= r7) goto L_0x0158
            if (r5 <= r3) goto L_0x0158
            int r8 = r6.A04
            r1 = 0
        L_0x0109:
            if (r1 >= r8) goto L_0x015b
            float r9 = r6.A01(r1)
            float r0 = (float) r7
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x015c
            int r1 = r1 + 1
            goto L_0x0109
        L_0x0117:
            int r1 = r1.getHeight()
            goto L_0x00f5
        L_0x011c:
            r16 = r14
            goto L_0x00df
        L_0x011f:
            r0 = r14
            goto L_0x00ce
        L_0x0121:
            r0 = 3
            if (r1 != r0) goto L_0x0127
            r22 = 2
            goto L_0x00c1
        L_0x0127:
            if (r1 != r7) goto L_0x00c1
            r22 = 3
            goto L_0x00c1
        L_0x012c:
            r0 = r14
            goto L_0x00b4
        L_0x012e:
            r0 = 3
            if (r1 != r0) goto L_0x00a7
            r21 = 2
            goto L_0x00a7
        L_0x0135:
            r0 = r14
            goto L_0x009a
        L_0x0138:
            int r0 = r6.A00
            boolean r18 = X.AnonymousClass0wJ.A1T(r0, r7)
            goto L_0x0086
        L_0x0140:
            r0 = 2
            if (r7 != r0) goto L_0x0147
            r17 = 4
            goto L_0x0081
        L_0x0147:
            r0 = 3
            if (r7 != r0) goto L_0x014e
            r17 = 2
            goto L_0x0081
        L_0x014e:
            r0 = 5
            if (r7 == r0) goto L_0x0081
            r0 = 6
            if (r7 != r0) goto L_0x0081
            r17 = 1
            goto L_0x0081
        L_0x0158:
            r15.A01 = r6
            goto L_0x016b
        L_0x015b:
            r1 = r8
        L_0x015c:
            if (r1 < 0) goto L_0x0169
            if (r1 == r5) goto L_0x0169
            if (r1 >= r3) goto L_0x0163
            r1 = 1
        L_0x0163:
            r19 = r1
            X.6vM r6 = r15.A00(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0169:
            r15.A01 = r6
        L_0x016b:
            X.7Yg r0 = r15.A02
            X.4zW r5 = r0.A05
            X.7F0 r0 = r2.A02
            X.8nH r0 = r0.A0D
            X.6nD r3 = r0.AUS()
            long r1 = X.AnonymousClass7An.A02(r15)
            float r0 = r0.AQV()
            r5.A00(r3, r0, r1)
            X.6vM r0 = r15.A01
            android.text.Layout r1 = r0.A08
            java.lang.CharSequence r0 = r1.getText()
            X.C04220Ms.A06(r0)
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x01b3
            java.lang.CharSequence r2 = r1.getText()
            X.C04220Ms.A06(r2)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r1.getText()
            X.C04220Ms.A06(r0)
            int r1 = r0.length()
            java.lang.Class<X.4zc> r0 = X.C86964zc.class
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r0)
            X.4zc[] r1 = (X.C86964zc[]) r1
            X.C04220Ms.A04(r1)
            int r0 = r1.length
            if (r0 != 0) goto L_0x01b5
        L_0x01b3:
            X.4zc[] r1 = new X.C86964zc[r4]
        L_0x01b5:
            int r6 = r1.length
            r5 = 0
        L_0x01b7:
            if (r5 >= r6) goto L_0x01c4
            r0 = r1[r5]
            long r2 = X.AnonymousClass7An.A02(r15)
            r0.A00 = r2
            int r5 = r5 + 1
            goto L_0x01b7
        L_0x01c4:
            java.lang.CharSequence r1 = r15.A03
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x01dd
            X.0ZV r8 = X.AnonymousClass0ZV.A00
        L_0x01cc:
            r15.A04 = r8
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1 r0 = X.C86154wM.A13(r15, r0)
            X.0Oa r0 = X.AnonymousClass0OY.A01(r1, r0)
            r15.A05 = r0
            return
        L_0x01dd:
            r7 = r1
            android.text.Spanned r7 = (android.text.Spanned) r7
            int r1 = r1.length()
            java.lang.Class<X.4zv> r0 = X.C87154zv.class
            java.lang.Object[] r6 = r7.getSpans(r4, r1, r0)
            X.C04220Ms.A06(r6)
            int r5 = r6.length
            java.util.ArrayList r8 = X.C18240wQ.A0k(r5)
            r3 = 0
        L_0x01f3:
            if (r3 >= r5) goto L_0x01cc
            r10 = r6[r3]
            X.4zv r10 = (X.C87154zv) r10
            int r2 = r7.getSpanStart(r10)
            int r9 = r7.getSpanEnd(r10)
            X.6vM r0 = r15.A01
            android.text.Layout r0 = r0.A08
            int r13 = r0.getLineForOffset(r2)
            int r0 = r15.A06
            boolean r12 = X.C86114wI.A1U(r13, r0)
            X.6vM r0 = r15.A01
            android.text.Layout r0 = r0.A08
            int r0 = r0.getEllipsisCount(r13)
            if (r0 <= 0) goto L_0x0224
            X.6vM r0 = r15.A01
            android.text.Layout r0 = r0.A08
            int r0 = r0.getEllipsisStart(r13)
            r11 = 1
            if (r9 > r0) goto L_0x0225
        L_0x0224:
            r11 = 0
        L_0x0225:
            X.6vM r0 = r15.A01
            android.text.Layout r1 = r0.A08
            int r0 = r1.getEllipsisStart(r13)
            if (r0 != 0) goto L_0x02ae
            int r0 = r1.getLineEnd(r13)
        L_0x0233:
            boolean r0 = X.C86134wK.A1X(r9, r0)
            if (r11 != 0) goto L_0x02ac
            if (r0 != 0) goto L_0x02ac
            if (r12 != 0) goto L_0x02ac
            X.6vM r0 = r15.A01
            android.text.Layout r0 = r0.A08
            boolean r0 = r0.isRtlCharAt(r2)
            if (r0 == 0) goto L_0x02a9
            X.66n r0 = X.C967466n.Rtl
        L_0x0249:
            int r1 = r0.ordinal()
            r11 = 2
            X.6vM r0 = r15.A01
            float r9 = r0.A03(r2, r4)
            if (r1 == r4) goto L_0x025e
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x02bf
            int r0 = r10.A00
            float r0 = (float) r0
            float r9 = r9 - r0
        L_0x025e:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x02b8
            int r0 = r10.A00
            float r2 = (float) r0
            float r2 = r2 + r9
            X.6vM r12 = r15.A01
            int r0 = r10.A04
            switch(r0) {
                case 0: goto L_0x029e;
                case 1: goto L_0x0299;
                case 2: goto L_0x0290;
                default: goto L_0x026d;
            }
        L_0x026d:
            float r1 = r12.A02(r13)
            float r0 = r12.A01(r13)
            float r1 = r1 + r0
            int r0 = r10.A00()
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = (float) r11
            float r1 = r1 / r0
        L_0x027e:
            int r0 = r10.A00()
            float r0 = (float) r0
            float r0 = r0 + r1
            X.7F6 r10 = new X.7F6
            r10.<init>(r9, r1, r2, r0)
        L_0x0289:
            r8.add(r10)
            int r3 = r3 + 1
            goto L_0x01f3
        L_0x0290:
            float r1 = r12.A01(r13)
            int r0 = r10.A00()
            goto L_0x02a6
        L_0x0299:
            float r1 = r12.A02(r13)
            goto L_0x027e
        L_0x029e:
            float r1 = r12.A00(r13)
            int r0 = r10.A00()
        L_0x02a6:
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L_0x027e
        L_0x02a9:
            X.66n r0 = X.C967466n.Ltr
            goto L_0x0249
        L_0x02ac:
            r10 = r14
            goto L_0x0289
        L_0x02ae:
            java.lang.CharSequence r0 = r1.getText()
            int r0 = r0.length()
            goto L_0x0233
        L_0x02b8:
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x02bf:
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x02c6:
            java.lang.String r0 = "maxLines should be greater than 0"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x02cd:
            java.lang.String r0 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123707Ye.<init>(X.7Yg, int, long, boolean):void");
    }

    private final C115526vM A00(TextUtils.TruncateAt truncateAt, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        AnonymousClass79A r0;
        CharSequence charSequence = this.A03;
        float A022 = (float) Constraints.A02(this.A00);
        C123727Yg r02 = this.A02;
        C86904zW r1 = r02.A05;
        int i8 = r02.A01;
        C113916sN r3 = r02.A03;
        AnonymousClass79N r03 = r02.A02.A01;
        if (r03 == null || (r0 = r03.A00) == null) {
            z = true;
        } else {
            z = r0.A00;
        }
        return new C115526vM(r1, truncateAt, r3, charSequence, A022, i, i8, i3, i5, i6, i7, i4, i2, z);
    }

    public static final void A01(C146678mg r6, C123707Ye r7) {
        Canvas canvas = ((C123447Wy) r6).A00;
        C115526vM r62 = r7.A01;
        boolean z = r62.A0B;
        if (z) {
            canvas.save();
            canvas.clipRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) Constraints.A02(r7.A00), r7.Amg());
        }
        if (canvas.getClipBounds(r62.A07)) {
            int i = r62.A05;
            if (i != 0) {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i);
            }
            AnonymousClass4xA r1 = AnonymousClass6ZS.A00;
            r1.A00 = canvas;
            r62.A08.draw(r1);
            if (i != 0) {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((float) -1) * ((float) i));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public final float Amg() {
        int height;
        C115526vM r2 = this.A01;
        boolean z = r2.A0B;
        Layout layout = r2.A08;
        if (z) {
            height = layout.getLineBottom(r2.A04 - 1);
        } else {
            height = layout.getHeight();
        }
        return (float) (height + r2.A05 + r2.A02 + r2.A03);
    }
}
