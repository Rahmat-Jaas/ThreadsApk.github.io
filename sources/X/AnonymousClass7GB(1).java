package X;

/* renamed from: X.7GB  reason: invalid class name */
public final class AnonymousClass7GB {
    public static final AnonymousClass7GB A00 = new AnonymousClass7GB();

    public static final int A01(String str) {
        float f;
        C04220Ms.A0B(str, 0);
        String A0P = AnonymousClass8bP.A0P(str);
        try {
            if (A0P.length() == 0) {
                return 0;
            }
            f = AnonymousClass7Kk.A02(A0P);
            return (int) f;
        } catch (C29721zB unused) {
            int A002 = AnonymousClass2C6.A00(A0P);
            StringBuilder A0s = C18190wL.A0s(A0P);
            if (Character.isDigit((char) A0P.codePointAt(A002 - 1))) {
                A0s.append("dp");
            }
            try {
                f = AnonymousClass7Kk.A01(A0s.toString());
            } catch (C29721zB unused2) {
                return 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e2, code lost:
        r26 = r15;
        r14 = r11;
        r15 = r10;
        r13 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(android.graphics.RectF r28, android.text.Spannable r29, android.text.TextPaint r30, X.C112976qV r31, X.C90945fL r32, X.MNV r33, X.AnonymousClass7GB r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, boolean r42) {
        /*
            r13 = r37
            r9 = r38
            int r0 = r38 - r37
            r24 = r39
            int r0 = r0 / r39
            r1 = 2
            int r0 = r0 / r1
            int r0 = r0 * r39
            int r7 = r37 + r0
            r6 = 1
            android.text.style.AbsoluteSizeSpan r5 = new android.text.style.AbsoluteSizeSpan
            r5.<init>(r7, r6)
            r11 = r29
            int r0 = r11.length()
            r4 = 0
            r11.setSpan(r5, r4, r0, r4)
            r27 = r42
            r15 = r41
            r12 = r28
            r28 = r31
            r20 = r35
            r21 = r36
            if (r42 == 0) goto L_0x0058
            float r2 = (float) r7
            r0 = r28
            android.content.Context r0 = r0.A04
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r0)
            float r0 = android.util.TypedValue.applyDimension(r15, r2, r0)
            int r0 = (int) r0
            float r8 = (float) r0
            r10 = 1050253722(0x3e99999a, float:0.3)
            float r10 = r10 * r8
            r0 = 1039516303(0x3df5c28f, float:0.12)
            float r8 = r8 * r0
            int r0 = android.view.View.MeasureSpec.getSize(r20)
            float r3 = (float) r0
            float r2 = (float) r1
            float r10 = r10 * r2
            float r3 = r3 - r10
            int r0 = android.view.View.MeasureSpec.getSize(r21)
            float r1 = (float) r0
            float r2 = r2 * r8
            float r1 = r1 - r2
            r0 = 0
            r12.set(r0, r0, r3, r1)
        L_0x0058:
            r17 = r32
            r18 = r33
            r16 = r28
            r19 = r11
            X.7h1 r0 = X.M2P.A01(r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r0.A04
            X.6mk r1 = (X.C111076mk) r1
            if (r1 == 0) goto L_0x014a
            r0 = r28
            android.content.Context r2 = r0.A04
            X.C04220Ms.A06(r2)
            android.text.Layout r14 = r1.A02
            r10 = r30
            r10.reset()
            android.text.TextPaint r0 = r14.getPaint()
            r10.set(r0)
            float r1 = (float) r7
            android.util.DisplayMetrics r0 = X.C18230wP.A0E(r2)
            float r0 = android.util.TypedValue.applyDimension(r15, r1, r0)
            int r0 = (int) r0
            float r0 = (float) r0
            r10.setTextSize(r0)
            android.text.Layout$Alignment r1 = r14.getAlignment()
            X.C04220Ms.A06(r1)
            float r0 = r12.right
            int r2 = X.AnonymousClass8bA.A02(r0)
            r8 = r40
            r3 = r8
            int r0 = r11.length()
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r11, r4, r0, r10, r2)
            X.C04220Ms.A06(r2)
            android.text.StaticLayout$Builder r1 = r2.setAlignment(r1)
            r0 = -1
            if (r8 != r0) goto L_0x00b2
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b2:
            r1.setMaxLines(r3)
            android.text.StaticLayout r1 = r2.build()
            X.C04220Ms.A06(r1)
            r16 = 1
            if (r8 == r0) goto L_0x00f6
            int r0 = r14.getLineCount()
            if (r0 > r8) goto L_0x00d5
            int r0 = r14.getLineCount()
            int r0 = r0 - r6
            int r2 = r14.getLineEnd(r0)
            int r0 = r11.length()
            if (r2 == r0) goto L_0x00f6
        L_0x00d5:
            r11.removeSpan(r5)
            r19 = r34
            if (r16 == 0) goto L_0x00e0
            if (r9 > r13) goto L_0x0135
            r7 = -1
        L_0x00df:
            return r7
        L_0x00e0:
            if (r9 <= r13) goto L_0x00df
            int r22 = r7 + r39
            r23 = r9
            r25 = r8
            r26 = r15
            r16 = r28
            r14 = r11
            r15 = r10
            r13 = r12
            int r0 = A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r0 >= r7) goto L_0x0149
            return r7
        L_0x00f6:
            int r0 = r1.getHeight()
            float r2 = (float) r0
            float r0 = r12.bottom
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00d5
            int r0 = r1.getLineCount()
            X.8bH r2 = X.AnonymousClass8bI.A0C(r4, r0)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0119
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0119
        L_0x0116:
            r16 = 0
            goto L_0x00d5
        L_0x0119:
            java.util.Iterator r3 = r2.iterator()
        L_0x011d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0116
            r0 = r3
            X.83z r0 = (X.C1367083z) r0
            int r0 = r0.A00()
            float r2 = r1.getLineWidth(r0)
            float r0 = r12.right
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            goto L_0x00d5
        L_0x0135:
            int r7 = r7 - r39
            r22 = r13
            r23 = r7
            r25 = r8
            r26 = r15
            r16 = r28
            r14 = r11
            r15 = r10
            r13 = r12
            int r7 = A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r7
        L_0x0149:
            return r0
        L_0x014a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GB.A00(android.graphics.RectF, android.text.Spannable, android.text.TextPaint, X.6qV, X.5fL, X.MNV, X.7GB, int, int, int, int, int, int, int, boolean):int");
    }
}
