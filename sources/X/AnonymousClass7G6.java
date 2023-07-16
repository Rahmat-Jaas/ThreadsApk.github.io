package X;

/* renamed from: X.7G6  reason: invalid class name */
public final class AnonymousClass7G6 {
    public static final AnonymousClass534 A00;

    static {
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        C04220Ms.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        A00 = new AnonymousClass532(r2, AnonymousClass8FV.A00);
    }

    public static final void A02(C147188nY r4, C121807If r5, AnonymousClass0YP r6, int i) {
        int i2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        r4.Cvd(1772272796);
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r4, r5) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0A(r4, r6);
        }
        if ((i2 & 91) != 18 || !r4.BCM()) {
            AnonymousClass534 r1 = A00;
            AnonymousClass7Ai.A01(r4, r6, AnonymousClass7DS.A01(r1, ((C121807If) r4.AEA(r1)).A01(r5), A1Z), i2);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r5, r6, i, 21);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b0, code lost:
        if (r4.ACY(r7) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0111, code lost:
        if ((r58 & com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r43, androidx.compose.ui.Modifier r44, X.C121807If r45, X.C1188372l r46, X.C114236su r47, X.C134817yQ r48, X.C121117Ee r49, X.AnonymousClass79I r50, java.lang.String r51, X.AnonymousClass0YY r52, int r53, int r54, int r55, int r56, int r57, int r58, long r59, long r61, long r63, long r65, boolean r67) {
        /*
            r24 = r52
            r26 = r44
            r18 = r63
            r22 = r59
            r20 = r61
            r16 = r65
            r7 = r45
            r41 = r54
            r42 = r53
            r25 = r67
            r40 = r55
            r39 = 0
            r0 = 1028090691(0x3d476b43, float:0.048686277)
            r4 = r43
            r4.Cvd(r0)
            r2 = r58
            r0 = r58 & 1
            r3 = r56
            r60 = r51
            if (r0 == 0) goto L_0x02cb
            r5 = r56 | 6
        L_0x002c:
            r38 = r58 & 2
            if (r38 == 0) goto L_0x02be
            r5 = r5 | 48
        L_0x0032:
            r37 = r58 & 4
            if (r37 == 0) goto L_0x02ad
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0038:
            r36 = r58 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r36 == 0) goto L_0x02a0
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0040:
            r35 = r58 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            r34 = 57344(0xe000, float:8.0356E-41)
            if (r35 == 0) goto L_0x0293
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x004b:
            r33 = r58 & 32
            r32 = 458752(0x70000, float:6.42848E-40)
            r31 = 65536(0x10000, float:9.18355E-41)
            if (r33 == 0) goto L_0x0287
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0055:
            r5 = r5 | r0
        L_0x0056:
            r30 = r58 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r30 == 0) goto L_0x0277
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x005e:
            r5 = r5 | r0
        L_0x005f:
            r0 = r2 & 128(0x80, float:1.794E-43)
            r28 = r0
            if (r0 == 0) goto L_0x0265
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0067:
            r5 = r5 | r0
        L_0x0068:
            r9 = r2 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0253
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x006e:
            r5 = r5 | r0
        L_0x006f:
            r10 = r2 & 512(0x200, float:7.175E-43)
            r43 = r49
            if (r10 == 0) goto L_0x0241
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0077:
            r5 = r5 | r0
        L_0x0078:
            r11 = r2 & 1024(0x400, float:1.435E-42)
            r6 = r57
            if (r11 == 0) goto L_0x0230
            r8 = r57 | 6
        L_0x0080:
            r1 = r2 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0223
            r8 = r8 | 48
        L_0x0086:
            r12 = r2 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0216
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x008c:
            r13 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x0205
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0092:
            r14 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01f3
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0098:
            r0 = 32768(0x8000, float:4.5918E-41)
            r27 = r58 & r0
            if (r27 == 0) goto L_0x01e7
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x00a1:
            r8 = r8 | r0
        L_0x00a2:
            r0 = r57 & r29
            if (r0 != 0) goto L_0x00b5
            r0 = r58 & r31
            if (r0 != 0) goto L_0x00b2
            boolean r15 = r4.ACY(r7)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r15 != 0) goto L_0x00b4
        L_0x00b2:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x00b4:
            r8 = r8 | r0
        L_0x00b5:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r5
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r15) goto L_0x00ff
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r8
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r0) goto L_0x00ff
            boolean r0 = r4.BCM()
            if (r0 == 0) goto L_0x00ff
            r4.CuJ()
        L_0x00d0:
            X.8nW r1 = r4.AKE()
            if (r1 == 0) goto L_0x00fe
            X.8UN r0 = new X.8UN
            r43 = r0
            r44 = r26
            r45 = r7
            r51 = r60
            r52 = r24
            r53 = r42
            r54 = r41
            r55 = r40
            r56 = r3
            r57 = r6
            r58 = r2
            r59 = r22
            r61 = r20
            r63 = r18
            r65 = r16
            r67 = r25
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r61, r63, r65, r67)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x00fe:
            return
        L_0x00ff:
            r4.CvD()
            r0 = r56 & 1
            if (r0 == 0) goto L_0x0198
            boolean r0 = r4.Acj()
            if (r0 != 0) goto L_0x0198
            r4.CuJ()
            r0 = r58 & r31
            if (r0 == 0) goto L_0x0117
        L_0x0113:
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x0117:
            r4.AKA()
            r0 = 1557613245(0x5cd74abd, float:4.84794365E17)
            r4.Cvb(r0)
            long r9 = X.AnonymousClass7KE.A06
            int r0 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0177
            r52 = r22
        L_0x0128:
            r0 = r39
            X.AnonymousClass7W3.A0z(r4, r0)
            r45 = 0
            r51 = 4108112(0x3eaf50, float:5.756691E-39)
            X.7If r0 = new X.7If
            r44 = r0
            r54 = r20
            r56 = r18
            r58 = r16
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r58)
            X.7If r30 = r7.A01(r0)
            r0 = r5 & 14
            r9 = r5 & 112(0x70, float:1.57E-43)
            r9 = r9 | r0
            int r0 = r8 >> 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r0
            int r5 = r8 << 9
            r1 = r5 & r34
            r0 = r32
            int r36 = X.C86144wL.A04(r9, r1, r5, r0)
            r0 = r5 & r29
            r36 = r36 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r0
            r36 = r36 | r5
            r28 = r4
            r29 = r26
            r31 = r60
            r32 = r24
            r33 = r42
            r34 = r41
            r35 = r40
            r37 = r39
            r38 = r25
            X.C115746vq.A01(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x00d0
        L_0x0177:
            X.7F0 r0 = r7.A02
            X.8nH r0 = r0.A0D
            long r52 = r0.AYH()
            int r0 = (r52 > r9 ? 1 : (r52 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0128
            X.534 r0 = X.AnonymousClass6WZ.A00
            long r0 = X.C147188nY.A0R(r4, r0)
            X.534 r9 = X.AnonymousClass6WY.A00
            java.lang.Object r9 = r4.AEA(r9)
            float r9 = X.C18240wQ.A00(r9)
            long r52 = X.C121657He.A04(X.C86154wM.A0G(r0), X.AnonymousClass7KE.A03(r0), X.AnonymousClass7KE.A02(r0), X.AnonymousClass7KE.A01(r0), r9)
            goto L_0x0128
        L_0x0198:
            if (r38 == 0) goto L_0x019c
            X.7Wm r26 = androidx.compose.ui.Modifier.A00
        L_0x019c:
            if (r37 == 0) goto L_0x01a0
            long r22 = X.AnonymousClass7KE.A06
        L_0x01a0:
            if (r36 == 0) goto L_0x01a4
            long r20 = X.AnonymousClass7HC.A01
        L_0x01a4:
            r49 = 0
            if (r35 == 0) goto L_0x01aa
            r47 = r49
        L_0x01aa:
            if (r33 == 0) goto L_0x01ae
            r48 = r49
        L_0x01ae:
            if (r30 == 0) goto L_0x01b2
            r46 = r49
        L_0x01b2:
            if (r28 == 0) goto L_0x01b6
            long r18 = X.AnonymousClass7HC.A01
        L_0x01b6:
            if (r9 == 0) goto L_0x01ba
            r50 = r49
        L_0x01ba:
            if (r10 != 0) goto L_0x01be
            r49 = r43
        L_0x01be:
            if (r11 == 0) goto L_0x01c2
            long r16 = X.AnonymousClass7HC.A01
        L_0x01c2:
            if (r1 == 0) goto L_0x01c6
            r42 = 1
        L_0x01c6:
            r0 = r25
            boolean r25 = X.C86154wM.A1Z(r12, r0)
            if (r13 == 0) goto L_0x01d1
            r41 = 2147483647(0x7fffffff, float:NaN)
        L_0x01d1:
            if (r14 == 0) goto L_0x01d5
            r40 = 1
        L_0x01d5:
            if (r27 == 0) goto L_0x01d9
            X.4hW r24 = X.C77874hW.A00
        L_0x01d9:
            r0 = r58 & r31
            if (r0 == 0) goto L_0x0117
            X.534 r0 = A00
            java.lang.Object r7 = r4.AEA(r0)
            X.7If r7 = (X.C121807If) r7
            goto L_0x0113
        L_0x01e7:
            r0 = r57 & r32
            if (r0 != 0) goto L_0x00a2
            r0 = r24
            int r0 = X.C147188nY.A0E(r4, r0)
            goto L_0x00a1
        L_0x01f3:
            r0 = r57 & r34
            if (r0 != 0) goto L_0x0098
            r14 = 0
            r0 = r40
            boolean r0 = r4.ACW(r0)
            if (r0 != 0) goto L_0x0202
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0202:
            r8 = r8 | r15
            goto L_0x0098
        L_0x0205:
            r0 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0092
            r0 = r41
            boolean r0 = r4.ACW(r0)
            if (r0 != 0) goto L_0x0213
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0213:
            r8 = r8 | r14
            goto L_0x0092
        L_0x0216:
            r0 = r6 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x008c
            r0 = r25
            int r0 = X.C147188nY.A0N(r4, r0)
            r8 = r8 | r0
            goto L_0x008c
        L_0x0223:
            r0 = r57 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0086
            r0 = r42
            int r0 = X.C147188nY.A04(r4, r0)
            r8 = r8 | r0
            goto L_0x0086
        L_0x0230:
            r0 = r57 & 14
            if (r0 != 0) goto L_0x023e
            r0 = r16
            int r0 = X.C147188nY.A05(r4, r0)
            r8 = r57 | r0
            goto L_0x0080
        L_0x023e:
            r8 = r6
            goto L_0x0080
        L_0x0241:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r56 & r0
            if (r0 != 0) goto L_0x0078
            r0 = r43
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A02(r0)
            goto L_0x0077
        L_0x0253:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r56 & r0
            if (r0 != 0) goto L_0x006f
            r0 = r50
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x006e
        L_0x0265:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r56 & r0
            if (r0 != 0) goto L_0x0068
            r0 = r18
            boolean r0 = r4.ACX(r0)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x0067
        L_0x0277:
            r0 = r56 & r29
            if (r0 != 0) goto L_0x005f
            r0 = r46
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x005e
        L_0x0287:
            r0 = r56 & r32
            if (r0 != 0) goto L_0x0056
            r0 = r48
            int r0 = X.C147188nY.A0K(r4, r0)
            goto L_0x0055
        L_0x0293:
            r0 = r56 & r34
            if (r0 != 0) goto L_0x004b
            r0 = r47
            int r0 = X.C147188nY.A0J(r4, r0)
            r5 = r5 | r0
            goto L_0x004b
        L_0x02a0:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0040
            r0 = r20
            int r0 = X.C147188nY.A06(r4, r0)
            r5 = r5 | r0
            goto L_0x0040
        L_0x02ad:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0038
            r0 = r22
            boolean r0 = r4.ACX(r0)
            int r0 = X.C86124wJ.A06(r0)
            r5 = r5 | r0
            goto L_0x0038
        L_0x02be:
            r0 = r56 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0032
            r0 = r26
            int r0 = X.C147188nY.A0G(r4, r0)
            r5 = r5 | r0
            goto L_0x0032
        L_0x02cb:
            r0 = r56 & 14
            if (r0 != 0) goto L_0x02d9
            r0 = r60
            int r5 = X.C147188nY.A0F(r4, r0)
            r5 = r5 | r56
            goto L_0x002c
        L_0x02d9:
            r5 = r3
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7G6.A00(X.8nY, androidx.compose.ui.Modifier, X.7If, X.72l, X.6su, X.7yQ, X.7Ee, X.79I, java.lang.String, X.0YY, int, int, int, int, int, int, long, long, long, long, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.7If} */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        if (r15 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A01(X.C147188nY r50, androidx.compose.ui.Modifier r51, X.C121807If r52, X.C1188372l r53, X.C114236su r54, X.C134817yQ r55, X.C121117Ee r56, X.AnonymousClass79I r57, java.lang.String r58, X.AnonymousClass0YY r59, int r60, int r61, int r62, int r63, int r64, long r65, long r67, long r69, long r71, boolean r73) {
        /*
            r24 = r52
            r45 = r54
            r18 = r69
            r22 = r65
            r20 = r67
            r16 = r71
            r44 = r53
            r25 = r59
            r48 = r57
            r40 = r60
            r46 = r55
            r26 = r73
            r27 = r51
            r39 = r61
            r38 = 0
            r49 = r58
            r1 = r49
            r0 = r38
            X.C04220Ms.A0B(r1, r0)
            r0 = -366126944(0xffffffffea2d58a0, float:-5.239067E25)
            r4 = r50
            r4.Cvd(r0)
            r2 = r64
            r0 = r64 & 1
            r3 = r62
            if (r0 == 0) goto L_0x02a2
            r5 = r62 | 6
        L_0x0039:
            r37 = r64 & 2
            if (r37 == 0) goto L_0x0295
            r5 = r5 | 48
        L_0x003f:
            r36 = r64 & 4
            if (r36 == 0) goto L_0x0284
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r35 = r64 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r35 == 0) goto L_0x0277
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x004d:
            r34 = r64 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            r33 = 57344(0xe000, float:8.0356E-41)
            if (r34 == 0) goto L_0x026a
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0058:
            r32 = r64 & 32
            r31 = 458752(0x70000, float:6.42848E-40)
            if (r32 == 0) goto L_0x025e
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0060:
            r5 = r5 | r0
        L_0x0061:
            r30 = r64 & 64
            r6 = 3670016(0x380000, float:5.142788E-39)
            if (r30 == 0) goto L_0x024e
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x0069:
            r5 = r5 | r0
        L_0x006a:
            r0 = r2 & 128(0x80, float:1.794E-43)
            r29 = r0
            if (r0 == 0) goto L_0x023c
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0072:
            r5 = r5 | r0
        L_0x0073:
            r8 = r2 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x022a
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0079:
            r5 = r5 | r0
        L_0x007a:
            r9 = r2 & 512(0x200, float:7.175E-43)
            r41 = r56
            if (r9 == 0) goto L_0x0218
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0082:
            r5 = r5 | r0
        L_0x0083:
            r10 = r2 & 1024(0x400, float:1.435E-42)
            r7 = r63
            if (r10 == 0) goto L_0x0207
            r1 = r63 | 6
        L_0x008b:
            r11 = r2 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x01fa
            r1 = r1 | 48
        L_0x0091:
            r12 = r2 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x01ed
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0097:
            r13 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x01dc
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x009d:
            r14 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01ca
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00a3:
            r0 = r63 & r31
            r28 = 32768(0x8000, float:4.5918E-41)
            if (r0 != 0) goto L_0x00bb
            r0 = r64 & r28
            if (r0 != 0) goto L_0x00b8
            r0 = r24
            boolean r15 = r4.ACY(r0)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r15 != 0) goto L_0x00ba
        L_0x00b8:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r0
        L_0x00bb:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r5
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r15) goto L_0x010d
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r1
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r0) goto L_0x010d
            boolean r0 = r4.BCM()
            if (r0 == 0) goto L_0x010d
            r4.CuJ()
            r47 = r41
        L_0x00d8:
            X.8nW r1 = r4.AKE()
            if (r1 == 0) goto L_0x010c
            X.8UL r0 = new X.8UL
            r28 = r0
            r29 = r27
            r30 = r24
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r36 = r49
            r37 = r25
            r38 = r40
            r40 = r3
            r41 = r7
            r42 = r2
            r43 = r22
            r45 = r20
            r47 = r18
            r49 = r16
            r51 = r26
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r51)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x010c:
            return
        L_0x010d:
            r4.CvD()
            r0 = r62 & 1
            if (r0 == 0) goto L_0x0177
            boolean r0 = r4.Acj()
            if (r0 != 0) goto L_0x0177
            r4.CuJ()
            r0 = r64 & r28
            if (r0 == 0) goto L_0x0125
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r0
        L_0x0125:
            r47 = r41
        L_0x0127:
            r4.AKA()
            r53 = 1
            r0 = r5 & 14
            int r8 = X.C86114wI.A03(r5, r0)
            r0 = r5 & r33
            r8 = r8 | r0
            r0 = r5 & r31
            int r54 = X.C86144wL.A04(r8, r0, r5, r6)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r5
            r54 = r54 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r5
            r54 = r54 | r0
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r0
            r54 = r54 | r5
            r0 = r1 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            int r5 = X.C86114wI.A03(r1, r0)
            int r1 = r1 << 3
            r0 = r1 & r31
            int r55 = X.C86144wL.A04(r5, r0, r1, r6)
            r41 = r4
            r42 = r27
            r43 = r24
            r50 = r25
            r51 = r40
            r52 = r39
            r56 = r38
            r57 = r22
            r59 = r20
            r61 = r18
            r63 = r16
            r65 = r26
            A00(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r63, r65)
            goto L_0x00d8
        L_0x0177:
            if (r37 == 0) goto L_0x017b
            X.7Wm r27 = androidx.compose.ui.Modifier.A00
        L_0x017b:
            if (r36 == 0) goto L_0x017f
            long r22 = X.AnonymousClass7KE.A06
        L_0x017f:
            if (r35 == 0) goto L_0x0183
            long r20 = X.AnonymousClass7HC.A01
        L_0x0183:
            r47 = 0
            if (r34 == 0) goto L_0x0189
            r45 = r47
        L_0x0189:
            if (r32 == 0) goto L_0x018d
            r46 = r47
        L_0x018d:
            if (r30 == 0) goto L_0x0191
            r44 = r47
        L_0x0191:
            if (r29 == 0) goto L_0x0195
            long r18 = X.AnonymousClass7HC.A01
        L_0x0195:
            if (r8 == 0) goto L_0x0199
            r48 = r47
        L_0x0199:
            if (r9 != 0) goto L_0x019d
            r47 = r41
        L_0x019d:
            if (r10 == 0) goto L_0x01a1
            long r16 = X.AnonymousClass7HC.A01
        L_0x01a1:
            if (r11 == 0) goto L_0x01a5
            r40 = 1
        L_0x01a5:
            r0 = r26
            boolean r26 = X.C86154wM.A1Z(r12, r0)
            if (r13 == 0) goto L_0x01b0
            r39 = 2147483647(0x7fffffff, float:NaN)
        L_0x01b0:
            if (r14 == 0) goto L_0x01b4
            X.4hX r25 = X.C77884hX.A00
        L_0x01b4:
            r0 = r64 & r28
            if (r0 == 0) goto L_0x0127
            X.534 r0 = A00
            java.lang.Object r24 = r4.AEA(r0)
            r0 = r24
            X.7If r0 = (X.C121807If) r0
            r24 = r0
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r0
            goto L_0x0127
        L_0x01ca:
            r0 = r63 & r33
            if (r0 != 0) goto L_0x00a3
            r14 = 0
            r0 = r25
            boolean r0 = r4.ACa(r0)
            if (r0 != 0) goto L_0x01d9
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x01d9:
            r1 = r1 | r15
            goto L_0x00a3
        L_0x01dc:
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x009d
            r0 = r39
            boolean r0 = r4.ACW(r0)
            if (r0 != 0) goto L_0x01ea
            r14 = 1024(0x400, float:1.435E-42)
        L_0x01ea:
            r1 = r1 | r14
            goto L_0x009d
        L_0x01ed:
            r0 = r7 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0097
            r0 = r26
            int r0 = X.C147188nY.A0N(r4, r0)
            r1 = r1 | r0
            goto L_0x0097
        L_0x01fa:
            r0 = r63 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0091
            r0 = r40
            int r0 = X.C147188nY.A04(r4, r0)
            r1 = r1 | r0
            goto L_0x0091
        L_0x0207:
            r0 = r63 & 14
            if (r0 != 0) goto L_0x0215
            r0 = r16
            int r0 = X.C147188nY.A05(r4, r0)
            r1 = r63 | r0
            goto L_0x008b
        L_0x0215:
            r1 = r7
            goto L_0x008b
        L_0x0218:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r62 & r0
            if (r0 != 0) goto L_0x0083
            r0 = r41
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A02(r0)
            goto L_0x0082
        L_0x022a:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r62
            if (r0 != 0) goto L_0x007a
            r0 = r48
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A03(r0)
            goto L_0x0079
        L_0x023c:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r62 & r0
            if (r0 != 0) goto L_0x0073
            r0 = r18
            boolean r0 = r4.ACX(r0)
            int r0 = X.C86104wH.A04(r0)
            goto L_0x0072
        L_0x024e:
            r0 = r62 & r6
            if (r0 != 0) goto L_0x006a
            r0 = r44
            boolean r0 = r4.ACY(r0)
            int r0 = X.C86104wH.A01(r0)
            goto L_0x0069
        L_0x025e:
            r0 = r62 & r31
            if (r0 != 0) goto L_0x0061
            r0 = r46
            int r0 = X.C147188nY.A0K(r4, r0)
            goto L_0x0060
        L_0x026a:
            r0 = r62 & r33
            if (r0 != 0) goto L_0x0058
            r0 = r45
            int r0 = X.C147188nY.A0J(r4, r0)
            r5 = r5 | r0
            goto L_0x0058
        L_0x0277:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004d
            r0 = r20
            int r0 = X.C147188nY.A06(r4, r0)
            r5 = r5 | r0
            goto L_0x004d
        L_0x0284:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0045
            r0 = r22
            boolean r0 = r4.ACX(r0)
            int r0 = X.C86124wJ.A06(r0)
            r5 = r5 | r0
            goto L_0x0045
        L_0x0295:
            r0 = r62 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x003f
            r0 = r27
            int r0 = X.C147188nY.A0G(r4, r0)
            r5 = r5 | r0
            goto L_0x003f
        L_0x02a2:
            r0 = r62 & 14
            if (r0 != 0) goto L_0x02ae
            int r5 = X.C147188nY.A0F(r4, r1)
            r5 = r5 | r62
            goto L_0x0039
        L_0x02ae:
            r5 = r3
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7G6.A01(X.8nY, androidx.compose.ui.Modifier, X.7If, X.72l, X.6su, X.7yQ, X.7Ee, X.79I, java.lang.String, X.0YY, int, int, int, int, int, long, long, long, long, boolean):void");
    }
}
