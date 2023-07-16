package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass4v4;
import X.AnonymousClass4v6;
import X.AnonymousClass4v7;
import X.AnonymousClass4v9;
import X.C108776iv;
import X.C18210wN;
import X.C85644vX;
import com.facebook.pando.TreeJNI;

public final class IgPaymentsSettingsInfoQueryResponseImpl extends TreeJNI implements AnonymousClass4v4 {

    public final class Me extends TreeJNI implements C85644vX {
        public final AnonymousClass4v6 A9X() {
            return (AnonymousClass4v6) reinterpret(IgPaymentsSettingsPaymentMethodsViewImpl.class);
        }

        public final AnonymousClass4v7 A9Y() {
            return (AnonymousClass4v7) reinterpret(IgPaymentsSettingsSecurityPinViewImpl.class);
        }

        public final AnonymousClass4v9 A9Z() {
            return (AnonymousClass4v9) reinterpret(IgPaymentsSettingsShippingInfoViewImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{IgPaymentsSettingsShippingInfoViewImpl.class, IgPaymentsSettingsSecurityPinViewImpl.class, IgPaymentsSettingsPaymentMethodsViewImpl.class};
        }

        public final String[] getScalarFields() {
            return C18210wN.A1Z();
        }
    }

    public final C85644vX Atr() {
        return (C85644vX) getTreeValue("me", Me.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }
}
