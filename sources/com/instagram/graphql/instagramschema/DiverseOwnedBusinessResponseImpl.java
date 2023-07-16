package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class DiverseOwnedBusinessResponseImpl extends TreeJNI implements C81204nM {

    public final class IgShopDiversityProfile extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{DiversityProfileImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgShopDiversityProfile.class, "ig_shop_diversity_profile(business_igid:$id)");
    }
}
