package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C84984uK;
import X.C84994uL;
import com.facebook.pando.TreeJNI;

public final class ContentSchedulingPublishMutationResponseImpl extends TreeJNI implements C84994uL {

    public final class XfbUnpublishedContentPublish extends TreeJNI implements C84984uK {
        public final String[] getScalarFields() {
            return new String[]{"success"};
        }

        public final boolean BEt() {
            return getBooleanValue("success");
        }
    }

    public final C84984uK BMY() {
        return (C84984uK) getTreeValue("xfb_unpublished_content_publish(data:$input)", XfbUnpublishedContentPublish.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbUnpublishedContentPublish.class, "xfb_unpublished_content_publish(data:$input)");
    }
}
