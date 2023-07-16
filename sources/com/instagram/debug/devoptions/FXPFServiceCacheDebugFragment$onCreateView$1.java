package com.instagram.debug.devoptions;

import X.AnonymousClass49R;
import X.AnonymousClass4To;
import X.C04220Ms;
import X.C14030oh;
import android.view.View;

public final class FXPFServiceCacheDebugFragment$onCreateView$1 implements View.OnClickListener {
    public final /* synthetic */ FXPFServiceCacheDebugFragment$onCreateView$listener$1 $listener;
    public final /* synthetic */ FXPFServiceCacheDebugFragment this$0;

    public FXPFServiceCacheDebugFragment$onCreateView$1(FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment, FXPFServiceCacheDebugFragment$onCreateView$listener$1 fXPFServiceCacheDebugFragment$onCreateView$listener$1) {
        this.this$0 = fXPFServiceCacheDebugFragment;
        this.$listener = fXPFServiceCacheDebugFragment$onCreateView$listener$1;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1766435254);
        FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment = this.this$0;
        AnonymousClass49R r2 = fXPFServiceCacheDebugFragment.serviceCacheHelper;
        if (r2 == null) {
            C04220Ms.A0E("serviceCacheHelper");
            throw null;
        }
        r2.A03(fXPFServiceCacheDebugFragment.callerContext, this.$listener, "ig_android_service_cache_fx_internal", fXPFServiceCacheDebugFragment.allowedServicesList, AnonymousClass4To.A00());
        C14030oh.A0C(78104023, A05);
    }
}
