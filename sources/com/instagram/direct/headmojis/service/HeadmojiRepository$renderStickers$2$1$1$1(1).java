package com.instagram.direct.headmojis.service;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C120467Az;
import X.C1367884j;
import X.C146958n9;
import X.C18220wO;
import X.C25633DpA;
import X.C39142Kno;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.headmojis.service.HeadmojiRepository$renderStickers$2$1$1$1", f = "HeadmojiRepository.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
public final class HeadmojiRepository$renderStickers$2$1$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ HeadmojiRepository A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeadmojiRepository$renderStickers$2$1$1$1(HeadmojiRepository headmojiRepository, String str, C146958n9 r4, float f) {
        super(2, r4);
        this.A02 = headmojiRepository;
        this.A03 = str;
        this.A01 = f;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        return new HeadmojiRepository$renderStickers$2$1$1$1(this.A02, this.A03, r6, this.A01);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C25633DpA dpA = this.A02.A03;
            String str = this.A03;
            float f = this.A01;
            this.A00 = 1;
            if (C120467Az.A01(dpA.A02, new C1367884j(dpA, str, f), this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((HeadmojiRepository$renderStickers$2$1$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
