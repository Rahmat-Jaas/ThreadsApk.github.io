package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import X.C83224qz;
import X.C86064wD;
import X.D0E;
import com.instagram.debug.devoptions.cam.CamDevOptionsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$sendEvent$1", f = "CamDevOptionsViewModel.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
public final class CamDevOptionsViewModel$sendEvent$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ CamDevOptionsViewModel.UIEvent $uiEvent;
    public int label;
    public final /* synthetic */ CamDevOptionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsViewModel$sendEvent$1(CamDevOptionsViewModel camDevOptionsViewModel, CamDevOptionsViewModel.UIEvent uIEvent, C146958n9 r4) {
        super(2, r4);
        this.this$0 = camDevOptionsViewModel;
        this.$uiEvent = uIEvent;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new CamDevOptionsViewModel$sendEvent$1(this.this$0, this.$uiEvent, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((CamDevOptionsViewModel$sendEvent$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            C86064wD r1 = this.this$0.eventChannel;
            CamDevOptionsViewModel.UIEvent uIEvent = this.$uiEvent;
            this.label = 1;
            if (r1.Cgt(uIEvent, this) == d0e) {
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
