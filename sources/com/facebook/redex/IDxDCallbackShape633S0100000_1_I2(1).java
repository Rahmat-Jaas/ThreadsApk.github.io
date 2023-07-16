package com.facebook.redex;

import X.C82664q4;

public class IDxDCallbackShape633S0100000_1_I2 implements C82664q4 {
    public Object A00;
    public final int A01;

    public IDxDCallbackShape633S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.4Dp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.4Dm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.4Dr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.4Dp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.4Dp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.4Dp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void BrJ(java.lang.Object r29) {
        /*
            r28 = this;
            r5 = r28
            r0 = r29
            int r1 = r5.A01
            switch(r1) {
                case 0: goto L_0x0117;
                case 1: goto L_0x0125;
                case 2: goto L_0x012f;
                case 3: goto L_0x001f;
                case 4: goto L_0x001e;
                case 5: goto L_0x00a4;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.3YF r0 = (X.AnonymousClass3YF) r0
            if (r0 == 0) goto L_0x001e
            java.lang.Object r2 = r5.A00
            X.1lT r2 = (X.AnonymousClass1lT) r2
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            androidx.fragment.app.Fragment r1 = r2.A00
            X.265 r4 = r2.A04
            X.3Eo r6 = r2.A02
            if (r5 != 0) goto L_0x00cc
            r6.A00()
        L_0x001e:
            return
        L_0x001f:
            X.3YF r0 = (X.AnonymousClass3YF) r0
            java.lang.Object r1 = r5.A00
            X.1lS r1 = (X.AnonymousClass1lS) r1
            if (r0 != 0) goto L_0x002f
            X.4tD r8 = r1.A01
            java.lang.String r0 = "Response from SmartLock was null; indicates SmartLock not supported on device"
        L_0x002b:
            r8.BNe(r0)
            return
        L_0x002f:
            androidx.fragment.app.Fragment r7 = r1.A00
            X.265 r5 = r1.A03
            X.0bf r4 = r1.A02
            X.4tD r8 = r1.A01
            boolean r3 = r1.A04
            r14 = 0
            com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape125S0100000_1_I2 r6 = new com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape125S0100000_1_I2
            r6.<init>(r0, r14)
            if (r7 == 0) goto L_0x00a1
            androidx.fragment.app.FragmentActivity r2 = r7.getActivity()
            if (r2 == 0) goto L_0x00a1
            boolean r1 = r2 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r1 == 0) goto L_0x0050
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            r2.A0E(r6)
        L_0x0050:
            androidx.fragment.app.FragmentActivity r16 = r7.getActivity()
            com.facebook.redex.IDxDCallbackShape21S0500000_1_I2 r20 = new com.facebook.redex.IDxDCallbackShape21S0500000_1_I2
            r21 = r7
            r22 = r6
            r23 = r8
            r24 = r4
            r25 = r5
            r26 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r13 = 1
            com.facebook.redex.IDxDCallbackShape21S0500000_1_I2 r21 = new com.facebook.redex.IDxDCallbackShape21S0500000_1_I2
            r22 = r7
            r23 = r6
            r24 = r8
            r25 = r4
            r26 = r5
            r27 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r0.A01 = r8
            X.7lN r2 = r0.A00
            if (r2 == 0) goto L_0x009e
            r7 = 0
            java.lang.String r1 = "https://instagram.com"
            java.lang.String[] r11 = new java.lang.String[]{r1}
            r12 = 4
            com.google.android.gms.auth.api.credentials.CredentialRequest r6 = new com.google.android.gms.auth.api.credentials.CredentialRequest
            r8 = r7
            r9 = r7
            r10 = r7
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.4Dr r15 = new X.4Dr
            r17 = r6
            r23 = r3
            r19 = r0
            r22 = r5
            r18 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0113
        L_0x009e:
            java.lang.String r0 = "ApiClientWrapper not bound"
            goto L_0x002b
        L_0x00a1:
            java.lang.String r0 = "Passed in fragment activity is null; Activity required for fetch"
            goto L_0x002b
        L_0x00a4:
            X.3YF r0 = (X.AnonymousClass3YF) r0
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r5.A00
            X.1lR r1 = (X.AnonymousClass1lR) r1
            androidx.fragment.app.Fragment r1 = r1.A00
            androidx.fragment.app.FragmentActivity r4 = r1.getActivity()
            if (r4 == 0) goto L_0x001e
            X.356 r1 = X.C551031t.A00
            if (r1 == 0) goto L_0x001e
            X.355 r3 = r1.A00
            if (r3 == 0) goto L_0x001e
            r2 = 4
            com.facebook.redex.IDxDCallbackShape633S0100000_1_I2 r1 = new com.facebook.redex.IDxDCallbackShape633S0100000_1_I2
            r1.<init>(r5, r2)
            X.7lN r2 = r0.A00
            if (r2 == 0) goto L_0x001e
            X.4Dm r15 = new X.4Dm
            r15.<init>(r4, r3, r0, r1)
            goto L_0x0113
        L_0x00cc:
            r12 = 0
            com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape125S0100000_1_I2 r3 = new com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape125S0100000_1_I2
            r3.<init>(r0, r12)
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            boolean r1 = r2 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r1 == 0) goto L_0x00df
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            r2.A0E(r3)
        L_0x00df:
            r1 = 3
            com.facebook.redex.IDxDCallbackShape260S0200000_1_I2 r3 = new com.facebook.redex.IDxDCallbackShape260S0200000_1_I2
            r3.<init>(r1, r5, r6)
            r8 = 0
            r15 = 1
            r11 = 2
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r7 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig
            r13 = r7
            r14 = r11
            r16 = r12
            r17 = r15
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r1 = "https://accounts.google.com"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            com.google.android.gms.auth.api.credentials.HintRequest r6 = new com.google.android.gms.auth.api.credentials.HintRequest
            r9 = r8
            r13 = r12
            r14 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.7lN r2 = r0.A00
            if (r2 == 0) goto L_0x001e
            X.4Dp r15 = new X.4Dp
            r7 = r15
            r8 = r5
            r9 = r6
            r10 = r2
            r11 = r0
            r12 = r3
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0113:
            r2.A00(r15)
            return
        L_0x0117:
            java.lang.Object r0 = r5.A00
            X.4Du r0 = (X.C70304Du) r0
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.1aw r0 = (X.AnonymousClass1aw) r0
            X.AnonymousClass1aw.A00(r0)
            return
        L_0x0125:
            java.lang.Object r0 = r5.A00
            X.4Dv r0 = (X.C70314Dv) r0
            X.1cc r0 = r0.A01
            X.C23171cc.A00(r0)
            return
        L_0x012f:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxCCallbackShape124S0300000_1_I2 r0 = (com.facebook.redex.IDxCCallbackShape124S0300000_1_I2) r0
            java.lang.Object r2 = r0.A00
            X.1rD r2 = (X.C26791rD) r2
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r0.A02
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C26791rD.A00(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDCallbackShape633S0100000_1_I2.BrJ(java.lang.Object):void");
    }
}
