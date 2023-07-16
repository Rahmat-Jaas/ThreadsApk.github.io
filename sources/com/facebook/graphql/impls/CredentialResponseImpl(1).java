package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CredentialResponseImpl extends TreeJNI implements C81204nM {

    public final class Credential extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"credential_type", "id"};
        }

        public final CreditCardCredentialImpl A00() {
            if (!isFulfilled("PAYCreditCard")) {
                return null;
            }
            return (CreditCardCredentialImpl) reinterpret(CreditCardCredentialImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{CreditCardCredentialImpl.class, PaypalBAImpl.class};
        }
    }

    public final class Error extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SharedPaymentsErrorImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"error_step"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Credential.class, "credential", false), Error.class, "error", false);
    }
}
