package com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1o3;
import X.AnonymousClass1o4;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1", f = "PostCaptureEffectMiniGalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1 extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ boolean A00;

    public PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1(C146958n9 r2) {
        super(2, r2);
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1 postCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1 = new PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1(r4);
        postCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1.A00 = AnonymousClass0wJ.A1X(obj);
        return postCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        if (this.A00) {
            return AnonymousClass1o4.A00;
        }
        return AnonymousClass1o3.A00;
    }
}
