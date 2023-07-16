package com.instagram.debug.devoptions;

import X.C83954sG;
import androidx.fragment.app.FragmentActivity;

public final class FXPFLinkageCacheDebugFragment$onCreateView$listener$1 implements C83954sG {
    public final /* synthetic */ FXPFLinkageCacheDebugFragment this$0;

    public FXPFLinkageCacheDebugFragment$onCreateView$listener$1(FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment) {
        this.this$0 = fXPFLinkageCacheDebugFragment;
    }

    public void onFailure() {
        FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment = this.this$0;
        FragmentActivity activity = fXPFLinkageCacheDebugFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new FXPFLinkageCacheDebugFragment$onCreateView$listener$1$onFailure$1(fXPFLinkageCacheDebugFragment));
        }
    }

    public void onSuccess() {
        FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment = this.this$0;
        FragmentActivity activity = fXPFLinkageCacheDebugFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new FXPFLinkageCacheDebugFragment$onCreateView$listener$1$onSuccess$1(fXPFLinkageCacheDebugFragment));
        }
    }
}
