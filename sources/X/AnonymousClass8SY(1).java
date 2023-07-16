package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.8SY  reason: invalid class name */
public final class AnonymousClass8SY extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ C145048jk A00;
    public final /* synthetic */ C145058jl A01;
    public final /* synthetic */ C145068jm A02;
    public final /* synthetic */ C120997Do A03;
    public final /* synthetic */ C147288p6 A04;
    public final /* synthetic */ LazyGridState A05;
    public final /* synthetic */ AnonymousClass0YP A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SY(C145048jk r2, C145058jl r3, C145068jm r4, C120997Do r5, C147288p6 r6, LazyGridState lazyGridState, AnonymousClass0YP r8, boolean z, boolean z2) {
        super(2);
        this.A07 = z;
        this.A02 = r4;
        this.A08 = z2;
        this.A05 = lazyGridState;
        this.A04 = r6;
        this.A06 = r8;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v174, resolved type: X.6qh} */
    /* JADX WARNING: type inference failed for: r1v188, types: [java.util.AbstractCollection] */
    /* JADX WARNING: type inference failed for: r1v200, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0304, code lost:
        if (java.lang.Math.abs(X.AnonymousClass8bA.A02(r22)) < java.lang.Math.abs(r13)) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a9, code lost:
        if (r20 > r6) goto L_0x05ab;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0942  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r52, java.lang.Object r53) {
        /*
            r51 = this;
            r0 = r53
            r4 = r52
            X.8pb r4 = (X.C147598pb) r4
            androidx.compose.ui.unit.Constraints r0 = (androidx.compose.ui.unit.Constraints) r0
            long r1 = r0.A00
            r17 = 0
            r0 = r17
            X.C04220Ms.A0B(r4, r0)
            r11 = r51
            boolean r0 = r11.A07
            r18 = r0
            if (r0 == 0) goto L_0x0155
            X.66l r0 = X.C967266l.Vertical
        L_0x001b:
            X.C97826Da.A00(r0, r1)
            X.8jm r3 = r11.A02
            X.69J r0 = r4.getLayoutDirection()
            if (r18 == 0) goto L_0x014f
            float r0 = r3.ABa(r0)
        L_0x002a:
            int r7 = r4.CfL(r0)
            X.69J r0 = r4.getLayoutDirection()
            if (r18 == 0) goto L_0x0149
            float r0 = r3.ABe(r0)
        L_0x0038:
            int r6 = r4.CfL(r0)
            X.7V9 r3 = (X.AnonymousClass7V9) r3
            float r0 = r3.A03
            int r5 = r4.CfL(r0)
            float r0 = r3.A00
            int r35 = r4.CfL(r0)
            int r9 = r5 + r35
            int r8 = r7 + r6
            if (r18 == 0) goto L_0x013d
            r45 = r9
            boolean r3 = r11.A08
            if (r3 != 0) goto L_0x0058
            r35 = r5
        L_0x0058:
            int r45 = r45 - r35
            int r6 = -r8
            int r0 = -r9
            long r26 = X.AnonymousClass7JT.A03(r1, r6, r0)
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = r11.A05
            X.8p6 r6 = r11.A04
            r50 = r6
            r0.A02(r6)
            X.6sJ r33 = r50.BD4()
            X.0YP r10 = r11.A06
            androidx.compose.ui.unit.Constraints r6 = new androidx.compose.ui.unit.Constraints
            r6.<init>(r1)
            java.lang.Object r12 = r10.invoke(r4, r6)
            java.util.List r12 = (java.util.List) r12
            int r10 = r12.size()
            r6 = r33
            int r6 = r6.A00
            if (r10 == r6) goto L_0x009c
            r6 = r33
            r6.A00 = r10
            java.util.ArrayList r10 = r6.A03
            r10.clear()
            X.6Dq r6 = new X.6Dq
            r6.<init>()
            r10.add(r6)
            r6 = r33
            java.util.List r6 = r6.A04
            r6.clear()
        L_0x009c:
            X.8pE r6 = r0.A0C
            r6.CrC(r4)
            int r10 = r12.size()
            X.8pE r6 = r0.A0I
            X.C147368pE.A03(r6, r10)
            if (r18 == 0) goto L_0x0135
            X.8jl r6 = r11.A01
            float r6 = r6.BD3()
        L_0x00b2:
            int r32 = r4.CfL(r6)
            if (r18 == 0) goto L_0x012e
            X.8jk r6 = r11.A00
            float r6 = r6.BD3()
        L_0x00be:
            int r15 = r4.CfL(r6)
            int r19 = r50.getItemCount()
            if (r18 == 0) goto L_0x0128
            int r6 = androidx.compose.ui.unit.Constraints.A01(r1)
            int r6 = r6 - r9
        L_0x00cd:
            if (r3 == 0) goto L_0x00d4
            if (r6 > 0) goto L_0x00d4
            if (r18 == 0) goto L_0x0126
            int r5 = r5 + r6
        L_0x00d4:
            long r46 = X.AnonymousClass7Hh.A00(r7, r5)
            X.7Do r7 = r11.A03
            X.7VS r10 = new X.7VS
            r41 = r10
            r42 = r7
            r43 = r4
            r44 = r35
            r48 = r18
            r49 = r3
            r41.<init>(r42, r43, r44, r45, r46, r48, r49)
            X.6ps r29 = new X.6ps
            r14 = r29
            r13 = r50
            r5 = r32
            r14.<init>(r13, r10, r4, r5)
            X.7VT r13 = new X.7VT
            r5 = r18
            r13.<init>(r4, r12, r15, r5)
            X.6sQ r10 = new X.6sQ
            r36 = r10
            r37 = r33
            r38 = r14
            r39 = r13
            r40 = r12
            r41 = r15
            r42 = r19
            r43 = r32
            r44 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44)
            r12 = 31
            r5 = r33
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r12 = X.C86164wN.A10(r10, r5, r12)
            X.8pE r5 = r0.A0G
            r5.CrC(r12)
            androidx.compose.runtime.snapshots.Snapshot r15 = X.C121637Hc.A02()
            goto L_0x0159
        L_0x0126:
            int r7 = r7 + r6
            goto L_0x00d4
        L_0x0128:
            int r6 = androidx.compose.ui.unit.Constraints.A02(r1)
            int r6 = r6 - r8
            goto L_0x00cd
        L_0x012e:
            X.8jl r6 = r11.A01
            float r6 = r6.BD3()
            goto L_0x00be
        L_0x0135:
            X.8jk r6 = r11.A00
            float r6 = r6.BD3()
            goto L_0x00b2
        L_0x013d:
            r45 = r8
            boolean r3 = r11.A08
            r35 = r6
            if (r3 != 0) goto L_0x0058
            r35 = r7
            goto L_0x0058
        L_0x0149:
            float r0 = X.AnonymousClass7K4.A00(r3, r0)
            goto L_0x0038
        L_0x014f:
            float r0 = X.AnonymousClass7K4.A01(r3, r0)
            goto L_0x002a
        L_0x0155:
            X.66l r0 = X.C967266l.Horizontal
            goto L_0x001b
        L_0x0159:
            androidx.compose.runtime.snapshots.Snapshot r13 = r15.A05()     // Catch:{ all -> 0x09f3 }
            int r12 = r0.A00()     // Catch:{ all -> 0x09ee }
            r5 = r19
            if (r12 < r5) goto L_0x0171
            if (r19 <= 0) goto L_0x0171
            int r12 = r19 + -1
            r5 = r33
            int r12 = r5.A00(r12)     // Catch:{ all -> 0x09ee }
            r5 = 0
            goto L_0x0187
        L_0x0171:
            int r12 = r0.A00()     // Catch:{ all -> 0x09ee }
            r5 = r33
            int r12 = r5.A00(r12)     // Catch:{ all -> 0x09ee }
            X.7DW r5 = r0.A07     // Catch:{ all -> 0x09ee }
            X.8pE r5 = r5.A03     // Catch:{ all -> 0x09ee }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x09ee }
            int r5 = X.AnonymousClass0wJ.A04(r5)     // Catch:{ all -> 0x09ee }
        L_0x0187:
            X.Lsi r31 = X.C122127Kl.A02     // Catch:{ all -> 0x09f3 }
            r14 = r31
            r14.A01(r13)     // Catch:{ all -> 0x09f3 }
            r15.A0A()
            float r13 = r0.A00
            r22 = r13
            X.8jl r13 = r11.A01
            r44 = r13
            X.8jk r11 = r11.A00
            r43 = r11
            X.84E r11 = r0.A08
            r42 = r11
            r25 = 1
            kotlin.jvm.internal.KtLambdaShape0S0102100_I2 r30 = new kotlin.jvm.internal.KtLambdaShape0S0102100_I2
            r36 = r30
            r37 = r4
            r38 = r8
            r39 = r9
            r40 = r1
            r36.<init>(r37, r38, r39, r40)
            r1 = 17
            X.C04220Ms.A0B(r7, r1)
            r2 = 19
            X.C04220Ms.A0B(r11, r2)
            boolean r1 = X.C86114wI.A1S(r35)
            java.lang.String r34 = "Failed requirement."
            if (r1 == 0) goto L_0x09e9
            if (r45 < 0) goto L_0x09e4
            if (r19 > 0) goto L_0x0226
            r11 = 0
            int r1 = androidx.compose.ui.unit.Constraints.A04(r26)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = androidx.compose.ui.unit.Constraints.A03(r26)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.4hH r2 = X.C77724hH.A00
            r1 = r30
            java.lang.Object r12 = r1.invoke(r4, r3, r2)
            X.8ld r12 = (X.C146098ld) r12
            X.0ZV r13 = X.AnonymousClass0ZV.A00
            if (r18 == 0) goto L_0x0223
            X.66l r10 = X.C967266l.Vertical
        L_0x01e9:
            r14 = 0
            X.7Xw r9 = new X.7Xw
            r15 = r17
            r16 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x01f3:
            X.7DW r7 = r0.A07
            X.6qh r3 = r9.A03
            if (r3 == 0) goto L_0x0221
            X.6qq[] r2 = r3.A03
            int r1 = r2.length
            if (r1 == 0) goto L_0x0221
            r1 = r2[r17]
            if (r1 == 0) goto L_0x0221
            java.lang.Object r1 = r1.A04
        L_0x0204:
            r7.A00 = r1
            boolean r1 = r7.A01
            if (r1 != 0) goto L_0x020e
            int r1 = r9.A02
            if (r1 <= 0) goto L_0x0950
        L_0x020e:
            r1 = r25
            r7.A01 = r1
            int r8 = r9.A01
            float r4 = (float) r8
            r2 = 0
            r1 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0942
            androidx.compose.runtime.snapshots.Snapshot r6 = X.C121637Hc.A02()
            goto L_0x091c
        L_0x0221:
            r1 = 0
            goto L_0x0204
        L_0x0223:
            X.66l r10 = X.C967266l.Horizontal
            goto L_0x01e9
        L_0x0226:
            int r13 = X.AnonymousClass8bA.A02(r22)
            int r5 = r5 - r13
            r21 = 0
            r1 = r17
            if (r12 != r1) goto L_0x0235
            if (r5 >= 0) goto L_0x0235
            int r13 = r13 + r5
            r5 = 0
        L_0x0235:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            r1 = r35
            int r11 = -r1
            r1 = 0
            if (r32 >= 0) goto L_0x0241
            r1 = r32
        L_0x0241:
            int r11 = r11 + r1
            int r5 = r5 + r11
        L_0x0243:
            if (r5 >= 0) goto L_0x0256
            if (r12 <= 0) goto L_0x0256
            int r12 = r12 + -1
            X.6qh r1 = r10.A01(r12)
            r2 = r17
            r8.add(r2, r1)
            int r1 = r1.A02
            int r5 = r5 + r1
            goto L_0x0243
        L_0x0256:
            if (r5 >= r11) goto L_0x025a
            int r13 = r13 + r5
            r5 = r11
        L_0x025a:
            int r5 = r5 - r11
            int r16 = r6 + r45
            r1 = r16
            r2 = r17
            if (r1 >= r2) goto L_0x0265
            r16 = 0
        L_0x0265:
            int r14 = -r5
            int r15 = r8.size()
            r9 = r12
        L_0x026b:
            if (r2 >= r15) goto L_0x0280
            java.lang.Object r1 = r8.get(r2)
            X.6qh r1 = (X.C113086qh) r1
            int r9 = r9 + 1
            int r1 = r1.A02
            int r14 = r14 + r1
            int r2 = r2 + 1
            goto L_0x026b
        L_0x027b:
            r8.add(r2)
        L_0x027e:
            int r9 = r9 + 1
        L_0x0280:
            r20 = r14
            r1 = r19
            if (r9 >= r1) goto L_0x02c3
            r1 = r16
            if (r14 < r1) goto L_0x0292
            if (r14 <= 0) goto L_0x0292
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x02c3
        L_0x0292:
            X.6qh r2 = r10.A01(r9)
            X.6qq[] r1 = r2.A03
            int r1 = r1.length
            if (r1 == 0) goto L_0x02c3
            int r1 = r2.A02
            int r14 = r14 + r1
            if (r14 > r11) goto L_0x027b
            X.6qq[] r1 = r2.A03
            r15 = r1
            int r1 = r1.length
            if (r1 != 0) goto L_0x02b2
            r0 = 50
            java.lang.String r1 = X.C28174Ezk.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x02b2:
            int r1 = r1 + -1
            r1 = r15[r1]
            int r1 = r1.A01
            r15 = r1
            int r1 = r19 + -1
            if (r15 == r1) goto L_0x027b
            int r12 = r9 + 1
            int r1 = r2.A02
            int r5 = r5 - r1
            goto L_0x027e
        L_0x02c3:
            if (r14 >= r6) goto L_0x02e6
            int r9 = r6 - r14
            int r5 = r5 - r9
            int r20 = r14 + r9
        L_0x02ca:
            r1 = r35
            if (r5 >= r1) goto L_0x02df
            if (r12 <= 0) goto L_0x02df
            int r12 = r12 + -1
            X.6qh r1 = r10.A01(r12)
            r2 = r17
            r8.add(r2, r1)
            int r1 = r1.A02
            int r5 = r5 + r1
            goto L_0x02ca
        L_0x02df:
            int r13 = r13 + r9
            if (r5 >= 0) goto L_0x02e6
            int r13 = r13 + r5
            int r20 = r20 + r5
            r5 = 0
        L_0x02e6:
            int r1 = X.AnonymousClass8bA.A02(r22)
            if (r1 >= 0) goto L_0x0394
            r2 = -1
        L_0x02ed:
            if (r13 >= 0) goto L_0x038e
            r21 = -1
        L_0x02f1:
            r1 = r21
            if (r2 != r1) goto L_0x0306
            int r1 = X.AnonymousClass8bA.A02(r22)
            int r2 = java.lang.Math.abs(r1)
            int r1 = java.lang.Math.abs(r13)
            float r9 = (float) r13
            r48 = r9
            if (r2 >= r1) goto L_0x0308
        L_0x0306:
            r48 = r22
        L_0x0308:
            if (r5 < 0) goto L_0x09df
            int r9 = -r5
            java.lang.Object r21 = X.AnonymousClass00J.A0C(r8)
            r1 = r21
            X.6qh r1 = (X.C113086qh) r1
            r21 = r1
            X.6qq[] r2 = r1.A03
            int r1 = r2.length
            if (r1 == 0) goto L_0x038b
            r1 = r2[r17]
            if (r1 == 0) goto L_0x038b
            int r1 = r1.A01
            r28 = r1
        L_0x0322:
            java.lang.Object r1 = X.AnonymousClass00J.A0F(r8)
            X.6qh r1 = (X.C113086qh) r1
            if (r1 == 0) goto L_0x0388
            X.6qq[] r2 = r1.A03
            int r1 = r2.length
            if (r1 == 0) goto L_0x0388
            int r1 = r1 - r25
            r1 = r2[r1]
            if (r1 == 0) goto L_0x0388
            int r1 = r1.A01
            r24 = r1
        L_0x0339:
            int r15 = r42.size()
            r22 = 0
            r23 = r22
            r12 = 0
        L_0x0342:
            if (r12 >= r15) goto L_0x039a
            r1 = r42
            java.lang.Object r1 = r1.get(r12)
            X.8ck r1 = (X.AnonymousClass8ck) r1
            X.7Y2 r1 = (X.AnonymousClass7Y2) r1
            java.lang.Object r11 = r1.A04
            X.8pE r1 = r1.A01
            java.lang.Object r1 = r1.getValue()
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = r50
            int r13 = X.C97986Ds.A00(r1, r11, r2)
            if (r13 < 0) goto L_0x0385
            r1 = r28
            if (r13 >= r1) goto L_0x0385
            X.6sJ r1 = r10.A00
            int r2 = r1.A01(r13)
            r1 = r17
            long r1 = r10.A00(r1, r2)
            r11 = r29
            int r14 = r11.A00
            X.6qq r2 = r11.A00(r13, r14, r1)
            if (r23 != 0) goto L_0x0380
            java.util.ArrayList r23 = X.AnonymousClass0wJ.A0v()
        L_0x0380:
            r1 = r23
            r1.add(r2)
        L_0x0385:
            int r12 = r12 + 1
            goto L_0x0342
        L_0x0388:
            r24 = 0
            goto L_0x0339
        L_0x038b:
            r28 = 0
            goto L_0x0322
        L_0x038e:
            if (r13 <= 0) goto L_0x02f1
            r21 = 1
            goto L_0x02f1
        L_0x0394:
            boolean r2 = X.C18180wK.A1X(r1)
            goto L_0x02ed
        L_0x039a:
            if (r23 != 0) goto L_0x039e
            X.0ZV r23 = X.AnonymousClass0ZV.A00
        L_0x039e:
            int r15 = r42.size()
            r12 = 0
        L_0x03a3:
            if (r12 >= r15) goto L_0x03eb
            r1 = r42
            java.lang.Object r1 = r1.get(r12)
            X.8ck r1 = (X.AnonymousClass8ck) r1
            X.7Y2 r1 = (X.AnonymousClass7Y2) r1
            java.lang.Object r11 = r1.A04
            X.8pE r1 = r1.A01
            java.lang.Object r1 = r1.getValue()
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = r50
            int r13 = X.C97986Ds.A00(r1, r11, r2)
            int r1 = r24 + 1
            if (r1 > r13) goto L_0x03e8
            r1 = r19
            if (r13 >= r1) goto L_0x03e8
            X.6sJ r1 = r10.A00
            int r2 = r1.A01(r13)
            r1 = r17
            long r1 = r10.A00(r1, r2)
            r11 = r29
            int r14 = r11.A00
            X.6qq r2 = r11.A00(r13, r14, r1)
            if (r22 != 0) goto L_0x03e3
            java.util.ArrayList r22 = X.AnonymousClass0wJ.A0v()
        L_0x03e3:
            r1 = r22
            r1.add(r2)
        L_0x03e8:
            int r12 = r12 + 1
            goto L_0x03a3
        L_0x03eb:
            if (r22 != 0) goto L_0x03ef
            X.0ZV r22 = X.AnonymousClass0ZV.A00
        L_0x03ef:
            if (r35 > 0) goto L_0x03f3
            if (r32 >= 0) goto L_0x041a
        L_0x03f3:
            int r11 = r8.size()
            r10 = 0
        L_0x03f8:
            if (r10 >= r11) goto L_0x041a
            java.lang.Object r1 = r8.get(r10)
            X.6qh r1 = (X.C113086qh) r1
            int r2 = r1.A02
            if (r5 == 0) goto L_0x041a
            if (r2 > r5) goto L_0x041a
            int r1 = X.C86104wH.A0B(r8)
            if (r10 == r1) goto L_0x041a
            int r5 = r5 - r2
            int r10 = r10 + 1
            java.lang.Object r21 = r8.get(r10)
            r1 = r21
            X.6qh r1 = (X.C113086qh) r1
            r21 = r1
            goto L_0x03f8
        L_0x041a:
            if (r18 == 0) goto L_0x0440
            int r32 = androidx.compose.ui.unit.Constraints.A02(r26)
            r41 = r32
            r1 = r26
            r10 = r20
            int r10 = X.AnonymousClass8bI.A03(r1, r10)
            r27 = r10
        L_0x042c:
            int r2 = java.lang.Math.min(r10, r6)
            r11 = 0
            r14 = 0
            r1 = r20
            if (r1 >= r2) goto L_0x0451
            r14 = 1
            if (r9 == 0) goto L_0x0451
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0440:
            r1 = r26
            r10 = r20
            int r10 = X.AnonymousClass8bI.A04(r1, r10)
            r32 = r10
            r41 = r10
            int r27 = androidx.compose.ui.unit.Constraints.A01(r26)
            goto L_0x042c
        L_0x0451:
            int r12 = r8.size()
            r2 = 0
            r13 = 0
        L_0x0457:
            if (r2 >= r12) goto L_0x0466
            java.lang.Object r1 = r8.get(r2)
            X.6qh r1 = (X.C113086qh) r1
            X.6qq[] r1 = r1.A03
            int r1 = r1.length
            int r13 = r13 + r1
            int r2 = r2 + 1
            goto L_0x0457
        L_0x0466:
            java.util.ArrayList r26 = X.C18240wQ.A0k(r13)
            if (r14 == 0) goto L_0x04a0
            boolean r1 = r23.isEmpty()
            if (r1 == 0) goto L_0x09da
            boolean r1 = r22.isEmpty()
            if (r1 == 0) goto L_0x09da
            int r9 = r8.size()
            int[] r11 = new int[r9]
            r2 = 0
        L_0x047f:
            if (r2 >= r9) goto L_0x0495
            r1 = r2
            if (r3 == 0) goto L_0x0488
            int r1 = r9 - r2
            int r1 = r1 + -1
        L_0x0488:
            java.lang.Object r1 = r8.get(r1)
            X.6qh r1 = (X.C113086qh) r1
            int r1 = r1.A01
            r11[r2] = r1
            int r2 = r2 + 1
            goto L_0x047f
        L_0x0495:
            int[] r1 = new int[r9]
            r15 = r1
            r1 = 0
        L_0x0499:
            if (r1 >= r9) goto L_0x0518
            r15[r1] = r17
            int r1 = r1 + 1
            goto L_0x0499
        L_0x04a0:
            int r4 = r23.size()
            r35 = r9
            r3 = 0
        L_0x04a7:
            if (r3 >= r4) goto L_0x04cd
            r1 = r23
            java.lang.Object r2 = r1.get(r3)
            X.6qq r2 = (X.C113156qq) r2
            int r1 = r2.A03
            int r35 = r35 - r1
            r34 = r2
            r36 = r11
            r37 = r32
            r38 = r27
            r39 = r11
            r40 = r11
            X.7VN r2 = r34.A00(r35, r36, r37, r38, r39, r40)
            r1 = r26
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x04a7
        L_0x04cd:
            int r4 = r8.size()
            r3 = 0
        L_0x04d2:
            if (r3 >= r4) goto L_0x04ed
            java.lang.Object r10 = r8.get(r3)
            X.6qh r10 = (X.C113086qh) r10
            r2 = r32
            r1 = r27
            java.util.List r2 = r10.A00(r9, r2, r1)
            r1 = r26
            r1.addAll(r2)
            int r1 = r10.A02
            int r9 = r9 + r1
            int r3 = r3 + 1
            goto L_0x04d2
        L_0x04ed:
            int r4 = r22.size()
        L_0x04f1:
            if (r11 >= r4) goto L_0x0537
            r1 = r22
            java.lang.Object r3 = r1.get(r11)
            X.6qq r3 = (X.C113156qq) r3
            r34 = r3
            r35 = r9
            r36 = r17
            r37 = r32
            r38 = r27
            r39 = r17
            r40 = r17
            X.7VN r2 = r34.A00(r35, r36, r37, r38, r39, r40)
            r1 = r26
            r1.add(r2)
            int r1 = r3.A03
            int r9 = r9 + r1
            int r11 = r11 + 1
            goto L_0x04f1
        L_0x0518:
            if (r18 == 0) goto L_0x057b
            r2 = r44
            r2.A9G(r4, r11, r15, r10)
        L_0x051f:
            int r2 = r9 + -1
            r1 = r17
            X.8bH r1 = X.AnonymousClass8bH.A02(r1, r2)
            if (r3 == 0) goto L_0x052d
            X.7yc r1 = X.AnonymousClass8bI.A0A(r1)
        L_0x052d:
            int r12 = r1.A00
            int r11 = r1.A01
            int r4 = r1.A02
            if (r4 <= 0) goto L_0x0550
            if (r12 <= r11) goto L_0x0554
        L_0x0537:
            r1 = r48
            int r3 = (int) r1
            int r4 = r26.size()
            r2 = 0
        L_0x053f:
            if (r2 >= r4) goto L_0x058b
            r1 = r26
            java.lang.Object r1 = r1.get(r2)
            X.7VN r1 = (X.AnonymousClass7VN) r1
            boolean r1 = r1.A0C
            if (r1 != 0) goto L_0x0614
            int r2 = r2 + 1
            goto L_0x053f
        L_0x0550:
            if (r4 >= 0) goto L_0x0537
            if (r11 > r12) goto L_0x0537
        L_0x0554:
            r13 = r15[r12]
            r1 = r12
            if (r3 == 0) goto L_0x055d
            int r1 = r9 - r12
            int r1 = r1 + -1
        L_0x055d:
            java.lang.Object r14 = r8.get(r1)
            X.6qh r14 = (X.C113086qh) r14
            if (r3 == 0) goto L_0x056a
            int r13 = r10 - r13
            int r1 = r14.A01
            int r13 = r13 - r1
        L_0x056a:
            r2 = r32
            r1 = r27
            java.util.List r2 = r14.A00(r13, r2, r1)
            r1 = r26
            r1.addAll(r2)
            if (r12 == r11) goto L_0x0537
            int r12 = r12 + r4
            goto L_0x0554
        L_0x057b:
            X.69J r36 = X.AnonymousClass69J.Ltr
            r34 = r43
            r35 = r4
            r37 = r11
            r38 = r15
            r39 = r10
            r34.A9H(r35, r36, r37, r38, r39)
            goto L_0x051f
        L_0x058b:
            java.util.Map r1 = r7.A07
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0614
            r1.clear()
            java.util.Map r1 = X.AnonymousClass4WJ.A0A()
            r7.A01 = r1
            r1 = -1
            r7.A00 = r1
        L_0x059f:
            int r2 = r19 + -1
            r1 = r24
            if (r1 != r2) goto L_0x05ab
            r40 = 0
            r1 = r20
            if (r1 <= r6) goto L_0x05ad
        L_0x05ab:
            r40 = 1
        L_0x05ad:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            r4 = 49
            r1 = r26
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r4 = X.C86144wL.A16(r1, r4)
            r1 = r30
            java.lang.Object r2 = r1.invoke(r3, r2, r4)
            X.8ld r2 = (X.C146098ld) r2
            boolean r1 = r23.isEmpty()
            if (r1 == 0) goto L_0x05ed
            boolean r1 = r22.isEmpty()
            if (r1 == 0) goto L_0x05ed
        L_0x05d1:
            if (r18 == 0) goto L_0x05ea
            X.66l r33 = X.C967266l.Vertical
        L_0x05d5:
            X.7Xw r9 = new X.7Xw
            r32 = r9
            r34 = r21
            r35 = r2
            r36 = r26
            r37 = r48
            r38 = r5
            r39 = r19
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x01f3
        L_0x05ea:
            X.66l r33 = X.C967266l.Horizontal
            goto L_0x05d5
        L_0x05ed:
            java.util.ArrayList r7 = X.C18200wM.A0t(r26)
            int r6 = r26.size()
            r4 = 0
        L_0x05f6:
            if (r4 >= r6) goto L_0x0611
            r1 = r26
            java.lang.Object r3 = r1.get(r4)
            r1 = r3
            X.7VN r1 = (X.AnonymousClass7VN) r1
            int r1 = r1.A01
            r8 = r28
            if (r8 > r1) goto L_0x060e
            r8 = r24
            if (r1 > r8) goto L_0x060e
            r7.add(r3)
        L_0x060e:
            int r4 = r4 + 1
            goto L_0x05f6
        L_0x0611:
            r26 = r7
            goto L_0x05d1
        L_0x0614:
            int r1 = r7.A00
            r34 = r1
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r26)
            X.7VN r1 = (X.AnonymousClass7VN) r1
            if (r1 == 0) goto L_0x06e1
            int r1 = r1.A01
        L_0x0622:
            r7.A00 = r1
            java.util.Map r1 = r7.A01
            r40 = r1
            r1 = r29
            X.8p6 r1 = r1.A01
            java.util.Map r1 = r1.Aqt()
            r7.A01 = r1
            boolean r9 = r7.A09
            r1 = 0
            if (r9 == 0) goto L_0x063b
            r32 = r27
            r1 = r3
            r3 = 0
        L_0x063b:
            long r15 = X.AnonymousClass7Hh.A00(r3, r1)
            java.util.LinkedHashSet r1 = r7.A02
            r47 = r1
            java.util.Map r8 = r7.A07
            java.util.Set r2 = r8.keySet()
            r1.addAll(r2)
            int r14 = r26.size()
            r10 = 0
        L_0x0651:
            if (r10 >= r14) goto L_0x06e4
            r1 = r26
            java.lang.Object r4 = r1.get(r10)
            X.7VN r4 = (X.AnonymousClass7VN) r4
            java.lang.Object r2 = r4.A0A
            r1 = r47
            r1.remove(r2)
            boolean r1 = r4.A0C
            if (r1 == 0) goto L_0x06db
            java.lang.Object r1 = r4.A0A
            java.lang.Object r3 = r8.get(r1)
            X.6kH r3 = (X.C109606kH) r3
            if (r3 != 0) goto L_0x06ac
            java.lang.Object r2 = r4.A0A
            r1 = r40
            java.lang.Number r3 = X.C86124wJ.A0j(r2, r1)
            if (r3 == 0) goto L_0x0695
            int r2 = r4.A01
            int r1 = r3.intValue()
            if (r2 == r1) goto L_0x0695
            int r2 = r3.intValue()
            r1 = r34
            if (r2 >= r1) goto L_0x0692
            java.util.List r1 = r7.A06
        L_0x068c:
            r1.add(r4)
        L_0x068f:
            int r10 = r10 + 1
            goto L_0x0651
        L_0x0692:
            java.util.List r1 = r7.A05
            goto L_0x068c
        L_0x0695:
            java.lang.Object r3 = r4.A0A
            long r1 = r4.A06
            if (r9 == 0) goto L_0x06a7
            int r1 = X.C86104wH.A08(r1)
        L_0x069f:
            X.6kH r1 = X.C120997Do.A00(r7, r4, r1)
            r8.put(r3, r1)
            goto L_0x068f
        L_0x06a7:
            int r1 = X.C86104wH.A07(r1)
            goto L_0x069f
        L_0x06ac:
            long r11 = r3.A02
            r13 = 32
            r1 = r15
            long r1 = X.AnonymousClass7Hh.A01(r11, r1)
            r3.A02 = r1
            boolean r11 = r4.A0D
            long r1 = r4.A07
            if (r11 == 0) goto L_0x06d4
            long r1 = r1 >> r13
        L_0x06be:
            int r11 = (int) r1
            r3.A01 = r11
            boolean r11 = r4.A0D
            long r1 = r4.A06
            if (r11 == 0) goto L_0x06cf
            long r1 = r1 >> r13
            int r11 = (int) r1
        L_0x06c9:
            r3.A00 = r11
            X.C120997Do.A01(r3, r7, r4)
            goto L_0x068f
        L_0x06cf:
            int r11 = X.C86104wH.A08(r1)
            goto L_0x06c9
        L_0x06d4:
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r11
            goto L_0x06be
        L_0x06db:
            java.lang.Object r1 = r4.A0A
            r8.remove(r1)
            goto L_0x068f
        L_0x06e1:
            r1 = 0
            goto L_0x0622
        L_0x06e4:
            java.util.List r1 = r7.A06
            r46 = r1
            int r1 = r46.size()
            r2 = r25
            if (r1 <= r2) goto L_0x06f8
            r3 = 6
            r2 = r46
            r1 = r40
            X.C86144wL.A1Q(r1, r2, r3)
        L_0x06f8:
            int r13 = r46.size()
            r36 = -1
            r11 = 0
            r10 = -1
            r4 = 0
            r2 = 0
        L_0x0702:
            if (r11 >= r13) goto L_0x073d
            r1 = r46
            java.lang.Object r12 = r1.get(r11)
            X.7VN r12 = (X.AnonymousClass7VN) r12
            if (r9 == 0) goto L_0x073a
            int r3 = r12.A05
        L_0x0710:
            r1 = r36
            if (r3 == r1) goto L_0x0733
            if (r3 != r10) goto L_0x0733
            int r1 = r12.A00()
            int r2 = java.lang.Math.max(r2, r1)
        L_0x071e:
            int r1 = -r4
            int r3 = r12.A00()
            int r1 = r1 - r3
            X.6kH r3 = X.C120997Do.A00(r7, r12, r1)
            java.lang.Object r1 = r12.A0A
            r8.put(r1, r3)
            X.C120997Do.A01(r3, r7, r12)
            int r11 = r11 + 1
            goto L_0x0702
        L_0x0733:
            int r4 = r4 + r2
            int r2 = r12.A00()
            r10 = r3
            goto L_0x071e
        L_0x073a:
            int r3 = r12.A00
            goto L_0x0710
        L_0x073d:
            java.util.List r1 = r7.A05
            r45 = r1
            int r1 = r45.size()
            r2 = r25
            if (r1 <= r2) goto L_0x0751
            r3 = 4
            r2 = r45
            r1 = r40
            X.C86144wL.A1Q(r1, r2, r3)
        L_0x0751:
            int r11 = r45.size()
            r10 = -1
            r4 = 0
            r13 = 0
            r2 = 0
        L_0x0759:
            if (r4 >= r11) goto L_0x0790
            r1 = r45
            java.lang.Object r12 = r1.get(r4)
            X.7VN r12 = (X.AnonymousClass7VN) r12
            if (r9 == 0) goto L_0x078d
            int r3 = r12.A05
        L_0x0767:
            r1 = r36
            if (r3 == r1) goto L_0x0786
            if (r3 != r10) goto L_0x0786
            int r1 = r12.A00()
            int r2 = java.lang.Math.max(r2, r1)
        L_0x0775:
            int r1 = r32 + r13
            X.6kH r3 = X.C120997Do.A00(r7, r12, r1)
            java.lang.Object r1 = r12.A0A
            r8.put(r1, r3)
            X.C120997Do.A01(r3, r7, r12)
            int r4 = r4 + 1
            goto L_0x0759
        L_0x0786:
            int r13 = r13 + r2
            int r2 = r12.A00()
            r10 = r3
            goto L_0x0775
        L_0x078d:
            int r3 = r12.A00
            goto L_0x0767
        L_0x0790:
            java.util.Iterator r35 = r47.iterator()
        L_0x0794:
            boolean r1 = r35.hasNext()
            if (r1 == 0) goto L_0x084f
            java.lang.Object r14 = r35.next()
            java.lang.Object r13 = X.AnonymousClass4WJ.A07(r14, r8)
            X.6kH r13 = (X.C109606kH) r13
            java.util.Map r1 = r7.A01
            java.lang.Object r12 = r1.get(r14)
            java.lang.Number r12 = (java.lang.Number) r12
            java.util.List r1 = r13.A03
            r39 = r1
            int r3 = r39.size()
            r2 = 0
        L_0x07b5:
            if (r2 >= r3) goto L_0x084c
            r1 = r39
            java.lang.Object r1 = r1.get(r2)
            X.6kI r1 = (X.C109616kI) r1
            X.8pE r1 = r1.A03
            boolean r1 = X.C86104wH.A1X(r1)
            if (r1 == 0) goto L_0x0848
            r2 = 1
        L_0x07c8:
            boolean r1 = r39.isEmpty()
            if (r1 != 0) goto L_0x0843
            if (r12 == 0) goto L_0x0843
            if (r2 != 0) goto L_0x080d
            r1 = r40
            java.lang.Object r1 = r1.get(r14)
            boolean r1 = r12.equals(r1)
            if (r1 != 0) goto L_0x0843
            int r34 = r39.size()
            r11 = 0
        L_0x07e3:
            r1 = r34
            if (r11 >= r1) goto L_0x0843
            r1 = r39
            java.lang.Object r10 = r1.get(r11)
            X.6kI r10 = (X.C109616kI) r10
            long r15 = r10.A01
            long r1 = r13.A02
            r3 = r15
            long r3 = X.AnonymousClass7Hh.A01(r3, r1)
            if (r9 == 0) goto L_0x083e
            int r2 = X.C86104wH.A08(r3)
        L_0x07fe:
            int r1 = r10.A00
            int r2 = r2 + r1
            if (r2 <= 0) goto L_0x083b
            if (r9 == 0) goto L_0x0836
            int r2 = X.C86104wH.A08(r3)
        L_0x0809:
            r1 = r32
            if (r2 >= r1) goto L_0x083b
        L_0x080d:
            int r10 = r12.intValue()
            X.79v r2 = androidx.compose.ui.unit.Constraints.A01
            int r1 = r13.A01
            if (r9 == 0) goto L_0x0831
            long r1 = r2.A02(r1)
        L_0x081b:
            r3 = r29
            int r4 = r3.A00
            X.6qq r2 = r3.A00(r10, r4, r1)
            int r1 = r7.A00
            if (r10 >= r1) goto L_0x082e
            java.util.List r1 = r7.A04
        L_0x0829:
            r1.add(r2)
            goto L_0x0794
        L_0x082e:
            java.util.List r1 = r7.A03
            goto L_0x0829
        L_0x0831:
            long r1 = r2.A01(r1)
            goto L_0x081b
        L_0x0836:
            int r2 = X.C86104wH.A07(r3)
            goto L_0x0809
        L_0x083b:
            int r11 = r11 + 1
            goto L_0x07e3
        L_0x083e:
            int r2 = X.C86104wH.A07(r3)
            goto L_0x07fe
        L_0x0843:
            r8.remove(r14)
            goto L_0x0794
        L_0x0848:
            int r2 = r2 + 1
            goto L_0x07b5
        L_0x084c:
            r2 = 0
            goto L_0x07c8
        L_0x084f:
            java.util.List r4 = r7.A04
            int r1 = r4.size()
            r2 = r25
            if (r1 <= r2) goto L_0x085d
            r1 = 7
            X.C86144wL.A1Q(r7, r4, r1)
        L_0x085d:
            int r12 = r4.size()
            r11 = 0
            r10 = 0
            r2 = 0
            r9 = -1
        L_0x0865:
            if (r11 >= r12) goto L_0x08af
            java.lang.Object r3 = r4.get(r11)
            X.6qq r3 = (X.C113156qq) r3
            int r13 = r3.A01
            r1 = r33
            int r13 = r1.A00(r13)
            r1 = r36
            if (r13 == r1) goto L_0x08aa
            if (r13 != r9) goto L_0x08aa
            int r1 = r3.A02
            int r2 = java.lang.Math.max(r2, r1)
        L_0x0881:
            int r14 = -r10
            int r1 = r3.A02
            int r14 = r14 - r1
            java.lang.Object r1 = r3.A04
            java.lang.Object r13 = X.AnonymousClass4WJ.A07(r1, r8)
            X.6kH r13 = (X.C109606kH) r13
            int r1 = r13.A00
            r39 = r14
            r40 = r1
            r42 = r27
            r43 = r36
            r44 = r36
            r38 = r3
            X.7VN r3 = r38.A00(r39, r40, r41, r42, r43, r44)
            r1 = r26
            r1.add(r3)
            X.C120997Do.A01(r13, r7, r3)
            int r11 = r11 + 1
            goto L_0x0865
        L_0x08aa:
            int r10 = r10 + r2
            int r2 = r3.A02
            r9 = r13
            goto L_0x0881
        L_0x08af:
            java.util.List r11 = r7.A03
            int r2 = r11.size()
            r1 = r25
            if (r2 <= r1) goto L_0x08bd
            r1 = 5
            X.C86144wL.A1Q(r7, r11, r1)
        L_0x08bd:
            int r12 = r11.size()
            r10 = -1
            r2 = 0
            r9 = 0
            r14 = 0
        L_0x08c5:
            if (r9 >= r12) goto L_0x090b
            java.lang.Object r3 = r11.get(r9)
            X.6qq r3 = (X.C113156qq) r3
            int r13 = r3.A01
            r1 = r33
            int r13 = r1.A00(r13)
            r1 = r36
            if (r13 == r1) goto L_0x0906
            if (r13 != r10) goto L_0x0906
            int r1 = r3.A02
            int r2 = java.lang.Math.max(r2, r1)
        L_0x08e1:
            int r39 = r32 + r14
            java.lang.Object r1 = r3.A04
            java.lang.Object r13 = X.AnonymousClass4WJ.A07(r1, r8)
            X.6kH r13 = (X.C109606kH) r13
            int r1 = r13.A00
            r40 = r1
            r42 = r27
            r43 = r36
            r44 = r36
            r38 = r3
            X.7VN r3 = r38.A00(r39, r40, r41, r42, r43, r44)
            r1 = r26
            r1.add(r3)
            X.C120997Do.A01(r13, r7, r3)
            int r9 = r9 + 1
            goto L_0x08c5
        L_0x0906:
            int r14 = r14 + r2
            int r2 = r3.A02
            r10 = r13
            goto L_0x08e1
        L_0x090b:
            r46.clear()
            r45.clear()
            r4.clear()
            r11.clear()
            r47.clear()
            goto L_0x059f
        L_0x091c:
            androidx.compose.runtime.snapshots.Snapshot r5 = r6.A05()     // Catch:{ all -> 0x093d }
            if (r3 == 0) goto L_0x092d
            X.6qq[] r4 = r3.A03     // Catch:{ all -> 0x0936 }
            int r2 = r4.length     // Catch:{ all -> 0x0936 }
            if (r2 == 0) goto L_0x092d
            r2 = r4[r17]     // Catch:{ all -> 0x0936 }
            if (r2 == 0) goto L_0x092d
            int r1 = r2.A01     // Catch:{ all -> 0x0936 }
        L_0x092d:
            X.AnonymousClass7DW.A00(r7, r1, r8)     // Catch:{ all -> 0x0936 }
            r1 = r31
            r1.A01(r5)     // Catch:{ all -> 0x093d }
            goto L_0x094d
        L_0x0936:
            r1 = move-exception
            r0 = r31
            r0.A01(r5)     // Catch:{ all -> 0x093d }
            throw r1     // Catch:{ all -> 0x093d }
        L_0x093d:
            r0 = move-exception
            r6.A0A()
            throw r0
        L_0x0942:
            java.lang.String r0 = "scrollOffset should be non-negative ("
            java.lang.String r0 = X.C86134wK.A0r(r0, r8)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x094d:
            r6.A0A()
        L_0x0950:
            float r2 = r0.A00
            float r1 = r9.A00
            float r2 = r2 - r1
            r0.A00 = r2
            X.8pE r1 = r0.A0E
            r1.CrC(r9)
            boolean r2 = r9.A04
            X.8pE r1 = r0.A0B
            X.C147368pE.A04(r1, r2)
            r2 = 0
            if (r3 == 0) goto L_0x096a
            int r1 = r3.A00
            if (r1 != 0) goto L_0x096e
        L_0x096a:
            int r1 = r9.A01
            if (r1 == 0) goto L_0x096f
        L_0x096e:
            r2 = 1
        L_0x096f:
            X.8pE r1 = r0.A0A
            X.C147368pE.A04(r1, r2)
            int r1 = r0.A02
            int r1 = r1 + 1
            r0.A02 = r1
            int r1 = r0.A01
            r3 = -1
            if (r1 == r3) goto L_0x09be
            java.util.List r2 = r9.BLp()
            boolean r1 = X.C18190wL.A1a(r2)
            if (r1 == 0) goto L_0x09be
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x09c2
            java.lang.Object r2 = X.AnonymousClass00J.A0E(r2)
            X.C28 r2 = (X.C28) r2
            X.8pE r1 = r0.A0D
            boolean r1 = X.C86104wH.A1X(r1)
            X.7VN r2 = (X.AnonymousClass7VN) r2
            if (r1 == 0) goto L_0x09bf
            int r1 = r2.A05
        L_0x099f:
            int r2 = r1 + 1
        L_0x09a1:
            int r1 = r0.A01
            if (r1 == r2) goto L_0x09be
            r0.A01 = r3
            X.84X r4 = r0.A0J
            int r3 = r4.A00
            if (r3 <= 0) goto L_0x09bb
            r2 = 0
            java.lang.Object[] r1 = r4.A01
        L_0x09b0:
            r0 = r1[r2]
            X.8fZ r0 = (X.C142778fZ) r0
            r0.cancel()
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x09b0
        L_0x09bb:
            r4.A05()
        L_0x09be:
            return r9
        L_0x09bf:
            int r1 = r2.A00
            goto L_0x099f
        L_0x09c2:
            java.lang.Object r2 = X.AnonymousClass00J.A0C(r2)
            X.C28 r2 = (X.C28) r2
            X.8pE r1 = r0.A0D
            boolean r1 = X.C86104wH.A1X(r1)
            X.7VN r2 = (X.AnonymousClass7VN) r2
            if (r1 == 0) goto L_0x09d7
            int r1 = r2.A05
        L_0x09d4:
            int r2 = r1 + -1
            goto L_0x09a1
        L_0x09d7:
            int r1 = r2.A00
            goto L_0x09d4
        L_0x09da:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r34)
            throw r0
        L_0x09df:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r34)
            throw r0
        L_0x09e4:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r34)
            throw r0
        L_0x09e9:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r34)
            throw r0
        L_0x09ee:
            r0 = move-exception
            X.C86144wL.A1N(r13)     // Catch:{ all -> 0x09f3 }
            throw r0     // Catch:{ all -> 0x09f3 }
        L_0x09f3:
            r0 = move-exception
            r15.A0A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8SY.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
