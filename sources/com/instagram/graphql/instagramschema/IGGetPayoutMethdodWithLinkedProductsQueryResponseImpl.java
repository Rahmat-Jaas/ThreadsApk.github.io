package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass8r1;
import X.C108776iv;
import X.C148148qW;
import X.C148158qX;
import X.C148428r2;
import X.C148548rG;
import X.C18180wK;
import X.C18190wL;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IGGetPayoutMethdodWithLinkedProductsQueryResponseImpl extends TreeJNI implements C148158qX {

    public final class PayoutInfoPerCredential extends TreeJNI implements C148428r2 {

        public final class OnboardingTypes extends TreeJNI implements AnonymousClass8r1 {
            public final String[] getScalarFields() {
                return new String[]{"onboarding_type", "subtypes"};
            }

            public final String Aya() {
                return getStringValue("onboarding_type");
            }

            public final ImmutableList BEs() {
                return getStringList("subtypes");
            }
        }

        public final class PayoutInfo extends TreeJNI implements C148148qW {
            public final C148548rG A9g() {
                return (C148548rG) reinterpret(PayoutMethodInfoFragmentImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{PayoutMethodInfoFragmentImpl.class};
            }
        }

        public final ImmutableList Ayb() {
            return getTreeList("onboarding_types", OnboardingTypes.class);
        }

        public final C148148qW B0h() {
            return (C148148qW) getTreeValue("payout_info", PayoutInfo.class);
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(OnboardingTypes.class, "onboarding_types", true), PayoutInfo.class, "payout_info", false);
        }
    }

    public final ImmutableList B0i() {
        return getTreeList("payout_info_per_credential(input:$input)", PayoutInfoPerCredential.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(PayoutInfoPerCredential.class, "payout_info_per_credential(input:$input)");
    }
}
