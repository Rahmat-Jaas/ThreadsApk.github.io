package com.instagram.ar.core.discovery.minigallery.services;

import X.AnonymousClass0YM;
import X.C146958n9;
import X.C39142Kno;
import X.D1X;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1", f = "MiniGalleryCategoriesService.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ MiniGalleryCategoriesService A03;
    public final /* synthetic */ D1X A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(MiniGalleryCategoriesService miniGalleryCategoriesService, D1X d1x, C146958n9 r4, boolean z, boolean z2) {
        super(3, r4);
        this.A03 = miniGalleryCategoriesService;
        this.A06 = z;
        this.A04 = d1x;
        this.A05 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MiniGalleryCategoriesService miniGalleryCategoriesService = this.A03;
        boolean z = this.A06;
        MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 = new MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(miniGalleryCategoriesService, this.A04, (C146958n9) obj3, z, this.A05);
        miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r2 != null) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r12.A00
            r6 = 1
            if (r0 == 0) goto L_0x000d
            X.AnonymousClass0OU.A00(r13)
        L_0x000a:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x000d:
            X.AnonymousClass0OU.A00(r13)
            java.lang.Object r5 = r12.A01
            X.4r0 r5 = (X.C83234r0) r5
            java.lang.Object r4 = r12.A02
            X.6jP r4 = (X.C109066jP) r4
            java.util.List r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0058
            java.util.List r1 = r4.A02
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r3 = r1.iterator()
        L_0x002a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2) r0
            java.lang.String r1 = r0.A02
            r0 = 362(0x16a, float:5.07E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x0058
        L_0x0047:
            X.1jA r0 = X.AnonymousClass1jA.A00(r4)
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r2 = X.C86164wN.A0M(r0)
        L_0x004f:
            r12.A00 = r6
            java.lang.Object r0 = X.C25817DsW.A02(r12, r2, r5)
            if (r0 != r7) goto L_0x000a
            return r7
        L_0x0058:
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r4 = r12.A03
            android.content.Context r0 = r4.A01
            boolean r0 = X.AnonymousClass0fS.A09(r0)
            X.D1X r3 = r12.A04
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r12.A05
            boolean r11 = r12.A06
            com.instagram.service.session.UserSession r9 = r4.A03
            X.D0w r2 = r3.A00
            X.C04220Ms.A0B(r2, r6)
            r8 = 0
            X.3zb r10 = X.C67463zb.A00()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "include_flm_effects"
            r10.A03(r0, r1)
            java.lang.String r1 = r2.name()
            java.lang.String r0 = "product"
            r10.A05(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "show_green_screen_category_for_reels"
            r10.A03(r0, r1)
            java.lang.Class<X.5GO> r2 = X.AnonymousClass5GO.class
            java.lang.String r1 = "IGAREffectsGalleryCategoriesQuery"
            X.3zc r0 = new X.3zc
            r0.<init>(r10, r2, r1)
            r2 = 74970091(0x477f3eb, float:2.9146712E-36)
            X.GfJ r1 = new X.GfJ
            r1.<init>((X.C10300i6) r9)
            r1.A06(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1.A03 = r0
            r1.A05 = r8
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r1 = X.C86104wH.A0O(r1, r2)
            r0 = 0
            com.facebook.redex.IDxFlowShape76S0300000_2_I2 r2 = new com.facebook.redex.IDxFlowShape76S0300000_2_I2
            r2.<init>(r0, r4, r3, r1)
            goto L_0x004f
        L_0x00b4:
            r2 = 0
            r1 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r0.<init>((X.C146958n9) r2, (java.lang.Object) r4, (java.lang.Object) r3, (int) r1)
            X.86y r2 = new X.86y
            r2.<init>(r0)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
