package com.instagram.ar.core.discovery.minigallery.services;

import X.C83234r0;
import X.D1X;

public final class MiniGalleryService$getSearchResults$$inlined$map$1$2 implements C83234r0 {
    public final /* synthetic */ MiniGalleryService A00;
    public final /* synthetic */ D1X A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C83234r0 A04;

    public MiniGalleryService$getSearchResults$$inlined$map$1$2(MiniGalleryService miniGalleryService, D1X d1x, String str, String str2, C83234r0 r5) {
        this.A04 = r5;
        this.A00 = miniGalleryService;
        this.A03 = str;
        this.A01 = d1x;
        this.A02 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r12, X.C146958n9 r13) {
        /*
            r11 = this;
            r3 = 19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r13)
            if (r0 == 0) goto L_0x00bf
            r6 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r6.A03
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r0 = 2
            r2 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r2) goto L_0x0099
            if (r1 != r0) goto L_0x00c6
            X.AnonymousClass0OU.A00(r3)
        L_0x0027:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x002a:
            X.AnonymousClass0OU.A00(r3)
            X.4r0 r4 = r11.A04
            X.3b6 r12 = (X.C62903b6) r12
            boolean r0 = r12 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0050
            X.1jB r12 = (X.AnonymousClass1jB) r12
            java.lang.Object r0 = r12.A00
            boolean r0 = r0 instanceof X.AnonymousClass5vB
            if (r0 == 0) goto L_0x004d
            X.5uw r0 = X.C94455uw.A00
        L_0x003f:
            X.1jB r0 = X.C86164wN.A0R(r0)
        L_0x0043:
            X.C86164wN.A1N(r6)
            java.lang.Object r0 = r4.emit(r0, r6)
            if (r0 != r7) goto L_0x0027
            return r7
        L_0x004d:
            X.5ux r0 = X.C94465ux.A00
            goto L_0x003f
        L_0x0050:
            boolean r0 = r12 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00cb
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r3 = r11.A00
            java.lang.String r0 = r11.A03
            r3.A00 = r0
            X.D1X r1 = r11.A01
            r0 = r12
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r10 = r0.A00
            X.6s5 r10 = (X.C113756s5) r10
            java.lang.String r0 = r11.A02
            boolean r9 = X.C18220wO.A1U(r0)
            X.C86124wJ.A1S(r4, r12, r6, r2)
            X.777 r2 = X.C25515Dn3.A03
            X.D0w r1 = r1.A00
            java.lang.String r0 = "search"
            X.Dn3 r1 = r2.A01(r1, r0)
            com.instagram.ar.core.effectcollection.EffectCollectionService r8 = r3.A02
            java.lang.Object r0 = r10.A00
            X.C04220Ms.A06(r0)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2
            r3.<init>(r1, r0)
            boolean r2 = r10.A02
            java.lang.String r1 = r10.A01
            X.6s5 r0 = new X.6s5
            r0.<init>(r3, r1, r2)
            java.lang.Object r0 = r8.A09(r0, r6, r9, r5)
            if (r0 == r7) goto L_0x0096
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0096:
            if (r0 != r7) goto L_0x00a4
            return r7
        L_0x0099:
            java.lang.Object r12 = r6.A02
            X.3b6 r12 = (X.C62903b6) r12
            java.lang.Object r4 = r6.A01
            X.4r0 r4 = (X.C83234r0) r4
            X.AnonymousClass0OU.A00(r3)
        L_0x00a4:
            X.1jA r12 = (X.AnonymousClass1jA) r12
            java.lang.Object r0 = r12.A00
            X.6s5 r0 = (X.C113756s5) r0
            java.lang.Object r3 = r0.A00
            X.C04220Ms.A06(r3)
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r0.A02
            java.lang.String r1 = r0.A01
            X.G7K r0 = new X.G7K
            r0.<init>(r1, r3, r2)
            X.1jA r0 = X.AnonymousClass1jA.A00(r0)
            goto L_0x0043
        L_0x00bf:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r6.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00cb:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
