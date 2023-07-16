package com.facebook.redex;

import X.C83234r0;

public class IDxFCollectorShape60S0300000_2_I2 implements C83234r0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.Map r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x002b
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 != r3) goto L_0x0038
            java.lang.Object r9 = r5.A02
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r0 = r5.A01
            com.facebook.redex.IDxFCollectorShape60S0300000_2_I2 r0 = (com.facebook.redex.IDxFCollectorShape60S0300000_2_I2) r0
            goto L_0x0031
        L_0x002b:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r5.<init>(r8, r10, r3)
            goto L_0x0015
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0061
        L_0x0035:
            r6 = move-exception
            goto L_0x00ba
        L_0x0038:
            java.lang.IllegalStateException r6 = X.AnonymousClass0wJ.A0a()
            throw r6
        L_0x003d:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r0 = r8.A01     // Catch:{ all -> 0x00b8 }
            java.lang.Float r0 = X.C120527Bg.A02(r0, r9)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r2 = r8.A02     // Catch:{ all -> 0x00b8 }
            com.instagram.compose.core.SwipeableState r2 = (com.instagram.compose.core.SwipeableState) r2     // Catch:{ all -> 0x00b8 }
            float r1 = r0.floatValue()     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r8.A00     // Catch:{ all -> 0x00b8 }
            X.8fL r0 = (X.C142638fL) r0     // Catch:{ all -> 0x00b8 }
            r5.A01 = r8     // Catch:{ all -> 0x00b8 }
            r5.A02 = r9     // Catch:{ all -> 0x00b8 }
            r5.A00 = r3     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = com.instagram.compose.core.SwipeableState.A00(r0, r2, r5, r1)     // Catch:{ all -> 0x00b8 }
            if (r0 == r4) goto L_0x00b0
            r0 = r8
        L_0x0061:
            java.lang.Object r5 = r0.A02
            com.instagram.compose.core.SwipeableState r5 = (com.instagram.compose.core.SwipeableState) r5
            X.8pE r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            float r4 = X.C18240wQ.A00(r0)
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r9)
        L_0x0077:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0099
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r1.getKey()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = X.C86124wJ.A01(r0, r4)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.C86124wJ.A1X(r0)
            if (r0 == 0) goto L_0x0077
            X.C18210wN.A1Q(r3, r1)
            goto L_0x0077
        L_0x0099:
            java.util.Collection r0 = r3.values()
            java.lang.Object r1 = X.AnonymousClass00J.A08(r0)
            if (r1 != 0) goto L_0x00a9
            X.8pE r0 = r5.A07
            java.lang.Object r1 = r0.getValue()
        L_0x00a9:
            X.8pE r0 = r5.A07
            r0.CrC(r1)
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x00b0:
            return r4
        L_0x00b1:
            java.lang.String r0 = "The target value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r6 = move-exception
            r0 = r8
        L_0x00ba:
            java.lang.Object r5 = r0.A02
            com.instagram.compose.core.SwipeableState r5 = (com.instagram.compose.core.SwipeableState) r5
            X.8pE r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            float r4 = X.C18240wQ.A00(r0)
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r9)
        L_0x00d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r1.getKey()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = X.C86124wJ.A01(r0, r4)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.C86124wJ.A1X(r0)
            if (r0 == 0) goto L_0x00d0
            X.C18210wN.A1Q(r3, r1)
            goto L_0x00d0
        L_0x00f2:
            java.util.Collection r0 = r3.values()
            java.lang.Object r1 = X.AnonymousClass00J.A08(r0)
            if (r1 != 0) goto L_0x0102
            X.8pE r0 = r5.A07
            java.lang.Object r1 = r0.getValue()
        L_0x0102:
            X.8pE r0 = r5.A07
            r0.CrC(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape60S0300000_2_I2.A00(java.util.Map, X.8n9):java.lang.Object");
    }

    public IDxFCollectorShape60S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A00 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.6jP} */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02d0, code lost:
        if (r10 != null) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0498, code lost:
        r4.A00 = r5;
        r0 = r8.emit(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0500, code lost:
        r0 = r2.emit(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0504, code lost:
        if (r0 != r1) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0506, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0654, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0660, code lost:
        X.AnonymousClass0OU.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x067c, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06b3, code lost:
        if (r1 != X.D0E.COROUTINE_SUSPENDED) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06b5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010b, code lost:
        if (r0 != r10) goto L_0x010d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0315 A[LOOP:4: B:154:0x030f->B:156:0x0315, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06a3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r19, X.C146958n9 r20) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            int r0 = r6.A03
            r5 = r20
            switch(r0) {
                case 0: goto L_0x04a8;
                case 1: goto L_0x0012;
                case 2: goto L_0x018e;
                case 3: goto L_0x053a;
                case 4: goto L_0x020a;
                case 5: goto L_0x0367;
                case 6: goto L_0x0405;
                case 7: goto L_0x05bb;
                case 8: goto L_0x0607;
                case 9: goto L_0x061b;
                case 10: goto L_0x0683;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r1 = r6.A00(r7, r5)
        L_0x0011:
            return r1
        L_0x0012:
            r3 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x003b
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0028:
            java.lang.Object r3 = r4.A03
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r9) goto L_0x017b
            if (r0 != r8) goto L_0x0517
            X.AnonymousClass0OU.A00(r3)
            goto L_0x067a
        L_0x003b:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r6, r5, r3)
            goto L_0x0028
        L_0x0041:
            X.AnonymousClass0OU.A00(r3)
            java.lang.Object r2 = r6.A01
            X.4r0 r2 = (X.C83234r0) r2
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0078
            X.1jB r7 = (X.AnonymousClass1jB) r7
            java.lang.Object r3 = r7.A00
            boolean r0 = r3 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x0061
            X.5uv r0 = X.C94445uv.A00
        L_0x0058:
            X.1jB r0 = X.C86164wN.A0R(r0)
        L_0x005c:
            X.C86164wN.A1N(r4)
            goto L_0x0500
        L_0x0061:
            boolean r0 = r3 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x051c
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.Exception<com.instagram.ar.core.graphql.ErrorResponse>"
            X.C04220Ms.A0C(r3, r0)
            X.1j8 r3 = (X.AnonymousClass1j8) r3
            java.lang.Throwable r5 = r3.A00
            java.lang.String r3 = "MiniGalleryCategoriesService"
            java.lang.String r0 = "fetchGalleryCategories"
            X.C10450iM.A06(r3, r0, r5)
            X.5uu r0 = X.C94435uu.A00
            goto L_0x0058
        L_0x0078:
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0521
            X.1jA r7 = (X.AnonymousClass1jA) r7
            java.lang.Object r5 = r7.A00
            r0 = r5
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            java.lang.Object r0 = r0.A01
            X.8qV r0 = (X.C148138qV) r0
            if (r0 == 0) goto L_0x018a
            X.8r0 r3 = r0.ARB()
            if (r3 == 0) goto L_0x018a
            java.lang.Object r11 = r6.A02
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r11 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService) r11
            java.lang.Object r13 = r6.A00
            X.D1X r13 = (X.D1X) r13
            X.44e r5 = (X.C685344e) r5
            boolean r0 = r5.mFromDiskCache
            if (r0 == 0) goto L_0x011e
            java.lang.Integer r12 = X.AnonymousClass006.A00
        L_0x009f:
            X.CzL r10 = r3.Acc()
            com.google.common.collect.ImmutableList r0 = r3.B3e()
            X.C04220Ms.A06(r0)
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r14 = r0.iterator()
        L_0x00b2:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r3 = r14.next()
            X.8qz r3 = (X.C148418qz) r3
            X.C04220Ms.A04(r3)
            X.CzL r0 = r3.B3f()
            java.lang.String r6 = "IGAREffectModelExt"
            if (r0 != 0) goto L_0x00d7
            java.lang.StringBuilder r5 = X.C18200wM.A0r()
            java.lang.String r0 = "Receiving null product category id: "
        L_0x00cf:
            java.lang.String r0 = X.C86104wH.A0x(r3, r0, r5)
        L_0x00d3:
            X.C10450iM.A03(r6, r0)
            goto L_0x00b2
        L_0x00d7:
            X.CzL r5 = r3.B3f()
            X.CzL r0 = X.C23849CzL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r5 != r0) goto L_0x00e2
            java.lang.String r0 = "Receiving unrecognized product category"
            goto L_0x00d3
        L_0x00e2:
            java.lang.String r0 = r3.AdZ()
            if (r0 == 0) goto L_0x0117
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0117
            X.CzL r0 = r3.B3f()
            X.C04220Ms.A0A(r0)
            java.lang.String r6 = r0.name()
            java.lang.String r5 = r3.AdZ()
            X.C04220Ms.A0A(r5)
            X.CzL r0 = r3.B3f()
            if (r0 == 0) goto L_0x010d
            X.CzL r0 = r3.B3f()
            r3 = 1
            if (r0 == r10) goto L_0x010e
        L_0x010d:
            r3 = 0
        L_0x010e:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2
            r0.<init>((X.D1X) r13, (java.lang.String) r6, (java.lang.String) r5, (boolean) r3)
            r7.add(r0)
            goto L_0x00b2
        L_0x0117:
            java.lang.StringBuilder r5 = X.C18200wM.A0r()
            java.lang.String r0 = "Receiving null category display name: "
            goto L_0x00cf
        L_0x011e:
            r12 = 0
            goto L_0x009f
        L_0x0120:
            X.6jP r6 = new X.6jP
            r6.<init>(r12, r7)
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r0 = r11.A02
            X.C86124wJ.A1S(r2, r6, r4, r9)
            long r15 = java.lang.System.currentTimeMillis()
            X.765 r7 = r0.A01
            java.util.List r0 = r6.A02
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x013a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r3 = r9.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r0 = r3.A00
            X.D1X r0 = (X.D1X) r0
            java.lang.String r11 = r0.name()
            java.lang.String r12 = r3.A02
            java.lang.String r13 = r3.A01
            r0 = 95
            java.lang.String r14 = X.AnonymousClass00U.A0N(r11, r12, r0)
            boolean r0 = r3.A03
            X.6m4 r10 = new X.6m4
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r17)
            r5.add(r10)
            goto L_0x013a
        L_0x0169:
            X.M6w r3 = r7.A01
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r8, r7, r5)
            java.lang.Object r0 = X.C120467Az.A01(r3, r0, r4)
            if (r0 == r1) goto L_0x0178
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0178:
            if (r0 != r1) goto L_0x0184
            return r1
        L_0x017b:
            java.lang.Object r6 = r4.A02
            java.lang.Object r2 = r4.A01
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r3)
        L_0x0184:
            X.1jA r0 = X.AnonymousClass1jA.A00(r6)
            goto L_0x005c
        L_0x018a:
            X.5ut r0 = X.C94425ut.A00
            goto L_0x0058
        L_0x018e:
            r3 = 26
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x01b7
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01b7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x01a4:
            java.lang.Object r0 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r4.A00
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L_0x01bc
            if (r2 == r9) goto L_0x01fe
            if (r2 != r8) goto L_0x0526
            X.AnonymousClass0OU.A00(r0)
            goto L_0x067a
        L_0x01b7:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = X.C86164wN.A0n(r6, r5, r3)
            goto L_0x01a4
        L_0x01bc:
            X.AnonymousClass0OU.A00(r0)
            java.lang.Object r2 = r6.A01
            X.4r0 r2 = (X.C83234r0) r2
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x01e1
            X.1jB r7 = (X.AnonymousClass1jB) r7
            java.lang.Object r0 = r7.A00
            boolean r0 = r0 instanceof X.C94485uz
            if (r0 == 0) goto L_0x01de
            X.5uw r0 = X.C94455uw.A00
        L_0x01d3:
            X.1jB r0 = X.C86164wN.A0R(r0)
        L_0x01d7:
            r3 = 0
            r4.A01 = r3
            r4.A00 = r8
            goto L_0x0500
        L_0x01de:
            X.5ux r0 = X.C94465ux.A00
            goto L_0x01d3
        L_0x01e1:
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x052b
            X.1jA r7 = (X.AnonymousClass1jA) r7
            java.lang.Object r5 = r7.A00
            X.6s5 r5 = (X.C113756s5) r5
            java.lang.Object r3 = r6.A02
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r3 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService) r3
            java.lang.Object r0 = r6.A00
            X.6me r0 = (X.C111016me) r0
            r4.A01 = r2
            r4.A00 = r9
            java.lang.Object r0 = com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A01(r0, r3, r5, r4)
            if (r0 != r1) goto L_0x0205
            return r1
        L_0x01fe:
            java.lang.Object r2 = r4.A01
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r0)
        L_0x0205:
            X.1jA r0 = X.AnonymousClass1jA.A00(r0)
            goto L_0x01d7
        L_0x020a:
            r3 = 43
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x0230
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0230
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0220:
            java.lang.Object r2 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0236
            if (r0 == r5) goto L_0x0660
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0230:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r4.<init>(r6, r5, r3)
            goto L_0x0220
        L_0x0236:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r3 = r6.A01
            X.4r0 r3 = (X.C83234r0) r3
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0323
            X.1jA r7 = (X.AnonymousClass1jA) r7
            java.lang.Object r9 = r7.A00
            X.5z0 r9 = (X.AnonymousClass5z0) r9
            java.lang.Object r8 = r6.A00
            X.Dn3 r8 = (X.C25515Dn3) r8
            r14 = 0
            java.lang.Object r0 = r9.A01
            X.8qU r0 = (X.C148128qU) r0
            r15 = 0
            if (r0 == 0) goto L_0x02d8
            X.8qy r10 = r0.ARF()
            if (r10 == 0) goto L_0x02d9
            X.8qT r0 = r10.BFc()
            if (r0 == 0) goto L_0x02d9
            X.8r6 r0 = r0.A9m()
            if (r0 == 0) goto L_0x02d9
            X.8qr r0 = r0.Aee()
            if (r0 == 0) goto L_0x02d9
            X.Hyp r7 = r0.A9W()
            if (r7 == 0) goto L_0x02d9
            java.lang.Integer r6 = X.AnonymousClass006.A0N
            java.lang.String r2 = r8.A01
            X.Hz2 r0 = r7.A9T()
            boolean r0 = X.C31132GgT.A04(r0)
            if (r0 != 0) goto L_0x02d3
            r12 = 0
        L_0x0282:
            r7 = 0
            if (r10 == 0) goto L_0x02d0
            X.8qT r0 = r10.BFc()
            if (r0 == 0) goto L_0x02d0
            X.8r6 r0 = r0.A9m()
            if (r0 == 0) goto L_0x02d0
            java.lang.String r14 = r0.AhA()
        L_0x0295:
            X.8qT r0 = r10.BFc()
            if (r0 == 0) goto L_0x02ab
            X.8r6 r0 = r0.A9m()
            if (r0 == 0) goto L_0x02ab
            X.25X r0 = r0.Ah8()
            if (r0 == 0) goto L_0x02ab
            java.lang.String r15 = r0.name()
        L_0x02ab:
            com.google.common.collect.ImmutableList r0 = r10.Af1()
            if (r0 == 0) goto L_0x02db
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x02b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r0 = r2.next()
            X.8qS r0 = (X.C148108qS) r0
            X.Hyp r0 = r0.A9W()
            X.C04220Ms.A06(r0)
            r6.add(r0)
            goto L_0x02b9
        L_0x02d0:
            if (r10 == 0) goto L_0x02db
            goto L_0x0295
        L_0x02d3:
            com.instagram.camera.effect.models.CameraAREffect r12 = X.C31132GgT.A00(r7, r6, r2)
            goto L_0x0282
        L_0x02d8:
            r10 = r14
        L_0x02d9:
            r12 = r14
            goto L_0x0282
        L_0x02db:
            X.0ZV r6 = X.AnonymousClass0ZV.A00
        L_0x02dd:
            java.lang.Integer r10 = X.AnonymousClass006.A0N
            java.lang.String r8 = r8.A01
            X.C04220Ms.A0B(r6, r7)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r11 = r6.iterator()
        L_0x02ec:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0307
            java.lang.Object r6 = r11.next()
            r0 = r6
            X.Hyp r0 = (X.C34008Hyp) r0
            X.Hz2 r0 = r0.A9T()
            boolean r0 = X.C31132GgT.A04(r0)
            if (r0 == 0) goto L_0x02ec
            r2.add(r6)
            goto L_0x02ec
        L_0x0307:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x030f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x032c
            java.lang.Object r0 = r2.next()
            X.Hyp r0 = (X.C34008Hyp) r0
            com.instagram.camera.effect.models.CameraAREffect r0 = X.C31132GgT.A00(r0, r10, r8)
            r6.add(r0)
            goto L_0x030f
        L_0x0323:
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x033f
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x032c:
            boolean r0 = r9.mFromDiskCache
            if (r0 == 0) goto L_0x0364
            java.lang.Integer r13 = X.AnonymousClass006.A00
        L_0x0332:
            X.6m5 r11 = new X.6m5
            r17 = r7
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.1jA r7 = X.AnonymousClass1jA.A00(r11)
        L_0x033f:
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0355
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0535
            X.1jB r7 = (X.AnonymousClass1jB) r7
            java.lang.Object r2 = r7.A00
            boolean r0 = r2 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x035d
            X.5v2 r0 = X.AnonymousClass5v2.A00
        L_0x0351:
            X.1jB r7 = X.C86164wN.A0R(r0)
        L_0x0355:
            r4.A00 = r5
            java.lang.Object r0 = r3.emit(r7, r4)
            goto L_0x0504
        L_0x035d:
            boolean r0 = r2 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0530
            X.5v1 r0 = X.AnonymousClass5v1.A00
            goto L_0x0351
        L_0x0364:
            java.lang.Integer r13 = X.AnonymousClass006.A0Y
            goto L_0x0332
        L_0x0367:
            r3 = 19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r5)
            if (r0 == 0) goto L_0x038d
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x038d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x037d:
            java.lang.Object r2 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0393
            if (r0 == r5) goto L_0x0660
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x038d:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r4.<init>(r6, r5, r3)
            goto L_0x037d
        L_0x0393:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r8 = r6.A01
            X.4r0 r8 = (X.C83234r0) r8
            r3 = r7
            X.BBZ r3 = (X.BBZ) r3
            java.lang.Object r0 = r6.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x067a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            java.lang.Object r2 = r0.A00
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x03b5
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x03b5
            goto L_0x067a
        L_0x03b5:
            java.util.Iterator r11 = r2.iterator()
        L_0x03b9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x067a
            java.util.List r2 = X.AnonymousClass5I1.A00(r11)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x03ce
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x03ce
            goto L_0x03b9
        L_0x03ce:
            java.util.Iterator r10 = r2.iterator()
        L_0x03d2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03b9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r9 = X.AnonymousClass5IF.A00(r10)
            java.lang.Object r0 = r6.A02
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r0 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r0
            com.instagram.service.session.UserSession r2 = r0.A05
            int r0 = r9.A01
            if (r0 == 0) goto L_0x03fc
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
        L_0x03ea:
            java.lang.String r2 = X.C86134wK.A0p(r0)
            com.instagram.user.model.User r0 = r3.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x03d2
            goto L_0x0498
        L_0x03fc:
            java.lang.Object r0 = r9.A00
            X.BKU r0 = (X.BKU) r0
            com.instagram.user.model.User r0 = r0.A2Z(r2)
            goto L_0x03ea
        L_0x0405:
            r3 = 20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r5)
            if (r0 == 0) goto L_0x042b
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x042b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x041b:
            java.lang.Object r2 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0431
            if (r0 == r5) goto L_0x0660
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x042b:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r4.<init>(r6, r5, r3)
            goto L_0x041b
        L_0x0431:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r8 = r6.A01
            X.4r0 r8 = (X.C83234r0) r8
            r3 = r7
            X.BBR r3 = (X.BBR) r3
            java.lang.Object r0 = r6.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x067a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            java.lang.Object r2 = r0.A00
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0453
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0453
            goto L_0x067a
        L_0x0453:
            java.util.Iterator r11 = r2.iterator()
        L_0x0457:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x067a
            java.util.List r2 = X.AnonymousClass5I1.A00(r11)
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x046c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x046c
            goto L_0x0457
        L_0x046c:
            java.util.Iterator r10 = r2.iterator()
        L_0x0470:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0457
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r9 = X.AnonymousClass5IF.A00(r10)
            java.lang.Object r0 = r6.A02
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r0 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r0
            com.instagram.service.session.UserSession r2 = r0.A05
            int r0 = r9.A01
            if (r0 == 0) goto L_0x049f
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
        L_0x0488:
            java.lang.String r2 = X.C86134wK.A0p(r0)
            com.instagram.user.model.User r0 = r3.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0470
        L_0x0498:
            r4.A00 = r5
            java.lang.Object r0 = r8.emit(r7, r4)
            goto L_0x0504
        L_0x049f:
            java.lang.Object r0 = r9.A00
            X.BKU r0 = (X.BKU) r0
            com.instagram.user.model.User r0 = r0.A2Z(r2)
            goto L_0x0488
        L_0x04a8:
            r3 = 8
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x04d1
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x04d1
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x04be:
            java.lang.Object r2 = r4.A03
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r4.A00
            r0 = 2
            r5 = 1
            if (r3 == 0) goto L_0x04e3
            if (r3 == r5) goto L_0x04d7
            if (r3 == r0) goto L_0x0660
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x04d1:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r6, r5, r3)
            goto L_0x04be
        L_0x04d7:
            java.lang.Object r3 = r4.A02
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            java.lang.Object r0 = r4.A01
            com.facebook.redex.IDxFCollectorShape60S0300000_2_I2 r0 = (com.facebook.redex.IDxFCollectorShape60S0300000_2_I2) r0
            X.AnonymousClass0OU.A00(r2)
            goto L_0x0515
        L_0x04e3:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r3 = r6.A01
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            java.lang.Object r2 = r3.A00
            java.lang.Object r0 = X.AnonymousClass6X2.A00
            if (r2 != r0) goto L_0x0507
            r0 = r6
        L_0x04f1:
            r3.A00 = r7
            java.lang.Object r2 = r0.A00
            X.4r0 r2 = (X.C83234r0) r2
            java.lang.Object r0 = r0.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            X.C86164wN.A1N(r4)
        L_0x0500:
            java.lang.Object r0 = r2.emit(r0, r4)
        L_0x0504:
            if (r0 != r1) goto L_0x067a
            return r1
        L_0x0507:
            java.lang.Object r0 = r6.A02
            X.0YM r0 = (X.AnonymousClass0YM) r0
            X.C86124wJ.A1S(r6, r3, r4, r5)
            java.lang.Object r2 = r0.invoke(r2, r7, r4)
            if (r2 == r1) goto L_0x0011
            r0 = r6
        L_0x0515:
            r7 = r2
            goto L_0x04f1
        L_0x0517:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x051c:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0521:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0526:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x052b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0530:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0535:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x053a:
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x05af
            r0 = r7
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.6s5 r0 = (X.C113756s5) r0
            java.lang.Object r10 = r0.A00
            X.C04220Ms.A06(r10)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r10
            java.lang.Object r9 = r6.A02
            X.0MJ r9 = (X.AnonymousClass0MJ) r9
            java.lang.Object r3 = r9.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r3
            if (r3 == 0) goto L_0x05ad
            r0 = 1
            X.C04220Ms.A0B(r10, r0)
            X.01V r8 = X.AnonymousClass01V.A0p
            r4 = 17634421(0x10d1475, float:2.5912287E-38)
            r8.markerStart(r4)
            java.lang.Object r1 = r10.A01
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r0 = r3.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.AnonymousClass00J.A0S(r1, r0)
            int r12 = r0.size()
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r10.A03
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x05b9
            long r1 = r0.longValue()
        L_0x0582:
            java.lang.Object r0 = r3.A03
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x058c
            long r13 = r0.longValue()
        L_0x058c:
            long r1 = r1 - r13
            java.lang.Object r11 = r10.A00
            X.Dn3 r11 = (X.C25515Dn3) r11
            java.lang.String r3 = r11.A02
            java.lang.String r0 = "product_id"
            r8.markerAnnotate((int) r4, (java.lang.String) r0, (java.lang.String) r3)
            java.lang.String r3 = r11.A01
            java.lang.String r0 = "category_id"
            r8.markerAnnotate((int) r4, (java.lang.String) r0, (java.lang.String) r3)
            java.lang.String r0 = "new_effects_count"
            r8.markerAnnotate((int) r4, (java.lang.String) r0, (int) r12)
            java.lang.String r0 = "sync_time_diff_ms"
            r8.markerAnnotate((int) r4, (java.lang.String) r0, (long) r1)
            r0 = 2
            r8.markerEnd(r4, r0)
        L_0x05ad:
            r9.A00 = r10
        L_0x05af:
            java.lang.Object r0 = r6.A00
            X.4r0 r0 = (X.C83234r0) r0
            java.lang.Object r1 = r0.emit(r7, r5)
            goto L_0x06b1
        L_0x05b9:
            r1 = r13
            goto L_0x0582
        L_0x05bb:
            java.util.Iterator r2 = X.C86144wL.A0y(r7)
        L_0x05bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05de
            java.lang.Object r9 = r2.next()
            java.lang.Object r1 = r6.A00
            X.4qz r1 = (X.C83224qz) r1
            r11 = 0
            java.lang.Object r10 = r6.A02
            java.lang.Object r8 = r6.A01
            r12 = 43
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.C25237DiI.A00(r11, r11, r7, r1, r0)
            goto L_0x05bf
        L_0x05de:
            java.lang.Object r0 = r6.A02
            com.instagram.barcelona.mainactivity.BarcelonaActivity r0 = (com.instagram.barcelona.mainactivity.BarcelonaActivity) r0
            X.0Oa r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.0za r0 = (X.C19270za) r0
            X.4wE r5 = r0.A05
        L_0x05ec:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            X.0ZV r3 = X.AnonymousClass0ZV.A00
            java.lang.Object r2 = r0.A00
            X.4nZ r2 = (X.C81304nZ) r2
            boolean r1 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r0.<init>((X.C81304nZ) r2, (java.util.List) r3, (boolean) r1)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x05ec
            goto L_0x067a
        L_0x0607:
            boolean r0 = X.AnonymousClass0wJ.A1X(r7)
            if (r0 == 0) goto L_0x0618
            java.lang.Object r0 = r6.A02
        L_0x060f:
            java.lang.Object r2 = X.C86104wH.A0f(r0)
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r6.A00
            goto L_0x0654
        L_0x0618:
            java.lang.Object r0 = r6.A01
            goto L_0x060f
        L_0x061b:
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x065a
            java.lang.Object r0 = r6.A02
            X.B48 r0 = (X.B48) r0
            X.8wM r1 = r0.A0Z
            int r0 = r1.A09()
            X.9CZ r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0658
            java.lang.String r1 = r0.getId()
        L_0x0635:
            java.lang.Object r0 = r6.A00
            X.9CZ r0 = (X.AnonymousClass9CZ) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x065a
            java.lang.Object r2 = r6.A01
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = X.C62903b6.A05(r7)
            X.6d4 r0 = (X.C105216d4) r0
            int r1 = r0.A00
        L_0x064f:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
        L_0x0654:
            r2.invoke(r0)
            goto L_0x067a
        L_0x0658:
            r1 = 0
            goto L_0x0635
        L_0x065a:
            java.lang.Object r2 = r6.A01
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r1 = 0
            goto L_0x064f
        L_0x0660:
            X.AnonymousClass0OU.A00(r2)
            goto L_0x067a
        L_0x0664:
            boolean r0 = r7 instanceof X.C122997Uw
            if (r0 == 0) goto L_0x067d
            java.lang.Object r4 = r6.A00
            X.4qz r4 = (X.C83224qz) r4
            r3 = 0
            java.lang.Object r2 = r6.A01
            r0 = 27
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0101000_I2_4 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0101000_I2_4
            r1.<init>(r2, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r4, r0)
        L_0x067a:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x067d:
            java.lang.Object r1 = r6.A01
            X.7JH r1 = (X.AnonymousClass7JH) r1
            r0 = 0
            goto L_0x06a9
        L_0x0683:
            X.8ca r7 = (X.AnonymousClass8ca) r7
            boolean r0 = r7 instanceof X.C122987Uv
            if (r0 != 0) goto L_0x06e8
            boolean r0 = r7 instanceof X.C122997Uw
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r7
            X.7Uw r0 = (X.C122997Uw) r0
            X.7Uv r0 = r0.A00
        L_0x0696:
            r1.remove(r0)
        L_0x0699:
            java.lang.Object r0 = r6.A02
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0664
            java.lang.Object r1 = r6.A01
            X.7JH r1 = (X.AnonymousClass7JH) r1
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x06a9:
            java.lang.Float r0 = X.C86154wM.A0W(r0)
            java.lang.Object r1 = r1.A05(r0, r5)
        L_0x06b1:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x067a
            return r1
        L_0x06b6:
            boolean r0 = r7 instanceof X.C122977Uu
            if (r0 == 0) goto L_0x06c4
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r7
            X.7Uu r0 = (X.C122977Uu) r0
            X.7Uv r0 = r0.A00
            goto L_0x0696
        L_0x06c4:
            boolean r0 = r7 instanceof X.C122927Un
            if (r0 != 0) goto L_0x06e8
            boolean r0 = r7 instanceof X.C122957Ur
            if (r0 == 0) goto L_0x06d6
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r7
            X.7Ur r0 = (X.C122957Ur) r0
            X.7Un r0 = r0.A00
            goto L_0x0696
        L_0x06d6:
            boolean r0 = r7 instanceof X.C122917Um
            if (r0 != 0) goto L_0x06e8
            boolean r0 = r7 instanceof X.AnonymousClass7Uq
            if (r0 == 0) goto L_0x0699
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = r7
            X.7Uq r0 = (X.AnonymousClass7Uq) r0
            X.7Um r0 = r0.A00
            goto L_0x0696
        L_0x06e8:
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
            goto L_0x0699
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape60S0300000_2_I2.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
