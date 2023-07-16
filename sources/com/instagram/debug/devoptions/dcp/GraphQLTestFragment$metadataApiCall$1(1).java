package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C112086oy;
import X.C143338gY;
import X.C146958n9;
import X.C25599DoZ;
import X.C27219EgD;
import X.C39142Kno;
import X.C685344e;
import X.C83224qz;
import X.D0E;
import X.E5N;
import com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.ui.base.IgTextView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.GraphQLTestFragment$metadataApiCall$1", f = "GraphQLTestFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class GraphQLTestFragment$metadataApiCall$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ C112086oy $onDeviceFLMetadataApi;
    public final /* synthetic */ String $useCase;
    public final /* synthetic */ String $version;
    public int label;
    public final /* synthetic */ GraphQLTestFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.dcp.GraphQLTestFragment$metadataApiCall$1$1", f = "GraphQLTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.dcp.GraphQLTestFragment$metadataApiCall$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r5) {
            return new AnonymousClass1(A00, r5);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            TreeJNI A03;
            TreeJNI treeValue;
            ImmutableList treeList;
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                IgTextView igTextView = GraphQLTestFragment.this.resultText;
                String str = null;
                if (igTextView == null) {
                    C04220Ms.A0E("resultText");
                    throw null;
                }
                C143338gY r0 = A00;
                if (!(r0 == null || (A03 = C685344e.A03(r0)) == null || (treeValue = A03.getTreeValue("on_device_fl_metadata(input_params:{\"client_signal_metadata_version\":$client_signal_metadata_version,\"usecases\":$usecases})", OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.class)) == null || (treeList = treeValue.getTreeList("usecases", OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.class)) == null)) {
                    str = treeList.toString();
                }
                igTextView.setText(str);
                return Unit.A00;
            }
            throw AnonymousClass0wJ.A0a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphQLTestFragment$metadataApiCall$1(C112086oy r2, String str, String str2, GraphQLTestFragment graphQLTestFragment, C146958n9 r6) {
        super(2, r6);
        this.$onDeviceFLMetadataApi = r2;
        this.$useCase = str;
        this.$version = str2;
        this.this$0 = graphQLTestFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new GraphQLTestFragment$metadataApiCall$1(this.$onDeviceFLMetadataApi, this.$useCase, this.$version, this.this$0, r8);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((GraphQLTestFragment$metadataApiCall$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        TreeJNI A03;
        TreeJNI treeValue;
        ImmutableList treeList;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            final C143338gY A00 = this.$onDeviceFLMetadataApi.A00(ImmutableList.of(new KtCSuperShape0S2000000_I2(this.$useCase, this.$version, 1)), "0.0.0");
            if (!(A00 == null || (A03 = C685344e.A03(A00)) == null || (treeValue = A03.getTreeValue("on_device_fl_metadata(input_params:{\"client_signal_metadata_version\":$client_signal_metadata_version,\"usecases\":$usecases})", OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.class)) == null || (treeList = treeValue.getTreeList("usecases", OnDeviceFLMetadataResponseImpl.OnDeviceFlMetadata.Usecases.class)) == null)) {
                treeList.toString();
            }
            final GraphQLTestFragment graphQLTestFragment = this.this$0;
            C27219EgD egD = ((E5N) graphQLTestFragment.dispatcherProvider).A03;
            AnonymousClass1 r0 = new AnonymousClass1((C146958n9) null);
            this.label = 1;
            if (C25599DoZ.A00(this, egD, r0) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        return Unit.A00;
    }
}
