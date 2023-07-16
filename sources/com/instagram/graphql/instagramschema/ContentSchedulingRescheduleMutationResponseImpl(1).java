package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18230wP;
import X.C85004uM;
import X.C85014uN;
import com.facebook.pando.TreeJNI;

public final class ContentSchedulingRescheduleMutationResponseImpl extends TreeJNI implements C85014uN {

    public final class XfbUnpublishedContentReschedule extends TreeJNI implements C85004uM {
        public final boolean BEt() {
            return getBooleanValue("success");
        }

        public final String[] getScalarFields() {
            return C18230wP.A1a();
        }
    }

    public final C85004uM BMZ() {
        return (C85004uM) getTreeValue("xfb_unpublished_content_reschedule(data:$input)", XfbUnpublishedContentReschedule.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbUnpublishedContentReschedule.class, "xfb_unpublished_content_reschedule(data:$input)");
    }
}
