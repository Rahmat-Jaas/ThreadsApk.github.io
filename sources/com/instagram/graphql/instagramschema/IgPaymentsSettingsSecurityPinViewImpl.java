package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass4v7;
import X.C108776iv;
import X.C18210wN;
import X.C84934uF;
import com.facebook.pando.TreeJNI;

public final class IgPaymentsSettingsSecurityPinViewImpl extends TreeJNI implements AnonymousClass4v7 {

    public final class PaymentPin extends TreeJNI implements C84934uF {
        public final String[] getScalarFields() {
            return C18210wN.A1Z();
        }
    }

    public final C84934uF B0Q() {
        return (C84934uF) getTreeValue("payment_pin", PaymentPin.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PaymentPin.class, "payment_pin");
    }

    public final String[] getScalarFields() {
        return C18210wN.A1Z();
    }
}
