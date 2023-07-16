package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AuthFactorRequirementImpl extends TreeJNI implements C81204nM {

    public final class AuthFactorsGroups extends TreeJNI implements C81204nM {

        public final class Factors extends TreeJNI implements C81204nM {
            public final CSCAuthFactorImpl A00() {
                if (!isFulfilled("PAYFBPayCSCAuthFactor")) {
                    return null;
                }
                return (CSCAuthFactorImpl) reinterpret(CSCAuthFactorImpl.class);
            }

            public final PINAuthFactorImpl A01() {
                if (!isFulfilled("PAYFBPayPINAuthFactor")) {
                    return null;
                }
                return (PINAuthFactorImpl) reinterpret(PINAuthFactorImpl.class);
            }

            public final PayPalAuthFactorImpl A02() {
                if (!isFulfilled("PAYFBPayPayPalAuthFactor")) {
                    return null;
                }
                return (PayPalAuthFactorImpl) reinterpret(PayPalAuthFactorImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{TrustedDeviceAuthFactorImpl.class, BIOAuthFactorImpl.class, PINAuthFactorImpl.class, CSCAuthFactorImpl.class, SDCAuthFactorImpl.class, PayPalAuthFactorImpl.class, FBPayAuthFactorImpl.class, ThreeDSAuthFactorImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"allow_user_select", "num_required_factors"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Factors.class, "factors");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"num_required_groups"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(AuthFactorsGroups.class, "auth_factors_groups");
    }
}
