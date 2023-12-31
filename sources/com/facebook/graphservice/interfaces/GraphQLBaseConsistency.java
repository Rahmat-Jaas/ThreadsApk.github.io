package com.facebook.graphservice.interfaces;

import X.C142108dr;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public interface GraphQLBaseConsistency {
    ListenableFuture lookup(Object obj);

    ListenableFuture publishBuilder(C142108dr r1);

    ListenableFuture publishBuilderWithFullConsistency(C142108dr r1);

    GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);
}
