package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C35334Ist;
import X.C85434vB;
import X.C85664vZ;
import com.facebook.pando.TreeJNI;

public final class BasicAdsOptInQueryResponseImpl extends TreeJNI implements C85434vB {

    public final class XfbUserBasicAdsPreferences extends TreeJNI implements C85664vZ {
        public final String[] getScalarFields() {
            return new String[]{"is_basic_ads_opted_in", "is_basic_ads_youth", "tier"};
        }

        public final boolean Apl() {
            return getBooleanValue("is_basic_ads_opted_in");
        }

        public final boolean Apm() {
            return getBooleanValue("is_basic_ads_youth");
        }

        public final C35334Ist BGj() {
            return (C35334Ist) getEnumValue("tier", C35334Ist.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public final boolean BO5() {
            return hasFieldValue("is_basic_ads_opted_in");
        }

        public final boolean BO6() {
            return hasFieldValue("is_basic_ads_youth");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"get_ig_user_3pd_qe_group"};
    }

    public final String Akg() {
        return getStringValue("get_ig_user_3pd_qe_group");
    }

    public final C85664vZ BMa() {
        return (C85664vZ) getTreeValue("xfb_user_basic_ads_preferences", XfbUserBasicAdsPreferences.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbUserBasicAdsPreferences.class, "xfb_user_basic_ads_preferences");
    }
}
