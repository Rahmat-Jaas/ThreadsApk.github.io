package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class DcpFeaturesUploadResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbPostDcpFeaturesUpload extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"error_message", "is_success"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbPostDcpFeaturesUpload.class, "xfb_post_dcp_features_upload(data:{\"data\":{\"examples\":$examples,\"flow\":$flow,\"use_case\":$use_case,\"use_case_version\":$use_case_version}})");
    }
}
