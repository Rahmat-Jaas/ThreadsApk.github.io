package com.facebook.redex;

import X.C82404pZ;

public class IDxConsumerShape377S0100000_2_I2 implements C82404pZ {
    public Object A00;
    public final int A01;

    public IDxConsumerShape377S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.IM8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.IM8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.IM8} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r0.isEmpty() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            if (r0 == 0) goto L_0x005e
            X.EUq r9 = (X.C26743EUq) r9
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r9.A03()
            X.44e r0 = (X.C685344e) r0
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r8.A00
            X.57h r0 = (X.C882457h) r0
            X.56r r6 = r0.A01
            java.lang.Object r5 = r6.A08()
            if (r5 == 0) goto L_0x00e4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2) r5
            r1 = 0
            r5.A04 = r1
            r0 = 1
            r5.A06 = r0
            java.lang.Object r0 = r9.A03()
            X.5u2 r0 = (X.AnonymousClass5u2) r0
            java.lang.String r0 = r0.A00
            X.C04220Ms.A0B(r0, r1)
            r5.A00 = r0
            java.lang.Object r0 = r9.A03()
            X.5u2 r0 = (X.AnonymousClass5u2) r0
            boolean r0 = r0.A03
            r5.A05 = r0
            java.lang.Object r0 = r9.A03()
            X.5u2 r0 = (X.AnonymousClass5u2) r0
            java.lang.String r0 = r0.A01
            X.C04220Ms.A0B(r0, r1)
            r5.A01 = r0
            java.lang.Object r0 = r9.A03()
            X.5u2 r0 = (X.AnonymousClass5u2) r0
            boolean r0 = r0.A02
            r5.A02 = r0
        L_0x005a:
            r6.A0G(r5)
        L_0x005d:
            return
        L_0x005e:
            X.EUq r9 = (X.C26743EUq) r9
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r9)
            if (r0 == 0) goto L_0x005d
            java.lang.Object r2 = r8.A00
            X.I6I r2 = (X.I6I) r2
            X.56r r6 = r2.A0D
            java.lang.Object r5 = r6.A08()
            java.lang.String r1 = "Required value was null."
            if (r5 == 0) goto L_0x00f3
            X.IM8 r5 = (X.IM8) r5
            java.lang.Object r0 = X.AnonymousClass5z0.A00(r9)
            if (r0 == 0) goto L_0x00ee
            X.8qX r0 = (X.C148158qX) r0
            com.google.common.collect.ImmutableList r0 = r0.B0i()
            X.C04220Ms.A06(r0)
            r5.A0e = r0
            r0 = 0
            r5.A0l = r0
            java.lang.Object r7 = r6.A08()
            if (r7 == 0) goto L_0x00e9
            X.IM8 r7 = (X.IM8) r7
            java.util.List r0 = r7.A0c
            int r1 = r0.size()
            java.util.List r0 = r7.A0e
            int r0 = r0.size()
            r4 = 0
            if (r1 != 0) goto L_0x00c9
            if (r0 <= r1) goto L_0x00c9
            com.instagram.service.session.UserSession r3 = r2.A0H
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36310890471751977(0x810090000c0129, double:3.026491574331515E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x00c9
            X.8qn r0 = r7.A02
            if (r0 == 0) goto L_0x00c9
            com.google.common.collect.ImmutableList r0 = r0.Aeb()
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ca
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            java.util.List r0 = r7.A0e
            int r2 = r0.size()
            java.util.ArrayList r1 = X.C18240wQ.A0k(r2)
        L_0x00d4:
            if (r4 >= r2) goto L_0x00e0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.add(r0)
            int r4 = r4 + 1
            goto L_0x00d4
        L_0x00e0:
            r7.A0c = r1
            goto L_0x005a
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00ee:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxConsumerShape377S0100000_2_I2.accept(java.lang.Object):void");
    }
}
