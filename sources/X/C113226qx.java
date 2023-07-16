package X;

/* renamed from: X.6qx  reason: invalid class name and case insensitive filesystem */
public abstract class C113226qx {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r18, X.AnonymousClass0YP r19) {
        /*
            r17 = this;
            r1 = r17
            r14 = r19
            boolean r0 = r1 instanceof androidx.paging.PageEvent$StaticList
            r5 = r18
            if (r0 == 0) goto L_0x008d
            r2 = r1
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            r4 = 0
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2.A00(r4, r5)
            if (r0 == 0) goto L_0x0076
            r6 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0076
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x0022:
            java.lang.Object r0 = r6.A06
            X.D0E r15 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r5 = 1
            if (r1 == 0) goto L_0x0068
            if (r1 != r5) goto L_0x0088
            java.lang.Object r1 = r6.A05
            java.lang.Object r4 = r6.A04
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r6.A03
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r14 = r6.A02
            X.0YP r14 = (X.AnonymousClass0YP) r14
            java.lang.Object r2 = r6.A01
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x0042:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x004b
            r3.add(r1)
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = r4.next()
            r6.A01 = r2
            r6.A02 = r14
            r6.A03 = r3
            r6.A04 = r4
            r6.A05 = r1
            r6.A00 = r5
            java.lang.Object r0 = r14.invoke(r1, r6)
            if (r0 != r15) goto L_0x0042
            return r15
        L_0x0068:
            X.AnonymousClass0OU.A00(r0)
            java.util.List r0 = r2.A02
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r0.iterator()
            goto L_0x004b
        L_0x0076:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2
            r6.<init>(r2, r5, r4)
            goto L_0x0022
        L_0x007c:
            java.util.List r3 = (java.util.List) r3
            X.79c r1 = r2.A01
            X.79c r0 = r2.A00
            androidx.paging.PageEvent$StaticList r15 = new androidx.paging.PageEvent$StaticList
            r15.<init>(r1, r0, r3)
            return r15
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x008d:
            boolean r0 = r1 instanceof androidx.paging.PageEvent$Insert
            if (r0 == 0) goto L_0x0197
            r3 = r1
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent$Insert) r3
            r4 = 0
            boolean r0 = r5 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2
            if (r0 == 0) goto L_0x0174
            r13 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2 r13 = (kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2) r13
            int r0 = r13.A0G
            if (r0 != r4) goto L_0x0174
            int r2 = r13.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0174
            int r2 = r2 - r1
            r13.A02 = r2
        L_0x00ab:
            java.lang.Object r0 = r13.A06
            X.D0E r15 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r13.A02
            r16 = 1
            if (r2 == 0) goto L_0x013b
            r1 = r16
            if (r2 != r1) goto L_0x017b
            int r12 = r13.A01
            int r11 = r13.A00
            java.lang.Object r10 = r13.A08
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r2 = r13.A05
            java.lang.Object r9 = r13.A0F
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r8 = r13.A0E
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r13.A0D
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r13.A0C
            X.79m r1 = (X.C1202779m) r1
            java.lang.Object r6 = r13.A0B
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r13.A0A
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r4 = r13.A09
            X.67E r4 = (X.AnonymousClass67E) r4
            java.lang.Object r3 = r13.A04
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent$Insert) r3
            java.lang.Object r14 = r13.A03
            X.0YP r14 = (X.AnonymousClass0YP) r14
            X.AnonymousClass0OU.A00(r0)
        L_0x00ea:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0107
            r7.add(r2)
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r0.get(r12)
            int r12 = X.AnonymousClass0wJ.A04(r0)
        L_0x00ff:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            r8.add(r0)
        L_0x0107:
            r12 = r11
        L_0x0108:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r2 = r9.next()
            int r11 = r12 + 1
            if (r12 >= 0) goto L_0x011b
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x011b:
            r13.A03 = r14
            r13.A04 = r3
            X.C86144wL.A1O(r4, r5, r6, r1, r13)
            r13.A0D = r7
            r13.A0E = r8
            r13.A0F = r9
            r13.A05 = r2
            r13.A08 = r10
            r13.A00 = r11
            r13.A01 = r12
            r0 = r16
            r13.A02 = r0
            java.lang.Object r0 = r14.invoke(r2, r13)
            if (r0 != r15) goto L_0x00ea
            return r15
        L_0x013b:
            X.AnonymousClass0OU.A00(r0)
            X.67E r4 = r3.A04
            java.util.List r0 = r3.A05
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r6 = r0.iterator()
            goto L_0x0157
        L_0x014b:
            int[] r2 = r1.A03
            int r1 = r1.A00
            X.79m r0 = new X.79m
            r0.<init>(r7, r8, r2, r1)
            r10.add(r0)
        L_0x0157:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r1 = r6.next()
            X.79m r1 = (X.C1202779m) r1
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r1.A01
            java.util.Iterator r9 = r0.iterator()
            r10 = r5
            r12 = 0
            goto L_0x0108
        L_0x0174:
            kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2 r13 = new kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2
            r13.<init>(r3, r5, r4)
            goto L_0x00ab
        L_0x017b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0180:
            java.util.List r5 = (java.util.List) r5
            int r6 = r3.A01
            int r2 = r3.A00
            X.79c r1 = r3.A03
            X.79c r0 = r3.A02
            androidx.paging.PageEvent$Insert r15 = new androidx.paging.PageEvent$Insert
            r7 = r4
            r8 = r5
            r9 = r6
            r10 = r2
            r4 = r15
            r5 = r1
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r15
        L_0x0197:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113226qx.A00(X.8n9, X.0YP):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r0 == r15) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C146958n9 r23, X.AnonymousClass0YP r24) {
        /*
            r22 = this;
            r1 = r22
            r10 = r24
            boolean r0 = r1 instanceof androidx.paging.PageEvent$StaticList
            r7 = r23
            if (r0 == 0) goto L_0x0078
            r2 = r1
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            r6 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2.A00(r6, r7)
            if (r0 == 0) goto L_0x0072
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0072
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x0022:
            java.lang.Object r0 = r5.A06
            X.D0E r15 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            if (r1 == 0) goto L_0x0064
            if (r1 != r6) goto L_0x0145
            java.lang.Object r4 = r5.A05
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r3 = r5.A04
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r1 = r5.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r10 = r5.A02
            X.0YP r10 = (X.AnonymousClass0YP) r10
            java.lang.Object r2 = r5.A01
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x0043:
            r4.add(r0)
        L_0x0046:
            r4 = r1
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r3.next()
            r5.A01 = r2
            r5.A02 = r10
            r5.A03 = r1
            r5.A04 = r3
            r5.A05 = r1
            r5.A00 = r6
            java.lang.Object r0 = r10.invoke(r0, r5)
            if (r0 != r15) goto L_0x0043
        L_0x0063:
            return r15
        L_0x0064:
            X.AnonymousClass0OU.A00(r0)
            java.util.List r0 = r2.A02
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r3 = r0.iterator()
            goto L_0x0046
        L_0x0072:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2
            r5.<init>(r2, r7, r6)
            goto L_0x0022
        L_0x0078:
            boolean r0 = r1 instanceof androidx.paging.PageEvent$Insert
            if (r0 == 0) goto L_0x016b
            r4 = r1
            androidx.paging.PageEvent$Insert r4 = (androidx.paging.PageEvent$Insert) r4
            boolean r0 = r7 instanceof X.C137878Ar
            if (r0 == 0) goto L_0x0132
            r9 = r7
            X.8Ar r9 = (X.C137878Ar) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0132
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0091:
            java.lang.Object r0 = r9.A0C
            X.D0E r15 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r9.A00
            r8 = 10
            r7 = 1
            if (r1 == 0) goto L_0x00fa
            if (r1 != r7) goto L_0x014a
            java.lang.Object r13 = r9.A03
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r14 = r9.A0B
            java.util.Collection r14 = (java.util.Collection) r14
            java.lang.Object r2 = r9.A0A
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r12 = r9.A09
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r11 = r9.A08
            int[] r11 = (int[]) r11
            java.lang.Object r1 = r9.A07
            X.79m r1 = (X.C1202779m) r1
            java.lang.Object r3 = r9.A06
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r6 = r9.A05
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r5 = r9.A04
            X.67E r5 = (X.AnonymousClass67E) r5
            java.lang.Object r4 = r9.A02
            androidx.paging.PageEvent$Insert r4 = (androidx.paging.PageEvent$Insert) r4
            java.lang.Object r10 = r9.A01
            X.0YP r10 = (X.AnonymousClass0YP) r10
            X.AnonymousClass0OU.A00(r0)
        L_0x00cd:
            r14.add(r0)
        L_0x00d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r2.next()
            r9.A01 = r10
            r9.A02 = r4
            r9.A04 = r5
            r9.A05 = r6
            r9.A06 = r3
            r9.A07 = r1
            r9.A08 = r11
            r9.A09 = r12
            r9.A0A = r2
            r9.A0B = r12
            r9.A03 = r13
            r9.A00 = r7
            java.lang.Object r0 = r10.invoke(r0, r9)
            if (r0 == r15) goto L_0x0063
            r14 = r12
            goto L_0x00cd
        L_0x00fa:
            X.AnonymousClass0OU.A00(r0)
            X.67E r5 = r4.A04
            java.util.List r0 = r4.A05
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r3 = r0.iterator()
            goto L_0x0118
        L_0x010a:
            java.util.List r12 = (java.util.List) r12
            int r2 = r1.A00
            java.util.List r1 = r1.A02
            X.79m r0 = new X.79m
            r0.<init>(r12, r1, r11, r2)
            r13.add(r0)
        L_0x0118:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r1 = r3.next()
            X.79m r1 = (X.C1202779m) r1
            int[] r11 = r1.A03
            java.util.List r0 = r1.A01
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r2 = r0.iterator()
            r13 = r6
            goto L_0x00d0
        L_0x0132:
            X.8Ar r9 = new X.8Ar
            r9.<init>(r4, r7)
            goto L_0x0091
        L_0x0139:
            java.util.List r4 = (java.util.List) r4
            X.79c r1 = r2.A01
            X.79c r0 = r2.A00
            androidx.paging.PageEvent$StaticList r15 = new androidx.paging.PageEvent$StaticList
            r15.<init>(r1, r0, r4)
            return r15
        L_0x0145:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x014a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x014f:
            java.util.List r6 = (java.util.List) r6
            int r3 = r4.A01
            int r2 = r4.A00
            X.79c r1 = r4.A03
            X.79c r0 = r4.A02
            androidx.paging.PageEvent$Insert r15 = new androidx.paging.PageEvent$Insert
            r19 = r6
            r20 = r3
            r21 = r2
            r17 = r0
            r18 = r5
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r15
        L_0x016b:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113226qx.A01(X.8n9, X.0YP):java.lang.Object");
    }
}
