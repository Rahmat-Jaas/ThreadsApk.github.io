package com.facebook.pando;

import X.AnonymousClass6HS;
import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;

public final class PandoToken implements IPandoGraphQLService.Token {
    public static final AnonymousClass6HS Companion = new AnonymousClass6HS();
    public final HybridData mHybridData;

    public native void cancel();

    static {
        C15020qa.A0A("pando-graphql-jni");
    }

    public PandoToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
