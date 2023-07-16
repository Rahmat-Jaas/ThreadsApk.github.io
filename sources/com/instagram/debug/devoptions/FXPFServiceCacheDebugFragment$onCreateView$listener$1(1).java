package com.instagram.debug.devoptions;

import X.C83954sG;
import androidx.fragment.app.FragmentActivity;

public final class FXPFServiceCacheDebugFragment$onCreateView$listener$1 implements C83954sG {
    public final /* synthetic */ FXPFServiceCacheDebugFragment this$0;

    public FXPFServiceCacheDebugFragment$onCreateView$listener$1(FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment) {
        this.this$0 = fXPFServiceCacheDebugFragment;
    }

    public void onFailure() {
        FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment = this.this$0;
        FragmentActivity activity = fXPFServiceCacheDebugFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new FXPFServiceCacheDebugFragment$onCreateView$listener$1$onFailure$1(fXPFServiceCacheDebugFragment));
        }
    }

    public void onSuccess() {
        FXPFServiceCacheDebugFragment fXPFServiceCacheDebugFragment = this.this$0;
        FragmentActivity activity = fXPFServiceCacheDebugFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new FXPFServiceCacheDebugFragment$onCreateView$listener$1$onSuccess$1(fXPFServiceCacheDebugFragment));
        }
    }
}
