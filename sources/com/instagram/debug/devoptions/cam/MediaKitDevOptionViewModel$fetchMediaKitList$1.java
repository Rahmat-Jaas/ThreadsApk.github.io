package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import X.C83224qz;
import X.C83234r0;
import X.C84714tk;
import X.D0E;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.MediaKitDevOptionViewModel$fetchMediaKitList$1", f = "MediaKitDevOptionViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class MediaKitDevOptionViewModel$fetchMediaKitList$1 extends C39142Kno implements AnonymousClass0YP {
    public int label;
    public final /* synthetic */ MediaKitDevOptionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionViewModel$fetchMediaKitList$1(MediaKitDevOptionViewModel mediaKitDevOptionViewModel, C146958n9 r3) {
        super(2, r3);
        this.this$0 = mediaKitDevOptionViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        return new MediaKitDevOptionViewModel$fetchMediaKitList$1(this.this$0, r4);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return new MediaKitDevOptionViewModel$fetchMediaKitList$1(this.this$0, r4).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            C84714tk A05 = this.this$0.mediaKitApi.A05();
            final MediaKitDevOptionViewModel mediaKitDevOptionViewModel = this.this$0;
            MediaKitDevOptionViewModel$fetchMediaKitList$1$invokeSuspend$$inlined$map$1 mediaKitDevOptionViewModel$fetchMediaKitList$1$invokeSuspend$$inlined$map$1 = new MediaKitDevOptionViewModel$fetchMediaKitList$1$invokeSuspend$$inlined$map$1(A05, mediaKitDevOptionViewModel);
            AnonymousClass2 r0 = new C83234r0() {
                public final Object emit(List list, C146958n9 r3) {
                    MediaKitDevOptionViewModel.this._mediaKitListFlow.CrC(list);
                    return Unit.A00;
                }
            };
            this.label = 1;
            if (mediaKitDevOptionViewModel$fetchMediaKitList$1$invokeSuspend$$inlined$map$1.collect(r0, this) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        return Unit.A00;
    }
}
