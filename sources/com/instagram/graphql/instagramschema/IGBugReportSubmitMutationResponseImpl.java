package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85174ud;
import X.C85184ue;
import com.facebook.pando.TreeJNI;

public final class IGBugReportSubmitMutationResponseImpl extends TreeJNI implements C85184ue {

    public final class IgBugSubmit extends TreeJNI implements C85174ud {
        public final String[] getScalarFields() {
            return new String[]{"bug_id"};
        }

        public final String AUX() {
            return getStringValue("bug_id");
        }
    }

    public final C85174ud Ann() {
        return (C85174ud) getTreeValue("ig_bug_submit(input:$input)", IgBugSubmit.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgBugSubmit.class, "ig_bug_submit(input:$input)");
    }
}
