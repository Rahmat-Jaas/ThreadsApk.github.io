package X;

import com.instagram.barcelona.R;
import java.util.Iterator;

/* renamed from: X.7BZ  reason: invalid class name */
public final class AnonymousClass7BZ {
    public static final String A01(C147188nY r6, AnonymousClass8s2 r7, int i, boolean z) {
        Object obj;
        int i2;
        String A02;
        r6.Cvb(-1875367149);
        r6.Cvb(-458679802);
        if (r7.isEmpty()) {
            A02 = AnonymousClass7JS.A01(r6, 2131822228);
        } else {
            AnonymousClass7W3.A0z(r6, false);
            if (z) {
                Iterator it = r7.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        int length = ((String) obj).length();
                        do {
                            Object next = it.next();
                            int length2 = ((String) next).length();
                            if (length > length2) {
                                obj = next;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    throw C86154wM.A0u();
                }
            } else {
                obj = r7.get(0);
            }
            if (i == 1) {
                r6.Cvb(-458679588);
                i2 = 2131829617;
            } else {
                r6.Cvb(-458679527);
                i2 = 2131829618;
            }
            A02 = AnonymousClass7JS.A02(r6, obj, i2);
        }
        AnonymousClass7W3.A0w(AnonymousClass7W3.A04(r6, false), false);
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        if (r6 == X.C970267q.REPOST_PREVIEW) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C147188nY r27, androidx.compose.ui.Modifier r28, com.instagram.api.schemas.LineType r29, X.C970267q r30, X.AnonymousClass0ZU r31, X.AnonymousClass8s2 r32, int r33, int r34, int r35, boolean r36, boolean r37) {
        /*
            r8 = r28
            r0 = 0
            r5 = r31
            X.C04220Ms.A0B(r5, r0)
            r14 = 2
            r1 = 3
            r6 = r30
            X.C04220Ms.A0B(r6, r1)
            r13 = 4
            r1 = 825215334(0x312fc966, float:2.5580333E-9)
            r4 = r27
            r4.Cvd(r1)
            r2 = r35
            r1 = r35 & 1
            r3 = r34
            if (r1 == 0) goto L_0x0178
            r9 = r34 | 6
        L_0x0022:
            r1 = r35 & 2
            r7 = r33
            if (r1 == 0) goto L_0x016d
            r9 = r9 | 48
        L_0x002a:
            r1 = r35 & 4
            r34 = r32
            if (r1 == 0) goto L_0x0160
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r1 = r35 & 8
            if (r1 == 0) goto L_0x0155
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r1 = r35 & 16
            r35 = r29
            if (r1 == 0) goto L_0x0146
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r10 = r2 & 32
            r1 = r36
            if (r10 == 0) goto L_0x013b
            r10 = 196608(0x30000, float:2.75506E-40)
        L_0x0048:
            r9 = r9 | r10
        L_0x0049:
            r11 = r2 & 64
            if (r11 == 0) goto L_0x012c
            r10 = 1572864(0x180000, float:2.204052E-39)
        L_0x004f:
            r9 = r9 | r10
        L_0x0050:
            r10 = r2 & 128(0x80, float:1.794E-43)
            r15 = r37
            if (r10 == 0) goto L_0x011d
            r10 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0058:
            r9 = r9 | r10
        L_0x0059:
            r10 = 23967451(0x16db6db, float:4.3661218E-38)
            r10 = r10 & r9
            r9 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r9) goto L_0x0090
            boolean r9 = r4.BCM()
            if (r9 == 0) goto L_0x0090
            r4.CuJ()
        L_0x006b:
            X.8nW r4 = r4.AKE()
            if (r4 == 0) goto L_0x008f
            X.8Sz r0 = new X.8Sz
            r16 = r0
            r17 = r8
            r18 = r35
            r19 = r6
            r20 = r5
            r21 = r34
            r22 = r7
            r23 = r3
            r24 = r2
            r25 = r1
            r26 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.AnonymousClass7WO.A00(r4, r0)
        L_0x008f:
            return
        L_0x0090:
            if (r11 == 0) goto L_0x0094
            X.7Wm r8 = androidx.compose.ui.Modifier.A00
        L_0x0094:
            if (r37 == 0) goto L_0x0118
            r9 = r34
            java.lang.String r22 = A01(r4, r9, r7, r0)
        L_0x009c:
            androidx.compose.ui.Modifier r12 = X.C100346My.A00(r4, r8, r1)
            if (r36 == 0) goto L_0x0115
            X.687 r10 = X.AnonymousClass687.Middle
        L_0x00a4:
            r9 = r35
            X.687 r11 = X.AnonymousClass6MK.A00(r9, r10)
            X.67q r9 = X.C970267q.POST
            if (r6 == r9) goto L_0x00b3
            X.67q r10 = X.C970267q.REPOST_PREVIEW
            r9 = 0
            if (r6 != r10) goto L_0x00b4
        L_0x00b3:
            r9 = 1
        L_0x00b4:
            androidx.compose.ui.Modifier r10 = X.AnonymousClass73T.A00(r4, r12, r11, r13, r9)
            androidx.compose.ui.Alignment r9 = X.AnonymousClass7KV.A0E
            r18 = 0
            androidx.compose.ui.Modifier r13 = X.AnonymousClass7Kq.A03(r9, r10, r14)
            X.799 r12 = X.AnonymousClass799.A00(r0)
            boolean r9 = X.C147188nY.A0y(r4, r5)
            r11 = r4
            X.7W3 r11 = (X.AnonymousClass7W3) r11
            java.lang.Object r10 = r11.A13()
            if (r9 != 0) goto L_0x00d5
            java.lang.Object r9 = X.AnonymousClass7GN.A00
            if (r10 != r9) goto L_0x00da
        L_0x00d5:
            r9 = 6
            kotlin.jvm.internal.KtLambdaShape33S0100000_I2_13 r10 = X.AnonymousClass7W3.A0H(r11, r5, r9)
        L_0x00da:
            X.0ZU r9 = X.AnonymousClass7W3.A08(r11, r10, r0)
            androidx.compose.ui.Modifier r12 = X.C117646z1.A01(r13, r12, r9)
            X.6hH r9 = X.C103106Xv.A00
            float r11 = r9.A00
            r9 = 8
            float r10 = (float) r9
            r13 = r10
            r9 = 16
            float r9 = (float) r9
            if (r36 != 0) goto L_0x00f0
            r10 = r9
        L_0x00f0:
            androidx.compose.ui.Modifier r17 = X.AnonymousClass7K4.A05(r12, r11, r13, r9, r10)
            long r29 = X.AnonymousClass7KB.A03(r4)
            r31 = 0
            r24 = 1
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r27 = 6
            r28 = 2552(0x9f8, float:3.576E-42)
            r19 = r18
            r20 = r18
            r21 = r18
            r33 = r0
            r23 = r0
            r25 = r14
            r16 = r4
            X.AnonymousClass7I9.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33)
            goto L_0x006b
        L_0x0115:
            X.687 r10 = X.AnonymousClass687.End
            goto L_0x00a4
        L_0x0118:
            java.lang.String r22 = A00(r4, r7)
            goto L_0x009c
        L_0x011d:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x0059
            boolean r10 = r4.ACZ(r15)
            int r10 = X.C86104wH.A04(r10)
            goto L_0x0058
        L_0x012c:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x0050
            boolean r10 = r4.ACY(r8)
            int r10 = X.C86104wH.A01(r10)
            goto L_0x004f
        L_0x013b:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x0049
            int r10 = X.C147188nY.A0Q(r4, r1)
            goto L_0x0048
        L_0x0146:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            if (r1 != 0) goto L_0x0040
            r1 = r35
            int r1 = X.C147188nY.A0J(r4, r1)
            r9 = r9 | r1
            goto L_0x0040
        L_0x0155:
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0038
            int r1 = X.C147188nY.A0I(r4, r6)
            r9 = r9 | r1
            goto L_0x0038
        L_0x0160:
            r1 = r3 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0032
            r1 = r34
            int r1 = X.C147188nY.A0H(r4, r1)
            r9 = r9 | r1
            goto L_0x0032
        L_0x016d:
            r1 = r34 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x002a
            int r1 = X.C147188nY.A04(r4, r7)
            r9 = r9 | r1
            goto L_0x002a
        L_0x0178:
            r1 = r34 & 14
            if (r1 != 0) goto L_0x0184
            int r9 = X.C147188nY.A09(r4, r5)
            r9 = r9 | r34
            goto L_0x0022
        L_0x0184:
            r9 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BZ.A02(X.8nY, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.67q, X.0ZU, X.8s2, int, int, int, boolean, boolean):void");
    }

    public static final String A00(C147188nY r3, int i) {
        r3.Cvb(379879041);
        String A01 = C120737Cg.A01(C147188nY.A0T(r3).getResources(), Integer.valueOf(i), true);
        C04220Ms.A06(A01);
        String A04 = AnonymousClass7JS.A04(r3, new Object[]{A01}, R.plurals.barcelona_post_like_count, i);
        AnonymousClass7W3.A0z(r3, false);
        return A04;
    }
}
