package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class FBPayLinkAccountMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayLinkAccount extends TreeJNI implements C81204nM {

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{TraceFieldType.ErrorCode, TraceFieldType.Error, "error_title"};
            }
        }

        public final class AdditionalAuthenticationError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{AdditionalAuthenticationErrorImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(PaymentsError.class, "payments_error", false), AdditionalAuthenticationError.class, "additional_authentication_error", false);
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayLinkAccount.class, "fbpay_link_account(data:$input)");
    }
}
