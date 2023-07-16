package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGGraphQLNonprofitFundraiserCreateMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class IgNonprofitFundraiserCreate extends TreeJNI implements C81204nM {

        public final class Fundraiser extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Fundraiser.class, "fundraiser");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgNonprofitFundraiserCreate.class, "ig_nonprofit_fundraiser_create(params:$params)");
    }
}
