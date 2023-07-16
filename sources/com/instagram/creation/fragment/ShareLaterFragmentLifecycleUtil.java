package com.instagram.creation.fragment;

public final class ShareLaterFragmentLifecycleUtil {
    public static void cleanupReferences(ShareLaterFragment shareLaterFragment) {
        shareLaterFragment.mAppShareTable = null;
        shareLaterFragment.mIgShareTable = null;
    }
}
