package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import X.C85354uv;
import X.L4A;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class IGPayoutOnboardingAddressValidationQueryResponseImpl extends TreeJNI implements C85354uv {

    public final class PayoutAddressValidation extends TreeJNI implements L4A {

        public final class Corrections extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"can_be_corrected", "error_message", "is_valid_strict", "valid"};
        }

        public final boolean BKE() {
            return getBooleanValue("valid");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Corrections.class, "corrections");
        }

        public final String getErrorMessage() {
            return getStringValue("error_message");
        }
    }

    public final L4A B0T() {
        return (L4A) getTreeValue("payout_address_validation(params:$params)", PayoutAddressValidation.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PayoutAddressValidation.class, "payout_address_validation(params:$params)");
    }
}
