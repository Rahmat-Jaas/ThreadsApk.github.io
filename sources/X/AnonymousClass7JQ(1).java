package X;

import androidx.compose.ui.Modifier;
import com.facebook.redex.IDxDObserverShape844S0100000_2_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0000100_I2;

/* renamed from: X.7JQ  reason: invalid class name */
public final class AnonymousClass7JQ {
    public static final void A04(C121827Ii r16, C147188nY r17, int i) {
        C121457Gf r0;
        C121827Ii r5 = r16;
        C04220Ms.A0B(r5, 0);
        C147188nY r12 = r17;
        r12.Cvd(-1436003720);
        C113196qu r02 = r5.A02;
        if (r02 != null && C86104wH.A1X(r02.A0C)) {
            boolean A0z = C147188nY.A0z(r12, r5, 1157296644);
            AnonymousClass7W3 r6 = (AnonymousClass7W3) r12;
            Object A13 = r6.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new IDxDObserverShape844S0100000_2_I2(r5, 0);
                r6.A14(A13);
            }
            AnonymousClass7W3.A0w(r6, false);
            C147168nV A0j = C147188nY.A0j(r12);
            C04220Ms.A0B(A0j, 0);
            int CVm = r5.A07.CVm(C86104wH.A07(AnonymousClass7HD.A00(r5.A0H)));
            C113196qu r03 = r5.A02;
            if (r03 != null) {
                r0 = C147368pE.A00(r03);
            } else {
                r0 = null;
            }
            C04220Ms.A0A(r0);
            AnonymousClass7AW r1 = r0.A02;
            AnonymousClass7F6 A0A = r1.A0A(AnonymousClass8bI.A02(CVm, 0, r1.A04.A03.length()));
            long A0C = C86104wH.A0C(A0A.A01 + (A0j.CxL(AnonymousClass6ZI.A00) / ((float) 2)), A0A.A00);
            Modifier A01 = AnonymousClass7CA.A01(Modifier.A00, A13, new KtSLambdaShape14S0201000_I2(A13, (C146958n9) null, 14, 42));
            boolean A0z2 = C147188nY.A0z(r12, C86124wJ.A0O(A0C), 1157296644);
            Object A132 = r6.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = new KtLambdaShape2S0000100_I2(A0C, 1);
                r6.A14(A132);
            }
            AnonymousClass7Ck.A01(r12, AnonymousClass6FI.A00(A01, AnonymousClass7W3.A0B(r6, A132, false), false), (AnonymousClass0YP) null, 384, A0C);
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, r5, i, 6);
        }
    }

    public static final void A01(C113196qu r7) {
        C112046ot r6 = r7.A03;
        if (r6 != null) {
            C112036os r1 = r7.A0H;
            AnonymousClass0YY r5 = r7.A0J;
            C04220Ms.A0B(r5, 2);
            AnonymousClass7HD r0 = r1.A01;
            C134747yH r3 = r0.A01;
            long j = r0.A00;
            C04220Ms.A0B(r3, 0);
            r5.invoke(new AnonymousClass7HD(r3, (C121767Ia) null, j));
            C106886fn r12 = r6.A01;
            if (r12.A01.compareAndSet(r6, (Object) null)) {
                AnonymousClass7Z5 r32 = (AnonymousClass7Z5) r12.A00;
                AnonymousClass7Z1 r02 = (AnonymousClass7Z1) r32.A0A;
                AnonymousClass7Z4 r2 = r02.A01;
                if (C04220Ms.A0I(r2.A00, r02.A00)) {
                    r2.A00 = null;
                }
                r32.A05 = C78014hk.A00;
                r32.A06 = C78024hl.A00;
                r32.A00 = null;
                AnonymousClass7Z5.A00(C969367g.StopInput, r32);
            }
        }
        r7.A03 = null;
    }

    public static final void A02(C113196qu r1, AnonymousClass77X r2, boolean z) {
        C112046ot r12;
        if (!C86104wH.A1X(r1.A09)) {
            r2.A00(AnonymousClass8LW.A00);
        } else if (z && (r12 = r1.A03) != null && C04220Ms.A0I(r12.A01.A01.get(), r12)) {
            AnonymousClass7Z5.A00(C969367g.ShowKeyboard, (AnonymousClass7Z5) r12.A00);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[Catch:{ all -> 0x00bd, all -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C113196qu r11, X.C146978nB r12, X.AnonymousClass7HD r13) {
        /*
            androidx.compose.runtime.snapshots.Snapshot r10 = X.C121637Hc.A02()
            androidx.compose.runtime.snapshots.Snapshot r9 = r10.A05()     // Catch:{ all -> 0x00c2 }
            X.7Gf r0 = X.C147368pE.A00(r11)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            X.6ot r4 = r11.A03     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x00b6
            X.8mM r5 = r11.A01     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x00b6
            X.6sY r7 = r11.A00     // Catch:{ all -> 0x00bd }
            X.7AW r2 = r0.A02     // Catch:{ all -> 0x00bd }
            X.8pE r0 = r11.A09     // Catch:{ all -> 0x00bd }
            boolean r1 = X.C86104wH.A1X(r0)     // Catch:{ all -> 0x00bd }
            boolean r6 = X.AnonymousClass0wJ.A1Z(r13, r7)     // Catch:{ all -> 0x00bd }
            r0 = 6
            X.C04220Ms.A0B(r12, r0)     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x00b6
            long r0 = r13.A00     // Catch:{ all -> 0x00bd }
            int r0 = X.C121767Ia.A00(r0)     // Catch:{ all -> 0x00bd }
            int r1 = r12.CVm(r0)     // Catch:{ all -> 0x00bd }
            X.6uz r0 = r2.A04     // Catch:{ all -> 0x00bd }
            X.7yH r0 = r0.A03     // Catch:{ all -> 0x00bd }
            int r0 = r0.length()     // Catch:{ all -> 0x00bd }
            if (r1 < r0) goto L_0x0042
            if (r1 == 0) goto L_0x0047
            int r1 = r1 + -1
        L_0x0042:
            X.7F6 r0 = r2.A09(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x0060
        L_0x0047:
            X.7If r3 = r7.A06     // Catch:{ all -> 0x00bd }
            X.8nV r2 = r7.A08     // Catch:{ all -> 0x00bd }
            X.8g4 r1 = r7.A07     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = X.AnonymousClass72Q.A00     // Catch:{ all -> 0x00bd }
            long r0 = X.AnonymousClass72Q.A00(r3, r1, r2, r0, r6)     // Catch:{ all -> 0x00bd }
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.C86104wH.A08(r0)     // Catch:{ all -> 0x00bd }
            float r2 = (float) r0     // Catch:{ all -> 0x00bd }
            r1 = 0
            X.7F6 r0 = new X.7F6     // Catch:{ all -> 0x00bd }
            r0.<init>(r1, r1, r3, r2)     // Catch:{ all -> 0x00bd }
        L_0x0060:
            float r8 = r0.A01     // Catch:{ all -> 0x00bd }
            float r7 = r0.A03     // Catch:{ all -> 0x00bd }
            long r1 = X.C86104wH.A0C(r8, r7)     // Catch:{ all -> 0x00bd }
            long r5 = r5.Bb0(r1)     // Catch:{ all -> 0x00bd }
            float r2 = X.AnonymousClass7KC.A01(r5)     // Catch:{ all -> 0x00bd }
            float r1 = X.AnonymousClass7KC.A02(r5)     // Catch:{ all -> 0x00bd }
            long r2 = X.C86104wH.A0C(r2, r1)     // Catch:{ all -> 0x00bd }
            float r1 = r0.A02     // Catch:{ all -> 0x00bd }
            float r1 = r1 - r8
            float r0 = r0.A00     // Catch:{ all -> 0x00bd }
            float r0 = r0 - r7
            long r0 = X.C86104wH.A0C(r1, r0)     // Catch:{ all -> 0x00bd }
            X.7F6 r2 = X.AnonymousClass6EY.A00(r2, r0)     // Catch:{ all -> 0x00bd }
            X.6fn r0 = r4.A01     // Catch:{ all -> 0x00bd }
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00bd }
            X.6ot r0 = (X.C112046ot) r0     // Catch:{ all -> 0x00bd }
            boolean r0 = X.C04220Ms.A0I(r0, r4)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            X.8dF r1 = r4.A00     // Catch:{ all -> 0x00bd }
            X.7Z5 r1 = (X.AnonymousClass7Z5) r1     // Catch:{ all -> 0x00bd }
            android.graphics.Rect r0 = X.AnonymousClass7F6.A00(r2)     // Catch:{ all -> 0x00bd }
            r1.A00 = r0     // Catch:{ all -> 0x00bd }
            java.util.List r0 = r1.A04     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            android.graphics.Rect r2 = r1.A00     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x00b6
            android.view.View r1 = r1.A07     // Catch:{ all -> 0x00bd }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x00bd }
            r0.<init>(r2)     // Catch:{ all -> 0x00bd }
            r1.requestRectangleOnScreen(r0)     // Catch:{ all -> 0x00bd }
        L_0x00b6:
            X.C86144wL.A1N(r9)     // Catch:{ all -> 0x00c2 }
            r10.A0A()
            return
        L_0x00bd:
            r0 = move-exception
            X.C86144wL.A1N(r9)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            r10.A0A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JQ.A03(X.6qu, X.8nB, X.7HD):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r1 != true) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C121827Ii r8, X.C147188nY r9, int r10, boolean r11) {
        /*
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            r9.Cvd(r0)
            if (r11 == 0) goto L_0x00bb
            X.6qu r0 = r8.A02
            r5 = 1
            if (r0 == 0) goto L_0x00ab
            X.7Gf r0 = X.C147368pE.A00(r0)
            if (r0 == 0) goto L_0x00ab
            X.7AW r7 = r0.A02
            X.6qu r0 = r8.A02
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.A05
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ab
            X.8pE r4 = r8.A0H
            long r0 = X.AnonymousClass7HD.A00(r4)
            boolean r0 = X.C121767Ia.A02(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0082
            X.8nB r2 = r8.A07
            long r0 = X.AnonymousClass7HD.A00(r4)
            int r0 = X.C86104wH.A07(r0)
            int r6 = r2.CVm(r0)
            X.8nB r2 = r8.A07
            long r0 = X.AnonymousClass7HD.A00(r4)
            int r0 = X.C86104wH.A08(r0)
            int r0 = r2.CVm(r0)
            X.66n r6 = r7.A0B(r6)
            int r0 = r0 - r5
            int r0 = java.lang.Math.max(r0, r3)
            X.66n r2 = r7.A0B(r0)
            r0 = -498391544(0xffffffffe24b2608, float:-9.368574E20)
            r9.Cvb(r0)
            X.6qu r0 = r8.A02
            if (r0 == 0) goto L_0x0068
            X.8pE r0 = r0.A0E
            boolean r1 = X.C86104wH.A1X(r0)
            r0 = 1
            if (r1 == r5) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            r1 = 518(0x206, float:7.26E-43)
            if (r0 == 0) goto L_0x0070
            X.C115786vu.A00(r8, r9, r6, r1, r5)
        L_0x0070:
            X.AnonymousClass7W3.A0z(r9, r3)
            X.6qu r0 = r8.A02
            if (r0 == 0) goto L_0x0082
            X.8pE r0 = r0.A0D
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 != r5) goto L_0x0082
            X.C115786vu.A00(r8, r9, r2, r1, r3)
        L_0x0082:
            X.6qu r2 = r8.A02
            if (r2 == 0) goto L_0x00ab
            X.7HD r0 = r8.A08
            X.7yH r0 = r0.A01
            java.lang.String r1 = r0.A00
            X.7HD r0 = X.C86154wM.A0I(r4)
            X.7yH r0 = r0.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.C86144wL.A1X(r1, r0)
            if (r0 == 0) goto L_0x009c
            r2.A06 = r3
        L_0x009c:
            X.8pE r0 = r2.A09
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00bb
            r8.A08()
        L_0x00ab:
            X.8nW r2 = r9.AKE()
            if (r2 == 0) goto L_0x00ba
            r1 = 0
            kotlin.jvm.internal.KtLambdaShape4S0111000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S0111000_I2
            r0.<init>(r8, r10, r1, r11)
            r2.D9d(r0)
        L_0x00ba:
            return
        L_0x00bb:
            r8.A06()
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JQ.A05(X.7Ii, X.8nY, int, boolean):void");
    }

    public static final void A06(C121827Ii r13, C147188nY r14, Modifier modifier, AnonymousClass0YP r16, int i) {
        r14.Cvd(-20551815);
        int i2 = i;
        C146288ly A07 = AnonymousClass7KV.A07(r14, true);
        Object A0p = C147188nY.A0p(r14);
        Object A0n = C147188nY.A0n(r14);
        Object A0m = C147188nY.A0m(r14);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        Modifier modifier2 = modifier;
        AnonymousClass0YM A00 = C98236Es.A00(modifier);
        int A01 = C86114wI.A01((((i & 14) | 384) << 3) & 112);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r14;
        C147188nY.A0w(r14, r2, r1);
        AnonymousClass7W3.A0a(r14, r2, A07, A0p);
        AnonymousClass7KP.A08(r14, A0n, A0m, A00, A01);
        C121827Ii r11 = r13;
        AnonymousClass0YP r10 = r16;
        C115756vr.A01(r13, r14, r10, ((i >> 3) & 112) | 8);
        AnonymousClass7W3.A0w(r2, false);
        AnonymousClass7W3.A0e(r2);
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 3, r10, r11, modifier2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: X.53m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v136, resolved type: X.6fn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: X.53m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: X.53m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v47, resolved type: X.53m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v7, resolved type: X.53m} */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r28v3 */
    /* JADX WARNING: type inference failed for: r28v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0519, code lost:
        if (r16 != false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0092, code lost:
        if (r0.ACY(r25) == false) goto L_0x0094;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x06f0  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0736  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x075a  */
    /* JADX WARNING: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r49, X.AnonymousClass7ER r50, X.C147188nY r51, androidx.compose.ui.Modifier r52, X.C111366nD r53, X.C121807If r54, X.C1202679l r55, X.AnonymousClass7HD r56, X.C146898n3 r57, X.AnonymousClass0YY r58, X.AnonymousClass0YY r59, X.AnonymousClass0YM r60, int r61, int r62, int r63, int r64, int r65, boolean r66, boolean r67, boolean r68) {
        /*
            r31 = r60
            r30 = r52
            r29 = r54
            r26 = r61
            r18 = r57
            r24 = r50
            r32 = r59
            r20 = r67
            r23 = r49
            r33 = r62
            r25 = r55
            r28 = r53
            r17 = r66
            r16 = r68
            r8 = 0
            r67 = r58
            r68 = r56
            r1 = r68
            r0 = r67
            boolean r21 = X.AnonymousClass0wJ.A1Z(r1, r0)
            r1 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r0 = r51
            r0.Cvd(r1)
            r9 = r65
            r1 = r65 & 1
            r14 = r63
            if (r1 == 0) goto L_0x07b1
            r10 = r63 | 6
        L_0x003b:
            r1 = r65 & 2
            if (r1 == 0) goto L_0x07a4
            r10 = r10 | 48
        L_0x0041:
            r35 = r65 & 4
            if (r35 == 0) goto L_0x0797
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r34 = r65 & 8
            r12 = 1024(0x400, float:1.435E-42)
            if (r34 == 0) goto L_0x078a
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x004f:
            r27 = r65 & 16
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r27 == 0) goto L_0x077a
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x0057:
            r22 = r65 & 32
            if (r22 == 0) goto L_0x076c
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x005d:
            r10 = r10 | r1
        L_0x005e:
            r15 = r65 & 64
            if (r15 == 0) goto L_0x075a
            r1 = 1572864(0x180000, float:2.204052E-39)
        L_0x0064:
            r10 = r10 | r1
        L_0x0065:
            r3 = r9 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0748
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x006b:
            r10 = r10 | r1
        L_0x006c:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0736
            r1 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0072:
            r10 = r10 | r1
        L_0x0073:
            r6 = r9 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0724
            r1 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0079:
            r10 = r10 | r1
        L_0x007a:
            r5 = r9 & 1024(0x400, float:1.435E-42)
            r19 = r64
            if (r5 == 0) goto L_0x0712
            r1 = r64 | 6
        L_0x0082:
            r2 = r64 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0097
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0094
            r2 = r25
            boolean r4 = r0.ACY(r2)
            r2 = 32
            if (r4 != 0) goto L_0x0096
        L_0x0094:
            r2 = 16
        L_0x0096:
            r1 = r1 | r2
        L_0x0097:
            r4 = r9 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0703
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x009d:
            r11 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x06f0
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00a3:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x06dc
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00a9:
            r2 = 32768(0x8000, float:4.5918E-41)
            r13 = r65 & r2
            if (r13 == 0) goto L_0x06ce
            r2 = 196608(0x30000, float:2.75506E-40)
        L_0x00b2:
            r1 = r1 | r2
        L_0x00b3:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r10 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r2) goto L_0x0108
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r2) goto L_0x0108
            boolean r2 = r0.BCM()
            if (r2 == 0) goto L_0x0108
            r0.CuJ()
        L_0x00ce:
            X.8nW r1 = r0.AKE()
            if (r1 == 0) goto L_0x0107
            kotlin.jvm.internal.KtLambdaShape0S01135000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S01135000_I2
            r34 = r0
            r35 = r68
            r36 = r67
            r37 = r30
            r38 = r29
            r39 = r18
            r40 = r32
            r41 = r23
            r42 = r28
            r43 = r25
            r44 = r24
            r45 = r31
            r46 = r26
            r47 = r33
            r48 = r14
            r49 = r19
            r50 = r9
            r51 = r21
            r52 = r17
            r53 = r20
            r54 = r16
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            X.7WO r1 = (X.AnonymousClass7WO) r1
            r1.A06 = r0
        L_0x0107:
            return
        L_0x0108:
            r0.CvD()
            r2 = r63 & 1
            if (r2 == 0) goto L_0x0682
            boolean r2 = r0.Acj()
            if (r2 != 0) goto L_0x0682
            r0.CuJ()
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x011e
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x011e:
            r0.AKA()
            X.7W3 r5 = X.C147188nY.A0Y(r0)
            java.lang.Object r41 = r5.A13()
            java.lang.Object r46 = X.AnonymousClass7GN.A00
            r3 = r41
            r2 = r46
            if (r3 != r2) goto L_0x013b
            X.77X r41 = new X.77X
            r41.<init>()
            r2 = r41
            r5.A14(r2)
        L_0x013b:
            X.AnonymousClass7W3.A0w(r5, r8)
            r2 = r41
            X.77X r2 = (X.AnonymousClass77X) r2
            r41 = r2
            r2 = -55012947(0xfffffffffcb891ad, float:-7.666698E36)
            r0.Cvb(r2)
            if (r20 == 0) goto L_0x067e
            if (r16 != 0) goto L_0x067e
            X.534 r2 = X.AnonymousClass7DE.A09
            java.lang.Object r34 = r0.AEA(r2)
            r2 = r34
            X.6fn r2 = (X.C106886fn) r2
            r34 = r2
        L_0x015a:
            X.AnonymousClass7W3.A0w(r5, r8)
            X.534 r2 = X.AnonymousClass7DE.A02
            java.lang.Object r22 = r0.AEA(r2)
            r2 = r22
            X.8nV r2 = (X.C147168nV) r2
            r22 = r2
            X.534 r2 = X.AnonymousClass7DE.A04
            java.lang.Object r6 = r0.AEA(r2)
            X.8g4 r6 = (X.C143078g4) r6
            X.534 r2 = X.AnonymousClass6ZJ.A01
            java.lang.Object r2 = r0.AEA(r2)
            X.6tP r2 = (X.C114506tP) r2
            long r2 = r2.A00
            r35 = r2
            X.534 r2 = X.AnonymousClass7DE.A03
            java.lang.Object r37 = r0.AEA(r2)
            r2 = r37
            X.8fl r2 = (X.C142888fl) r2
            r37 = r2
            r2 = r26
            r3 = r21
            if (r2 != r3) goto L_0x067a
            if (r17 != 0) goto L_0x067a
            r2 = r25
            boolean r2 = r2.A03
            if (r2 == 0) goto L_0x067a
            X.66l r3 = X.C967266l.Horizontal
        L_0x0199:
            java.lang.Object[] r7 = new java.lang.Object[]{r3}
            X.8cs r4 = X.AnonymousClass7EJ.A05
            boolean r2 = X.C147188nY.A0y(r0, r3)
            java.lang.Object r10 = r5.A13()
            if (r2 != 0) goto L_0x01ad
            r2 = r46
            if (r10 != r2) goto L_0x01b6
        L_0x01ad:
            r2 = 30
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r10 = X.C86154wM.A12(r3, r2)
            r5.A14(r10)
        L_0x01b6:
            X.0ZU r3 = X.AnonymousClass7W3.A09(r5, r10, r8)
            r45 = 4
            r2 = r45
            java.lang.Object r27 = X.AnonymousClass6EN.A00(r0, r4, r3, r7, r2)
            r2 = r27
            X.7EJ r2 = (X.AnonymousClass7EJ) r2
            r27 = r2
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2 = r68
            r4 = r18
            boolean r2 = X.C147188nY.A10(r0, r2, r4, r3)
            java.lang.Object r10 = r5.A13()
            if (r2 != 0) goto L_0x01dd
            r2 = r46
            if (r10 != r2) goto L_0x025e
        L_0x01dd:
            r2 = r68
            X.7yH r2 = r2.A01
            X.C04220Ms.A0B(r4, r8)
            r3 = r21
            X.C04220Ms.A0B(r2, r3)
            X.6tW r3 = r4.AMa(r2)
            X.7yH r11 = r3.A00
            X.8nB r7 = r3.A01
            int r4 = r2.length()
            int r3 = r11.length()
            X.7Z0 r2 = new X.7Z0
            r2.<init>(r7, r4, r3)
            X.6tW r10 = new X.6tW
            r10.<init>(r11, r2)
            r2 = r68
            X.7Ia r2 = r2.A02
            if (r2 == 0) goto L_0x025b
            long r11 = r2.A00
            X.7yH r7 = r10.A00
            r4 = 0
            X.7yF r3 = new X.7yF
            r2 = r21
            r3.<init>(r4, r8, r2)
            r3.A04(r7)
            X.79I r55 = X.AnonymousClass79I.A03
            r59 = 0
            r58 = 12287(0x2fff, float:1.7218E-41)
            X.7F0 r2 = new X.7F0
            r47 = r2
            r48 = r4
            r49 = r4
            r50 = r4
            r51 = r4
            r52 = r4
            r53 = r4
            r54 = r4
            r56 = r4
            r57 = r4
            r61 = r59
            r63 = r59
            r65 = r59
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r61, r63, r65)
            X.8nB r13 = r10.A01
            int r4 = X.C86104wH.A07(r11)
            int r7 = r13.CVm(r4)
            int r4 = X.C86104wH.A08(r11)
            int r4 = r13.CVm(r4)
            r3.A05(r2, r7, r4)
            X.7yH r2 = r3.A01()
            X.6tW r10 = new X.6tW
            r10.<init>(r2, r13)
        L_0x025b:
            r5.A14(r10)
        L_0x025e:
            X.AnonymousClass7W3.A0w(r5, r8)
            X.6tW r10 = (X.C114576tW) r10
            X.7yH r7 = r10.A00
            X.8nB r2 = r10.A01
            r58 = r2
            X.7WO r3 = r5.A12()
            if (r3 == 0) goto L_0x07c2
            int r2 = r3.A01
            r2 = r2 | 1
            r3.A01 = r2
            r44 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2 = r44
            java.lang.Object r4 = X.C147188nY.A0r(r0, r5, r2)
            r2 = r46
            if (r4 != r2) goto L_0x02a4
            r53 = 2147483647(0x7fffffff, float:NaN)
            X.0ZV r52 = X.AnonymousClass0ZV.A00
            X.6sY r2 = new X.6sY
            r47 = r2
            r48 = r7
            r49 = r29
            r50 = r6
            r51 = r22
            r54 = r21
            r55 = r21
            r56 = r17
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            X.6qu r4 = new X.6qu
            r4.<init>(r2, r3)
            r5.A14(r4)
        L_0x02a4:
            X.AnonymousClass7W3.A0w(r5, r8)
            X.6qu r4 = (X.C113196qu) r4
            r2 = r68
            X.7yH r11 = r2.A01
            r2 = r29
            X.AnonymousClass0wJ.A1M(r11, r8, r2)
            r3 = r22
            r2 = r45
            X.C18190wL.A1S(r3, r2, r6)
            r12 = 7
            r3 = r24
            r2 = r37
            X.C18210wN.A1M(r3, r12, r2)
            r2 = r67
            r4.A04 = r2
            X.8mB r12 = r4.A0G
            r2 = r35
            r12.CjA(r2)
            X.6iU r3 = r4.A07
            r2 = r24
            r3.A00 = r2
            r2 = r37
            r3.A01 = r2
            X.6ot r2 = r4.A03
            r3.A02 = r2
            r4.A02 = r11
            X.6sY r2 = r4.A00
            X.0ZV r52 = X.AnonymousClass0ZV.A00
            r54 = 2147483647(0x7fffffff, float:NaN)
            r47 = r2
            r48 = r7
            r49 = r29
            r50 = r6
            r51 = r22
            r53 = r21
            r55 = r21
            r56 = r17
            X.6sY r3 = X.AnonymousClass7C9.A00(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            X.6sY r2 = r4.A00
            if (r2 == r3) goto L_0x02ff
            r2 = r21
            r4.A05 = r2
        L_0x02ff:
            r4.A00 = r3
            X.6os r13 = r4.A0H
            X.6ot r2 = r4.A03
            r43 = r2
            r38 = r68
            r2 = r68
            X.7Ia r2 = r2.A02
            r42 = r2
            X.6vR r2 = r13.A00
            int r3 = r2.A01
            r12 = -1
            if (r3 == r12) goto L_0x0677
            int r2 = r2.A00
            long r2 = X.AnonymousClass6FM.A00(r3, r2)
            X.7Ia r6 = new X.7Ia
            r6.<init>(r2)
        L_0x0321:
            r2 = r42
            boolean r2 = X.C04220Ms.A0I(r2, r6)
            r35 = 1
            r40 = r2 ^ 1
            X.7HD r2 = r13.A01
            X.7yH r2 = r2.A01
            boolean r2 = X.C04220Ms.A0I(r2, r11)
            r39 = 0
            if (r2 != 0) goto L_0x0651
            r2 = r68
            long r2 = r2.A00
            X.6vR r6 = new X.6vR
            r6.<init>(r11, r2)
            r13.A00 = r6
        L_0x0342:
            if (r42 != 0) goto L_0x0635
            X.6vR r6 = r13.A00
            r6.A01 = r12
            r6.A00 = r12
        L_0x034a:
            if (r35 != 0) goto L_0x0350
            if (r39 != 0) goto L_0x0361
            if (r40 == 0) goto L_0x0361
        L_0x0350:
            X.6vR r6 = r13.A00
            r6.A01 = r12
            r6.A00 = r12
            r7 = 0
            X.C04220Ms.A0B(r11, r8)
            X.7HD r38 = new X.7HD
            r6 = r38
            r6.<init>((X.C134747yH) r11, (X.C121767Ia) r7, (long) r2)
        L_0x0361:
            X.7HD r6 = r13.A01
            r2 = r38
            r13.A01 = r2
            if (r43 == 0) goto L_0x036e
            r3 = r43
            r3.A00(r6, r2)
        L_0x036e:
            r2 = r44
            java.lang.Object r6 = X.C147188nY.A0r(r0, r5, r2)
            r2 = r46
            if (r6 != r2) goto L_0x0383
            r2 = 0
            X.788 r6 = new X.788
            r3 = r21
            r6.<init>(r2, r8, r3)
            r5.A14(r6)
        L_0x0383:
            X.AnonymousClass7W3.A0w(r5, r8)
            X.788 r6 = (X.AnonymousClass788) r6
            r42 = 0
            long r35 = java.lang.System.currentTimeMillis()
            boolean r2 = r6.A04
            if (r2 != 0) goto L_0x03a0
            java.lang.Long r2 = r6.A03
            long r11 = X.C86134wK.A0C(r2)
            r2 = 5000(0x1388, float:7.006E-42)
            long r2 = (long) r2
            long r11 = r11 + r2
            int r2 = (r35 > r11 ? 1 : (r35 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x03ab
        L_0x03a0:
            java.lang.Long r2 = java.lang.Long.valueOf(r35)
            r6.A03 = r2
            r2 = r68
            r6.A00(r2)
        L_0x03ab:
            r2 = r44
            java.lang.Object r3 = X.C147188nY.A0r(r0, r5, r2)
            r2 = r46
            if (r3 != r2) goto L_0x03bd
            X.7Ii r3 = new X.7Ii
            r3.<init>(r6)
            r5.A14(r3)
        L_0x03bd:
            X.AnonymousClass7W3.A0w(r5, r8)
            X.7Ii r3 = (X.C121827Ii) r3
            r2 = r58
            r3.A07 = r2
            r2 = r18
            X.C04220Ms.A0B(r2, r8)
            r3.A09 = r2
            X.0YY r2 = r4.A0J
            r57 = r2
            X.C04220Ms.A0B(r2, r8)
            r3.A0B = r2
            r3.A02 = r4
            X.8pE r7 = r3.A0H
            r2 = r68
            r7.CrC(r2)
            X.534 r2 = X.AnonymousClass7DE.A01
            java.lang.Object r2 = r0.AEA(r2)
            X.8g0 r2 = (X.C143038g0) r2
            r3.A05 = r2
            X.534 r2 = X.AnonymousClass7DE.A0A
            java.lang.Object r2 = r0.AEA(r2)
            X.8g1 r2 = (X.C143048g1) r2
            r3.A06 = r2
            X.534 r2 = X.AnonymousClass7DE.A05
            java.lang.Object r2 = r0.AEA(r2)
            X.8fq r2 = (X.C142938fq) r2
            r3.A04 = r2
            r2 = r41
            r3.A03 = r2
            r40 = r16 ^ 1
            X.8pE r7 = r3.A0G
            r2 = r40
            X.C147368pE.A04(r7, r2)
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r0.Cvb(r2)
            r2 = r44
            java.lang.Object r7 = X.C147188nY.A0r(r0, r5, r2)
            r2 = r46
            java.lang.Object r2 = X.C86104wH.A0b(r0, r5, r7, r2, r7)
            X.4qz r54 = X.AnonymousClass7WN.A01(r5, r2)
            r2 = r44
            java.lang.Object r7 = X.C147188nY.A0r(r0, r5, r2)
            r2 = r46
            if (r7 != r2) goto L_0x0432
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r7 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl
            r7.<init>()
            r5.A14(r7)
        L_0x0432:
            X.AnonymousClass7W3.A0w(r5, r8)
            androidx.compose.foundation.relocation.BringIntoViewRequester r7 = (androidx.compose.foundation.relocation.BringIntoViewRequester) r7
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            X.8Jg r12 = new X.8Jg
            r46 = r12
            r47 = r7
            r48 = r4
            r49 = r3
            r50 = r25
            r51 = r58
            r52 = r68
            r53 = r34
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54)
            r39 = 2
            r13 = r41
            r11 = r39
            X.C04220Ms.A0B(r13, r11)
            r11 = r13
            X.AnonymousClass0wJ.A1N(r2, r13)
            androidx.compose.ui.focus.FocusRequesterElement r13 = new androidx.compose.ui.focus.FocusRequesterElement
            r13.<init>(r11)
            androidx.compose.ui.Modifier r13 = r2.Cx6(r13)
            X.AnonymousClass0wJ.A1N(r13, r12)
            androidx.compose.ui.focus.FocusChangedElement r11 = new androidx.compose.ui.focus.FocusChangedElement
            r11.<init>(r12)
            androidx.compose.ui.Modifier r13 = r13.Cx6(r11)
            r12 = r23
            r11 = r20
            androidx.compose.ui.Modifier r38 = X.AnonymousClass72L.A00(r12, r13, r11)
            r11 = -55008430(0xfffffffffcb8a352, float:-7.669561E36)
            r0.Cvb(r11)
            if (r20 == 0) goto L_0x048b
            if (r16 != 0) goto L_0x048b
            r11 = 12
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r11 = X.C86154wM.A0z(r4, r11)
            X.AnonymousClass7K5.A04(r0, r4, r11)
        L_0x048b:
            X.AnonymousClass7W3.A0w(r5, r8)
            X.8mA r13 = r3.A0C
            r15 = r2
            r5 = r21
            X.C04220Ms.A0B(r13, r5)
            if (r20 == 0) goto L_0x04a7
            r5 = 19
            r15 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r12 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r11 = r42
            r12.<init>((java.lang.Object) r13, (X.C146958n9) r11, (int) r5, (int) r15)
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7CA.A01(r2, r13, r12)
        L_0x04a7:
            kotlin.jvm.internal.KtLambdaShape4S0410000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape4S0410000_I2
            r46 = r13
            r47 = r21
            r49 = r41
            r50 = r3
            r52 = r16
            r46.<init>(r47, r48, r49, r50, r51, r52)
            r11 = r2
            if (r20 == 0) goto L_0x04c8
            kotlin.jvm.internal.KtLambdaShape50S0200000_I2 r12 = new kotlin.jvm.internal.KtLambdaShape50S0200000_I2
            r11 = r45
            r5 = r23
            r12.<init>(r11, r13, r5)
            X.0YY r5 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r11 = X.C120417Am.A02(r2, r5, r12)
        L_0x04c8:
            androidx.compose.ui.Modifier r36 = r11.Cx6(r15)
            r12 = 15
            r11 = r58
            r5 = r68
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r5 = X.C86154wM.A0y(r11, r5, r4, r12)
            androidx.compose.ui.Modifier r42 = X.C115836vz.A00(r2, r5)
            kotlin.jvm.internal.KtLambdaShape4S0410000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape4S0410000_I2
            r46 = r5
            r47 = r8
            r48 = r68
            r49 = r3
            r50 = r11
            r51 = r4
            r52 = r20
            r46.<init>(r47, r48, r49, r50, r51, r52)
            androidx.compose.ui.Modifier r43 = X.C98246Et.A00(r2, r5)
            r5 = r18
            boolean r5 = r5 instanceof X.AnonymousClass7Z8
            X.8Js r11 = new X.8Js
            r46 = r11
            r47 = r4
            r48 = r3
            r49 = r41
            r50 = r25
            r51 = r58
            r52 = r68
            r53 = r10
            r54 = r20
            r55 = r5
            r56 = r16
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r5 = r21
            androidx.compose.ui.Modifier r35 = X.AnonymousClass6FI.A00(r2, r11, r5)
            if (r20 == 0) goto L_0x051b
            r11 = 1
            if (r16 == 0) goto L_0x051c
        L_0x051b:
            r11 = 0
        L_0x051c:
            r41 = r2
            r10 = r28
            r5 = r45
            X.C04220Ms.A0B(r10, r5)
            if (r11 == 0) goto L_0x053e
            kotlin.jvm.internal.KtLambdaShape9S0400000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape9S0400000_I2
            r44 = r10
            r45 = r8
            r46 = r58
            r47 = r28
            r48 = r4
            r49 = r68
            r44.<init>(r45, r46, r47, r48, r49)
            X.0YY r5 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r41 = X.C120417Am.A02(r2, r5, r10)
        L_0x053e:
            r5 = 13
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r5 = X.C86154wM.A0z(r3, r5)
            X.AnonymousClass7K5.A04(r0, r3, r5)
            r45 = 3
            kotlin.jvm.internal.KtLambdaShape6S0400000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape6S0400000_I2
            r44 = r10
            r46 = r25
            r47 = r68
            r48 = r34
            r49 = r4
            r44.<init>(r45, r46, r47, r48, r49)
            r5 = r25
            X.AnonymousClass7K5.A04(r0, r5, r10)
            r10 = r26
            r5 = r21
            boolean r52 = X.AnonymousClass0wJ.A1T(r10, r5)
            X.8Z2 r5 = new X.8Z2
            r44 = r5
            r45 = r4
            r46 = r6
            r47 = r3
            r48 = r58
            r49 = r68
            r50 = r57
            r51 = r40
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52)
            X.0YY r15 = androidx.compose.ui.platform.InspectableValueKt.A00
            androidx.compose.ui.Modifier r10 = X.C120417Am.A02(r2, r15, r5)
            r6 = r30
            r5 = r38
            androidx.compose.ui.Modifier r6 = r6.Cx6(r5)
            X.C04220Ms.A0B(r6, r8)
            r11 = 40
            r5 = r37
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r11 = X.C86164wN.A10(r5, r4, r11)
            androidx.compose.ui.input.key.OnPreviewKeyEvent r5 = new androidx.compose.ui.input.key.OnPreviewKeyEvent
            r5.<init>(r11)
            androidx.compose.ui.Modifier r11 = r6.Cx6(r5)
            r5 = 38
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r6 = X.C86164wN.A10(r3, r4, r5)
            X.C04220Ms.A0B(r11, r8)
            androidx.compose.ui.input.key.OnPreviewKeyEvent r5 = new androidx.compose.ui.input.key.OnPreviewKeyEvent
            r5.<init>(r6)
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.Modifier.A07(r11, r5, r10)
            X.C04220Ms.A0B(r13, r8)
            r6 = r21
            r5 = r27
            boolean r5 = X.C86164wN.A1Q(r6, r5)
            if (r5 == 0) goto L_0x0633
            kotlin.jvm.internal.KtLambdaShape5S0210000_I2 r12 = new kotlin.jvm.internal.KtLambdaShape5S0210000_I2
            r10 = r39
            r8 = r27
            r6 = r23
            r5 = r20
            r12.<init>(r10, r8, r6, r5)
        L_0x05c8:
            kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2 r11 = new kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2
            r10 = r21
            r8 = r23
            r6 = r27
            r5 = r20
            r11.<init>(r10, r8, r6, r5)
            androidx.compose.ui.Modifier r8 = X.C120417Am.A02(r13, r12, r11)
            r6 = r36
            r5 = r35
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.Modifier.A07(r8, r6, r5)
            r5 = 14
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r5 = X.C86154wM.A0z(r4, r5)
            androidx.compose.ui.Modifier r6 = X.C98246Et.A00(r6, r5)
            if (r20 == 0) goto L_0x0630
            X.8pE r5 = r4.A09
            boolean r5 = X.C86104wH.A1X(r5)
            if (r5 == 0) goto L_0x0630
            r55 = 1
            r5 = 10
            androidx.compose.ui.Modifier r2 = X.C120417Am.A01(r2, r3, r15, r5)
        L_0x05fd:
            X.8UM r5 = new X.8UM
            r36 = r5
            r37 = r7
            r38 = r27
            r39 = r4
            r40 = r3
            r44 = r2
            r45 = r29
            r46 = r58
            r47 = r68
            r48 = r18
            r49 = r22
            r50 = r32
            r51 = r31
            r52 = r1
            r53 = r33
            r54 = r26
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r1 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            X.8sI r2 = X.AnonymousClass7JR.A00(r0, r5, r1)
            r1 = 448(0x1c0, float:6.28E-43)
            A06(r3, r0, r6, r2, r1)
            goto L_0x00ce
        L_0x0630:
            r55 = 0
            goto L_0x05fd
        L_0x0633:
            r12 = r15
            goto L_0x05c8
        L_0x0635:
            r6 = r42
            long r6 = r6.A00
            r47 = r6
            boolean r6 = X.C121767Ia.A02(r47)
            if (r6 != 0) goto L_0x034a
            X.6vR r6 = r13.A00
            r7 = r6
            int r6 = X.C121767Ia.A01(r47)
            int r15 = X.C121767Ia.A00(r47)
            r7.A02(r6, r15)
            goto L_0x034a
        L_0x0651:
            X.7HD r2 = r13.A01
            long r2 = r2.A00
            r35 = r2
            r2 = r68
            long r2 = r2.A00
            int r6 = (r35 > r2 ? 1 : (r35 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0663
            r35 = 0
            goto L_0x0342
        L_0x0663:
            X.6vR r6 = r13.A00
            r15 = r6
            int r7 = X.C121767Ia.A01(r2)
            int r6 = X.C121767Ia.A00(r2)
            r15.A03(r7, r6)
            r35 = 0
            r39 = 1
            goto L_0x0342
        L_0x0677:
            r6 = 0
            goto L_0x0321
        L_0x067a:
            X.66l r3 = X.C967266l.Vertical
            goto L_0x0199
        L_0x067e:
            r34 = 0
            goto L_0x015a
        L_0x0682:
            if (r35 == 0) goto L_0x0686
            X.7Wm r30 = androidx.compose.ui.Modifier.A00
        L_0x0686:
            if (r34 == 0) goto L_0x068a
            X.7If r29 = X.C121807If.A03
        L_0x068a:
            if (r27 == 0) goto L_0x068e
            X.8n3 r18 = X.C1191673u.A00
        L_0x068e:
            if (r22 == 0) goto L_0x0692
            X.4hQ r32 = X.C77814hQ.A00
        L_0x0692:
            if (r15 == 0) goto L_0x0696
            r23 = 0
        L_0x0696:
            if (r3 == 0) goto L_0x06a1
            long r2 = X.AnonymousClass7KE.A06
            X.53m r28 = new X.53m
            r10 = r28
            r10.<init>(r2)
        L_0x06a1:
            r2 = r17
            boolean r17 = X.C86154wM.A1Z(r7, r2)
            if (r6 == 0) goto L_0x06ac
            r26 = 2147483647(0x7fffffff, float:NaN)
        L_0x06ac:
            if (r5 == 0) goto L_0x06b0
            r33 = 1
        L_0x06b0:
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x06b8
            X.79l r25 = X.C1202679l.A04
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x06b8:
            if (r4 == 0) goto L_0x06bc
            X.7ER r24 = X.AnonymousClass7ER.A00
        L_0x06bc:
            r2 = r20
            boolean r20 = X.C86154wM.A1Z(r11, r2)
            r2 = r16
            boolean r16 = X.C18240wQ.A1R(r12, r2)
            if (r13 == 0) goto L_0x011e
            X.0YM r31 = X.AnonymousClass6WU.A00
            goto L_0x011e
        L_0x06ce:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r64 & r2
            if (r2 != 0) goto L_0x00b3
            r2 = r31
            int r2 = X.C147188nY.A0E(r0, r2)
            goto L_0x00b2
        L_0x06dc:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r64 & r2
            if (r2 != 0) goto L_0x00a9
            r2 = r16
            boolean r2 = r0.ACZ(r2)
            if (r2 != 0) goto L_0x06ed
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x06ed:
            r1 = r1 | r13
            goto L_0x00a9
        L_0x06f0:
            r2 = r19
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00a3
            r2 = r20
            boolean r2 = r0.ACZ(r2)
            if (r2 == 0) goto L_0x0700
            r12 = 2048(0x800, float:2.87E-42)
        L_0x0700:
            r1 = r1 | r12
            goto L_0x00a3
        L_0x0703:
            r2 = r19
            r2 = r2 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x009d
            r2 = r24
            int r2 = X.C147188nY.A0H(r0, r2)
            r1 = r1 | r2
            goto L_0x009d
        L_0x0712:
            r1 = r64 & 14
            if (r1 != 0) goto L_0x0720
            r1 = r33
            int r1 = X.C147188nY.A03(r0, r1)
            r1 = r64 | r1
            goto L_0x0082
        L_0x0720:
            r1 = r19
            goto L_0x0082
        L_0x0724:
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r63 & r1
            if (r1 != 0) goto L_0x007a
            r1 = r26
            boolean r1 = r0.ACW(r1)
            int r1 = X.C86104wH.A02(r1)
            goto L_0x0079
        L_0x0736:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r63 & r1
            if (r1 != 0) goto L_0x0073
            r1 = r17
            boolean r1 = r0.ACZ(r1)
            int r1 = X.C86104wH.A03(r1)
            goto L_0x0072
        L_0x0748:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r63 & r1
            if (r1 != 0) goto L_0x006c
            r1 = r28
            boolean r1 = r0.ACY(r1)
            int r1 = X.C86104wH.A04(r1)
            goto L_0x006b
        L_0x075a:
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r63 & r1
            if (r1 != 0) goto L_0x0065
            r1 = r23
            boolean r1 = r0.ACY(r1)
            int r1 = X.C86104wH.A01(r1)
            goto L_0x0064
        L_0x076c:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r63 & r1
            if (r1 != 0) goto L_0x005e
            r1 = r32
            int r1 = X.C147188nY.A0E(r0, r1)
            goto L_0x005d
        L_0x077a:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r63 & r1
            if (r1 != 0) goto L_0x0057
            r1 = r18
            int r1 = X.C147188nY.A0J(r0, r1)
            r10 = r10 | r1
            goto L_0x0057
        L_0x078a:
            r1 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x004f
            r1 = r29
            int r1 = X.C147188nY.A0I(r0, r1)
            r10 = r10 | r1
            goto L_0x004f
        L_0x0797:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0047
            r1 = r30
            int r1 = X.C147188nY.A0H(r0, r1)
            r10 = r10 | r1
            goto L_0x0047
        L_0x07a4:
            r1 = r63 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0041
            r1 = r67
            int r1 = X.C147188nY.A0A(r0, r1)
            r10 = r10 | r1
            goto L_0x0041
        L_0x07b1:
            r1 = r63 & 14
            if (r1 != 0) goto L_0x07bf
            r1 = r68
            int r10 = X.C147188nY.A0F(r0, r1)
            r10 = r10 | r63
            goto L_0x003b
        L_0x07bf:
            r10 = r14
            goto L_0x003b
        L_0x07c2:
            java.lang.String r0 = "no recompose scope found"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JQ.A00(X.8p3, X.7ER, X.8nY, androidx.compose.ui.Modifier, X.6nD, X.7If, X.79l, X.7HD, X.8n3, X.0YY, X.0YY, X.0YM, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
