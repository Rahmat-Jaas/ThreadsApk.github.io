package com.facebook.pando;

import X.C143348gZ;
import X.C145218k7;
import java.util.concurrent.Executor;

public interface IPandoGraphQLService {

    public interface Token extends C143348gZ {
        void cancel();
    }

    Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, C145218k7 r3, Executor executor);

    void publish(String str);

    void publishTreeUpdater(TreeUpdaterJNI treeUpdaterJNI);

    Result subscribe(Object obj, Class cls, C145218k7 r3, Executor executor);

    public final class Result {
        public final Token cancelToken;
        public final Object tree;

        public Result(Object obj, Token token) {
            this.tree = obj;
            this.cancelToken = token;
        }
    }
}
