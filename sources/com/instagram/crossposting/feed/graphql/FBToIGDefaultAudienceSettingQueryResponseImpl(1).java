package com.instagram.crossposting.feed.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBToIGDefaultAudienceSettingQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpGetFeedCrosspostingDefaultAudienceStatus extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"audience_cohort", "consent_accept_deadline", "current_phase", "fb_feed_audience", "is_ig_user_opt_in_default_audience", "is_old_crossposter"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpGetFeedCrosspostingDefaultAudienceStatus.class, "xcxp_get_feed_crossposting_default_audience_status");
    }
}
