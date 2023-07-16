package X;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.53X  reason: invalid class name */
public final class AnonymousClass53X extends AnonymousClass7YG implements C145748l1, C147768ps, C142998fw, C147628pe, C147738pp, C147728po, C147698pl, C147708pm, C147748pq, C147678pj, C143018fy, C147718pn, C147638pf, C147668pi, C147758pr {
    public C147538pV A00;
    public C146508mM A01;
    public AnonymousClass54L A02;
    public HashSet A03 = C18200wM.A0u();
    public boolean A04 = true;

    public AnonymousClass53X(C147538pV r3) {
        C04220Ms.A0B(r3, 1);
        this.A01 = C115916w7.A00(r3);
        this.A00 = r3;
    }

    public static C147528pU A00(AnonymousClass53X r1, Object obj) {
        C04220Ms.A0B(obj, 1);
        C147538pV r12 = r1.A00;
        C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return (C147528pU) r12;
    }

    public final void AIj(C147558pX r7) {
        C147538pV r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        C147418pJ r4 = (C147418pJ) r1;
        if (this.A04 && (r1 instanceof C147508pS)) {
            C147538pV r3 = this.A00;
            if (r3 instanceof C147508pS) {
                ((AndroidComposeView) C121847Ik.A03(this)).A0Y.A00(this, C86164wN.A0v(r3, this, 19), AnonymousClass6aC.A01);
            }
            this.A04 = false;
        }
        r4.AIj(r7);
    }

    public final Object BgW(C147168nV r3, Object obj) {
        C04220Ms.A0B(r3, 0);
        C147538pV r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((C147468pO) r1).BgW(r3, obj);
    }

    public final void Bzc(C142898fm r2) {
        C04220Ms.A0B(r2, 0);
        throw C18180wK.A0a("Check failed.");
    }

    public final void C5z() {
        this.A04 = true;
        C98286Ex.A00(this);
    }

