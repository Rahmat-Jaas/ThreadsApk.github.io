package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.AnonymousClass6VR;
import X.C146958n9;
import X.C18180wK;
import X.C18250wR;
import X.C28161tl;
import X.C39142Kno;
import X.C83224qz;
import com.instagram.user.model.User;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$configureUserEligibility$1", f = "CamDevOptionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CamDevOptionsViewModel$configureUserEligibility$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ boolean $paidPartnershipLabelOptIn;
    public int label;
    public final /* synthetic */ CamDevOptionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsViewModel$configureUserEligibility$1(boolean z, CamDevOptionsViewModel camDevOptionsViewModel, C146958n9 r4) {
        super(2, r4);
        this.$paidPartnershipLabelOptIn = z;
        this.this$0 = camDevOptionsViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new CamDevOptionsViewModel$configureUserEligibility$1(this.$paidPartnershipLabelOptIn, this.this$0, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((CamDevOptionsViewModel$configureUserEligibility$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0OU.A00(obj);
            boolean z = this.$paidPartnershipLabelOptIn;
            C28161tl A01 = AnonymousClass3WS.A01(this.this$0.userSession);
            if (z) {
                C18180wK.A0v(C28161tl.A02(A01), "branded_content_eligibility_decision", "eligible");
                User A0R = C18250wR.A0R(this.this$0.userSession);
                A0R.A2K(true);
                AnonymousClass6VR.A00(this.this$0.userSession).A02(A0R, true, false);
            } else {
                C18180wK.A0v(C28161tl.A02(A01), "branded_content_eligibility_decision", "eligible_pending_opt_in");
            }
            this.this$0.hideLoading();
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0a();
    }
}
