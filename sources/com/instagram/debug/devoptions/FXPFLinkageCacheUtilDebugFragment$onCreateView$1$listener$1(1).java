package com.instagram.debug.devoptions;

import androidx.fragment.app.FragmentActivity;

public final class FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1 {
    public final /* synthetic */ FXPFLinkageCacheUtilDebugFragment this$0;

    public FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1(FXPFLinkageCacheUtilDebugFragment fXPFLinkageCacheUtilDebugFragment) {
        this.this$0 = fXPFLinkageCacheUtilDebugFragment;
    }

    public void onFailure() {
        FXPFLinkageCacheUtilDebugFragment fXPFLinkageCacheUtilDebugFragment = this.this$0;
        FragmentActivity activity = fXPFLinkageCacheUtilDebugFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1$onFailure$1(fXPFLinkageCacheUtilDebugFragment));
        }
    }

    public void onSuccess(boolean z) {
        String str;
        if (z) {
            str = "Same account";
        } else {
            str = "Not same account";
        }
        FXPFLinkageCacheUtilDebugFragment fXPFLinkageCacheUtilDebugFragment = this.this$0;
        FragmentActivity activity = fXPFLinkageCacheUtilDebugFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new FXPFLinkageCacheUtilDebugFragment$onCreateView$1$listener$1$onSuccess$1(fXPFLinkageCacheUtilDebugFragment, str));
        }
    }
}
