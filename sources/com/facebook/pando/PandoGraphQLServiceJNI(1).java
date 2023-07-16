package com.facebook.pando;

import X.AnonymousClass0wJ;
import X.AnonymousClass6HR;
import X.C04220Ms;
import X.C145218k7;
import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PandoGraphQLServiceJNI implements IPandoGraphQLService {
    public static final AnonymousClass6HR Companion = new AnonymousClass6HR();
    public final HybridData mHybridData;

    public /* synthetic */ PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(pandoPrimaryExecution, pandoConsistencyServiceJNI, z);
    }

    public static final PandoGraphQLServiceJNI createDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoConsistencyServiceJNI pandoConsistencyServiceJNI) {
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoConsistencyServiceJNI, true);
    }

    public static final PandoGraphQLServiceJNI createNonDelegating(PandoPrimaryExecution pandoPrimaryExecution, PandoConsistencyServiceJNI pandoConsistencyServiceJNI) {
        return new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoConsistencyServiceJNI, false);
    }

    private final native PandoConsistencyServiceJNI getConsistencyService();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, boolean z);

    private final native IPandoGraphQLService.Result initiateNative(String str, PandoGraphQLRequest pandoGraphQLRequest, NativeCallbacks nativeCallbacks, Executor executor);

    private final native IPandoGraphQLService.Result subscribeNative(TreeJNI treeJNI, Class cls, NativeCallbacks nativeCallbacks, Executor executor);

    public IPandoGraphQLService.Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, C145218k7 r4, Executor executor) {
        NativeCallbacks nativeCallbacks;
        C04220Ms.A0B(pandoGraphQLRequest, 1);
        if (r4 != null) {
            nativeCallbacks = new NativeCallbacks(r4);
        } else {
            nativeCallbacks = null;
        }
        return initiateNative(str, pandoGraphQLRequest, nativeCallbacks, executor);
    }

    public native void publish(String str);

    public void publishTreeUpdater(TreeUpdaterJNI treeUpdaterJNI) {
        C04220Ms.A0B(treeUpdaterJNI, 0);
        getConsistencyService().publishTreeUpdater(treeUpdaterJNI);
    }

    public final class NativeCallbacks {
        public final C145218k7 innerCallbacks;

        public NativeCallbacks(C145218k7 r2) {
            C04220Ms.A0B(r2, 1);
            this.innerCallbacks = r2;
        }

        public final void onError(String str) {
            C04220Ms.A0B(str, 0);
            this.innerCallbacks.onError(str);
        }

        public final void onModelUpdate(TreeJNI treeJNI, Summary summary) {
            AnonymousClass0wJ.A1N(treeJNI, summary);
            this.innerCallbacks.CRg(summary, treeJNI);
        }
    }

    static {
        C15020qa.A0A("pando-graphql-jni");
    }

    public PandoGraphQLServiceJNI(PandoPrimaryExecution pandoPrimaryExecution, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, boolean z) {
        this.mHybridData = initHybridData(pandoPrimaryExecution, pandoConsistencyServiceJNI, z);
    }

    public boolean hasSubscribersRacey() {
        return getConsistencyService().hasSubscribersRacey();
    }

    public IPandoGraphQLService.Result subscribe(Object obj, Class cls, C145218k7 r4, Executor executor) {
        AnonymousClass0wJ.A1O(cls, r4);
        C04220Ms.A0B(executor, 3);
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebook.pando.TreeJNI");
        return subscribeNative((TreeJNI) obj, cls, new NativeCallbacks(r4), executor);
    }
}
