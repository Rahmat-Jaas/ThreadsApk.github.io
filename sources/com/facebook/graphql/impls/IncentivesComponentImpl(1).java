package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IncentivesComponentImpl extends TreeJNI implements C81204nM {

    public final class AllEligibleIncentives extends TreeJNI implements C81204nM {

        public final class Incentives extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{IncentiveItemInfoImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Incentives.class, "incentives");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"enable_promo_code_input"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AllEligibleIncentives.class, "all_eligible_incentives");
    }
}
