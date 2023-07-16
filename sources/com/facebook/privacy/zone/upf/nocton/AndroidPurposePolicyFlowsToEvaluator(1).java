package com.facebook.privacy.zone.upf.nocton;

import X.C04220Ms;
import X.C15020qa;
import X.C98886Hh;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class AndroidPurposePolicyFlowsToEvaluator {
    public static final C98886Hh Companion = new C98886Hh();
    public final HybridData mHybridData;

    public AndroidPurposePolicyFlowsToEvaluator(HybridData hybridData) {
        C04220Ms.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native int flowsTo(String str, String str2, Map map);

    public static final native HybridData initHybrid0();

    static {
        C15020qa.A0A("mobile_purpose_policy");
    }

    public AndroidPurposePolicyFlowsToEvaluator() {
        this(initHybrid0());
    }
}
