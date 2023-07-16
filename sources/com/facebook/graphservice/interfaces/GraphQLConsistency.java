package com.facebook.graphservice.interfaces;

import X.C142108dr;
import X.C97736Co;
import com.google.common.util.concurrent.ListenableFuture;

public interface GraphQLConsistency extends GraphQLBaseConsistency {
    ListenableFuture applyOptimistic(Tree tree, Tree tree2, C97736Co r3);

    ListenableFuture applyOptimisticBuilder(C142108dr r1, Tree tree, C97736Co r3);

    ListenableFuture publish(Tree tree);

    ListenableFuture publishBuilder(C142108dr r1);

    ListenableFuture publishBuilderWithFullConsistency(C142108dr r1);

    ListenableFuture publishWithFullConsistency(Tree tree);
}
