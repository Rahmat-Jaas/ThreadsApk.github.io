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
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.MediaKitDevOptionViewModel$fetchMediaKitInfo$1", f = "MediaKitDevOptionViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class MediaKitDevOptionViewModel$fetchMediaKitInfo$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ String $mediaKitId;
    public int label;
    public final /* synthetic */ MediaKitDevOptionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionViewModel$fetchMediaKitInfo$1(String str, MediaKitDevOptionViewModel mediaKitDevOptionViewModel, C146958n9 r4) {
        super(2, r4);
        this.$mediaKitId = str;
        this.this$0 = mediaKitDevOptionViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new MediaKitDevOptionViewModel$fetchMediaKitInfo$1(this.$mediaKitId, this.this$0, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((MediaKitDevOptionViewModel$fetchMediaKitInfo$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C84714tk A08;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            String str = this.$mediaKitId;
            MediaKitDevOptionViewModel mediaKitDevOptionViewModel = this.this$0;
            if (str != null) {
                A08 = mediaKitDevOptionViewModel.mediaKitApi.A07(str);
            } else {
                A08 = mediaKitDevOptionViewModel.mediaKitApi.A08((Map) null, true);
            }
            final MediaKitDevOptionViewModel mediaKitDevOptionViewModel2 = this.this$0;
            MediaKitDevOptionViewModel$fetchMediaKitInfo$1$invokeSuspend$$inlined$map$1 mediaKitDevOptionViewModel$fetchMediaKitInfo$1$invokeSuspend$$inlined$map$1 = new MediaKitDevOptionViewModel$fetchMediaKitInfo$1$invokeSuspend$$inlined$map$1(A08, mediaKitDevOptionViewModel2);
            AnonymousClass3 r0 = new C83234r0() {
                public final Object emit(String str, C146958n9 r3) {
                    MediaKitDevOptionViewModel.this._mediaKitJsonFlow.CrC(str);
                    return Unit.A00;
                }
            };
            this.label = 1;
            if (mediaKitDevOptionViewModel$fetchMediaKitInfo$1$invokeSuspend$$inlined$map$1.collect(r0, this) == d0e) {
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
