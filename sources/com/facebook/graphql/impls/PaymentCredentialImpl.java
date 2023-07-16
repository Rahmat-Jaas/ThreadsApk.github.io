package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PaymentCredentialImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{"credential_type"};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{CreditCardCredentialImpl.class, PaypalBAImpl.class, TokenizedCardCredentialImpl.class, AlternativePaymentMethodImpl.class};
    }
}
