package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0YP;
import X.C112076ox;
import X.C146958n9;
import X.C39142Kno;
import X.C83224qz;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1", f = "GraphQLTestFragment.kt", i = {}, l = {123, 127, 131, 140}, m = "invokeSuspend", n = {}, s = {})
public final class GraphQLTestFragment$featuresApiCall$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ List $extra;
    public final /* synthetic */ C112076ox $onDeviceFLFeaturesAPI;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ String $useCase;
    public final /* synthetic */ String $version;
    public int label;
    public final /* synthetic */ GraphQLTestFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphQLTestFragment$featuresApiCall$1(C112076ox r2, String str, String str2, String str3, List list, GraphQLTestFragment graphQLTestFragment, C146958n9 r8) {
        super(2, r8);
        this.$onDeviceFLFeaturesAPI = r2;
        this.$useCase = str;
        this.$version = str2;
        this.$purpose = str3;
        this.$extra = list;
        this.this$0 = graphQLTestFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        return new GraphQLTestFragment$featuresApiCall$1(this.$onDeviceFLFeaturesAPI, this.$useCase, this.$version, this.$purpose, this.$extra, this.this$0, r10);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((GraphQLTestFragment$featuresApiCall$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.label
            r3 = 4
            r2 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r1) goto L_0x00bb
            if (r0 == r5) goto L_0x00bb
            if (r0 == r2) goto L_0x00bb
            if (r0 == r3) goto L_0x00bb
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0017:
            X.AnonymousClass0OU.A00(r14)
            X.6ox r6 = r13.$onDeviceFLFeaturesAPI
            java.lang.String r8 = r13.$useCase
            java.lang.String r9 = r13.$version
            java.lang.String r10 = r13.$purpose
            java.lang.Integer r7 = X.AnonymousClass006.A00
            java.util.List r12 = r13.$extra
            java.lang.String r11 = "test"
            X.8gY r7 = r6.A00(r7, r8, r9, r10, r11, r12)
            r6 = 0
            if (r7 != 0) goto L_0x0045
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment r2 = r13.this$0
            X.4u0 r0 = r2.dispatcherProvider
            X.E5N r0 = (X.E5N) r0
            X.EgD r3 = r0.A03
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$1 r0 = new com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$1
            r0.<init>(r6)
            r13.label = r1
        L_0x003e:
            java.lang.Object r0 = X.C25599DoZ.A00(r13, r3, r0)
        L_0x0042:
            if (r0 != r4) goto L_0x00be
            return r4
        L_0x0045:
            r0 = r7
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            java.lang.Object r8 = r0.A01
            if (r8 != 0) goto L_0x005c
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment r1 = r13.this$0
            X.4u0 r0 = r1.dispatcherProvider
            X.E5N r0 = (X.E5N) r0
            X.EgD r3 = r0.A03
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$2 r0 = new com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$2
            r0.<init>(r6)
            r13.label = r5
            goto L_0x003e
        L_0x005c:
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            if (r8 == 0) goto L_0x00ab
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl$OnDeviceFlFeatures> r5 = com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.class
            java.lang.String r1 = "on_device_fl_features(input_params:{\"client_msg\":$client_msg,\"client_msg_type\":$client_msg_type,\"contexts\":$contexts,\"purpose\":$purpose,\"test_id\":$test_id,\"usecase\":$usecase,\"version\":$version})"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r1, r5)
            if (r0 == 0) goto L_0x00ab
            com.facebook.pando.TreeJNI r2 = r8.getTreeValue(r1, r5)
            if (r2 == 0) goto L_0x0097
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl$OnDeviceFlFeatures$Features> r1 = com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.class
            java.lang.String r0 = "features"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r5 = r0.iterator()
        L_0x007e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0097
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r5)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl$OnDeviceFlFeatures$Features$Context> r1 = com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context.class
            java.lang.String r0 = "context"
            r2.getTreeValue(r0, r1)
            java.lang.Class<com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl$OnDeviceFlFeatures$Features$FloatFeatures> r1 = com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.FloatFeatures.class
            java.lang.String r0 = "float_features"
            r2.getTreeList(r0, r1)
            goto L_0x007e
        L_0x0097:
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment r2 = r13.this$0
            X.4u0 r0 = r2.dispatcherProvider
            X.E5N r0 = (X.E5N) r0
            X.EgD r1 = r0.A03
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$5 r0 = new com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$5
            r0.<init>(r7, r6)
            r13.label = r3
            java.lang.Object r0 = X.C25599DoZ.A00(r13, r1, r0)
            goto L_0x0042
        L_0x00ab:
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment r1 = r13.this$0
            X.4u0 r0 = r1.dispatcherProvider
            X.E5N r0 = (X.E5N) r0
            X.EgD r3 = r0.A03
            com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$3 r0 = new com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1$3
            r0.<init>(r6)
            r13.label = r2
            goto L_0x003e
        L_0x00bb:
            X.AnonymousClass0OU.A00(r14)
        L_0x00be:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.dcp.GraphQLTestFragment$featuresApiCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
