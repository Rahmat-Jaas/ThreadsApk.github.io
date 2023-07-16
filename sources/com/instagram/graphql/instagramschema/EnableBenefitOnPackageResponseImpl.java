package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EnableBenefitOnPackageResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbEnableStaticBenefitUpyPackageWithBenefits extends TreeJNI implements C81204nM {

        public final class UpyPackageWithBenefits extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(UpyPackageWithBenefits.class, "upy_package_with_benefits");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbEnableStaticBenefitUpyPackageWithBenefits.class, "xfb_enable_static_benefit_upy_package_with_benefits(data:$data)");
    }
}
