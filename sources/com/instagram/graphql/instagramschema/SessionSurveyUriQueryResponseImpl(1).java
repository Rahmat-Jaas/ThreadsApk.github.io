package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SessionSurveyUriQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class IgEndSessionSurveyUriRootQuery extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"leaf_id", "root_id", "survey_id", "survey_uri"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgEndSessionSurveyUriRootQuery.class, "ig_end_session_survey_uri_root_query(integration_point_id:$integration_point_id,session_id:$session_id,survey_context_data:$survey_context_data)");
    }
}
