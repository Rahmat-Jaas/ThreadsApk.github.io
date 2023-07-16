package com.facebook.redex;

import X.C83234r0;

public class IDxFCollectorShape14S0101000_2_I2 implements C83234r0 {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxFCollectorShape14S0101000_2_I2(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0201, code lost:
        X.AnonymousClass0OU.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0206, code lost:
        X.AnonymousClass0OU.A00(r2);
        r0 = r15.A00;
        r7.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0215, code lost:
        if (((androidx.paging.UnbatchedFlowCombiner) r15.A01).A00(r1, r7, r0) != r6) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0217, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0218, code lost:
        X.AnonymousClass0OU.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x021b, code lost:
        r7.A00 = r4;
        r0 = X.DHD.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0221, code lost:
        if (r0 != r6) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0223, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r16, X.C146958n9 r17) {
        /*
            r15 = this;
            r1 = r16
            int r0 = r15.A02
            r4 = r17
            switch(r0) {
                case 0: goto L_0x01d3;
                case 1: goto L_0x01a5;
                case 2: goto L_0x0162;
                case 3: goto L_0x0046;
                default: goto L_0x0009;
            }
        L_0x0009:
            boolean r0 = r1 instanceof X.C23264CpC
            if (r0 == 0) goto L_0x002f
            java.lang.Object r3 = r15.A01
            X.CR8 r3 = (X.CR8) r3
            X.I6I r2 = r3.A04()
            r1 = 2131832323(0x7f112e03, float:1.9297697E38)
            int r0 = r15.A00
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r3, r0, r1)
            r2.A0D(r0)
            X.0m7 r0 = r3.getParentFragmentManager()
            r0.A0d()
        L_0x002c:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x002f:
            boolean r0 = r1 instanceof X.C23263CpB
            if (r0 == 0) goto L_0x002c
            java.lang.Object r2 = r15.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r1 = r2.requireContext()
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            java.lang.String r0 = r2.getString(r0)
            X.C63813iO.A0B(r1, r0)
            goto L_0x002c
        L_0x0046:
            X.8ea r1 = (X.C142268ea) r1
            boolean r0 = r1 instanceof X.AnonymousClass5LM
            if (r0 == 0) goto L_0x011a
            X.5LM r1 = (X.AnonymousClass5LM) r1
            java.util.List r0 = r1.A00
            java.lang.Object r4 = r15.A01
            X.57a r4 = (X.C881757a) r4
            r5 = 10
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0x(r0, r5)
            java.util.Iterator r6 = r0.iterator()
        L_0x005e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r6.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000100_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000100_I2) r0
            r13 = 0
            X.C04220Ms.A0B(r0, r13)
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A02
            java.lang.String r11 = r0.A04
            java.lang.String r12 = r0.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r12}
            r0 = 2131821379(0x7f110343, float:1.92755E38)
            X.1kC r8 = new X.1kC
            r8.<init>(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2
            r7.<init>((X.C57943Dd) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (boolean) r13)
            r3.add(r7)
            goto L_0x005e
        L_0x008b:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r3, r5)
            java.util.Iterator r2 = r3.iterator()
        L_0x0093:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r2.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2) r0
            java.lang.String r0 = r0.A02
            r5.add(r0)
            goto L_0x0093
        L_0x00a5:
            X.76R r11 = r4.A01
            r11.A00 = r5
            int r5 = r15.A00
            boolean r14 = r1.A01
            java.lang.Integer r13 = X.AnonymousClass006.A00
            r12 = 0
            X.5Ch r6 = X.AnonymousClass76R.A00(r11, r13, r12)
            java.lang.Long r10 = X.C18230wP.A0f(r5)
            java.lang.String r9 = "balance"
            r6.A09(r9, r10)
            java.util.List r0 = r11.A00
            java.lang.String r8 = "star_package_options"
            r6.A0B(r8, r0)
            X.7Jn r2 = X.C122017Jn.A02
            X.0nS r1 = r11.A02
            X.C04220Ms.A05(r1)
            com.instagram.appreciation.analytics.LoggingFanData r0 = r11.A01
            java.lang.String r7 = r0.A03
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "packs_hit_cache"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r14)
            java.util.Map r0 = X.AnonymousClass4WK.A0O(r0)
            r2.A05(r6, r1, r7, r0)
            X.5Ch r6 = X.AnonymousClass76R.A00(r11, r13, r12)
            r6.A09(r9, r10)
            java.util.List r0 = r11.A00
            r6.A0B(r8, r0)
            java.util.Map r2 = X.AnonymousClass4WJ.A0A()
            java.lang.String r0 = "client_load_appreciationgiver_display"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 253(0xfd, float:3.55E-43)
            X.C86104wH.A1I(r1, r6, r7, r2, r0)
            X.4wE r2 = r4.A06
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.text.NumberFormat r1 = java.text.NumberFormat.getNumberInstance(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = r1.format(r0)
            X.C04220Ms.A06(r1)
            X.5uq r0 = new X.5uq
            r0.<init>(r3, r5, r1)
            r2.CrC(r0)
            goto L_0x002c
        L_0x011a:
            boolean r0 = r1 instanceof X.AnonymousClass5LN
            if (r0 == 0) goto L_0x002c
            java.lang.Object r5 = r15.A01
            X.57a r5 = (X.C881757a) r5
            X.76R r3 = r5.A01
            int r2 = r15.A00
            X.5LN r1 = (X.AnonymousClass5LN) r1
            java.lang.String r9 = r1.A02
            java.lang.String r10 = r1.A00
            java.lang.String r11 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r0 = 0
            X.5Ch r6 = X.AnonymousClass76R.A00(r3, r1, r0)
            X.C86134wK.A1F(r6, r2)
            X.0nS r7 = r3.A02
            X.C04220Ms.A05(r7)
            com.instagram.appreciation.analytics.LoggingFanData r0 = r3.A01
            java.lang.String r8 = r0.A03
            X.C122017Jn.A04(r6, r7, r8, r9, r10, r11)
            X.4wD r3 = r5.A04
            java.lang.Object[] r1 = X.C86164wN.A1T()
            r0 = 2131821387(0x7f11034b, float:1.9275516E38)
            X.1kC r2 = new X.1kC
            r2.<init>(r1, r0)
            java.lang.String r1 = "appreciation_funding_empty_packs_error"
            X.5un r0 = new X.5un
            r0.<init>(r2, r1)
            java.lang.Object r6 = r3.Cgt(r0, r4)
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r6 != r0) goto L_0x002c
            return r6
        L_0x0162:
            r6 = 16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r6, r4)
            if (r0 == 0) goto L_0x0188
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0188
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0178:
            java.lang.Object r2 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x018e
            if (r0 == r4) goto L_0x0201
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0188:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r5.<init>(r15, r4, r6)
            goto L_0x0178
        L_0x018e:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r3 = r15.A01
            X.4r0 r3 = (X.C83234r0) r3
            X.79h r1 = (X.C1202279h) r1
            int r2 = r15.A00
            X.6tY r0 = new X.6tY
            r0.<init>(r1, r2)
            r5.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r5)
            goto L_0x0221
        L_0x01a5:
            r5 = 15
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r4)
            if (r0 == 0) goto L_0x01ce
            r7 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01ce
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x01bb:
            java.lang.Object r2 = r7.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0206
            if (r0 == r3) goto L_0x0218
            if (r0 == r4) goto L_0x0201
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01ce:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = X.C86114wI.A0x(r15, r4, r5)
            goto L_0x01bb
        L_0x01d3:
            r5 = 14
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r4)
            if (r0 == 0) goto L_0x01fc
            r7 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01fc
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x01e9:
            java.lang.Object r2 = r7.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0206
            if (r0 == r3) goto L_0x0218
            if (r0 == r4) goto L_0x0201
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01fc:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = X.C86114wI.A0x(r15, r4, r5)
            goto L_0x01e9
        L_0x0201:
            X.AnonymousClass0OU.A00(r2)
            goto L_0x002c
        L_0x0206:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r2 = r15.A01
            androidx.paging.UnbatchedFlowCombiner r2 = (androidx.paging.UnbatchedFlowCombiner) r2
            int r0 = r15.A00
            r7.A00 = r3
            java.lang.Object r0 = r2.A00(r1, r7, r0)
            if (r0 != r6) goto L_0x021b
            return r6
        L_0x0218:
            X.AnonymousClass0OU.A00(r2)
        L_0x021b:
            r7.A00 = r4
            java.lang.Object r0 = X.DHD.A00(r7)
        L_0x0221:
            if (r0 != r6) goto L_0x002c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape14S0101000_2_I2.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
