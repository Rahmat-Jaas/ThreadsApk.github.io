package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import X.C83224qz;
import com.instagram.debug.devoptions.cam.CamDevOptionsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$launchMediaKitFeedSettings$1", f = "CamDevOptionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CamDevOptionsViewModel$launchMediaKitFeedSettings$1 extends C39142Kno implements AnonymousClass0YP {
    public int label;
    public final /* synthetic */ CamDevOptionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsViewModel$launchMediaKitFeedSettings$1(CamDevOptionsViewModel camDevOptionsViewModel, C146958n9 r3) {
        super(2, r3);
        this.this$0 = camDevOptionsViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        return new CamDevOptionsViewModel$launchMediaKitFeedSettings$1(this.this$0, r4);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return new CamDevOptionsViewModel$launchMediaKitFeedSettings$1(this.this$0, r4).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0OU.A00(obj);
            this.this$0.sendEvent(CamDevOptionsViewModel.UIEvent.LaunchMediaKitSettings.INSTANCE);
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0a();
    }
}
