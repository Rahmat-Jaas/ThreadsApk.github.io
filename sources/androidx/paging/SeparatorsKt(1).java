package androidx.paging;

import X.AnonymousClass00J;
import X.AnonymousClass4WK;
import X.C04220Ms;
import X.C1202779m;
import X.C18180wK;
import X.C18190wL;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public final class SeparatorsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C1202779m r10, X.C146958n9 r11, X.AnonymousClass0YM r12) {
        /*
            r5 = 1
            boolean r0 = r11 instanceof kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2
            if (r0 == 0) goto L_0x00b5
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2) r4
            int r0 = r4.A09
            if (r0 != r5) goto L_0x00b5
            int r2 = r4.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b5
            int r2 = r2 - r1
            r4.A02 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A08
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0079
            if (r0 != r5) goto L_0x00bc
            int r0 = r4.A01
            int r9 = r4.A00
            java.lang.Object r7 = r4.A07
            java.lang.Object r3 = r4.A06
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r2 = r4.A05
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r12 = r4.A04
            X.0YM r12 = (X.AnonymousClass0YM) r12
            java.lang.Object r10 = r4.A03
            X.79m r10 = (X.C1202779m) r10
            X.AnonymousClass0OU.A00(r1)
        L_0x003a:
            if (r1 == 0) goto L_0x0047
            r2.add(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            r3.add(r1)
        L_0x0047:
            r2.add(r7)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            r3.add(r1)
            int r9 = r9 + 1
        L_0x0054:
            if (r9 >= r0) goto L_0x00c1
            java.util.List r8 = r10.A01
            java.lang.Object r7 = r8.get(r9)
            int r1 = r9 + -1
            java.lang.Object r1 = r8.get(r1)
            r4.A03 = r10
            r4.A04 = r12
            r4.A05 = r2
            r4.A06 = r3
            r4.A07 = r7
            r4.A00 = r9
            r4.A01 = r0
            r4.A02 = r5
            java.lang.Object r1 = r12.invoke(r1, r7, r4)
            if (r1 != r6) goto L_0x003a
            return r6
        L_0x0079:
            X.AnonymousClass0OU.A00(r1)
            java.util.List r7 = r10.A01
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00d6
            int r0 = r7.size()
            int r0 = r0 + 4
            java.util.ArrayList r2 = X.C18240wQ.A0k(r0)
            java.util.ArrayList r3 = X.C18240wQ.A0k(r0)
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r7)
            r2.add(r0)
            java.util.List r0 = r10.A02
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r0)
            int r1 = X.AnonymousClass0wJ.A04(r0)
        L_0x00a5:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r3.add(r0)
            int r0 = r7.size()
            r9 = 1
            goto L_0x0054
        L_0x00b3:
            r1 = 0
            goto L_0x00a5
        L_0x00b5:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2
            r4.<init>(r11)
            goto L_0x0017
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00c1:
            int r1 = r2.size()
            java.util.List r0 = r10.A01
            int r0 = r0.size()
            if (r1 == r0) goto L_0x00d6
            int[] r1 = r10.A03
            int r0 = r10.A00
            X.79m r10 = new X.79m
            r10.<init>(r2, r3, r1, r0)
        L_0x00d6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.A00(X.79m, X.8n9, X.0YM):java.lang.Object");
    }

    public static final void A01(C1202779m r6, C1202779m r7, Object obj, List list, int i, int i2) {
        int[] iArr;
        C04220Ms.A0B(list, 0);
        int[] iArr2 = null;
        if (r6 != null) {
            iArr = r6.A03;
        } else {
            iArr = null;
        }
        if (r7 != null) {
            iArr2 = r7.A03;
        }
        if (iArr != null) {
            if (iArr2 != null) {
                int length = iArr.length;
                int length2 = iArr2.length;
                int[] copyOf = Arrays.copyOf(iArr, length + length2);
                System.arraycopy(iArr2, 0, copyOf, length, length2);
                C04220Ms.A06(copyOf);
                LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass4WK.A0N(r3));
                for (int valueOf : copyOf) {
                    linkedHashSet.add(Integer.valueOf(valueOf));
                }
                iArr = AnonymousClass00J.A0m(AnonymousClass00J.A0M(AnonymousClass00J.A0N(linkedHashSet)));
            }
        } else if (iArr2 != null) {
            iArr = iArr2;
        } else {
            throw C18190wL.A0a("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj != null) {
            list.add(new C1202779m(C18180wK.A0n(obj), C18180wK.A0n(Integer.valueOf(i2)), iArr, i));
        }
    }
}
