package com.instagram.fx.access.constants;

import X.C04220Ms;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public enum FxcalAccountType {
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (FxcalAccountType fxcalAccountType : values()) {
            builder.put(fxcalAccountType.A00, fxcalAccountType);
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        A01 = build;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    FxcalAccountType(String str) {
        this.A00 = str;
    }
}
