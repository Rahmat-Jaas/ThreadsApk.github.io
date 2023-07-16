package com.facebook.pando;

import X.AnonymousClass6HO;
import X.C15020qa;
import com.facebook.jni.HybridClassBase;
import java.util.concurrent.Executor;

public final class PandoConsistencyServiceJNI extends HybridClassBase {
    public static final AnonymousClass6HO Companion = new AnonymousClass6HO();

    public static final native PandoConsistencyServiceJNI create(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor, int i);

    public final native boolean hasSubscribersRacey();

    public final native void publishTreeUpdater(TreeUpdaterJNI treeUpdaterJNI);

    public final native void setPublishPostProcessor(PandoPublishPostProcessorProvider pandoPublishPostProcessorProvider);

    static {
        C15020qa.A0A("pando-jni");
    }
}
