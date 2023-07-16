package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C84964uI;
import X.C84974uJ;
import com.facebook.pando.TreeJNI;

public final class ContentSchedulingDeleteMutationResponseImpl extends TreeJNI implements C84974uJ {

    public final class XfbUnpublishedContentDelete extends TreeJNI implements C84964uI {
        public final String[] getScalarFields() {
            return new String[]{"success"};
        }

        public final boolean BEt() {
            return getBooleanValue("success");
        }
    }

    public final C84964uI BMX() {
        return (C84964uI) getTreeValue("xfb_unpublished_content_delete(data:$input)", XfbUnpublishedContentDelete.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbUnpublishedContentDelete.class, "xfb_unpublished_content_delete(data:$input)");
    }
}