    public static final void A01(AnonymousClass53X r6) {
        if (r6.A08) {
            C147538pV r5 = r6.A00;
            if ((r6.A01 & 32) != 0) {
                if (r5 instanceof C147498pR) {
                    C1197076n r4 = ((AndroidComposeView) C121847Ik.A03(r6)).A0U;
                    C104176bM Aqd = ((C147498pR) r5).Aqd();
                    C04220Ms.A0B(Aqd, 1);
                    r4.A03.A0C(C121847Ik.A01(r6));
                    r4.A04.A0C(Aqd);
                    if (!r4.A00) {
                        r4.A00 = true;
                        r4.A05.CaB(C86154wM.A13(r4, 21));
                    }
                }
                if (r5 instanceof C147488pQ) {
                    ((C147488pQ) r5).C7Y(AnonymousClass6aC.A00);
                }
            }
            if ((r6.A01 & 8) != 0) {
                C121847Ik.A03(r6).CJp();
                return;
            }
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass53X r6, boolean r7) {
        /*
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0176
            X.8pV r3 = r6.A00
            int r0 = r6.A01
            r0 = r0 & 32
            r2 = 1
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3 instanceof X.C147498pR
            if (r0 == 0) goto L_0x004a
            r5 = r3
            X.8pR r5 = (X.C147498pR) r5
            X.54L r4 = r6.A02
            if (r4 == 0) goto L_0x0155
            X.6bM r1 = r5.Aqd()
            boolean r0 = r4.A01(r1)
            if (r0 == 0) goto L_0x0155
            r4.A00 = r5
            X.8nO r0 = X.C121847Ik.A03(r6)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.76n r4 = r0.A0U
        L_0x002c:
            X.C04220Ms.A0B(r1, r2)
            X.84X r0 = r4.A01
            r0.A0C(r6)
            X.84X r0 = r4.A02
            r0.A0C(r1)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x004a
            r4.A00 = r2
            X.8nO r1 = r4.A05
            r0 = 21
            kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1 r0 = X.C86154wM.A13(r4, r0)
            r1.CaB(r0)
        L_0x004a:
            boolean r0 = r3 instanceof X.C147488pQ
            if (r0 == 0) goto L_0x0053
            if (r7 == 0) goto L_0x0146
            r6.A06()
        L_0x0053:
            int r0 = r6.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0069
            boolean r0 = r3 instanceof X.C147508pS
            if (r0 == 0) goto L_0x005f
            r6.A04 = r2
        L_0x005f:
            if (r7 != 0) goto L_0x0069
            r0 = 2
            X.54T r0 = X.C121847Ik.A02(r6, r0)
            r0.A0O()
        L_0x0069:
            int r0 = r6.A01
            r0 = r0 & 2
            if (r0 == 0) goto L_0x009a
            X.7Y3 r0 = X.C121847Ik.A01(r6)
            X.7IW r0 = r0.A0a
            X.7YG r0 = r0.A05
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0088
            X.54T r1 = r6.A06
            X.C04220Ms.A0A(r1)
            r0 = r1
            X.54l r0 = (X.C877754l) r0
            r0.A00 = r6
            r1.A0N()
        L_0x0088:
            if (r7 != 0) goto L_0x009a
            r0 = 2
            X.54T r0 = X.C121847Ik.A02(r6, r0)
            r0.A0O()
            X.7Y3 r1 = X.C121847Ik.A01(r6)
            r0 = 0
            r1.A0P(r0)
        L_0x009a:
            boolean r0 = r3 instanceof X.C147478pP
            if (r0 == 0) goto L_0x00a4
            r0 = r3
            X.8pP r0 = (X.C147478pP) r0
            r0.CFQ(r6)
        L_0x00a4:
            r1 = 128(0x80, float:1.794E-43)
            int r0 = r6.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0103
            boolean r0 = r3 instanceof X.C147458pN
            if (r0 == 0) goto L_0x00c3
            X.7Y3 r0 = X.C121847Ik.A01(r6)
            X.7IW r0 = r0.A0a
            X.7YG r0 = r0.A05
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00c3
            X.7Y3 r1 = X.C121847Ik.A01(r6)
            r0 = 0
            r1.A0P(r0)
        L_0x00c3:
            boolean r0 = r3 instanceof X.C147448pM
            if (r0 == 0) goto L_0x0103
            r0 = 0
            r6.A01 = r0
            X.7Y3 r0 = X.C121847Ik.A01(r6)
            X.7IW r0 = r0.A0a
            X.7YG r0 = r0.A05
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0103
            X.8nO r2 = X.C121847Ik.A03(r6)
            X.7YL r1 = new X.7YL
            r1.<init>(r6)
            androidx.compose.ui.platform.AndroidComposeView r2 = (androidx.compose.ui.platform.AndroidComposeView) r2
            X.7HO r0 = r2.A0X
            X.84X r0 = r0.A02
            r0.A0C(r1)
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L_0x0103
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L_0x0103
            int r0 = r2.getWidth()
            if (r0 == 0) goto L_0x0142
            int r0 = r2.getHeight()
            if (r0 == 0) goto L_0x0142
            r2.invalidate()
        L_0x0103:
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r6.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0122
            boolean r0 = r3 instanceof X.C147438pL
            if (r0 == 0) goto L_0x0122
            X.7Y3 r0 = X.C121847Ik.A01(r6)
            X.7IW r0 = r0.A0a
            X.7YG r0 = r0.A05
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0122
            X.7Y3 r1 = X.C121847Ik.A01(r6)
            r0 = 0
            r1.A0P(r0)
        L_0x0122:
            int r2 = r6.A01
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0136
            boolean r0 = r3 instanceof X.C147428pK
            if (r0 == 0) goto L_0x0136
            X.8pK r3 = (X.C147428pK) r3
            X.6bK r1 = r3.B21()
            X.54T r0 = r6.A06
            r1.A00 = r0
        L_0x0136:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0141
            X.8nO r0 = X.C121847Ik.A03(r6)
            r0.CJp()
        L_0x0141:
            return
        L_0x0142:
            r2.requestLayout()
            goto L_0x0103
        L_0x0146:
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1 r1 = X.C86154wM.A13(r6, r0)
            X.8nO r0 = X.C121847Ik.A03(r6)
            r0.CaB(r1)
            goto L_0x0053
        L_0x0155:
            X.54L r0 = new X.54L
            r0.<init>(r5)
            r6.A02 = r0
            X.7Y3 r0 = X.C121847Ik.A01(r6)
            X.7IW r0 = r0.A0a
            X.7YG r0 = r0.A05
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x004a
            X.8nO r0 = X.C121847Ik.A03(r6)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.76n r4 = r0.A0U
            X.6bM r1 = r5.Aqd()
            goto L_0x002c
        L_0x0176:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53X.A02(X.53X, boolean):void");
    }

    public final void A06() {
        if (this.A08) {
            this.A03.clear();
            ((AndroidComposeView) C121847Ik.A03(this)).A0Y.A00(this, C86154wM.A13(this, 23), AnonymousClass6aC.A02);
        }
    }

    public final Object AbB(C104176bM r5) {
        this.A03.add(r5);
        AnonymousClass7YG r1 = this.A03;
        if (r1.A08) {
            AnonymousClass7YG r3 = r1.A04;
            AnonymousClass7Y3 A012 = C121847Ik.A01(this);
            while (true) {
                if ((A012.A0a.A02.A00 & 32) != 0) {
                    while (r3 != null) {
                        if ((r3.A01 & 32) != 0 && (r3 instanceof C147628pe)) {
                            C147628pe r12 = (C147628pe) r3;
                            if (r12.B4y().A01(r5)) {
                                return r12.B4y().A00(r5);
                            }
                        }
                        r3 = r3.A04;
                    }
                }
                A012 = A012.A09();
                if (A012 == null) {
                    return r5.A00.invoke();
                }
                AnonymousClass7IW r0 = A012.A0a;
                if (r0 != null) {
                    r3 = r0.A05;
                } else {
                    r3 = null;
                }
            }
        } else {
            throw C18180wK.A0a("Check failed.");
        }
    }

    public final C113206qv B4y() {
        AnonymousClass54L r0 = this.A02;
        if (r0 == null) {
            return AnonymousClass54M.A00;
        }
        return r0;
    }

    public final C134887yX BAK() {
        C147538pV r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((AnonymousClass55K) ((C147408pI) r1)).A00;
    }

    public final long BCH() {
        return AnonymousClass7FV.A02(C121847Ik.A02(this, 128).A02);
    }

    public final boolean BZg() {
        return this.A08;
    }

    public final void BgV(C146948n8 r2) {
        throw C18180wK.A0a("Check failed.");
    }

    public final String toString() {
        return this.A00.toString();
    }

    public final /* synthetic */ void ANV() {
        C121847Ik.A01(this).ANV();
    }

    public final C147168nV Acs() {
        return C121847Ik.A01(this).A0C;
    }

    public final int BfA(C147148nT r2, C147838q0 r3, int i) {
        return A00(this, r2).BfA(r2, r3, i);
    }

    public final int BfD(C147148nT r2, C147838q0 r3, int i) {
        return A00(this, r2).BfD(r2, r3, i);
    }

    public final C146098ld Bg3(C147578pZ r2, C147618pd r3, long j) {
        return A00(this, r2).Bg3(r2, r3, j);
    }

    public final int BgL(C147148nT r2, C147838q0 r3, int i) {
        return A00(this, r2).BgL(r2, r3, i);
    }

    public final int BgO(C147148nT r2, C147838q0 r3, int i) {
        return A00(this, r2).BgO(r2, r3, i);
    }

    public final void CBU(C109656kM r9, AnonymousClass67C r10, long j) {
        boolean z;
        AnonymousClass0wJ.A1N(r9, r10);
        C147538pV r1 = this.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C104156bK B21 = ((C147428pK) r1).B21();
        if (B21 instanceof AnonymousClass54D) {
            AnonymousClass54D r3 = (AnonymousClass54D) B21;
            C04220Ms.A0B(r10, 1);
            r3.A00 = j;
            if (r10 == AnonymousClass67C.Initial) {
                r3.A01 = r9;
            }
            AnonymousClass54D.A00(r9, r10, r3);
            List list = r9.A03;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!C121667Hg.A02(C86124wJ.A0P(list, i))) {
                        break;
                    }
                    i++;
                } else {
                    r9 = null;
                    break;
                }
            }
            r3.A02 = r9;
            return;
        }
        AnonymousClass54C r32 = (AnonymousClass54C) B21;
        boolean A1V = C18210wN.A1V(r10);
        List list2 = r9.A03;
        AnonymousClass7XO r4 = r32.A01;
        if (!r4.A02) {
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                C121197Es A0P = C86124wJ.A0P(list2, i2);
                if (C121667Hg.A01(A0P) || C121667Hg.A02(A0P)) {
                    break;
                }
                i2++;
            }
        }
        z = true;
        if (r32.A00 != AnonymousClass006.A0C) {
            if (r10 == AnonymousClass67C.Initial && z) {
                AnonymousClass54C.A00(r9, r32);
            }
            if (r10 == AnonymousClass67C.Final && !z) {
                AnonymousClass54C.A00(r9, r32);
            }
        }
        if (r10 == AnonymousClass67C.Final) {
            int size3 = list2.size();
            int i3 = 0;
            while (i3 < size3) {
                if (C121667Hg.A02(C86124wJ.A0P(list2, i3))) {
                    i3++;
                } else {
                    return;
                }
            }
            r32.A00 = AnonymousClass006.A00;
            r4.A02 = A1V;
        }
    }

    public final AnonymousClass69J getLayoutDirection() {
        return C121847Ik.A01(this).A0D;
    }
}
