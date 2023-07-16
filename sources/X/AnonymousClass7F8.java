package X;

import android.view.ActionMode;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape174S0100000_I2;

/* renamed from: X.7F8  reason: invalid class name */
public final class AnonymousClass7F8 {
    public AnonymousClass77X A00 = new AnonymousClass77X();
    public AnonymousClass7KC A01;
    public C142938fq A02;
    public C146508mM A03;
    public C143038g0 A04;
    public C143048g1 A05;
    public AnonymousClass0YY A06 = C77854hU.A00;
    public final C123207Vw A07;
    public final C147368pE A08;
    public final C147368pE A09;
    public final C147368pE A0A;
    public final C147368pE A0B;
    public final C147368pE A0C;
    public final C147368pE A0D;
    public final C147368pE A0E;
    public final C147368pE A0F;

    public AnonymousClass7F8(C123207Vw r7) {
        C04220Ms.A0B(r7, 1);
        this.A07 = r7;
        AnonymousClass7WR r4 = AnonymousClass7WR.A00;
        this.A08 = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0E = C86104wH.A0I(r4, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        long j = AnonymousClass7KC.A03;
        this.A0A = C86104wH.A0I(r4, C86124wJ.A0O(j), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0B = C86104wH.A0I(r4, C86124wJ.A0O(j), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0F = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0D = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0C = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        r7.A03 = C86154wM.A0z(this, 30);
        r7.A06 = C86164wN.A0w(this, 8);
        r7.A05 = C86154wM.A0z(this, 31);
        r7.A07 = new KtLambdaShape174S0100000_I2(this, 2);
        r7.A01 = C86154wM.A12(this, 45);
        r7.A04 = C86154wM.A0z(this, 32);
        r7.A02 = C86154wM.A0z(this, 33);
    }

    public final boolean A09(C146848mx r17, AnonymousClass7KC r18, AnonymousClass7KC r19, boolean z) {
        C114876u2 r0;
        long j;
        AnonymousClass7KC r3 = r18;
        if (r18 == null) {
            return false;
        }
        C114886u3 r6 = (C114886u3) this.A08.getValue();
        if (r6 == null) {
            return false;
        }
        boolean z2 = z;
        if (z) {
            r0 = r6.A00;
        } else {
            r0 = r6.A01;
        }
        C145708kx r1 = (C145708kx) this.A07.A0B.get(Long.valueOf(r0.A01));
        if (r1 == null) {
            return false;
        }
        C146508mM Ard = r1.Ard();
        C04220Ms.A0A(Ard);
        AnonymousClass7KC A002 = A00(this, Ard, AnonymousClass746.A00(r1.AlH(r6, !z)));
        if (A002 == null) {
            return false;
        }
        long j2 = A002.A00;
        if (z) {
            j = r3.A00;
        } else {
            j = j2;
            j2 = r3.A00;
        }
        return A08(r17, r19, j, j2, z2);
    }

    public static final AnonymousClass7KC A00(AnonymousClass7F8 r1, C146508mM r2, long j) {
        C146508mM r0 = r1.A03;
        if (r0 == null || !r0.BRS()) {
            return null;
        }
        return C86124wJ.A0O(r1.A03().Bay(r2, j));
    }

    public static final void A01(AnonymousClass7F8 r8) {
        C146508mM r2;
        C146508mM r4;
        C114886u3 r7 = (C114886u3) r8.A08.getValue();
        C146508mM r6 = r8.A03;
        AnonymousClass7KC r5 = null;
        if (r7 != null) {
            C145708kx A022 = r8.A02(r7.A01);
            C145708kx A023 = r8.A02(r7.A00);
            if (A022 != null) {
                r2 = A022.Ard();
            } else {
                r2 = null;
            }
            if (A023 != null) {
                r4 = A023.Ard();
            } else {
                r4 = null;
            }
            if (!(r6 == null || !r6.BRS() || r2 == null || r4 == null)) {
                long Bay = r6.Bay(r2, A022.AlH(r7, true));
                long Bay2 = r6.Bay(r4, A023.AlH(r7, false));
                AnonymousClass7F6 A024 = AnonymousClass7FK.A02(r6);
                AnonymousClass7KC A0O = C86124wJ.A0O(Bay);
                if (!AnonymousClass7FK.A03(A024, Bay) && r8.A0C.getValue() != AnonymousClass678.SelectionStart) {
                    A0O = null;
                }
                r8.A0F.CrC(A0O);
                AnonymousClass7KC A0O2 = C86124wJ.A0O(Bay2);
                if (AnonymousClass7FK.A03(A024, Bay2) || r8.A0C.getValue() == AnonymousClass678.SelectionEnd) {
                    r5 = A0O2;
                }
                r8.A0D.CrC(r5);
            }
        }
        r8.A0F.CrC((Object) null);
        r8.A0D.CrC(r5);
    }

    public final C145708kx A02(C114876u2 r4) {
        return (C145708kx) this.A07.A0B.get(Long.valueOf(r4.A01));
    }

    public final C146508mM A03() {
        C146508mM r2 = this.A03;
        if (!AnonymousClass0wJ.A1W(r2)) {
            throw C18190wL.A0a("Failed requirement.");
        } else if (r2.BRS()) {
            return r2;
        } else {
            throw C18190wL.A0a("Failed requirement.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        if (r0 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r0 != false) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r18 = this;
            r12 = r18
            X.7Vw r1 = r12.A07
            X.8mM r0 = r12.A03()
            java.util.List r17 = r1.A00(r0)
            X.8pE r0 = r12.A08
            java.lang.Object r7 = r0.getValue()
            X.6u3 r7 = (X.C114886u3) r7
            r9 = 0
            if (r7 == 0) goto L_0x0097
            r11 = 0
            int r14 = r17.size()
        L_0x001c:
            if (r11 >= r14) goto L_0x008e
            r0 = r17
            java.lang.Object r6 = r0.get(r11)
            X.8kx r6 = (X.C145708kx) r6
            r0 = r6
            X.7Vu r0 = (X.C123197Vu) r0
            long r0 = r0.A02
            X.6u2 r8 = r7.A01
            long r4 = r8.A01
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0045
            r0 = r6
            X.7Vu r0 = (X.C123197Vu) r0
            long r2 = r0.A02
            X.6u2 r0 = r7.A00
            long r0 = r0.A01
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0045
            if (r9 != 0) goto L_0x0045
        L_0x0042:
            int r11 = r11 + 1
            goto L_0x001c
        L_0x0045:
            r13 = 0
            r3 = r6
            X.7Vu r3 = (X.C123197Vu) r3
            X.0ZU r0 = r3.A03
            java.lang.Object r0 = r0.invoke()
            X.7AW r0 = (X.AnonymousClass7AW) r0
            if (r0 != 0) goto L_0x00c9
            r2 = 0
            r1 = 6
            java.lang.String r0 = ""
            X.7yH r10 = new X.7yH
            r10.<init>(r2, r1, r0)
        L_0x005c:
            long r2 = r3.A02
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0098
            X.6u2 r0 = r7.A00
            long r0 = r0.A01
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 == 0) goto L_0x0098
        L_0x006a:
            if (r9 == 0) goto L_0x0070
            X.7yH r10 = r9.A06(r10)
        L_0x0070:
            r0 = r6
            X.7Vu r0 = (X.C123197Vu) r0
            long r2 = r0.A02
            X.6u2 r0 = r7.A00
            long r0 = r0.A01
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0081
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x008d
        L_0x0081:
            X.7Vu r6 = (X.C123197Vu) r6
            long r0 = r6.A02
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00ce
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00ce
        L_0x008d:
            r9 = r10
        L_0x008e:
            if (r9 == 0) goto L_0x0097
            X.8g0 r0 = r12.A04
            if (r0 == 0) goto L_0x0097
            r0.CqS(r9)
        L_0x0097:
            return
        L_0x0098:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            X.6u2 r15 = r7.A00
            long r0 = r15.A01
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x00b5
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00b1
            int r13 = r15.A00
        L_0x00aa:
            int r0 = r8.A00
        L_0x00ac:
            X.7yH r10 = r10.subSequence(r13, r0)
            goto L_0x006a
        L_0x00b1:
            int r13 = r8.A00
            r8 = r15
            goto L_0x00aa
        L_0x00b5:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r0 = r7.A02
            if (r1 != 0) goto L_0x00be
            if (r0 == 0) goto L_0x00c2
            goto L_0x00aa
        L_0x00be:
            X.6u2 r8 = r7.A00
            if (r0 == 0) goto L_0x00aa
        L_0x00c2:
            int r13 = r8.A00
            int r0 = r10.length()
            goto L_0x00ac
        L_0x00c9:
            X.6uz r0 = r0.A04
            X.7yH r10 = r0.A03
            goto L_0x005c
        L_0x00ce:
            r9 = r10
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F8.A04():void");
    }

    public final void A05() {
        Integer num;
        if (C86104wH.A1X(this.A0E)) {
            C143048g1 r2 = this.A05;
            if (r2 != null) {
                num = ((AnonymousClass7YX) r2).A01;
            } else {
                num = null;
            }
            if (num == AnonymousClass006.A00 && r2 != null) {
                AnonymousClass7YX r22 = (AnonymousClass7YX) r2;
                r22.A01 = AnonymousClass006.A01;
                ActionMode actionMode = r22.A00;
                if (actionMode != null) {
                    actionMode.finish();
                }
                r22.A00 = null;
            }
        }
    }

    public final void A06() {
        C123207Vw r0 = this.A07;
        r0.A09.CrC(AnonymousClass4WJ.A0A());
        A05();
        if (this.A08.getValue() != null) {
            this.A06.invoke((Object) null);
            C142938fq r1 = this.A02;
            if (r1 != null) {
                r1.CWa(9);
            }
        }
    }

    public final void A07() {
        C143048g1 r14;
        AnonymousClass7F6 r1;
        C146508mM Ard;
        C146508mM Ard2;
        C146508mM r4;
        if (C86104wH.A1X(this.A0E)) {
            C147368pE r12 = this.A08;
            if (r12.getValue() != null && (r14 = this.A05) != null) {
                C114886u3 r122 = (C114886u3) r12.getValue();
                if (r122 != null) {
                    C114876u2 r11 = r122.A01;
                    C145708kx A022 = A02(r11);
                    C114876u2 r8 = r122.A00;
                    C145708kx A023 = A02(r8);
                    if (!(A022 == null || (Ard = A022.Ard()) == null || A023 == null || (Ard2 = A023.Ard()) == null || (r4 = this.A03) == null || !r4.BRS())) {
                        long Bay = r4.Bay(Ard, A022.AlH(r122, true));
                        long Bay2 = r4.Bay(Ard2, A023.AlH(r122, false));
                        long Bb0 = r4.Bb0(Bay);
                        long Bb02 = r4.Bb0(Bay2);
                        float min = Math.min(AnonymousClass7KC.A01(Bb0), AnonymousClass7KC.A01(Bb02));
                        float max = Math.max(AnonymousClass7KC.A01(Bb0), AnonymousClass7KC.A01(Bb02));
                        long Bay3 = r4.Bay(Ard, C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A022.AU5(r11.A00).A03));
                        long Bay4 = r4.Bay(Ard2, C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A023.AU5(r8.A00).A03));
                        r1 = new AnonymousClass7F6(min, Math.min(AnonymousClass7KC.A02(r4.Bb0(Bay3)), AnonymousClass7KC.A02(r4.Bb0(Bay4))), max, Math.max(AnonymousClass7KC.A02(Bb0), AnonymousClass7KC.A02(Bb02)) + ((float) (((double) AnonymousClass746.A00) * 4.0d)));
                        r14.Ctn(r1, C86154wM.A12(this, 47), (AnonymousClass0ZU) null, (AnonymousClass0ZU) null, (AnonymousClass0ZU) null);
                    }
                }
                r1 = AnonymousClass7F6.A04;
                r14.Ctn(r1, C86154wM.A12(this, 47), (AnonymousClass0ZU) null, (AnonymousClass0ZU) null, (AnonymousClass0ZU) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        if (r0 != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016a, code lost:
        if (r0 != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.C146848mx r37, X.AnonymousClass7KC r38, long r39, long r41, boolean r43) {
        /*
            r36 = this;
            r28 = r43
            if (r43 == 0) goto L_0x0180
            X.678 r1 = X.AnonymousClass678.SelectionStart
        L_0x0006:
            r13 = r36
            X.8pE r0 = r13.A0C
            r0.CrC(r1)
            r34 = r39
            r32 = r41
            if (r43 == 0) goto L_0x017a
            X.7KC r1 = X.C86124wJ.A0O(r34)
        L_0x0017:
            X.8pE r0 = r13.A09
            r0.CrC(r1)
            java.util.LinkedHashMap r21 = X.C18220wO.A0y()
            X.7Vw r0 = r13.A07
            r31 = r0
            X.8mM r1 = r13.A03()
            java.util.List r20 = r0.A00(r1)
            r15 = 0
            int r19 = r20.size()
            r14 = 0
            r18 = 0
        L_0x0034:
            r0 = r19
            if (r14 >= r0) goto L_0x018b
            r0 = r20
            java.lang.Object r9 = r0.get(r14)
            X.8kx r9 = (X.C145708kx) r9
            r0 = r31
            X.8pE r0 = r0.A09
            java.util.Map r2 = X.C86154wM.A0t(r0)
            r8 = r9
            X.7Vu r8 = (X.C123197Vu) r8
            long r0 = r8.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r7 = r2.get(r0)
            X.6u3 r7 = (X.C114886u3) r7
            X.8mM r4 = r13.A03()
            r17 = 0
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r17)
            if (r7 == 0) goto L_0x0075
            long r2 = r8.A02
            X.6u2 r0 = r7.A01
            long r0 = r0.A01
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0184
            X.6u2 r0 = r7.A00
            long r0 = r0.A01
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0184
        L_0x0075:
            X.8mM r2 = r8.Ard()
            r12 = 0
            if (r2 == 0) goto L_0x0172
            X.0ZU r0 = r8.A03
            java.lang.Object r6 = r0.invoke()
            X.7AW r6 = (X.AnonymousClass7AW) r6
            if (r6 == 0) goto L_0x0172
            long r0 = X.AnonymousClass7KC.A03
            long r4 = r4.Bay(r2, r0)
            r0 = r34
            long r2 = X.AnonymousClass7KC.A04(r0, r4)
            r0 = r32
            long r0 = X.AnonymousClass7KC.A04(r0, r4)
            r10 = r38
            if (r38 == 0) goto L_0x016f
            long r10 = r10.A00
            long r4 = X.AnonymousClass7KC.A04(r10, r4)
            X.7KC r10 = X.C86124wJ.A0O(r4)
        L_0x00a6:
            long r4 = r8.A02
            r29 = r4
            long r4 = r6.A02
            int r8 = X.C86104wH.A07(r4)
            float r11 = (float) r8
            int r4 = X.C86104wH.A08(r4)
            float r8 = (float) r4
            r5 = 0
            X.7F6 r4 = new X.7F6
            r4.<init>(r5, r5, r11, r8)
            X.69D r8 = X.AnonymousClass69D.A01
            boolean r5 = r4.A05(r2)
            r11 = 1
            if (r5 != 0) goto L_0x010c
            boolean r5 = r4.A05(r0)
            if (r5 != 0) goto L_0x010c
            int r5 = r8.A00(r4, r2)
            int r8 = r8.A00(r4, r0)
            boolean r5 = X.C18180wK.A1X(r5)
            if (r8 > 0) goto L_0x00da
            r11 = 0
        L_0x00da:
            r5 = r5 ^ r11
            if (r5 != 0) goto L_0x010c
            r0 = r16
            kotlin.Pair r0 = X.C18180wK.A0p(r12, r0)
        L_0x00e3:
            java.lang.Object r2 = r0.A00
            X.6u3 r2 = (X.C114886u3) r2
            java.lang.Object r0 = r0.A01
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r18 != 0) goto L_0x00f3
            r18 = 0
            if (r0 == 0) goto L_0x00f5
        L_0x00f3:
            r18 = 1
        L_0x00f5:
            if (r2 == 0) goto L_0x0104
            X.7Vu r9 = (X.C123197Vu) r9
            long r0 = r9.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r21
            r0.put(r1, r2)
        L_0x0104:
            X.6u3 r15 = X.AnonymousClass7FK.A01(r15, r2)
            int r14 = r14 + 1
            goto L_0x0034
        L_0x010c:
            int r2 = X.C115766vs.A00(r4, r6, r2)
            int r3 = X.C115766vs.A00(r4, r6, r0)
            if (r10 == 0) goto L_0x016d
            long r0 = r10.A00
            int r4 = X.C115766vs.A00(r4, r6, r0)
        L_0x011c:
            long r26 = X.AnonymousClass6FM.A00(r2, r3)
            if (r7 == 0) goto L_0x0133
            X.6u2 r0 = r7.A01
            int r1 = r0.A00
            X.6u2 r0 = r7.A00
            int r0 = r0.A00
            long r0 = X.AnonymousClass6FM.A00(r1, r0)
            X.7Ia r12 = new X.7Ia
            r12.<init>(r0)
        L_0x0133:
            r22 = r37
            r23 = r6
            r24 = r12
            r25 = r4
            long r23 = r22.A82(r23, r24, r25, r26, r28)
            int r1 = X.C86104wH.A07(r23)
            int r0 = X.C86104wH.A08(r23)
            boolean r27 = X.C86134wK.A1X(r1, r0)
            r22 = r6
            r25 = r29
            X.6u3 r1 = X.C115766vs.A01(r22, r23, r25, r27)
            boolean r0 = X.C86144wL.A1X(r1, r7)
            if (r43 == 0) goto L_0x0167
            if (r2 == r4) goto L_0x016a
        L_0x015b:
            r17 = 1
        L_0x015d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            goto L_0x00e3
        L_0x0167:
            if (r3 == r4) goto L_0x016a
            goto L_0x015b
        L_0x016a:
            if (r0 == 0) goto L_0x015d
            goto L_0x015b
        L_0x016d:
            r4 = -1
            goto L_0x011c
        L_0x016f:
            r10 = r12
            goto L_0x00a6
        L_0x0172:
            r0 = r16
            kotlin.Pair r0 = X.C18180wK.A0p(r12, r0)
            goto L_0x00e3
        L_0x017a:
            X.7KC r1 = X.C86124wJ.A0O(r32)
            goto L_0x0017
        L_0x0180:
            X.678 r1 = X.AnonymousClass678.SelectionEnd
            goto L_0x0006
        L_0x0184:
            java.lang.String r0 = "The given previousSelection doesn't belong to this selectable."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x018b:
            X.8pE r0 = r13.A08
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.C04220Ms.A0I(r15, r0)
            if (r0 != 0) goto L_0x01ae
            X.8fq r1 = r13.A02
            if (r1 == 0) goto L_0x01a0
            r0 = 9
            r1.CWa(r0)
        L_0x01a0:
            r0 = r31
            X.8pE r1 = r0.A09
            r0 = r21
            r1.CrC(r0)
            X.0YY r0 = r13.A06
            r0.invoke(r15)
        L_0x01ae:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F8.A08(X.8mx, X.7KC, long, long, boolean):boolean");
    }
}
