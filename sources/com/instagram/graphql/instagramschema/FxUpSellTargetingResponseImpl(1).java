package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C307322r;
import X.C85154ub;
import X.C85164uc;
import com.facebook.pando.TreeJNI;

public final class FxUpSellTargetingResponseImpl extends TreeJNI implements C85164uc {

    public final class FxupsellsTargeting extends TreeJNI implements C85154ub {
        public final String[] getScalarFields() {
            return new String[]{"upsell_to_launch"};
        }

        public final C307322r BJm() {
            return (C307322r) getEnumValue("upsell_to_launch", C307322r.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }
    }

    public final C85154ub AkX() {
        return (C85154ub) getTreeValue("fxupsells_targeting", FxupsellsTargeting.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxupsellsTargeting.class, "fxupsells_targeting");
    }
}
