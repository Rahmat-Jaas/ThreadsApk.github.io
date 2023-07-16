package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayLinkAvailabilityImpl extends TreeJNI implements C81204nM {

    public final class LinkUnavailableReason extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ECPUserFacingErrorImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"is_link_available"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(LinkUnavailableReason.class, "link_unavailable_reason");
    }
}
