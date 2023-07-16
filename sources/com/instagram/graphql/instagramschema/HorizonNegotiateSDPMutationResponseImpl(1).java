package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class HorizonNegotiateSDPMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XigCloudHorizonNegotiateSdp extends TreeJNI implements C81204nM {

        public final class ScreenSize extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{IgReactMediaPickerNativeModule.HEIGHT, IgReactMediaPickerNativeModule.WIDTH};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"input_channel_label", "is_enqueued", "lifecycle_channel_label", "sdp_answer"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ScreenSize.class, "screen_size");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigCloudHorizonNegotiateSdp.class, "xig_cloud_horizon_negotiate_sdp(data:$data)");
    }
}
