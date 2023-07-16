package androidx.paging;

import X.AnonymousClass00J;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.C06750aI;
import X.C115476vB;
import X.C1201779c;
import X.C1202779m;
import X.C137898Au;
import X.C86104wH;
import X.C86134wK;
import java.util.List;

public final class SeparatorState {
    public int A00;
    public int A01;
    public C1201779c A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C115476vB A07 = new C115476vB();
    public final List A08 = AnonymousClass0wJ.A0v();
    public final Integer A09;
    public final AnonymousClass0YM A0A;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(androidx.paging.PageEvent$StaticList r11, X.C146958n9 r12) {
        /*
            r10 = this;
            r3 = 0
            boolean r0 = r12 instanceof kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2
            if (r0 == 0) goto L_0x007a
            r8 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2) r8
            int r0 = r8.A09
            if (r0 != r3) goto L_0x007a
            int r2 = r8.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r8.A02 = r2
        L_0x0017:
            java.lang.Object r2 = r8.A07
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A02
            r7 = 1
            if (r0 == 0) goto L_0x0068
            if (r0 != r7) goto L_0x0080
            int r6 = r8.A01
            int r5 = r8.A00
            java.lang.Object r1 = r8.A06
            java.lang.Object r4 = r8.A05
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r11 = r8.A04
            androidx.paging.PageEvent$StaticList r11 = (androidx.paging.PageEvent$StaticList) r11
            java.lang.Object r3 = r8.A03
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            X.AnonymousClass0OU.A00(r2)
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r4.add(r2)
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r4.add(r1)
        L_0x0041:
            if (r5 == r6) goto L_0x0085
            int r5 = r5 + 1
        L_0x0045:
            java.util.List r1 = r11.A02
            int r0 = r5 + -1
            java.lang.Object r2 = X.AnonymousClass00J.A0G(r1, r0)
            java.lang.Object r1 = X.AnonymousClass00J.A0G(r1, r5)
            X.0YM r0 = r3.A0A
            r8.A03 = r3
            r8.A04 = r11
            r8.A05 = r4
            r8.A06 = r1
            r8.A00 = r5
            r8.A01 = r6
            r8.A02 = r7
            java.lang.Object r2 = r0.invoke(r2, r1, r8)
            if (r2 != r9) goto L_0x0037
            return r9
        L_0x0068:
            X.AnonymousClass0OU.A00(r2)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r5 = 0
            java.util.List r0 = r11.A02
            int r6 = r0.size()
            if (r6 < 0) goto L_0x0085
            r3 = r10
            goto L_0x0045
        L_0x007a:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0603000_I2
            r8.<init>(r10, r12, r3)
            goto L_0x0017
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0085:
            X.79c r2 = r11.A01
            X.79c r1 = r11.A00
            androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
            r0.<init>(r2, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A03(androidx.paging.PageEvent$StaticList, X.8n9):java.lang.Object");
    }

    public static final C1202779m A00(C1202779m r7) {
        int i;
        int A0B;
        int[] iArr = r7.A03;
        List list = r7.A01;
        List A17 = C06750aI.A17(AnonymousClass00J.A0C(list), AnonymousClass00J.A0E(list));
        int i2 = r7.A00;
        List list2 = r7.A02;
        if (list2 != null) {
            i = AnonymousClass0wJ.A04(AnonymousClass00J.A0C(list2));
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (list2 != null) {
            A0B = AnonymousClass0wJ.A04(AnonymousClass00J.A0E(list2));
        } else {
            A0B = C86104wH.A0B(list);
        }
        return new C1202779m(A17, C86134wK.A0v(valueOf, A0B), iArr, i2);
    }

    public static void A01(C137898Au r0, Object obj, Object obj2, Object obj3, Object obj4) {
        r0.A0B = obj;
        r0.A0C = obj2;
        r0.A0D = obj3;
        r0.A0E = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: X.79m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v55, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v62, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: X.79m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0215, code lost:
        r20 = r13.A00;
        r14 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021d, code lost:
        if (r14 == null) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021f, code lost:
        r21 = X.AnonymousClass0wJ.A04(X.AnonymousClass00J.A0C(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0227, code lost:
        androidx.paging.SeparatorsKt.A01((X.C1202779m) null, r13, r5, r4, r20, r21);
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0231, code lost:
        if (r8 != 0) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0233, code lost:
        r14 = X.C86134wK.A0A(r12);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0239, code lost:
        r21 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0272, code lost:
        r15.add(r5);
        r13 = r13 + 1;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0277, code lost:
        if (r13 >= r14) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0279, code lost:
        r10.A04 = r0;
        A01(r10, r6, r4, r1, r11);
        r10.A05 = r12;
        r10.A06 = r2;
        r10.A07 = r3;
        r10.A08 = r4;
        r10.A09 = null;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A01 = r13;
        r10.A02 = r14;
        r10.A03 = 3;
        r5 = androidx.paging.SeparatorsKt.A00((X.C1202779m) r6.A05.get(r13), r10, r0.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a6, code lost:
        if (r5 == r9) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a8, code lost:
        r15 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d9, code lost:
        r4.add(r5);
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e2, code lost:
        if (X.C18190wL.A1a(r12.A01) == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e4, code lost:
        r14 = r12;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e9, code lost:
        if (r11.hasNext() == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02eb, code lost:
        r12 = (X.C1202779m) r11.next();
        r14 = r14;
        r5 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f9, code lost:
        if (X.C18190wL.A1a(r5) == false) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02fb, code lost:
        r16 = r0.A0A;
        r15 = X.AnonymousClass00J.A0E(r14.A01);
        r5 = X.AnonymousClass00J.A0C(r5);
        r10.A04 = r0;
        A01(r10, r6, r13, r1, r2);
        r10.A05 = r3;
        r10.A06 = r11;
        r10.A07 = r12;
        r10.A08 = r14;
        r10.A09 = null;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A03 = 6;
        r5 = r16.invoke(r15, r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0326, code lost:
        if (r5 == r9) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0328, code lost:
        r4 = r13;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0329, code lost:
        r13 = r6.A04;
        r16 = r13;
        r15 = X.AnonymousClass67E.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x032f, code lost:
        if (r13 != r15) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0331, code lost:
        r18 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0337, code lost:
        if (r16 != r15) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0339, code lost:
        r13 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033b, code lost:
        if (r13 == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x033d, code lost:
        r13 = X.AnonymousClass00J.A0E(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0341, code lost:
        r19 = X.AnonymousClass0wJ.A04(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0345, code lost:
        androidx.paging.SeparatorsKt.A01(r14, r12, r5, r4, r18, r19);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0353, code lost:
        if (X.C18190wL.A1a(r12.A01) == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0355, code lost:
        r1.add(A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035c, code lost:
        r13 = r0.A0A;
        r10.A04 = r0;
        A01(r10, r6, r4, r1, r2);
        r10.A05 = r3;
        r10.A06 = r11;
        r10.A07 = r12;
        r10.A08 = r14;
        r10.A09 = r4;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A03 = 7;
        r5 = androidx.paging.SeparatorsKt.A00(r12, r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0378, code lost:
        if (r5 == r9) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x037a, code lost:
        r13 = r4;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x037d, code lost:
        r19 = X.C86104wH.A0B(r14.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0384, code lost:
        r13 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0386, code lost:
        if (r13 == null) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0388, code lost:
        r13 = X.AnonymousClass00J.A0C(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x038d, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0390, code lost:
        r18 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0395, code lost:
        r4 = r13;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0397, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x039b, code lost:
        if (r6.A04 != X.AnonymousClass67E.PREPEND) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x039d, code lost:
        r5 = r0.A08;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a3, code lost:
        if (X.C18190wL.A1a(r5) == false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a5, code lost:
        r12 = (X.C1202779m) X.AnonymousClass00J.A0C(r5);
        r14 = r0.A0A;
        X.C04220Ms.A0A(r2);
        r11 = X.AnonymousClass00J.A0E(r2.A01);
        r5 = X.AnonymousClass00J.A0C(r12.A01);
        r10.A04 = r0;
        A01(r10, r6, r13, r1, r2);
        r10.A05 = r3;
        r10.A06 = r12;
        r10.A07 = null;
        r10.A08 = null;
        r10.A09 = null;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A03 = 8;
        r5 = r14.invoke(r11, r5, r10);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03d8, code lost:
        if (r5 != r9) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03da, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03fe, code lost:
        r11 = r2.A00;
        r4 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0402, code lost:
        if (r4 == null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0404, code lost:
        r19 = X.AnonymousClass0wJ.A04(X.AnonymousClass00J.A0E(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040c, code lost:
        androidx.paging.SeparatorsKt.A01(r2, r12, r5, r13, r11, r19);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0417, code lost:
        r12 = r3.intValue() + 1;
        r4 = r6.A05;
        X.C04220Ms.A0B(r4, 0);
        r11 = X.C86104wH.A0B(r4);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0427, code lost:
        if (r12 <= r11) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0429, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042a, code lost:
        if (r7 == false) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042e, code lost:
        if (r0.A04 != false) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0430, code lost:
        r0.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0433, code lost:
        if (r8 == 0) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0435, code lost:
        r2 = (X.C1202779m) X.AnonymousClass00J.A0E(r0.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x043d, code lost:
        r8 = r0.A0A;
        r7 = X.AnonymousClass00J.A0E(r2.A01);
        r10.A04 = r0;
        A01(r10, r6, r4, r1, r2);
        r10.A05 = r4;
        r10.A06 = null;
        r10.A07 = null;
        r10.A08 = null;
        r10.A09 = null;
        r10.A03 = 10;
        r5 = r8.invoke(r7, (java.lang.Object) null, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045d, code lost:
        if (r5 == r9) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x045f, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0462, code lost:
        X.C04220Ms.A0A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0489, code lost:
        r13.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x048c, code lost:
        if (r12 == r11) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x048e, code lost:
        r12 = r12 + 1;
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0491, code lost:
        r4 = r0.A0A;
        r10.A04 = r0;
        A01(r10, r6, r13, r1, r2);
        r10.A05 = r13;
        r10.A06 = null;
        r10.A07 = null;
        r10.A08 = null;
        r10.A09 = null;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A01 = r12;
        r10.A02 = r11;
        r10.A03 = 9;
        r5 = androidx.paging.SeparatorsKt.A00((X.C1202779m) r6.A05.get(r12), r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04bb, code lost:
        if (r5 == r9) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04bd, code lost:
        r4 = r13;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04bf, code lost:
        r19 = X.C86104wH.A0B(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04c7, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04cb, code lost:
        if (r6.A04 != X.AnonymousClass67E.APPEND) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04cd, code lost:
        r13 = r0.A08;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04d3, code lost:
        if (X.C18190wL.A1a(r13) == false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04d5, code lost:
        r13 = (X.C1202779m) X.AnonymousClass00J.A0E(r13);
        r16 = r0.A0A;
        r15 = X.AnonymousClass00J.A0E(r13.A01);
        X.C04220Ms.A0A(r11);
        r14 = X.AnonymousClass00J.A0C(r11.A01);
        r10.A04 = r0;
        A01(r10, r6, r4, r1, r11);
        r10.A05 = r12;
        r10.A06 = r2;
        r10.A07 = r3;
        r10.A08 = r13;
        r10.A09 = null;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A03 = 4;
        r5 = r16.invoke(r15, r14, r10);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x050b, code lost:
        if (r5 != r9) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x050d, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0539, code lost:
        r14 = r11.A00;
        r15 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x053d, code lost:
        if (r15 == null) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x053f, code lost:
        r20 = X.AnonymousClass0wJ.A04(X.AnonymousClass00J.A0C(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0547, code lost:
        androidx.paging.SeparatorsKt.A01(r13, r11, r5, r4, r14, r20);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0553, code lost:
        X.C04220Ms.A0A(r11);
        r1.add(A00(r11));
        r13 = r0.A0A;
        r10.A04 = r0;
        A01(r10, r6, r4, r1, r12);
        r10.A05 = r2;
        r10.A06 = r3;
        r10.A07 = r4;
        r10.A08 = null;
        r10.A09 = null;
        r10.A0A = r7;
        r10.A00 = r8;
        r10.A03 = 5;
        r5 = androidx.paging.SeparatorsKt.A00(r11, r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x057a, code lost:
        if (r5 == r9) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x057c, code lost:
        r13 = r4;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x057e, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05a8, code lost:
        r4.add(r5);
        r11 = r6.A05.subList(r12.intValue(), X.C86134wK.A0A(r3) + 1).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05c3, code lost:
        if (r11.hasNext() == false) goto L_0x05cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05c5, code lost:
        r13 = r13;
        r14 = r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d5, code lost:
        throw X.C86134wK.A0s(X.C18170wI.A00(122));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05f1, code lost:
        r7 = r2.A00;
        r3 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05f6, code lost:
        if (r3 == null) goto L_0x062d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05f8, code lost:
        r14 = X.AnonymousClass0wJ.A04(X.AnonymousClass00J.A0E(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0600, code lost:
        androidx.paging.SeparatorsKt.A01(r2, (X.C1202779m) null, r5, r8, r7, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0607, code lost:
        r0.A03 = false;
        r0.A06 = false;
        r3 = r6.A04;
        r2 = X.AnonymousClass67E.APPEND;
        r0 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0612, code lost:
        if (r3 != r2) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0614, code lost:
        r0.addAll(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0628, code lost:
        return new androidx.paging.PageEvent$Insert(r6.A03, r6.A02, r3, r4, r6.A01, r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0629, code lost:
        r0.addAll(0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x062d, code lost:
        r14 = X.C86104wH.A0B(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0641, code lost:
        r0.A03 = r7;
        r0.A06 = r7;
        r0.A05 = r1;
        r0.A04 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0649, code lost:
        if (r5 != null) goto L_0x064f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x064b, code lost:
        X.C04220Ms.A0B(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x064e, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x067c, code lost:
        return new androidx.paging.PageEvent$Insert(r6.A03, r6.A02, r6.A04, X.C18180wK.A0n(new X.C1202779m(X.C18180wK.A0n(r5), X.C18180wK.A0n(java.lang.Integer.valueOf(r7)), new int[]{r7}, r7)), r6.A01, r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0177, code lost:
        if (r7 != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017f, code lost:
        if (r13 != false) goto L_0x0181;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r7v0, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(androidx.paging.PageEvent$Insert r23, X.C146958n9 r24) {
        /*
            r22 = this;
            r3 = r24
            r6 = r23
            boolean r0 = r3 instanceof X.C137898Au
            r14 = r22
            if (r0 == 0) goto L_0x0026
            r10 = r3
            X.8Au r10 = (X.C137898Au) r10
            int r2 = r10.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r10.A03 = r2
        L_0x0018:
            java.lang.Object r5 = r10.A0F
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0634;
                case 2: goto L_0x0059;
                case 3: goto L_0x0243;
                case 4: goto L_0x050e;
                case 5: goto L_0x0581;
                case 6: goto L_0x002c;
                case 7: goto L_0x02aa;
                case 8: goto L_0x03db;
                case 9: goto L_0x0466;
                case 10: goto L_0x05d6;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0026:
            X.8Au r10 = new X.8Au
            r10.<init>(r14, r3)
            goto L_0x0018
        L_0x002c:
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r14 = r10.A08
            X.79m r14 = (X.C1202779m) r14
            java.lang.Object r12 = r10.A07
            X.79m r12 = (X.C1202779m) r12
            java.lang.Object r11 = r10.A06
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r3 = r10.A05
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A0E
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r1 = r10.A0D
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r4 = r10.A0C
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
            goto L_0x0329
        L_0x0059:
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r4 = r10.A09
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r13 = r10.A08
            X.79m r13 = (X.C1202779m) r13
            java.lang.Object r3 = r10.A07
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A06
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r12 = r10.A05
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r11 = r10.A0E
            X.79m r11 = (X.C1202779m) r11
            java.lang.Object r1 = r10.A0D
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r15 = r10.A0C
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
            goto L_0x0215
        L_0x008a:
            X.AnonymousClass0OU.A00(r5)
            java.lang.Integer r4 = r14.A09
            r3 = 0
            boolean r5 = X.AnonymousClass0wJ.A1Z(r6, r4)
            X.67E r2 = r6.A04
            X.67E r1 = X.AnonymousClass67E.APPEND
            if (r2 != r1) goto L_0x00fa
            boolean r13 = r14.A06
        L_0x009c:
            X.C04220Ms.A0B(r4, r5)
            X.67E r11 = X.AnonymousClass67E.PREPEND
            if (r2 != r11) goto L_0x00db
            boolean r7 = r14.A03
        L_0x00a5:
            java.util.List r15 = r6.A05
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x00c1
        L_0x00b1:
            r8 = 1
        L_0x00b2:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x0119
            if (r2 != r11) goto L_0x0119
            if (r8 != 0) goto L_0x0119
            java.lang.String r0 = "Additional prepend event after prepend state is done"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00c1:
            java.util.Iterator r3 = r15.iterator()
        L_0x00c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r3.next()
            X.79m r0 = (X.C1202779m) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c5
            r8 = 0
            goto L_0x00b2
        L_0x00db:
            int r4 = r4.intValue()
            r7 = 0
            X.79c r0 = r6.A03
            X.6bS r0 = r0.A00
            if (r4 == r3) goto L_0x00e9
            boolean r7 = r0.A00
            goto L_0x00a5
        L_0x00e9:
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00a5
            X.79c r0 = r6.A02
            if (r0 == 0) goto L_0x00f8
            X.6bS r0 = r0.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00f8
            goto L_0x00a5
        L_0x00f8:
            r7 = 1
            goto L_0x00a5
        L_0x00fa:
            int r7 = r4.intValue()
            r13 = 0
            X.79c r0 = r6.A03
            X.6bS r0 = r0.A01
            if (r7 == r3) goto L_0x0108
            boolean r13 = r0.A00
            goto L_0x009c
        L_0x0108:
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x009c
            X.79c r0 = r6.A02
            if (r0 == 0) goto L_0x0117
            X.6bS r0 = r0.A01
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0117
            goto L_0x009c
        L_0x0117:
            r13 = 1
            goto L_0x009c
        L_0x0119:
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x0128
            if (r2 != r1) goto L_0x0128
            if (r8 != 0) goto L_0x0128
            java.lang.String r0 = "Additional append event after append state is done"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0128:
            X.6vB r3 = r14.A07
            X.79c r0 = r6.A03
            r3.A03(r0)
            X.79c r0 = r6.A02
            r14.A02 = r0
            if (r2 == r1) goto L_0x0139
            int r0 = r6.A01
            r14.A01 = r0
        L_0x0139:
            if (r2 == r11) goto L_0x013f
            int r0 = r6.A00
            r14.A00 = r0
        L_0x013f:
            if (r8 == 0) goto L_0x0188
            if (r13 != 0) goto L_0x0146
            if (r7 != 0) goto L_0x0146
        L_0x0145:
            return r23
        L_0x0146:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x014f
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x014f
            return r23
        L_0x014f:
            java.util.List r0 = r14.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0188
            if (r13 == 0) goto L_0x0177
            if (r7 == 0) goto L_0x0181
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0179
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0179
            X.0YM r2 = r14.A0A
            r10.A04 = r14
            r10.A0B = r6
            r1 = 1
            r10.A03 = r5
            r0 = 0
            java.lang.Object r5 = r2.invoke(r0, r0, r10)
            if (r5 == r9) goto L_0x050d
            r0 = r14
            r7 = 0
            goto L_0x0641
        L_0x0177:
            if (r7 == 0) goto L_0x0145
        L_0x0179:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x017f
            r14.A03 = r5
        L_0x017f:
            if (r13 == 0) goto L_0x0145
        L_0x0181:
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0145
            r14.A06 = r5
            return r23
        L_0x0188:
            java.util.ArrayList r4 = X.C18200wM.A0t(r15)
            java.util.ArrayList r1 = X.C18200wM.A0t(r15)
            if (r8 != 0) goto L_0x01cc
            r2 = 0
        L_0x0193:
            int r0 = X.C86104wH.A0B(r15)
            if (r2 >= r0) goto L_0x01aa
            java.lang.Object r0 = r15.get(r2)
            X.79m r0 = (X.C1202779m) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01aa
            int r2 = r2 + 1
            goto L_0x0193
        L_0x01aa:
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r2)
            java.lang.Object r11 = r15.get(r2)
            X.79m r11 = (X.C1202779m) r11
            int r2 = X.C86104wH.A0B(r15)
        L_0x01b9:
            if (r2 <= 0) goto L_0x01d1
            java.lang.Object r0 = r15.get(r2)
            X.79m r0 = (X.C1202779m) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01d1
            int r2 = r2 + -1
            goto L_0x01b9
        L_0x01cc:
            r11 = 0
            r12 = 0
            r2 = 0
            r3 = 0
            goto L_0x01dc
        L_0x01d1:
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            java.lang.Object r2 = r15.get(r2)
            X.79m r2 = (X.C1202779m) r2
        L_0x01dc:
            if (r13 == 0) goto L_0x0241
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0241
            r14.A05 = r5
            if (r8 == 0) goto L_0x023c
            java.util.List r0 = r14.A08
            java.lang.Object r13 = X.AnonymousClass00J.A0C(r0)
            X.79m r13 = (X.C1202779m) r13
        L_0x01ee:
            X.0YM r15 = r14.A0A
            java.util.List r0 = r13.A01
            java.lang.Object r5 = X.AnonymousClass00J.A0C(r0)
            r10.A04 = r14
            A01(r10, r6, r4, r1, r11)
            r10.A05 = r12
            r10.A06 = r2
            r10.A07 = r3
            r10.A08 = r13
            r10.A09 = r4
            r10.A0A = r7
            r10.A00 = r8
            r0 = 2
            r10.A03 = r0
            r0 = 0
            java.lang.Object r5 = r15.invoke(r0, r5, r10)
            if (r5 == r9) goto L_0x050d
            r0 = r14
            r15 = r4
        L_0x0215:
            r16 = 0
            int r14 = r13.A00
            r20 = r14
            java.util.List r14 = r13.A02
            if (r14 == 0) goto L_0x0239
            java.lang.Object r14 = X.AnonymousClass00J.A0C(r14)
            int r21 = X.AnonymousClass0wJ.A04(r14)
        L_0x0227:
            r17 = r13
            r18 = r5
            r19 = r4
            androidx.paging.SeparatorsKt.A01(r16, r17, r18, r19, r20, r21)
            r4 = r15
        L_0x0231:
            if (r8 != 0) goto L_0x042a
            int r14 = X.C86134wK.A0A(r12)
            r13 = 0
            goto L_0x0277
        L_0x0239:
            r21 = 0
            goto L_0x0227
        L_0x023c:
            X.C04220Ms.A0A(r11)
            r13 = r11
            goto L_0x01ee
        L_0x0241:
            r0 = r14
            goto L_0x0231
        L_0x0243:
            int r14 = r10.A02
            int r13 = r10.A01
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r15 = r10.A08
            java.util.AbstractCollection r15 = (java.util.AbstractCollection) r15
            java.lang.Object r3 = r10.A07
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A06
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r12 = r10.A05
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r11 = r10.A0E
            X.79m r11 = (X.C1202779m) r11
            java.lang.Object r1 = r10.A0D
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r4 = r10.A0C
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x0272:
            r15.add(r5)
            int r13 = r13 + 1
        L_0x0277:
            if (r13 >= r14) goto L_0x04c7
            java.util.List r5 = r6.A05
            java.lang.Object r15 = r5.get(r13)
            X.79m r15 = (X.C1202779m) r15
            X.0YM r5 = r0.A0A
            r16 = r5
            r10.A04 = r0
            A01(r10, r6, r4, r1, r11)
            r10.A05 = r12
            r10.A06 = r2
            r10.A07 = r3
            r10.A08 = r4
            r5 = 0
            r10.A09 = r5
            r10.A0A = r7
            r10.A00 = r8
            r10.A01 = r13
            r10.A02 = r14
            r5 = 3
            r10.A03 = r5
            r5 = r16
            java.lang.Object r5 = androidx.paging.SeparatorsKt.A00(r15, r10, r5)
            if (r5 == r9) goto L_0x050d
            r15 = r4
            goto L_0x0272
        L_0x02aa:
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r4 = r10.A09
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            java.lang.Object r14 = r10.A08
            X.79m r14 = (X.C1202779m) r14
            java.lang.Object r12 = r10.A07
            X.79m r12 = (X.C1202779m) r12
            java.lang.Object r11 = r10.A06
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r3 = r10.A05
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A0E
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r1 = r10.A0D
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r13 = r10.A0C
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x02d9:
            r4.add(r5)
            java.util.List r4 = r12.A01
            boolean r4 = X.C18190wL.A1a(r4)
            if (r4 == 0) goto L_0x02e5
            r14 = r12
        L_0x02e5:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0397
            java.lang.Object r12 = r11.next()
            X.79m r12 = (X.C1202779m) r12
            X.79m r14 = (X.C1202779m) r14
            java.util.List r5 = r12.A01
            boolean r4 = X.C18190wL.A1a(r5)
            if (r4 == 0) goto L_0x0395
            X.0YM r4 = r0.A0A
            r16 = r4
            java.util.List r4 = r14.A01
            java.lang.Object r15 = X.AnonymousClass00J.A0E(r4)
            java.lang.Object r5 = X.AnonymousClass00J.A0C(r5)
            r10.A04 = r0
            A01(r10, r6, r13, r1, r2)
            r10.A05 = r3
            r10.A06 = r11
            r10.A07 = r12
            r10.A08 = r14
            r4 = 0
            r10.A09 = r4
            r10.A0A = r7
            r10.A00 = r8
            r4 = 6
            r10.A03 = r4
            r4 = r16
            java.lang.Object r5 = r4.invoke(r15, r5, r10)
            if (r5 == r9) goto L_0x050d
            r4 = r13
        L_0x0329:
            X.67E r13 = r6.A04
            r16 = r13
            X.67E r15 = X.AnonymousClass67E.PREPEND
            if (r13 != r15) goto L_0x0390
            int r13 = r14.A00
            r18 = r13
        L_0x0335:
            r13 = r16
            if (r13 != r15) goto L_0x0384
            java.util.List r13 = r14.A02
            if (r13 == 0) goto L_0x037d
            java.lang.Object r13 = X.AnonymousClass00J.A0E(r13)
        L_0x0341:
            int r19 = X.AnonymousClass0wJ.A04(r13)
        L_0x0345:
            r15 = r12
            r16 = r5
            r17 = r4
            androidx.paging.SeparatorsKt.A01(r14, r15, r16, r17, r18, r19)
        L_0x034d:
            java.util.List r5 = r12.A01
            boolean r5 = X.C18190wL.A1a(r5)
            if (r5 == 0) goto L_0x035c
            X.79m r5 = A00(r12)
            r1.add(r5)
        L_0x035c:
            X.0YM r13 = r0.A0A
            r10.A04 = r0
            A01(r10, r6, r4, r1, r2)
            r10.A05 = r3
            r10.A06 = r11
            r10.A07 = r12
            r10.A08 = r14
            r10.A09 = r4
            r10.A0A = r7
            r10.A00 = r8
            r5 = 7
            r10.A03 = r5
            java.lang.Object r5 = androidx.paging.SeparatorsKt.A00(r12, r10, r13)
            if (r5 == r9) goto L_0x050d
            r13 = r4
            goto L_0x02d9
        L_0x037d:
            java.util.List r13 = r14.A01
            int r19 = X.C86104wH.A0B(r13)
            goto L_0x0345
        L_0x0384:
            java.util.List r13 = r12.A02
            if (r13 == 0) goto L_0x038d
            java.lang.Object r13 = X.AnonymousClass00J.A0C(r13)
            goto L_0x0341
        L_0x038d:
            r19 = 0
            goto L_0x0345
        L_0x0390:
            int r13 = r12.A00
            r18 = r13
            goto L_0x0335
        L_0x0395:
            r4 = r13
            goto L_0x034d
        L_0x0397:
            X.67E r5 = r6.A04
            X.67E r4 = X.AnonymousClass67E.PREPEND
            if (r5 != r4) goto L_0x0417
            java.util.List r5 = r0.A08
            boolean r4 = X.C18190wL.A1a(r5)
            if (r4 == 0) goto L_0x0417
            java.lang.Object r12 = X.AnonymousClass00J.A0C(r5)
            X.79m r12 = (X.C1202779m) r12
            X.0YM r14 = r0.A0A
            X.C04220Ms.A0A(r2)
            java.util.List r4 = r2.A01
            java.lang.Object r11 = X.AnonymousClass00J.A0E(r4)
            java.util.List r4 = r12.A01
            java.lang.Object r5 = X.AnonymousClass00J.A0C(r4)
            r10.A04 = r0
            A01(r10, r6, r13, r1, r2)
            r10.A05 = r3
            r10.A06 = r12
            r4 = 0
            r10.A07 = r4
            r10.A08 = r4
            r10.A09 = r4
            r10.A0A = r7
            r10.A00 = r8
            r4 = 8
            r10.A03 = r4
            java.lang.Object r5 = r14.invoke(r11, r5, r10)
            if (r5 != r9) goto L_0x03fe
            return r9
        L_0x03db:
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r12 = r10.A06
            X.79m r12 = (X.C1202779m) r12
            java.lang.Object r3 = r10.A05
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A0E
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r1 = r10.A0D
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r13 = r10.A0C
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x03fe:
            int r11 = r2.A00
            java.util.List r4 = r2.A02
            if (r4 == 0) goto L_0x04bf
            java.lang.Object r4 = X.AnonymousClass00J.A0E(r4)
            int r19 = X.AnonymousClass0wJ.A04(r4)
        L_0x040c:
            r14 = r2
            r15 = r12
            r16 = r5
            r17 = r13
            r18 = r11
            androidx.paging.SeparatorsKt.A01(r14, r15, r16, r17, r18, r19)
        L_0x0417:
            int r3 = r3.intValue()
            int r12 = r3 + 1
            java.util.List r4 = r6.A05
            r3 = 0
            X.C04220Ms.A0B(r4, r3)
            int r11 = X.C86104wH.A0B(r4)
            if (r12 <= r11) goto L_0x0491
            r4 = r13
        L_0x042a:
            if (r7 == 0) goto L_0x0607
            boolean r3 = r0.A04
            if (r3 != 0) goto L_0x0607
            r3 = 1
            r0.A04 = r3
            if (r8 == 0) goto L_0x0462
            java.util.List r2 = r0.A08
            java.lang.Object r2 = X.AnonymousClass00J.A0E(r2)
            X.79m r2 = (X.C1202779m) r2
        L_0x043d:
            X.0YM r8 = r0.A0A
            java.util.List r3 = r2.A01
            java.lang.Object r7 = X.AnonymousClass00J.A0E(r3)
            r10.A04 = r0
            A01(r10, r6, r4, r1, r2)
            r10.A05 = r4
            r5 = 0
            r10.A06 = r5
            r10.A07 = r5
            r10.A08 = r5
            r10.A09 = r5
            r3 = 10
            r10.A03 = r3
            java.lang.Object r5 = r8.invoke(r7, r5, r10)
            if (r5 == r9) goto L_0x050d
            r8 = r4
            goto L_0x05f1
        L_0x0462:
            X.C04220Ms.A0A(r2)
            goto L_0x043d
        L_0x0466:
            int r11 = r10.A02
            int r12 = r10.A01
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r13 = r10.A05
            java.util.AbstractCollection r13 = (java.util.AbstractCollection) r13
            java.lang.Object r2 = r10.A0E
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r1 = r10.A0D
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r4 = r10.A0C
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x0489:
            r13.add(r5)
            if (r12 == r11) goto L_0x042a
            int r12 = r12 + 1
            r13 = r4
        L_0x0491:
            java.util.List r3 = r6.A05
            java.lang.Object r5 = r3.get(r12)
            X.79m r5 = (X.C1202779m) r5
            X.0YM r4 = r0.A0A
            r10.A04 = r0
            A01(r10, r6, r13, r1, r2)
            r10.A05 = r13
            r3 = 0
            r10.A06 = r3
            r10.A07 = r3
            r10.A08 = r3
            r10.A09 = r3
            r10.A0A = r7
            r10.A00 = r8
            r10.A01 = r12
            r10.A02 = r11
            r3 = 9
            r10.A03 = r3
            java.lang.Object r5 = androidx.paging.SeparatorsKt.A00(r5, r10, r4)
            if (r5 == r9) goto L_0x050d
            r4 = r13
            goto L_0x0489
        L_0x04bf:
            java.util.List r4 = r2.A01
            int r19 = X.C86104wH.A0B(r4)
            goto L_0x040c
        L_0x04c7:
            X.67E r13 = r6.A04
            X.67E r5 = X.AnonymousClass67E.APPEND
            if (r13 != r5) goto L_0x0553
            java.util.List r13 = r0.A08
            boolean r5 = X.C18190wL.A1a(r13)
            if (r5 == 0) goto L_0x0553
            java.lang.Object r13 = X.AnonymousClass00J.A0E(r13)
            X.79m r13 = (X.C1202779m) r13
            X.0YM r5 = r0.A0A
            r16 = r5
            java.util.List r5 = r13.A01
            java.lang.Object r15 = X.AnonymousClass00J.A0E(r5)
            X.C04220Ms.A0A(r11)
            java.util.List r5 = r11.A01
            java.lang.Object r14 = X.AnonymousClass00J.A0C(r5)
            r10.A04 = r0
            A01(r10, r6, r4, r1, r11)
            r10.A05 = r12
            r10.A06 = r2
            r10.A07 = r3
            r10.A08 = r13
            r5 = 0
            r10.A09 = r5
            r10.A0A = r7
            r10.A00 = r8
            r5 = 4
            r10.A03 = r5
            r5 = r16
            java.lang.Object r5 = r5.invoke(r15, r14, r10)
            if (r5 != r9) goto L_0x0539
        L_0x050d:
            return r9
        L_0x050e:
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r13 = r10.A08
            X.79m r13 = (X.C1202779m) r13
            java.lang.Object r3 = r10.A07
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A06
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r12 = r10.A05
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r11 = r10.A0E
            X.79m r11 = (X.C1202779m) r11
            java.lang.Object r1 = r10.A0D
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r4 = r10.A0C
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x0539:
            int r14 = r11.A00
            java.util.List r15 = r11.A02
            if (r15 == 0) goto L_0x057e
            java.lang.Object r15 = X.AnonymousClass00J.A0C(r15)
            int r20 = X.AnonymousClass0wJ.A04(r15)
        L_0x0547:
            r15 = r13
            r16 = r11
            r17 = r5
            r18 = r4
            r19 = r14
            androidx.paging.SeparatorsKt.A01(r15, r16, r17, r18, r19, r20)
        L_0x0553:
            X.C04220Ms.A0A(r11)
            X.79m r5 = A00(r11)
            r1.add(r5)
            X.0YM r13 = r0.A0A
            r10.A04 = r0
            A01(r10, r6, r4, r1, r12)
            r10.A05 = r2
            r10.A06 = r3
            r10.A07 = r4
            r5 = 0
            r10.A08 = r5
            r10.A09 = r5
            r10.A0A = r7
            r10.A00 = r8
            r5 = 5
            r10.A03 = r5
            java.lang.Object r5 = androidx.paging.SeparatorsKt.A00(r11, r10, r13)
            if (r5 == r9) goto L_0x050d
            r13 = r4
            goto L_0x05a8
        L_0x057e:
            r20 = 0
            goto L_0x0547
        L_0x0581:
            int r8 = r10.A00
            boolean r7 = r10.A0A
            java.lang.Object r4 = r10.A07
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            java.lang.Object r3 = r10.A06
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r10.A05
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r12 = r10.A0E
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r1 = r10.A0D
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r13 = r10.A0C
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x05a8:
            r4.add(r5)
            java.util.List r11 = r6.A05
            int r5 = r12.intValue()
            int r4 = X.C86134wK.A0A(r3)
            int r4 = r4 + 1
            java.util.List r4 = r11.subList(r5, r4)
            java.util.Iterator r11 = r4.iterator()
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x05cb
            java.lang.Object r14 = r11.next()
            goto L_0x02e5
        L_0x05cb:
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        L_0x05d6:
            java.lang.Object r8 = r10.A05
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r10.A0E
            X.79m r2 = (X.C1202779m) r2
            java.lang.Object r1 = r10.A0D
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r4 = r10.A0C
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
        L_0x05f1:
            r10 = 0
            int r7 = r2.A00
            java.util.List r3 = r2.A02
            if (r3 == 0) goto L_0x062d
            java.lang.Object r3 = X.AnonymousClass00J.A0E(r3)
            int r14 = X.AnonymousClass0wJ.A04(r3)
        L_0x0600:
            r9 = r2
            r11 = r5
            r12 = r8
            r13 = r7
            androidx.paging.SeparatorsKt.A01(r9, r10, r11, r12, r13, r14)
        L_0x0607:
            r5 = 0
            r0.A03 = r5
            r0.A06 = r5
            X.67E r3 = r6.A04
            X.67E r2 = X.AnonymousClass67E.APPEND
            java.util.List r0 = r0.A08
            if (r3 != r2) goto L_0x0629
            r0.addAll(r1)
        L_0x0617:
            int r1 = r6.A01
            int r0 = r6.A00
            X.79c r7 = r6.A03
            X.79c r8 = r6.A02
            androidx.paging.PageEvent$Insert r6 = new androidx.paging.PageEvent$Insert
            r11 = r1
            r12 = r0
            r9 = r3
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0629:
            r0.addAll(r5, r1)
            goto L_0x0617
        L_0x062d:
            java.util.List r3 = r2.A01
            int r14 = X.C86104wH.A0B(r3)
            goto L_0x0600
        L_0x0634:
            java.lang.Object r6 = r10.A0B
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent$Insert) r6
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.AnonymousClass0OU.A00(r5)
            r7 = 0
            r1 = 1
        L_0x0641:
            r0.A03 = r7
            r0.A06 = r7
            r0.A05 = r1
            r0.A04 = r1
            if (r5 != 0) goto L_0x064f
            X.C04220Ms.A0B(r6, r7)
            return r6
        L_0x064f:
            X.67E r4 = r6.A04
            int[] r3 = new int[]{r7}
            java.util.List r2 = X.C18180wK.A0n(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.util.List r1 = X.C18180wK.A0n(r0)
            X.79m r0 = new X.79m
            r0.<init>(r2, r1, r3, r7)
            java.util.List r10 = X.C18180wK.A0n(r0)
            int r3 = r6.A01
            int r2 = r6.A00
            X.79c r1 = r6.A03
            X.79c r0 = r6.A02
            androidx.paging.PageEvent$Insert r6 = new androidx.paging.PageEvent$Insert
            r9 = r4
            r11 = r3
            r12 = r2
            r7 = r1
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A02(androidx.paging.PageEvent$Insert, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        if (r0 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C113226qx r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r4 = 19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r4, r14)
            if (r0 == 0) goto L_0x002c
            r1 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r1 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x002c
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0016:
            java.lang.Object r6 = r1.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r1.A00
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x0031
            if (r0 == r4) goto L_0x0031
            if (r0 == r5) goto L_0x0031
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x002c:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r1 = X.C86164wN.A0n(r12, r14, r4)
            goto L_0x0016
        L_0x0031:
            java.lang.Object r1 = r1.A01
            androidx.paging.SeparatorState r1 = (androidx.paging.SeparatorState) r1
            X.AnonymousClass0OU.A00(r6)
            goto L_0x0089
        L_0x0039:
            X.AnonymousClass0OU.A00(r6)
            boolean r0 = r13 instanceof androidx.paging.PageEvent$Insert
            if (r0 == 0) goto L_0x004d
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent$Insert) r13
            r1.A01 = r12
            r1.A00 = r3
            java.lang.Object r6 = r12.A02(r13, r1)
        L_0x004a:
            if (r6 != r2) goto L_0x0088
            return r2
        L_0x004d:
            boolean r0 = r13 instanceof X.AnonymousClass59N
            if (r0 == 0) goto L_0x00aa
            X.59N r13 = (X.AnonymousClass59N) r13
            r4 = 0
            X.C04220Ms.A0B(r13, r4)
            X.6vB r1 = r12.A07
            X.67E r3 = r13.A03
            X.59K r0 = X.AnonymousClass59K.A01
            r1.A02(r0, r3)
            X.67E r1 = X.AnonymousClass67E.PREPEND
            if (r3 != r1) goto L_0x009f
            int r0 = r13.A02
            r12.A01 = r0
            r12.A05 = r4
        L_0x006a:
            java.util.List r2 = r12.A08
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0076
            if (r3 != r1) goto L_0x009c
            r12.A06 = r4
        L_0x0076:
            int r1 = r13.A01
            int r0 = r13.A00
            X.8bH r1 = X.AnonymousClass8bH.A02(r1, r0)
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3 r0 = X.C86164wN.A0q(r1, r0)
            X.C000300e.A0v(r0, r2)
            r6 = r13
        L_0x0088:
            r1 = r12
        L_0x0089:
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0124
            java.util.List r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "deferred endTerm, page stash should be empty"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x009c:
            r12.A03 = r4
            goto L_0x0076
        L_0x009f:
            X.67E r0 = X.AnonymousClass67E.APPEND
            if (r3 != r0) goto L_0x006a
            int r0 = r13.A02
            r12.A00 = r0
            r12.A04 = r4
            goto L_0x006a
        L_0x00aa:
            boolean r0 = r13 instanceof X.AnonymousClass59L
            if (r0 == 0) goto L_0x0114
            X.59L r13 = (X.AnonymousClass59L) r13
            r1.A01 = r12
            r1.A00 = r4
            X.79c r5 = r12.A02
            X.6vB r3 = r12.A07
            X.79c r0 = r3.A01()
            X.79c r6 = r13.A01
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 == 0) goto L_0x00cf
            X.79c r0 = r13.A00
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 == 0) goto L_0x00cf
        L_0x00cc:
            r6 = r13
            goto L_0x004a
        L_0x00cf:
            r3.A03(r6)
            X.79c r7 = r13.A00
            r12.A02 = r7
            r0 = 0
            if (r7 == 0) goto L_0x00cc
            X.6bS r4 = r7.A01
            boolean r3 = r4.A00
            if (r3 == 0) goto L_0x00fc
            if (r5 == 0) goto L_0x00fa
            X.6bS r3 = r5.A01
        L_0x00e3:
            boolean r3 = X.C04220Ms.A0I(r3, r4)
            if (r3 != 0) goto L_0x00fc
            X.0ZV r9 = X.AnonymousClass0ZV.A00
            int r10 = r12.A01
            X.67E r8 = X.AnonymousClass67E.PREPEND
            r11 = -1
        L_0x00f0:
            androidx.paging.PageEvent$Insert r5 = new androidx.paging.PageEvent$Insert
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = r12.A02(r5, r1)
            goto L_0x00cc
        L_0x00fa:
            r3 = r0
            goto L_0x00e3
        L_0x00fc:
            X.6bS r4 = r7.A00
            boolean r3 = r4.A00
            if (r3 == 0) goto L_0x00cc
            if (r5 == 0) goto L_0x0106
            X.6bS r0 = r5.A00
        L_0x0106:
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 != 0) goto L_0x00cc
            X.0ZV r9 = X.AnonymousClass0ZV.A00
            int r11 = r12.A00
            X.67E r8 = X.AnonymousClass67E.APPEND
            r10 = -1
            goto L_0x00f0
        L_0x0114:
            boolean r0 = r13 instanceof androidx.paging.PageEvent$StaticList
            if (r0 == 0) goto L_0x0138
            androidx.paging.PageEvent$StaticList r13 = (androidx.paging.PageEvent$StaticList) r13
            r1.A01 = r12
            r1.A00 = r5
            java.lang.Object r6 = r12.A03(r13, r1)
            goto L_0x004a
        L_0x0124:
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0137
            java.util.List r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "deferred startTerm, page stash should be empty"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0137:
            return r6
        L_0x0138:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A04(X.6qx, X.8n9):java.lang.Object");
    }

    public SeparatorState(Integer num, AnonymousClass0YM r3) {
        this.A09 = num;
        this.A0A = r3;
    }
}
