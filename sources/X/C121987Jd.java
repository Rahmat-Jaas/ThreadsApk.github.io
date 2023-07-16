package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Jd  reason: invalid class name and case insensitive filesystem */
public final class C121987Jd {
    public static final C121987Jd A00 = new C121987Jd();
    public static final Map A01 = AnonymousClass4WJ.A0G(C18180wK.A0p(AnonymousClass686.HEADER, C969567j.HEADER_OVERLAP), C18180wK.A0p(AnonymousClass686.TOOLBAR, C969567j.TOOLBAR_OVERLAP));

    public static final void A02(Rect rect, RCTextView rCTextView, int i) {
        Layout layout = rCTextView.A06;
        TextPaint paint = layout.getPaint();
        C04220Ms.A06(paint);
        CharSequence subSequence = rCTextView.A07.subSequence(layout.getLineStart(i), layout.getLineVisibleEnd(i));
        if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(subSequence, 0, subSequence.length(), rect);
        } else {
            paint.getTextBounds(subSequence.toString(), 0, subSequence.length(), rect);
        }
        rect.top += layout.getLineBaseline(i);
        rect.bottom += layout.getLineBaseline(i);
    }

    public static final boolean A04(Rect rect, Rect rect2, int i) {
        boolean A1W = C18230wP.A1W(Math.max(rect.left, rect2.left), Math.min(rect.right, rect2.right) - i);
        boolean A1W2 = C18230wP.A1W(Math.max(rect.top, rect2.top), Math.min(rect.bottom, rect2.bottom) - i);
        if (!A1W || !A1W2) {
            return false;
        }
        return true;
    }

    private final KtCSuperShape0S0302000_I2 A00(View view, AnonymousClass686 r10) {
        RCTextView rCTextView;
        Layout layout;
        int hashCode = view.hashCode();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect A0F = C86164wN.A0F(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
        boolean isShown = view.isShown();
        Integer num = null;
        if (!(!(view instanceof RCTextView) || (rCTextView = (RCTextView) view) == null || (layout = rCTextView.A06) == null)) {
            num = Integer.valueOf(layout.getLineCount());
        }
        return new KtCSuperShape0S0302000_I2(A0F, r10, num, hashCode, isShown ? 1 : 0);
    }

    public static final void A03(ViewGroup viewGroup, C121987Jd r5, List list) {
        if (viewGroup.getChildCount() == 0) {
            list.add(viewGroup);
        }
        int i = 0;
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        A03((ViewGroup) childAt, r5, list);
                    } else {
                        list.add(childAt);
                    }
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r30, android.view.ViewGroup r31, X.C109736kX r32, java.util.Map r33, float r34, int r35) {
        /*
            r1 = 1
            r23 = 4
            r21 = 5
            java.util.Iterator r2 = X.C86144wL.A0z(r33)
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r2.next()
            if (r0 != 0) goto L_0x0009
        L_0x0015:
            return
        L_0x0016:
            r3 = r32
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0015
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            X.7Jd r4 = A00
            r5 = r31
            A03(r5, r4, r0)
            java.util.ArrayList r22 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r15 = r0.iterator()
        L_0x002f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0197
            java.lang.Object r8 = r15.next()
            android.view.View r8 = (android.view.View) r8
            boolean r0 = r8 instanceof com.instagram.ui.widget.textureview.ScalingTextureView
            if (r0 == 0) goto L_0x004b
            X.686 r0 = X.AnonymousClass686.VIDEO
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r2 = r4.A00(r8, r0)
        L_0x0045:
            r0 = r22
            r0.add(r2)
            goto L_0x002f
        L_0x004b:
            boolean r0 = r8 instanceof com.facebook.rendercore.text.RCTextView
            if (r0 == 0) goto L_0x002f
            X.686 r26 = X.AnonymousClass686.TEXT
            int r28 = r8.hashCode()
            com.facebook.rendercore.text.RCTextView r8 = (com.facebook.rendercore.text.RCTextView) r8
            r11 = 2
            int[] r12 = new int[r11]
            r8.getLocationOnScreen(r12)
            r6 = 0
            r10 = r12[r6]
            r9 = r12[r1]
            int r0 = r8.getWidth()
            int r7 = r10 + r0
            r2 = r12[r1]
            int r0 = r8.getHeight()
            int r2 = r2 + r0
            android.graphics.Rect r10 = X.C86164wN.A0F(r10, r9, r7, r2)
            android.text.Layout r9 = r8.A06
            int r13 = r9.getLineCount()
            r2 = 0
            r7 = 0
        L_0x007b:
            if (r2 >= r13) goto L_0x008d
            float r0 = r9.getLineRight(r2)
            float r14 = r9.getLineLeft(r2)
            float r0 = r0 - r14
            int r0 = (int) r0
            if (r7 >= r0) goto L_0x008a
            r7 = r0
        L_0x008a:
            int r2 = r2 + 1
            goto L_0x007b
        L_0x008d:
            boolean r0 = r8 instanceof X.C91095fa
            if (r0 == 0) goto L_0x0112
            r9 = r8
            X.5fa r9 = (X.C91095fa) r9
            android.graphics.Rect r6 = X.C86134wK.A0D()
            float r12 = (float) r7
            float r7 = (float) r11
            float r0 = r9.getSpanXPadding()
            float r0 = r0 * r7
            float r12 = r12 + r0
            android.text.Layout r0 = r9.A06
            android.text.Layout$Alignment r0 = r0.getAlignment()
            if (r0 == 0) goto L_0x018d
            int[] r2 = X.C103336Yu.A00
            int r0 = r0.ordinal()
            r2 = r2[r0]
            if (r2 == r1) goto L_0x00fa
            if (r2 == r11) goto L_0x0106
            r0 = 3
            if (r2 != r0) goto L_0x00bb
            int r0 = r10.left
        L_0x00b9:
            r6.left = r0
        L_0x00bb:
            float r2 = r9.A01
            float r11 = r9.getSpanYPadding()
            float r2 = r2 - r11
            int r0 = r10.top
            float r0 = (float) r0
            float r0 = r0 + r2
            int r2 = (int) r0
            r6.top = r2
            int r0 = r6.left
            float r0 = (float) r0
            float r0 = r0 + r12
            int r0 = (int) r0
            r6.right = r0
            float r10 = (float) r2
            float r7 = r7 * r11
            float r10 = r10 + r7
            android.text.Layout r2 = r9.A06
            r0 = 0
            if (r2 == 0) goto L_0x00dc
            int r0 = r2.getHeight()
        L_0x00dc:
            float r0 = (float) r0
            float r10 = r10 + r0
            int r0 = (int) r10
            r6.bottom = r0
        L_0x00e1:
            boolean r29 = r8.isShown()
            android.text.Layout r0 = r8.A06
            int r0 = r0.getLineCount()
            java.lang.Integer r27 = java.lang.Integer.valueOf(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2
            r24 = r2
            r25 = r6
            r24.<init>((android.graphics.Rect) r25, (X.AnonymousClass686) r26, (java.lang.Integer) r27, (int) r28, (int) r29)
            goto L_0x0045
        L_0x00fa:
            int r0 = r10.width()
            float r2 = (float) r0
            float r2 = r2 - r12
            float r2 = r2 / r7
            int r0 = r10.left
            float r11 = (float) r0
            float r11 = r11 + r2
            goto L_0x0110
        L_0x0106:
            int r0 = r10.left
            float r11 = (float) r0
            int r0 = r10.width()
            float r0 = (float) r0
            float r0 = r0 - r12
            float r11 = r11 + r0
        L_0x0110:
            int r0 = (int) r11
            goto L_0x00b9
        L_0x0112:
            android.graphics.Rect r2 = X.C86134wK.A0D()
            A02(r2, r8, r6)
            android.graphics.Rect r6 = X.C86134wK.A0D()
            int r13 = r2.top
            r0 = r12[r1]
            int r13 = r13 + r0
            float r13 = (float) r13
            float r0 = r8.A01
            float r13 = r13 + r0
            int r0 = (int) r13
            r6.top = r0
            int r0 = r9.getLineCount()
            if (r0 <= r1) goto L_0x0137
            int r0 = r9.getLineCount()
            int r0 = r0 - r1
            A02(r2, r8, r0)
        L_0x0137:
            int r2 = r2.bottom
            r0 = r12[r1]
            int r2 = r2 + r0
            float r2 = (float) r2
            float r0 = r8.A01
            float r2 = r2 + r0
            int r0 = (int) r2
            r6.bottom = r0
            android.text.Layout$Alignment r0 = r9.getAlignment()
            if (r0 == 0) goto L_0x0192
            int[] r2 = X.C103336Yu.A00
            int r0 = r0.ordinal()
            r2 = r2[r0]
            if (r2 == r1) goto L_0x0183
            if (r2 == r11) goto L_0x0174
            r0 = 3
            if (r2 != r0) goto L_0x0165
            int r0 = r10.left
            float r2 = (float) r0
            float r0 = r8.A00
            float r0 = java.lang.Math.abs(r0)
            float r2 = r2 + r0
            int r0 = (int) r2
        L_0x0163:
            r6.left = r0
        L_0x0165:
            android.text.Layout$Alignment r2 = r9.getAlignment()
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r2 == r0) goto L_0x00e1
            int r0 = r6.left
            int r0 = r0 + r7
            r6.right = r0
            goto L_0x00e1
        L_0x0174:
            int r0 = r10.right
            float r2 = (float) r0
            float r0 = r8.A00
            float r0 = java.lang.Math.abs(r0)
            float r2 = r2 - r0
            int r0 = (int) r2
            r6.right = r0
            int r0 = r0 - r7
            goto L_0x0163
        L_0x0183:
            int r2 = r10.width()
            int r2 = r2 - r7
            int r2 = r2 / r11
            int r0 = r10.left
            int r0 = r0 + r2
            goto L_0x0163
        L_0x018d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0192:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0197:
            X.686 r0 = X.AnonymousClass686.PARENT
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r14 = r4.A00(r5, r0)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r22.iterator()
        L_0x01a5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r2 = r5.next()
            r0 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r0
            int r0 = r0.A01
            if (r0 != r1) goto L_0x01a5
            r12.add(r2)
            goto L_0x01a5
        L_0x01ba:
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            int r9 = r12.size()
            r8 = 0
        L_0x01c3:
            r11 = r35
            if (r8 >= r9) goto L_0x0211
            int r13 = r8 + 1
            int r7 = r12.size()
            r6 = r13
        L_0x01ce:
            if (r6 >= r7) goto L_0x020f
            java.lang.Object r0 = r12.get(r8)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r0
            java.lang.Object r2 = r0.A03
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            java.lang.Object r0 = r12.get(r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r0
            java.lang.Object r0 = r0.A03
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            boolean r0 = A04(r2, r0, r11)
            if (r0 == 0) goto L_0x020c
            X.67j r5 = X.C969567j.OVERLAP
            java.lang.Object r0 = r12.get(r8)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r0
            int r0 = r0.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.get(r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r0
            int r0 = r0.A00
            java.util.List r2 = X.C86134wK.A0v(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C969567j) r5, (java.util.List) r2)
            r10.add(r0)
        L_0x020c:
            int r6 = r6 + 1
            goto L_0x01ce
        L_0x020f:
            r8 = r13
            goto L_0x01c3
        L_0x0211:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r22.iterator()
        L_0x0219:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r2 = r5.next()
            r0 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0219
            r6.add(r2)
            goto L_0x0219
        L_0x022e:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r9 = r6.iterator()
        L_0x0236:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r6 = r9.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r6
            java.lang.Object r7 = r6.A03
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            int r2 = r7.left
            java.lang.Object r5 = r14.A03
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r0 = r5.left
            if (r2 < r0) goto L_0x0262
            int r2 = r7.top
            int r0 = r5.top
            if (r2 < r0) goto L_0x0262
            int r2 = r7.right
            int r0 = r5.right
            if (r2 > r0) goto L_0x0262
            int r2 = r7.bottom
            int r0 = r5.bottom
            if (r2 <= r0) goto L_0x0236
        L_0x0262:
            X.67j r5 = X.C969567j.OFF_THE_SCREEN
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r2 = X.C18180wK.A0n(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C969567j) r5, (java.util.List) r2)
            r8.add(r0)
            goto L_0x0236
        L_0x0277:
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            java.util.LinkedHashMap r9 = X.C18220wO.A0y()
            java.util.Iterator r16 = X.AnonymousClass0wJ.A0z(r33)
        L_0x0283:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02e7
            java.util.Map$Entry r0 = X.C18180wK.A0o(r16)
            java.lang.Object r2 = r0.getKey()
            X.686 r2 = (X.AnonymousClass686) r2
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0283
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r7 = r4.A00(r0, r2)
            r13.add(r7)
            java.util.Map r0 = A01
            java.lang.Object r6 = r0.get(r2)
            X.67j r6 = (X.C969567j) r6
            if (r6 == 0) goto L_0x0283
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r15 = r22.iterator()
        L_0x02b4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r12 = r15.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r12
            java.lang.Object r2 = r7.A03
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            java.lang.Object r0 = r12.A03
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            boolean r0 = A04(r2, r0, r11)
            if (r0 == 0) goto L_0x02b4
            int r0 = r7.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r12.A00
            java.util.List r2 = X.C86134wK.A0v(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C969567j) r6, (java.util.List) r2)
            r5.add(r0)
            goto L_0x02b4
        L_0x02e3:
            r9.put(r6, r5)
            goto L_0x0283
        L_0x02e7:
            int r20 = X.C09850gn.A01(r30)
            int r19 = X.C09850gn.A00(r30)
            boolean r0 = X.C09960hR.A04()
            r4 = 0
            if (r0 == 0) goto L_0x0308
            int r2 = X.C09960hR.A00()
            boolean r0 = X.C31156GhE.A06()
            if (r0 == 0) goto L_0x0304
            int r4 = X.C31156GhE.A01()
        L_0x0304:
            int r4 = java.lang.Math.max(r2, r4)
        L_0x0308:
            int r19 = r19 - r4
            r7 = 0
            X.67j r2 = X.C969567j.HEADER_OVERLAP
            java.lang.String r0 = "header_intersection_violations"
            kotlin.Pair r4 = X.C18180wK.A0p(r2, r0)
            X.67j r2 = X.C969567j.TOOLBAR_OVERLAP
            java.lang.String r0 = "toolbar_intersection_violations"
            kotlin.Pair r0 = X.C18180wK.A0p(r2, r0)
            java.util.Map r18 = X.AnonymousClass4WJ.A0G(r4, r0)
            r3.A00 = r1
            com.facebook.quicklog.QuickPerformanceLogger r0 = r3.A02
            long r0 = r0.currentMonotonicTimestampNanos()
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2 r2 = r3.A01
            X.C1193374s.A00(r2, r6)
            java.util.LinkedHashMap r5 = X.C18220wO.A0y()
            int r2 = r14.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r14.A03(r7)
            r5.put(r11, r2)
            java.util.Iterator r15 = r13.iterator()
        L_0x0345:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x035f
            java.lang.Object r12 = r15.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r12
            int r2 = r12.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r12.A03(r7)
            r5.put(r4, r2)
            goto L_0x0345
        L_0x035f:
            java.util.LinkedHashMap r15 = X.C18220wO.A0y()
            java.util.Iterator r16 = r22.iterator()
        L_0x0367:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0389
            java.lang.Object r12 = r16.next()
            r2 = r12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r2
            java.lang.Object r4 = r2.A04
            java.lang.Object r2 = r15.get(r4)
            if (r2 != 0) goto L_0x0383
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r15.put(r4, r2)
        L_0x0383:
            java.util.List r2 = (java.util.List) r2
            r2.add(r12)
            goto L_0x0367
        L_0x0389:
            java.util.Collection r2 = r15.values()
            java.util.Iterator r17 = r2.iterator()
        L_0x0391:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x03c9
            java.lang.Object r2 = r17.next()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4 = 0
            java.util.Iterator r16 = r2.iterator()
        L_0x03a2:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0391
            java.lang.Object r12 = r16.next()
            int r15 = r4 + 1
            if (r4 >= 0) goto L_0x03b4
            X.C06750aI.A1A()
            throw r7
        L_0x03b4:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r12
            int r2 = r12.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            java.lang.String r2 = r12.A03(r2)
            r5.put(r4, r2)
            r4 = r15
            goto L_0x03a2
        L_0x03c9:
            java.util.LinkedHashMap r4 = X.C18220wO.A0y()
            java.lang.String r12 = "render_info_"
            java.lang.String r2 = X.C18240wQ.A0f(r11, r5)
            java.lang.String r11 = X.AnonymousClass00U.A0L(r12, r2)
            java.lang.String r2 = r14.A02()
            r4.put(r11, r2)
            java.util.Iterator r14 = r13.iterator()
        L_0x03e2:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0404
            java.lang.Object r13 = r14.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r13 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r13
            int r2 = r13.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = X.C18240wQ.A0f(r2, r5)
            java.lang.String r11 = X.AnonymousClass00U.A0L(r12, r2)
            java.lang.String r2 = r13.A02()
            r4.put(r11, r2)
            goto L_0x03e2
        L_0x0404:
            java.util.Iterator r14 = r22.iterator()
        L_0x0408:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x042a
            java.lang.Object r13 = r14.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2 r13 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2) r13
            int r2 = r13.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = X.C18240wQ.A0f(r2, r5)
            java.lang.String r11 = X.AnonymousClass00U.A0L(r12, r2)
            java.lang.String r2 = r13.A02()
            r4.put(r11, r2)
            goto L_0x0408
        L_0x042a:
            boolean r2 = X.C18190wL.A1a(r10)
            java.lang.String r11 = ", "
            if (r2 == 0) goto L_0x0446
            r2 = r23
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r15 = X.C86164wN.A0r(r5, r2)
            r16 = 30
            r12 = r7
            r13 = r7
            r14 = r10
            java.lang.String r10 = X.AnonymousClass00J.A0H(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "intersection_violations"
            r4.put(r2, r10)
        L_0x0446:
            boolean r2 = X.C18190wL.A1a(r8)
            if (r2 == 0) goto L_0x045f
            r2 = 6
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r15 = X.C86164wN.A0r(r5, r2)
            r16 = 30
            r12 = r7
            r13 = r7
            r14 = r8
            java.lang.String r8 = X.AnonymousClass00J.A0H(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "out_of_bounds_violations"
            r4.put(r2, r8)
        L_0x045f:
            java.util.Iterator r10 = X.AnonymousClass0wJ.A0z(r9)
        L_0x0463:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0498
            java.util.Map$Entry r2 = X.C18180wK.A0o(r10)
            java.lang.Object r9 = r2.getKey()
            java.lang.Object r8 = r2.getValue()
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r2 = X.C18190wL.A1a(r8)
            if (r2 == 0) goto L_0x0463
            r2 = r21
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r15 = X.C86164wN.A0r(r5, r2)
            r16 = 30
            r12 = r7
            r13 = r7
            r14 = r8
            java.lang.String r8 = X.AnonymousClass00J.A0H(r11, r12, r13, r14, r15, r16)
            r2 = r18
            java.lang.Object r2 = r2.get(r9)
            if (r2 == 0) goto L_0x0463
            r4.put(r2, r8)
            goto L_0x0463
        L_0x0498:
            java.lang.String r5 = java.lang.String.valueOf(r20)
            r2 = 304(0x130, float:4.26E-43)
            java.lang.String r2 = X.I17.A00(r2)
            r4.put(r2, r5)
            java.lang.String r5 = java.lang.String.valueOf(r19)
            r2 = 303(0x12f, float:4.25E-43)
            java.lang.String r2 = X.I17.A00(r2)
            r4.put(r2, r5)
            java.lang.String r5 = java.lang.String.valueOf(r34)
            r2 = 220(0xdc, float:3.08E-43)
            java.lang.String r2 = X.C28174Ezk.A00(r2)
            r4.put(r2, r5)
            r6.putAll(r4)
            java.util.concurrent.ExecutorService r4 = r3.A03
            X.82L r2 = new X.82L
            r2.<init>(r3, r6, r0)
            r4.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121987Jd.A01(android.content.Context, android.view.ViewGroup, X.6kX, java.util.Map, float, int):void");
    }
}
