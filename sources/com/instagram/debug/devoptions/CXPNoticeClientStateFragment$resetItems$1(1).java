package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import X.C18190wL;
import X.C63813iO;
import android.view.View;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;

public final class CXPNoticeClientStateFragment$resetItems$1 implements View.OnClickListener {
    public final /* synthetic */ CXPNoticeClientStateFragment this$0;

    public CXPNoticeClientStateFragment$resetItems$1(CXPNoticeClientStateFragment cXPNoticeClientStateFragment) {
        this.this$0 = cXPNoticeClientStateFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2027968159);
        CXPNoticeStateRepository cXPNoticeStateRepository = this.this$0.cxpNoticesRepository;
        if (cXPNoticeStateRepository == null) {
            C04220Ms.A0E("cxpNoticesRepository");
            throw null;
        }
        C18190wL.A11(cXPNoticeStateRepository.A02.A00);
        C63813iO.A0C(this.this$0.getContext(), "Cleared All cached states and please refresh the page.");
        C14030oh.A0C(-1051195782, A05);
    }
}
