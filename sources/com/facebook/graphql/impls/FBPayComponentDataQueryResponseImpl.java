package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayComponentDataQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchFbpayComponentData extends TreeJNI implements C81204nM {

        public final class Components extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"type"};
            }

            public final Class[] getInlineClasses() {
                return new Class[]{ShippingAddressComponentImpl.class, ContactInformationComponentImpl.class, TermsComponentImpl.class, PayButtonComponentImpl.class, PaymentMethodComponentImpl.class, PromoCodeComponentImpl.class, OtcOptionComponentImpl.class, IncentivesComponentImpl.class, EmailOptInComponentImpl.class};
            }
        }

        public final class Error extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{SharedPaymentsErrorImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Components.class, "components", true), Error.class, "error", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchFbpayComponentData.class, "fetch_fbpay_component_data(component_types:$component_types,otc_component_input:$otc_component_input,otc_session_id:$otc_session_id,otc_type:$otc_type,payment_container_mode:$payment_container_mode,payment_product_id:$payment_product_id)");
    }
}
