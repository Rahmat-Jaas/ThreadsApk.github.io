package X;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.789  reason: invalid class name */
public final class AnonymousClass789 {
    public char[] A00;
    public final Layout A01;
    public final List A02;
    public final List A03;
    public final boolean[] A04;

    public AnonymousClass789(Layout layout) {
        C04220Ms.A0B(layout, 1);
        this.A01 = layout;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int i = 0;
        do {
            CharSequence text = this.A01.getText();
            C04220Ms.A06(text);
            int A0G = AnonymousClass8bP.A0G(text, 10, i, 4);
            if (A0G < 0) {
                i = this.A01.getText().length();
            } else {
                i = A0G + 1;
            }
            C18200wM.A1U(A0v, i);
        } while (i < this.A01.getText().length());
        this.A03 = A0v;
        int size = A0v.size();
        ArrayList A0k = C18240wQ.A0k(size);
        for (int i2 = 0; i2 < size; i2++) {
            A0k.add((Object) null);
        }
        this.A02 = A0k;
        this.A04 = new boolean[A0v.size()];
        this.A03.size();
    }

    private final int A00(int i) {
        while (i > 0) {
            char charAt = this.A01.getText().charAt(i - 1);
            if (!(charAt == ' ' || charAt == 10 || charAt == 5760)) {
                if (8192 <= charAt) {
                    if (charAt >= 8203) {
                        if (!(charAt == 8287 || charAt == 12288)) {
                            break;
                        }
                    } else if (charAt == 8199) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f1, code lost:
        if (r20 == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f8, code lost:
        if (r20 == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0201, code lost:
        if (r20 != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x020c, code lost:
        if (r20 != false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r10 != X.AnonymousClass0wJ.A04(r13.get(r7))) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r21.getRunCount() == 1) goto L_0x0112;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A01(int r29, boolean r30, boolean r31) {
        /*
            r28 = this;
            r11 = r28
            r10 = r29
            if (r31 == 0) goto L_0x0027
            android.text.Layout r12 = r11.A01
            r9 = 0
            if (r29 <= 0) goto L_0x001b
            java.lang.CharSequence r0 = r12.getText()
            int r0 = r0.length()
            if (r10 < r0) goto L_0x0155
            int r0 = r12.getLineCount()
            int r9 = r0 + -1
        L_0x001b:
            int r8 = r12.getLineStart(r9)
            int r1 = r12.getLineEnd(r9)
            if (r10 == r8) goto L_0x0030
            if (r10 == r1) goto L_0x0030
        L_0x0027:
            android.text.Layout r0 = r11.A01
            if (r30 == 0) goto L_0x016d
            float r0 = r0.getPrimaryHorizontal(r10)
            return r0
        L_0x0030:
            if (r29 == 0) goto L_0x0027
            java.lang.CharSequence r0 = r12.getText()
            int r0 = r0.length()
            if (r10 == r0) goto L_0x0027
            java.util.List r13 = r11.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            int r0 = r13.size()
            int r0 = X.C06750aI.A12(r2, r13, r0)
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x004f
            int r2 = -r2
        L_0x004f:
            if (r2 <= 0) goto L_0x005d
            int r7 = r2 + -1
            java.lang.Object r0 = r13.get(r7)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r10 == r0) goto L_0x005e
        L_0x005d:
            r7 = r2
        L_0x005e:
            if (r7 != 0) goto L_0x0149
            r0 = 0
        L_0x0061:
            int r0 = r12.getLineForOffset(r0)
            int r0 = r12.getParagraphDirection(r0)
            r6 = -1
            boolean r5 = X.AnonymousClass0wJ.A1T(r0, r6)
            r20 = r5
            int r19 = r11.A00(r1)
            if (r7 != 0) goto L_0x013d
            r0 = 0
        L_0x0077:
            int r18 = r8 - r0
            int r17 = r19 - r0
            boolean[] r0 = r11.A04
            r16 = r0
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x00c6
            java.util.List r0 = r11.A02
            java.lang.Object r6 = r0.get(r7)
            java.text.Bidi r6 = (java.text.Bidi) r6
        L_0x008b:
            if (r6 == 0) goto L_0x0185
            r1 = r18
            r0 = r17
            java.text.Bidi r14 = r6.createLineBidi(r1, r0)
            r13 = 0
            r7 = 1
            if (r14 == 0) goto L_0x0185
            int r0 = r14.getRunCount()
            if (r0 == r7) goto L_0x0185
            int r6 = r14.getRunCount()
            X.6u5[] r4 = new X.C114906u5[r6]
            r3 = 0
        L_0x00a6:
            if (r3 >= r6) goto L_0x0172
            int r2 = r14.getRunStart(r3)
            int r2 = r2 + r8
            int r1 = r14.getRunLimit(r3)
            int r1 = r1 + r8
            int r0 = r14.getRunLevel(r3)
            int r0 = r0 % 2
            boolean r15 = X.AnonymousClass0wJ.A1T(r0, r7)
            X.6u5 r0 = new X.6u5
            r0.<init>(r2, r1, r15)
            r4[r3] = r0
            int r3 = r3 + 1
            goto L_0x00a6
        L_0x00c6:
            r4 = 0
            if (r7 != 0) goto L_0x0132
            r14 = 0
        L_0x00ca:
            java.lang.Object r0 = r13.get(r7)
            int r1 = X.AnonymousClass0wJ.A04(r0)
            int r3 = r1 - r14
            char[] r2 = r11.A00
            if (r2 == 0) goto L_0x00db
            int r0 = r2.length
            if (r0 >= r3) goto L_0x00dd
        L_0x00db:
            char[] r2 = new char[r3]
        L_0x00dd:
            r0 = r2
            java.lang.CharSequence r15 = r12.getText()
            android.text.TextUtils.getChars(r15, r14, r1, r2, r4)
            boolean r14 = java.text.Bidi.requiresBidi(r2, r4, r3)
            r24 = 0
            r1 = 1
            if (r14 == 0) goto L_0x0112
            if (r7 != 0) goto L_0x0127
            r13 = 0
        L_0x00f1:
            int r13 = r12.getLineForOffset(r13)
            int r13 = r12.getParagraphDirection(r13)
            boolean r27 = X.AnonymousClass0wJ.A1T(r13, r6)
            java.text.Bidi r6 = new java.text.Bidi
            r21 = r6
            r22 = r2
            r23 = r4
            r25 = r4
            r26 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27)
            int r3 = r6.getRunCount()
            if (r3 != r1) goto L_0x0114
        L_0x0112:
            r6 = r24
        L_0x0114:
            java.util.List r3 = r11.A02
            r3.set(r7, r6)
            r16[r7] = r1
            if (r6 == 0) goto L_0x0123
            char[] r0 = r11.A00
            if (r2 != r0) goto L_0x0123
            r0 = r24
        L_0x0123:
            r11.A00 = r0
            goto L_0x008b
        L_0x0127:
            int r14 = r7 + -1
            java.lang.Object r13 = r13.get(r14)
            int r13 = X.AnonymousClass0wJ.A04(r13)
            goto L_0x00f1
        L_0x0132:
            int r0 = r7 + -1
            java.lang.Object r0 = r13.get(r0)
            int r14 = X.AnonymousClass0wJ.A04(r0)
            goto L_0x00ca
        L_0x013d:
            int r0 = r7 + -1
            java.lang.Object r0 = r13.get(r0)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            goto L_0x0077
        L_0x0149:
            int r0 = r7 + -1
            java.lang.Object r0 = r13.get(r0)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            goto L_0x0061
        L_0x0155:
            int r9 = r12.getLineForOffset(r10)
            int r1 = r12.getLineStart(r9)
            int r0 = r12.getLineEnd(r9)
            if (r1 == r10) goto L_0x0167
            if (r0 == r10) goto L_0x0167
            goto L_0x001b
        L_0x0167:
            if (r1 != r10) goto L_0x001b
            int r9 = r9 + -1
            goto L_0x001b
        L_0x016d:
            float r0 = r0.getSecondaryHorizontal(r10)
            return r0
        L_0x0172:
            int r3 = r14.getRunCount()
            byte[] r2 = new byte[r3]
            r1 = 0
        L_0x0179:
            if (r1 >= r3) goto L_0x019b
            int r0 = r14.getRunLevel(r1)
            byte r0 = (byte) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0179
        L_0x0185:
            boolean r0 = r12.isRtlCharAt(r8)
            if (r30 != 0) goto L_0x018d
            if (r5 != r0) goto L_0x0193
        L_0x018d:
            r20 = 0
            if (r5 != 0) goto L_0x0193
            r20 = 1
        L_0x0193:
            if (r10 != r8) goto L_0x0198
            if (r20 == 0) goto L_0x01fa
            goto L_0x01bd
        L_0x0198:
            if (r20 != 0) goto L_0x01fa
            goto L_0x01bd
        L_0x019b:
            java.text.Bidi.reorderVisually(r2, r13, r4, r13, r6)
            r1 = -1
            if (r10 != r8) goto L_0x01c5
            r2 = 0
        L_0x01a2:
            if (r2 >= r6) goto L_0x01ab
            r0 = r4[r2]
            int r0 = r0.A01
            if (r0 != r10) goto L_0x01c2
            r1 = r2
        L_0x01ab:
            r0 = r4[r1]
            if (r30 != 0) goto L_0x01b3
            boolean r0 = r0.A02
            if (r5 != r0) goto L_0x01b9
        L_0x01b3:
            r20 = 0
            if (r5 != 0) goto L_0x01b9
            r20 = 1
        L_0x01b9:
            if (r1 != 0) goto L_0x01f4
            if (r20 == 0) goto L_0x01f4
        L_0x01bd:
            float r0 = r12.getLineLeft(r9)
            return r0
        L_0x01c2:
            int r2 = r2 + 1
            goto L_0x01a2
        L_0x01c5:
            r0 = r19
            if (r10 <= r0) goto L_0x01cd
            int r10 = r11.A00(r10)
        L_0x01cd:
            r2 = 0
        L_0x01ce:
            if (r2 >= r6) goto L_0x01d7
            r0 = r4[r2]
            int r0 = r0.A00
            if (r0 != r10) goto L_0x01ea
            r1 = r2
        L_0x01d7:
            r0 = r4[r1]
            if (r30 != 0) goto L_0x01e5
            boolean r0 = r0.A02
            if (r5 == r0) goto L_0x01e5
            r20 = 0
            if (r5 != 0) goto L_0x01e5
            r20 = 1
        L_0x01e5:
            if (r1 != 0) goto L_0x01ed
            if (r20 == 0) goto L_0x01ed
            goto L_0x01bd
        L_0x01ea:
            int r2 = r2 + 1
            goto L_0x01ce
        L_0x01ed:
            int r0 = r6 + -1
            if (r1 != r0) goto L_0x020a
            if (r20 != 0) goto L_0x020e
            goto L_0x01fa
        L_0x01f4:
            int r0 = r6 + -1
            if (r1 != r0) goto L_0x01ff
            if (r20 != 0) goto L_0x0203
        L_0x01fa:
            float r0 = r12.getLineRight(r9)
            return r0
        L_0x01ff:
            int r0 = r1 + 1
            if (r20 == 0) goto L_0x0205
        L_0x0203:
            int r0 = r1 - r7
        L_0x0205:
            r0 = r4[r0]
            int r0 = r0.A01
            goto L_0x0214
        L_0x020a:
            int r0 = r1 + 1
            if (r20 == 0) goto L_0x0210
        L_0x020e:
            int r0 = r1 - r7
        L_0x0210:
            r0 = r4[r0]
            int r0 = r0.A00
        L_0x0214:
            float r0 = r12.getPrimaryHorizontal(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass789.A01(int, boolean, boolean):float");
    }
}
