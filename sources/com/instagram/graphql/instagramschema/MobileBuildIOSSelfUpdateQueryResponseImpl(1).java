package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class MobileBuildIOSSelfUpdateQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbMobileBuildIosSelfUpdate extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"build_number", "download_url", "file_size", "itms_url", "publish_date", "release_channel", "version_name"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbMobileBuildIosSelfUpdate.class, "xfb_mobile_build_ios_self_update(app_id:$app_id)");
    }
}
