package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayCheckoutScreenConfigImpl extends TreeJNI implements C81204nM {

    public final class EcpBannerConfig extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"nux", "pux"};
        }
    }

    public final class EcpOrderedComponents extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"nux", "pux"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"checkout_button_label", "event_handling_components", "full_billing_required", "optional_fields", "request_fields"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(EcpOrderedComponents.class, "ecp_ordered_components", false), EcpBannerConfig.class, "ecp_banner_config", false);
    }
}
