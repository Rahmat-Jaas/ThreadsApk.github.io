package com.instagram.wellbeing.equity.diversity;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.equity.diversity.DiversityInfoRepository$updateCacheAndDispatch$1", f = "DiversityInfoRepository.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class DiversityInfoRepository$updateCacheAndDispatch$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ DiversityInfoRepository A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiversityInfoRepository$updateCacheAndDispatch$1(DiversityInfoRepository diversityInfoRepository, String str, C146958n9 r4) {
        super(2, r4);
        this.A01 = diversityInfoRepository;
        this.A02 = str;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new DiversityInfoRepository$updateCacheAndDispatch$1(this.A01, this.A02, r5);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            DiversityInfoRepository diversityInfoRepository = this.A01;
            String str = this.A02;
            this.A00 = 1;
            if (diversityInfoRepository.A05(str, this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DiversityInfoRepository$updateCacheAndDispatch$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
