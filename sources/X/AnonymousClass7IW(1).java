package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithContentElement;
import androidx.compose.ui.draw.PainterModifierNodeElement;
import androidx.compose.ui.focus.FocusChangedElement;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusPropertiesElement;
import androidx.compose.ui.focus.FocusRequesterElement;
import androidx.compose.ui.focus.FocusTargetModifierNode$FocusTargetModifierElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import androidx.compose.ui.input.key.OnKeyEventElement;
import androidx.compose.ui.input.key.OnPreviewKeyEvent;
import androidx.compose.ui.input.rotary.OnRotaryScrollEventElement;
import androidx.compose.ui.layout.LayoutIdModifierElement;
import androidx.compose.ui.layout.LayoutModifierElement;
import com.facebook.common.dextricks.Constants;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.7IW  reason: invalid class name */
public final class AnonymousClass7IW {
    public AnonymousClass84X A00;
    public AnonymousClass84X A01;
    public AnonymousClass7YG A02;
    public AnonymousClass7YH A03;
    public AnonymousClass54T A04;
    public final AnonymousClass7YG A05;
    public final C877654k A06;
    public final AnonymousClass7Y3 A07;

    public static final AnonymousClass7YG A00(C147538pV r15, AnonymousClass7YG r16) {
        AnonymousClass7YG r2;
        if (r15 instanceof C123307Wk) {
            C123307Wk r152 = (C123307Wk) r15;
            if (r152 instanceof LayoutModifierElement) {
                r2 = new C875753h(((LayoutModifierElement) r152).A00);
            } else if (r152 instanceof LayoutIdModifierElement) {
                r2 = new C876053k(((LayoutIdModifierElement) r152).A00);
            } else if (r152 instanceof OnRotaryScrollEventElement) {
                r2 = new C875253c(((OnRotaryScrollEventElement) r152).A00);
            } else if (r152 instanceof OnPreviewKeyEvent) {
                r2 = new C875153b((AnonymousClass0YY) null, ((OnPreviewKeyEvent) r152).A00);
            } else if (r152 instanceof OnKeyEventElement) {
                r2 = new C875153b(((OnKeyEventElement) r152).A00, (AnonymousClass0YY) null);
            } else if (r152 instanceof GraphicsLayerModifierNodeElement) {
                GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) r152;
                float f = graphicsLayerModifierNodeElement.A02;
                float f2 = graphicsLayerModifierNodeElement.A03;
                float f3 = graphicsLayerModifierNodeElement.A00;
                float f4 = graphicsLayerModifierNodeElement.A01;
                long j = graphicsLayerModifierNodeElement.A06;
                r2 = new C875853i(graphicsLayerModifierNodeElement.A07, f, f2, f3, f4, j, graphicsLayerModifierNodeElement.A04, graphicsLayerModifierNodeElement.A05, graphicsLayerModifierNodeElement.A08);
            } else if (r152 instanceof BlockGraphicsLayerElement) {
                r2 = new C875653g(((BlockGraphicsLayerElement) r152).A00);
            } else if (r152 instanceof FocusTargetModifierNode$FocusTargetModifierElement) {
                r2 = new C875353d();
            } else if (r152 instanceof FocusRequesterElement) {
                r2 = new C875053a(((FocusRequesterElement) r152).A00);
            } else if (r152 instanceof FocusPropertiesElement) {
                r2 = new AnonymousClass53Z(((FocusPropertiesElement) r152).A00);
            } else if (r152 instanceof FocusOwnerImpl$modifier$1) {
                r2 = ((FocusOwnerImpl$modifier$1) r152).A00.A00;
            } else if (r152 instanceof FocusChangedElement) {
                r2 = new AnonymousClass53Y(((FocusChangedElement) r152).A00);
            } else if (r152 instanceof PainterModifierNodeElement) {
                PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) r152;
                C115286uo r5 = painterModifierNodeElement.A03;
                r2 = new C875953j(painterModifierNodeElement.A01, painterModifierNodeElement.A02, r5, painterModifierNodeElement.A04, painterModifierNodeElement.A00);
            } else if (r152 instanceof DrawWithContentElement) {
                r2 = new C875553f(((DrawWithContentElement) r152).A00);
            } else {
                r2 = new C875453e(((DrawBehindElement) r152).A00);
            }
            int i = 1;
            if (r2 instanceof C147768ps) {
                i = 3;
            }
            if (r2 instanceof C147748pq) {
                i |= 4;
            }
            if (r2 instanceof C147738pp) {
                i |= 8;
            }
            if (r2 instanceof C147728po) {
                i |= 16;
            }
            if (r2 instanceof C147628pe) {
                i |= 32;
            }
            if (r2 instanceof C147718pn) {
                i |= 64;
            }
            if (r2 instanceof C147678pj) {
                i |= 128;
            }
            if (r2 instanceof C147668pi) {
                i |= 256;
            }
            if (r2 instanceof C147758pr) {
                i |= 512;
            }
            if (r2 instanceof C875353d) {
                i |= 1024;
            }
            if (r2 instanceof C147708pm) {
                i |= 2048;
            }
            if (r2 instanceof C147698pl) {
                i |= 4096;
            }
            if (r2 instanceof C147648pg) {
                i |= 8192;
            }
            if (r2 instanceof C147658ph) {
                i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            r2.A01 = i;
        } else {
            r2 = new AnonymousClass53X(r15);
        }
        if (!r2.A08) {
            r2.A07 = true;
            AnonymousClass7YG r1 = r16;
            AnonymousClass7YG r0 = r1.A04;
            if (r0 != null) {
                r0.A02 = r2;
                r2.A04 = r0;
            }
            r1.A04 = r2;
            r2.A02 = r1;
            return r2;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public static final AnonymousClass7YG A01(AnonymousClass7YG r3) {
        if (r3.A08) {
            C115916w7.A01(r3, 2);
            r3.A05();
        }
        AnonymousClass7YG r2 = r3.A02;
        AnonymousClass7YG r1 = r3.A04;
        if (r2 != null) {
            r2.A04 = r1;
            r3.A02 = null;
        }
        if (r1 != null) {
            r1.A02 = r2;
            r3.A04 = null;
        }
        C04220Ms.A0A(r2);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bc, code lost:
        if (r10 != r13) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dc, code lost:
        r17 = X.C18180wK.A1W(r19 % 2);
        r0 = -r11;
        r18 = r0;
        r14 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        if (r14 > r11) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ea, code lost:
        if (r14 == r18) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ec, code lost:
        if (r14 == r11) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fa, code lost:
        if (r3[(r14 + 1) + r20] >= r3[(r14 - 1) + r20]) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        r13 = r3[(r14 + 1) + r20];
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        r1 = r28 - ((r26 - r10) - r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (r11 == 0) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        r16 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
        if (r10 == r13) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0112, code lost:
        if (r10 <= r25) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        if (r1 <= r27) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        if (r7.A9C(r10 - 1, r1 - 1) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0122, code lost:
        r10 = r10 - 1;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        r3[r14 + r20] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        if (r17 == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        r15 = r19 - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        if (r15 < r18) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0133, code lost:
        if (r15 > r11) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        if (r4[r15 + r20] < r10) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013b, code lost:
        r2[0] = r10;
        r2[1] = r1;
        r2[2] = r13;
        r2[3] = r16;
        r2[4] = 1;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0149, code lost:
        r14 = r14 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r13 = r3[(r14 - 1) + r20];
        r10 = r13 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass84X r25, X.AnonymousClass84X r26, X.AnonymousClass7YG r27, X.AnonymousClass7IW r28, int r29, int r30) {
        /*
            r1 = r28
            r8 = r30
            r9 = r29
            X.7YH r7 = r1.A03
            r4 = r25
            r3 = r26
            r2 = r27
            if (r7 != 0) goto L_0x01bd
            int r0 = r2.A00
            X.7YH r7 = new X.7YH
            r10 = r7
            r11 = r4
            r12 = r3
            r13 = r2
            r14 = r1
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r1.A03 = r7
        L_0x001f:
            r30 = 2
            int r0 = r29 + r8
            int r0 = r0 + 1
            int r1 = r0 >> 1
            int r0 = r1 * 3
            X.78i r6 = new X.78i
            r6.<init>(r0)
            int r0 = r1 << 2
            X.78i r5 = new X.78i
            r5.<init>(r0)
            r0 = 0
            r5.A02(r0, r9, r0, r8)
            int r0 = r1 << 1
            int r29 = r0 + 1
            r0 = r29
            int[] r4 = new int[r0]
            int[] r3 = new int[r0]
            r0 = 5
            int[] r2 = new int[r0]
        L_0x0046:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x01cd
            int[] r1 = r5.A01
            int r0 = r0 + -1
            r5.A00 = r0
            r28 = r1[r0]
            int r0 = r0 + -1
            r5.A00 = r0
            r27 = r1[r0]
            int r0 = r0 + -1
            r5.A00 = r0
            r26 = r1[r0]
            int r0 = r0 + -1
            r5.A00 = r0
            r25 = r1[r0]
            int r24 = r26 - r25
            int r23 = r28 - r27
            r22 = 0
            r12 = 1
            r0 = r24
            if (r0 < r12) goto L_0x0046
            r0 = r23
            if (r0 < r12) goto L_0x0046
            int r0 = r24 + r23
            int r0 = r0 + 1
            int r21 = r0 >> 1
            int r20 = r29 >> 1
            int r0 = r20 + 1
            r4[r0] = r25
            r3[r0] = r26
            r11 = 0
        L_0x0082:
            r0 = r21
            if (r11 >= r0) goto L_0x0046
            int r19 = r24 - r23
            int r0 = java.lang.Math.abs(r19)
            int r0 = r0 % 2
            boolean r18 = X.AnonymousClass0wJ.A1T(r0, r12)
            int r0 = -r11
            r17 = r0
            r14 = r0
        L_0x0096:
            if (r14 > r11) goto L_0x00dc
            r0 = r17
            if (r14 == r0) goto L_0x00ac
            if (r14 == r11) goto L_0x00d3
            int r0 = r14 + 1
            int r0 = r0 + r20
            r1 = r4[r0]
            int r0 = r14 + -1
            int r0 = r0 + r20
            r0 = r4[r0]
            if (r1 <= r0) goto L_0x00d3
        L_0x00ac:
            int r0 = r14 + 1
            int r0 = r0 + r20
            r13 = r4[r0]
            r10 = r13
        L_0x00b3:
            int r0 = r10 - r25
            int r1 = r27 + r0
            int r1 = r1 - r14
            if (r11 == 0) goto L_0x00be
            int r16 = r1 + -1
            if (r10 == r13) goto L_0x00c0
        L_0x00be:
            r16 = r1
        L_0x00c0:
            r0 = r26
            if (r10 >= r0) goto L_0x0155
            r0 = r28
            if (r1 >= r0) goto L_0x0155
            boolean r0 = r7.A9C(r10, r1)
            if (r0 == 0) goto L_0x0155
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00d3:
            int r0 = r14 + -1
            int r0 = r0 + r20
            r13 = r4[r0]
            int r10 = r13 + 1
            goto L_0x00b3
        L_0x00dc:
            int r0 = r19 % 2
            boolean r17 = X.C18180wK.A1W(r0)
            int r0 = -r11
            r18 = r0
            r14 = r0
        L_0x00e6:
            if (r14 > r11) goto L_0x01b9
            r0 = r18
            if (r14 == r0) goto L_0x00fc
            if (r14 == r11) goto L_0x014c
            int r0 = r14 + 1
            int r0 = r0 + r20
            r1 = r3[r0]
            int r0 = r14 + -1
            int r0 = r0 + r20
            r0 = r3[r0]
            if (r1 >= r0) goto L_0x014c
        L_0x00fc:
            int r0 = r14 + 1
            int r0 = r0 + r20
            r13 = r3[r0]
            r10 = r13
        L_0x0103:
            int r0 = r26 - r10
            int r0 = r0 - r14
            int r1 = r28 - r0
            if (r11 == 0) goto L_0x010e
            int r16 = r1 + 1
            if (r10 == r13) goto L_0x0110
        L_0x010e:
            r16 = r1
        L_0x0110:
            r0 = r25
            if (r10 <= r0) goto L_0x0127
            r0 = r27
            if (r1 <= r0) goto L_0x0127
            int r0 = r10 + -1
            int r15 = r1 + -1
            boolean r0 = r7.A9C(r0, r15)
            if (r0 == 0) goto L_0x0127
            int r10 = r10 + -1
            int r1 = r1 + -1
            goto L_0x0110
        L_0x0127:
            int r0 = r14 + r20
            r3[r0] = r10
            if (r17 == 0) goto L_0x0149
            int r15 = r19 - r14
            r0 = r18
            if (r15 < r0) goto L_0x0149
            if (r15 > r11) goto L_0x0149
            int r15 = r15 + r20
            r0 = r4[r15]
            if (r0 < r10) goto L_0x0149
            r2[r22] = r10
            r2[r12] = r1
            r2[r30] = r13
            r0 = 3
            r2[r0] = r16
            r0 = 4
            r2[r0] = r12
            r0 = 1
            goto L_0x0178
        L_0x0149:
            int r14 = r14 + 2
            goto L_0x00e6
        L_0x014c:
            int r0 = r14 + -1
            int r0 = r0 + r20
            r13 = r3[r0]
            int r10 = r13 + -1
            goto L_0x0103
        L_0x0155:
            int r0 = r14 + r20
            r4[r0] = r10
            if (r18 == 0) goto L_0x01b5
            int r15 = r19 - r14
            int r0 = r17 + 1
            if (r15 < r0) goto L_0x01b5
            int r0 = r11 + -1
            if (r15 > r0) goto L_0x01b5
            int r15 = r15 + r20
            r0 = r3[r15]
            if (r0 > r10) goto L_0x01b5
            r2[r22] = r13
            r2[r12] = r16
            r2[r30] = r10
            r0 = 3
            r2[r0] = r1
            r0 = 4
            r2[r0] = r22
            r0 = 0
        L_0x0178:
            r15 = r2[r30]
            r14 = r2[r22]
            int r15 = r15 - r14
            r13 = 3
            r11 = r2[r13]
            r10 = r2[r12]
            int r11 = r11 - r10
            int r1 = java.lang.Math.min(r15, r11)
            if (r1 <= 0) goto L_0x0191
            if (r11 == r15) goto L_0x01b1
            if (r0 == 0) goto L_0x01a9
            r0 = r14
        L_0x018e:
            r6.A01(r0, r10, r1)
        L_0x0191:
            r11 = r2[r22]
            r10 = r2[r12]
            r1 = r25
            r0 = r27
            r5.A02(r1, r11, r0, r10)
            r11 = r2[r30]
            r10 = r2[r13]
            r1 = r26
            r0 = r28
            r5.A02(r11, r1, r10, r0)
            goto L_0x0046
        L_0x01a9:
            int r0 = r14 + 1
            if (r11 <= r15) goto L_0x018e
            r0 = r14
            int r10 = r10 + 1
            goto L_0x018e
        L_0x01b1:
            r6.A01(r14, r10, r15)
            goto L_0x0191
        L_0x01b5:
            int r14 = r14 + 2
            goto L_0x0096
        L_0x01b9:
            int r11 = r11 + 1
            goto L_0x0082
        L_0x01bd:
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r7.A03 = r2
            int r0 = r2.A00
            r7.A00 = r0
            r7.A02 = r4
            r7.A01 = r3
            goto L_0x001f
        L_0x01cd:
            int r2 = r6.A00
            int r0 = r2 % 3
            r1 = 0
            if (r0 != 0) goto L_0x026a
            r0 = 3
            if (r2 <= r0) goto L_0x01db
            int r2 = r2 - r0
            X.C1200578i.A00(r6, r1, r2)
        L_0x01db:
            r6.A01(r9, r8, r1)
        L_0x01de:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x024d
            int[] r1 = r6.A01
            int r0 = r0 + -1
            r6.A00 = r0
            r4 = r1[r0]
            int r0 = r0 + -1
            r6.A00 = r0
            r2 = r1[r0]
            int r0 = r0 + -1
            r6.A00 = r0
            r1 = r1[r0]
        L_0x01f6:
            if (r9 <= r1) goto L_0x020a
            int r9 = r9 + -1
            X.7YG r0 = r7.A03
            X.7YG r0 = r0.A04
            X.C04220Ms.A0A(r0)
            r7.A03 = r0
            X.7YG r0 = A01(r0)
            r7.A03 = r0
            goto L_0x01f6
        L_0x020a:
            if (r8 <= r2) goto L_0x0212
            int r8 = r8 + -1
            r7.BQS(r9, r8)
            goto L_0x020a
        L_0x0212:
            int r3 = r4 + -1
            if (r4 <= 0) goto L_0x01de
            int r9 = r9 + -1
            int r8 = r8 + -1
            X.7YG r0 = r7.A03
            X.7YG r0 = r0.A04
            X.C04220Ms.A0A(r0)
            r7.A03 = r0
            X.84X r0 = r7.A02
            java.lang.Object[] r0 = r0.A01
            r2 = r0[r9]
            X.8pV r2 = (X.C147538pV) r2
            X.84X r0 = r7.A01
            java.lang.Object[] r0 = r0.A01
            r1 = r0[r8]
            X.8pV r1 = (X.C147538pV) r1
            boolean r0 = X.C04220Ms.A0I(r2, r1)
            if (r0 != 0) goto L_0x0240
            X.7YG r0 = r7.A03
            A03(r2, r1, r0)
            r7.A03 = r0
        L_0x0240:
            int r2 = r7.A00
            X.7YG r1 = r7.A03
            int r0 = r1.A01
            r2 = r2 | r0
            r7.A00 = r2
            r1.A00 = r2
            r4 = r3
            goto L_0x0212
        L_0x024d:
            if (r9 <= 0) goto L_0x0261
            int r9 = r9 + -1
            X.7YG r0 = r7.A03
            X.7YG r0 = r0.A04
            X.C04220Ms.A0A(r0)
            r7.A03 = r0
            X.7YG r0 = A01(r0)
            r7.A03 = r0
            goto L_0x024d
        L_0x0261:
            if (r8 <= 0) goto L_0x0269
            int r8 = r8 + -1
            r7.BQS(r9, r8)
            goto L_0x0261
        L_0x0269:
            return
        L_0x026a:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IW.A02(X.84X, X.84X, X.7YG, X.7IW, int, int):void");
    }

    public static final void A03(C147538pV r9, C147538pV r10, AnonymousClass7YG r11) {
        if ((r9 instanceof C123307Wk) && (r10 instanceof C123307Wk)) {
            C123307Wk r102 = (C123307Wk) r10;
            C04220Ms.A0C(r11, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            if (r102 instanceof LayoutModifierElement) {
                C875753h r1 = (C875753h) r11;
                C04220Ms.A0B(r1, 0);
                r1.A00 = ((LayoutModifierElement) r102).A00;
            } else if (r102 instanceof LayoutIdModifierElement) {
                C876053k r2 = (C876053k) r11;
                C04220Ms.A0B(r2, 0);
                Object obj = ((LayoutIdModifierElement) r102).A00;
                C04220Ms.A0B(obj, 0);
                r2.A00 = obj;
            } else if (r102 instanceof OnRotaryScrollEventElement) {
                C875253c r12 = (C875253c) r11;
                C04220Ms.A0B(r12, 0);
                r12.A00 = ((OnRotaryScrollEventElement) r102).A00;
            } else if (r102 instanceof OnPreviewKeyEvent) {
                C875153b r13 = (C875153b) r11;
                C04220Ms.A0B(r13, 0);
                r13.A01 = ((OnPreviewKeyEvent) r102).A00;
                r13.A00 = null;
            } else if (r102 instanceof OnKeyEventElement) {
                C875153b r14 = (C875153b) r11;
                C04220Ms.A0B(r14, 0);
                r14.A00 = ((OnKeyEventElement) r102).A00;
                r14.A01 = null;
            } else if (r102 instanceof GraphicsLayerModifierNodeElement) {
                GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) r102;
                C875853i r3 = (C875853i) r11;
                C04220Ms.A0B(r3, 0);
                r3.A03 = graphicsLayerModifierNodeElement.A02;
                r3.A04 = graphicsLayerModifierNodeElement.A03;
                r3.A00 = graphicsLayerModifierNodeElement.A00;
                r3.A02 = graphicsLayerModifierNodeElement.A01;
                r3.A01 = 8.0f;
                r3.A07 = graphicsLayerModifierNodeElement.A06;
                r3.A08 = graphicsLayerModifierNodeElement.A07;
                r3.A0A = graphicsLayerModifierNodeElement.A08;
                r3.A05 = graphicsLayerModifierNodeElement.A04;
                r3.A06 = graphicsLayerModifierNodeElement.A05;
                AnonymousClass54T r22 = C121847Ik.A02(r3, 2).A06;
                if (r22 != null) {
                    AnonymousClass0YY r15 = r3.A09;
                    r22.A0A = r15;
                    AnonymousClass54T.A07(r22, r15, true);
                }
            } else if (r102 instanceof BlockGraphicsLayerElement) {
                C875653g r16 = (C875653g) r11;
                C04220Ms.A0B(r16, 0);
                r16.A00 = ((BlockGraphicsLayerElement) r102).A00;
            } else {
                if (!(r102 instanceof FocusTargetModifierNode$FocusTargetModifierElement)) {
                    if (r102 instanceof FocusRequesterElement) {
                        C875053a r17 = (C875053a) r11;
                        C04220Ms.A0B(r17, 0);
                        r17.A00.A00.A0E(r17);
                        AnonymousClass77X r0 = ((FocusRequesterElement) r102).A00;
                        r17.A00 = r0;
                        r0.A00.A0C(r17);
                    } else if (r102 instanceof FocusPropertiesElement) {
                        AnonymousClass53Z r23 = (AnonymousClass53Z) r11;
                        C04220Ms.A0B(r23, 0);
                        AnonymousClass0YY r02 = ((FocusPropertiesElement) r102).A00;
                        C04220Ms.A0B(r02, 0);
                        r23.A00 = r02;
                    } else if (!(r102 instanceof FocusOwnerImpl$modifier$1)) {
                        if (r102 instanceof FocusChangedElement) {
                            AnonymousClass53Y r18 = (AnonymousClass53Y) r11;
                            C04220Ms.A0B(r18, 0);
                            r18.A00 = ((FocusChangedElement) r102).A00;
                        } else if (r102 instanceof PainterModifierNodeElement) {
                            PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) r102;
                            C875953j r6 = (C875953j) r11;
                            C04220Ms.A0B(r6, 0);
                            boolean z = true;
                            if (r6.A05 && r6.A03.A01() == painterModifierNodeElement.A03.A01()) {
                                z = false;
                            }
                            r6.A03 = painterModifierNodeElement.A03;
                            r6.A05 = true;
                            Alignment alignment = painterModifierNodeElement.A01;
                            C04220Ms.A0B(alignment, 0);
                            r6.A01 = alignment;
                            r6.A04 = painterModifierNodeElement.A04;
                            r6.A00 = painterModifierNodeElement.A00;
                            r6.A02 = painterModifierNodeElement.A02;
                            if (z) {
                                C121847Ik.A01(r6).A0P(false);
                            }
                            C98286Ex.A00(r6);
                        } else if (r102 instanceof DrawWithContentElement) {
                            C875553f r19 = (C875553f) r11;
                            C04220Ms.A0B(r19, 0);
                            r19.A00 = ((DrawWithContentElement) r102).A00;
                        } else {
                            C875453e r110 = (C875453e) r11;
                            C04220Ms.A0B(r110, 0);
                            r110.A00 = ((DrawBehindElement) r102).A00;
                        }
                    }
                }
                C04220Ms.A0B(r11, 0);
            }
            if (r11 != r11) {
                boolean z2 = r11.A08;
                if (!z2) {
                    r11.A07 = true;
                    if (z2) {
                        C115916w7.A01(r11, 2);
                        r11.A05();
                    }
                    AnonymousClass7YG r03 = r11.A04;
                    if (r03 != null) {
                        r11.A04 = r03;
                        r03.A02 = r11;
                        r11.A04 = null;
                    }
                    AnonymousClass7YG r04 = r11.A02;
                    if (r04 != null) {
                        r11.A02 = r04;
                        r04.A04 = r11;
                        r11.A02 = null;
                    }
                    r11.A06 = r11.A06;
                    return;
                }
                throw C18180wK.A0a("Check failed.");
            } else if (r102 instanceof PainterModifierNodeElement) {
                return;
            }
        } else if (r11 instanceof AnonymousClass53X) {
            AnonymousClass53X r24 = (AnonymousClass53X) r11;
            C04220Ms.A0B(r10, 0);
            if (r24.A08) {
                AnonymousClass53X.A01(r24);
            }
            r24.A00 = r10;
            r24.A01 = C115916w7.A00(r10);
            if (r24.A08) {
                AnonymousClass53X.A02(r24, false);
            }
        } else {
            throw C18180wK.A0a("Unknown Modifier.Node type");
        }
        if (r11.A08) {
            C115916w7.A01(r11, 0);
        } else {
            r11.A09 = true;
        }
    }

    public final void A04() {
        for (AnonymousClass7YG r3 = this.A02; r3 != null; r3 = r3.A02) {
            if (!r3.A08) {
                if (!(!r3.A08)) {
                    throw C18180wK.A0a("Check failed.");
                } else if (r3.A06 != null) {
                    r3.A08 = true;
                    if (r3 instanceof AnonymousClass53X) {
                        AnonymousClass53X.A02((AnonymousClass53X) r3, true);
                    } else if (r3 instanceof C875053a) {
                        C875053a r1 = (C875053a) r3;
                        r1.A00.A00.A0C(r1);
                    }
                    if (r3.A07) {
                        C115916w7.A01(r3, 1);
                    }
                    if (r3.A09) {
                        C115916w7.A01(r3, 0);
                    }
                    r3.A07 = false;
                    r3.A09 = false;
                } else {
                    throw C18180wK.A0a("Check failed.");
                }
            }
        }
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("[");
        AnonymousClass7YG r0 = this.A02;
        AnonymousClass7YG r3 = this.A05;
        if (r0 != r3) {
            while (true) {
                if (r0 != null && r0 != r3) {
                    A0s.append(String.valueOf(r0));
                    if (r0.A02 == r3) {
                        break;
                    }
                    A0s.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    r0 = r0.A02;
                } else {
                    break;
                }
            }
            return C18190wL.A0n(A0s);
        }
        A0s.append("]");
        return C18190wL.A0n(A0s);
    }

    public AnonymousClass7IW(AnonymousClass7Y3 r2) {
        this.A07 = r2;
        C877654k r0 = new C877654k(r2);
        this.A06 = r0;
        this.A04 = r0;
        AnonymousClass7YG r02 = r0.A00;
        this.A05 = r02;
        this.A02 = r02;
    }
}
