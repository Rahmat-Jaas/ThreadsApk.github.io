package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AvailableCardTypesImpl extends TreeJNI implements C81204nM {

    public final class CardIcon extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayIconImpl.class};
        }
    }

    public final class CardNumberMatchingRules extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormValidationRulesImpl.class};
        }
    }

    public final class CardNumberValidationRules extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormValidationRulesImpl.class};
        }
    }

    public final class SecurityCodeValidationRules extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormValidationRulesImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"card_short_name", "card_type"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(CardIcon.class, "card_icon(scale:$card_icon_scale)", false), C18190wL.A0G(CardNumberMatchingRules.class, "card_number_matching_rules", true), C18190wL.A0G(CardNumberValidationRules.class, "card_number_validation_rules", true), C18190wL.A0G(SecurityCodeValidationRules.class, "security_code_validation_rules", true)};
    }
}
