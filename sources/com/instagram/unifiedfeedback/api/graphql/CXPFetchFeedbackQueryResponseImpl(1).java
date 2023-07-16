package com.instagram.unifiedfeedback.api.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CXPFetchFeedbackQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpFetchFeedback extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBFeedbackImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XcxpFetchFeedback.class, "xcxp_fetch_feedback(content_destinations:$content_destinations,content_source:$content_source,id:$content_id)");
    }
}
