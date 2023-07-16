package com.instagram.ar.core.discovery.minigallery.services;

import X.AnonymousClass0YM;
import X.C146958n9;
import X.C39142Kno;
import X.C61133Sa;
import X.D1X;
import X.DOT;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1", f = "MiniGalleryPrefetchingService.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class MiniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C61133Sa A03;
    public final /* synthetic */ DOT A04;
    public final /* synthetic */ MiniGalleryService A05;
    public final /* synthetic */ D1X A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1(C61133Sa r2, DOT dot, MiniGalleryService miniGalleryService, D1X d1x, C146958n9 r6, boolean z) {
        super(3, r6);
        this.A07 = z;
        this.A04 = dot;
        this.A03 = r2;
        this.A05 = miniGalleryService;
        this.A06 = d1x;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = this.A07;
        DOT dot = this.A04;
        MiniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1 miniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1 = new MiniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1(this.A03, dot, this.A05, this.A06, (C146958n9) obj3, z);
        miniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r15.A00
            if (r0 == 0) goto L_0x000c
            X.AnonymousClass0OU.A00(r16)
        L_0x0009:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x000c:
            X.AnonymousClass0OU.A00(r16)
            java.lang.Object r4 = r15.A01
            X.4r0 r4 = (X.C83234r0) r4
            java.lang.Object r1 = r15.A02
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0067
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x008c
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.6jP r0 = (X.C109066jP) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2 r0 = r0.A00
            if (r0 == 0) goto L_0x0064
            X.777 r2 = X.C25515Dn3.A03
            X.D0w r1 = X.C23908D0w.REELS
            java.lang.String r0 = r0.A02
            X.Dn3 r0 = r2.A01(r1, r0)
        L_0x0033:
            java.util.List r0 = X.C18180wK.A0n(r0)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r2.next()
            X.Dn3 r1 = (X.C25515Dn3) r1
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r0 = r15.A05
            X.D1X r7 = r15.A06
            java.lang.String r8 = r1.A01
            r9 = 0
            r13 = 0
            r14 = 1
            X.6me r6 = new X.6me
            r10 = r9
            r11 = r9
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.4tk r0 = r0.A06(r6)
            r5.add(r0)
            goto L_0x003f
        L_0x0064:
            X.Dn3 r0 = X.C25515Dn3.A08
            goto L_0x0033
        L_0x0067:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = "MiniGalleryPrefetchingService"
            java.lang.String r0 = "Prefetching Mini Gallery categories failed"
            X.AnonymousClass0LU.A0B(r1, r0)
            X.3Sa r7 = r15.A03
            X.01V r6 = X.AnonymousClass01V.A0p
            int r5 = X.C61133Sa.A00(r7)
            r2 = 17640585(0x10d2c89, float:2.5929562E-38)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "categories_fetch_failed"
            r6.markerAnnotate((int) r2, (int) r5, (java.lang.String) r1, (java.lang.String) r0)
            int r1 = X.C61133Sa.A00(r7)
            r0 = 3
            r6.markerEnd(r2, r1, r0)
        L_0x008c:
            X.4V0 r1 = X.AnonymousClass4V0.A00
            goto L_0x00a2
        L_0x008f:
            java.util.List r1 = X.AnonymousClass00J.A0N(r5)
            r0 = 0
            X.4tk[] r0 = new X.C84714tk[r0]
            java.lang.Object[] r2 = r1.toArray(r0)
            if (r2 == 0) goto L_0x00ac
            r0 = 6
            com.facebook.redex.IDxFlowShape251S0100000_2_I2 r1 = new com.facebook.redex.IDxFlowShape251S0100000_2_I2
            r1.<init>(r2, r0)
        L_0x00a2:
            r0 = 1
            r15.A00 = r0
            java.lang.Object r0 = X.C25817DsW.A02(r15, r1, r4)
            if (r0 != r3) goto L_0x0009
            return r3
        L_0x00ac:
            r0 = 8
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x00b7:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryPrefetchingService$prefetchMiniGallery$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
