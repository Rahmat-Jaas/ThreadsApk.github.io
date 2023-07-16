package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C85364uw;
import X.C85374ux;
import com.facebook.pando.TreeJNI;

public final class IGRiskAppealCaseResponseImpl extends TreeJNI implements C85374ux {

    public final class GenIgUserRiskAppealCase extends TreeJNI implements C85364uw {
        public final String[] getScalarFields() {
            return new String[]{"job_id"};
        }

        public final String AqY() {
            return getStringValue("job_id");
        }
    }

    public final C85364uw Akd() {
        return (C85364uw) getTreeValue("gen_ig_user_risk_appeal_case", GenIgUserRiskAppealCase.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(GenIgUserRiskAppealCase.class, "gen_ig_user_risk_appeal_case");
    }
}
