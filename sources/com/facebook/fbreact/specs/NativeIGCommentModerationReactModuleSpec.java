package com.facebook.fbreact.specs;

import X.C145858lE;
import X.IPD;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIGCommentModerationReactModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGCommentModerationReactModule";

    @ReactMethod
    public abstract void fetchBlockedCommenters(C145858lE r1);

    @ReactMethod
    public abstract void fetchCommentAudienceControlType(C145858lE r1);

    @ReactMethod
    public abstract void fetchCommentCategoryFilterDisabled(C145858lE r1);

    @ReactMethod
    public abstract void fetchCommentFilter(C145858lE r1);

    @ReactMethod
    public abstract void fetchCommentFilterKeywords(C145858lE r1);

    @ReactMethod
    public abstract void fetchCurrentUser(C145858lE r1);

    public String getName() {
        return "IGCommentModerationReactModule";
    }

    @ReactMethod
    public abstract void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void setBlockedCommenters(ReadableMap readableMap, C145858lE r2);

    @ReactMethod
    public abstract void setCommentAudienceControlType(String str, C145858lE r2);

    @ReactMethod
    public abstract void setCommentCategoryFilterDisabled(boolean z, C145858lE r2);

    @ReactMethod
    public abstract void setCustomKeywords(String str, C145858lE r2);

    @ReactMethod
    public abstract void setCustomKeywordsWithDisabled(String str, boolean z, C145858lE r3);

    @ReactMethod
    public abstract void setUseDefaultKeywords(boolean z, C145858lE r2);

    public NativeIGCommentModerationReactModuleSpec(IPD ipd) {
        super(ipd);
    }
}
