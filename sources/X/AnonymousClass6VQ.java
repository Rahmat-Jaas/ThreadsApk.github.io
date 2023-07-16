package X;

/* renamed from: X.6VQ  reason: invalid class name */
public final class AnonymousClass6VQ {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        r8 = (android.text.style.ClickableSpan[]) ((android.text.Spanned) r10.getText()).getSpans(r2, r2, android.text.style.ClickableSpan.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r1 > r10.getLineRight(r2)) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.text.Layout r10, android.view.MotionEvent r11, android.view.View r12) {
        /*
            int r3 = r11.getAction()
            r9 = 1
            r5 = 0
            if (r3 == r9) goto L_0x000a
            if (r3 != 0) goto L_0x00a3
        L_0x000a:
            float r0 = r11.getX()
            int r4 = (int) r0
            float r0 = r11.getY()
            int r1 = (int) r0
            int r0 = r12.getPaddingLeft()
            int r4 = r4 - r0
            int r0 = r12.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r12.getScrollX()
            int r4 = r4 + r0
            int r0 = r12.getScrollY()
            int r1 = r1 + r0
            int r2 = r10.getLineForVertical(r1)
            float r0 = r10.getLineLeft(r2)
            float r1 = (float) r4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x003e
            float r0 = r10.getLineRight(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = 1
            if (r0 <= 0) goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r2 = r10.getOffsetForHorizontal(r2, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0099 }
            r0 = -1
            if (r2 == r0) goto L_0x00a3
            java.lang.CharSequence r1 = r10.getText()
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r8 = r1.getSpans(r2, r2, r0)
            android.text.style.ClickableSpan[] r8 = (android.text.style.ClickableSpan[]) r8
            int r7 = r8.length
            if (r7 == 0) goto L_0x00a3
            if (r3 != r9) goto L_0x0060
            if (r7 != r9) goto L_0x0061
            r0 = r8[r5]
        L_0x005d:
            r0.onClick(r12)
        L_0x0060:
            return r9
        L_0x0061:
            java.lang.CharSequence r10 = r10.getText()
            android.text.Spanned r10 = (android.text.Spanned) r10
            r0 = r8[r5]
            int r6 = r10.getSpanEnd(r0)
            r0 = r8[r5]
            int r0 = r10.getSpanStart(r0)
            int r6 = r6 - r0
            r5 = r6
            r4 = 0
            r3 = 0
            r2 = 1
        L_0x0078:
            r0 = r8[r2]
            int r1 = r10.getSpanEnd(r0)
            r0 = r8[r2]
            int r0 = r10.getSpanStart(r0)
            int r1 = r1 - r0
            if (r1 >= r6) goto L_0x0089
            r3 = r2
            r6 = r1
        L_0x0089:
            if (r1 <= r5) goto L_0x008d
            r4 = r2
            r5 = r1
        L_0x008d:
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x0078
            if (r11 == 0) goto L_0x0096
            r0 = r8[r3]
            goto L_0x005d
        L_0x0096:
            r0 = r8[r4]
            goto L_0x005d
        L_0x0099:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "IgSpannableTouchHelper HorizontalMeasurementProvider crash...."
            X.C10450iM.A03(r0, r1)
        L_0x00a3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VQ.A00(android.text.Layout, android.view.MotionEvent, android.view.View):boolean");
    }
}
