package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import X.C29691z7;
import android.view.View;
import android.widget.Spinner;

public final class FXPFLinkageCacheDebugFragment$onCreateView$1 implements View.OnClickListener {
    public final /* synthetic */ FXPFLinkageCacheDebugFragment$onCreateView$listener$1 $listener;
    public final /* synthetic */ FXPFLinkageCacheDebugFragment this$0;

    public FXPFLinkageCacheDebugFragment$onCreateView$1(FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment, FXPFLinkageCacheDebugFragment$onCreateView$listener$1 fXPFLinkageCacheDebugFragment$onCreateView$listener$1) {
        this.this$0 = fXPFLinkageCacheDebugFragment;
        this.$listener = fXPFLinkageCacheDebugFragment$onCreateView$listener$1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = C14030oh.A05(-1849512047);
        Spinner spinner = this.this$0.querySelector;
        if (spinner == null) {
            str = "querySelector";
        } else {
            boolean A0I = C04220Ms.A0I(spinner.getSelectedItem().toString(), FXPFLinkageCacheDebugFragment.FXAIC_QUERY);
            FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment = this.this$0;
            C29691z7 r4 = fXPFLinkageCacheDebugFragment.accountCacheHelper;
            if (r4 == null) {
                str = "accountCacheHelper";
            } else {
                r4.A0E(fXPFLinkageCacheDebugFragment.callerContext, this.$listener, Boolean.valueOf(A0I), FXPFLinkageCacheDebugFragment.callerName);
                C14030oh.A0C(-897757025, A05);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
