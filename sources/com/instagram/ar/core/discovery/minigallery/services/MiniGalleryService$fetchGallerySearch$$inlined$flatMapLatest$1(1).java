package com.instagram.ar.core.discovery.minigallery.services;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass1jA;
import X.C113756s5;
import X.C146958n9;
import X.C18190wL;
import X.C25817DsW;
import X.C39142Kno;
import X.C83234r0;
import X.C84714tk;
import X.C86164wN;
import X.D0E;
import X.D1X;
import X.G7K;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1", f = "MiniGalleryService.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
public final class MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ MiniGalleryService A03;
    public final /* synthetic */ D1X A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(MiniGalleryService miniGalleryService, D1X d1x, String str, String str2, String str3, C146958n9 r7) {
        super(3, r7);
        this.A03 = miniGalleryService;
        this.A07 = str;
        this.A04 = d1x;
        this.A06 = str2;
        this.A05 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MiniGalleryService miniGalleryService = this.A03;
        String str = this.A07;
        MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 = new MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(miniGalleryService, this.A04, str, this.A06, this.A05, (C146958n9) obj3);
        miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C84714tk A042;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C83234r0 r5 = (C83234r0) this.A01;
            C113756s5 r1 = (C113756s5) this.A02;
            if (r1 == null || !C18190wL.A1a((Collection) ((KtCSuperShape0S0410000_I2) r1.A00).A01)) {
                A042 = MiniGalleryService.A04(this.A03, this.A04, this.A07, this.A06, this.A05);
            } else {
                boolean z = r1.A02;
                A042 = C86164wN.A0M(AnonymousClass1jA.A00(new G7K(r1.A01, (List) ((KtCSuperShape0S0410000_I2) r1.A00).A01, z)));
            }
            this.A00 = 1;
            if (C25817DsW.A02(this, A042, r5) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }
}
