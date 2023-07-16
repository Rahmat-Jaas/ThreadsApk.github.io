package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass5z3;
import X.C100976Pk;
import X.C146958n9;
import X.C39142Kno;
import X.C83224qz;
import X.C83234r0;
import X.C84714tk;
import X.C86074wE;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.MediaKitDevOptionViewModel$deleteMediaKitById$1", f = "MediaKitDevOptionViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class MediaKitDevOptionViewModel$deleteMediaKitById$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ String $mediaKitId;
    public int label;
    public final /* synthetic */ MediaKitDevOptionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionViewModel$deleteMediaKitById$1(MediaKitDevOptionViewModel mediaKitDevOptionViewModel, String str, C146958n9 r4) {
        super(2, r4);
        this.this$0 = mediaKitDevOptionViewModel;
        this.$mediaKitId = str;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new MediaKitDevOptionViewModel$deleteMediaKitById$1(this.this$0, this.$mediaKitId, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((MediaKitDevOptionViewModel$deleteMediaKitById$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            C84714tk A06 = this.this$0.mediaKitApi.A06(this.$mediaKitId);
            final MediaKitDevOptionViewModel mediaKitDevOptionViewModel = this.this$0;
            AnonymousClass1 r0 = new C83234r0() {
                public final Object emit(C100976Pk r3, C146958n9 r4) {
                    C86074wE.A01(MediaKitDevOptionViewModel.this._loadingListState, r3 instanceof AnonymousClass5z3);
                    return Unit.A00;
                }
            };
            this.label = 1;
            if (A06.collect(r0, this) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        this.this$0.fetchMediaKitList();
        return Unit.A00;
    }
}
